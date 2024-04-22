import io.grpc.stub.StreamObserver;
import smartfarming.WaterAndFertilizerServiceGrpc;
import smartfarming.WaterAndFertilizerServiceOuterClass.*;

public class WaterAndFertilizerServiceImpl extends WaterAndFertilizerServiceGrpc.WaterAndFertilizerServiceImplBase {

    protected FarmEnvironmentSimulator farmEnvironmentSimulator;

    public WaterAndFertilizerServiceImpl(FarmEnvironmentSimulator farmEnvironmentSimulator) {
        this.farmEnvironmentSimulator = farmEnvironmentSimulator;
    }

    @Override
    public void waterAll(WaterRequest request, StreamObserver<ActionResponse> responseObserver) {
        // Implement logic to water all blocks
        // For demonstration purposes, assume success
        farmEnvironmentSimulator.changeAllHumidity(request.getWateringTime() / 10); // Increase humidity based on watering time
        ActionResponse response = ActionResponse.newBuilder()
                .setSuccess(true)
                .setMessage("All blocks watered successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void waterBlock(WaterRequest request, StreamObserver<ActionResponse> responseObserver) {
        // Implement logic to water a specific block
        // For demonstration purposes, assume success
        farmEnvironmentSimulator.changeHumidity(request.getBlockId(), request.getWateringTime() / 10); // Increase humidity based on watering time
        ActionResponse response = ActionResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Block " + request.getBlockId() + " watered successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void fertilizeAll(FertilizeRequest request, StreamObserver<ActionResponse> responseObserver) {
        // Implement logic to fertilize all blocks
        // For demonstration purposes, assume success
        farmEnvironmentSimulator.changeAllSoilFertility(request.getFertilizerAmount() * 0.05); // Increase soil fertility by the fertilizer amount
        ActionResponse response = ActionResponse.newBuilder()
                .setSuccess(true)
                .setMessage("All blocks fertilized successfully with " + request.getFertilizerAmount() + " amount of fertilizer")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void fertilizeBlock(FertilizeRequest request, StreamObserver<ActionResponse> responseObserver) {
        // Implement logic to fertilize a specific block
        // For demonstration purposes, assume success
        farmEnvironmentSimulator.changeSoilFertility(request.getBlockId(), request.getFertilizerAmount() * 0.05); // Increase soil fertility by the fertilizer amount
        ActionResponse response = ActionResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Block " + request.getBlockId() + " fertilized successfully with " + request.getFertilizerAmount() + " amount of fertilizer")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}