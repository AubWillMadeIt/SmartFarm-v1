
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class SmartFarmServer {
    private Server server;

    protected FarmEnvironmentSimulator farmEnvironmentSimulator = new FarmEnvironmentSimulator();

    public static void main(String[] args) throws IOException, InterruptedException {
        SmartFarmServer smartFarmServer = new SmartFarmServer();
        smartFarmServer.start();
        smartFarmServer.blockUntilShutdown();
    }

    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new WaterAndFertilizerServiceImpl(farmEnvironmentSimulator))
                .addService(new CropMonitoringServiceImpl(farmEnvironmentSimulator))
                .addService(new CropManagementServiceImpl(farmEnvironmentSimulator))
                .build()
                .start();
        System.out.println("Server started, listening on port " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** Shutting down gRPC server since JVM is shutting down");
            SmartFarmServer.this.stop();
            System.err.println("*** Server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}
