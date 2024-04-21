import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import smartagriculture.SensorServiceGrpc;
import smartagriculture.SensorServiceOuterClass.*;

public class SensorServiceImpl extends SensorServiceGrpc.SensorServiceImplBase {
    @Override
    public void getLatestSensorData(Empty request, StreamObserver<SensorData> responseObserver) {

        // 模拟获取最新传感器数据
        SensorData sensorData = SensorData.newBuilder()
                .setTemperature(25.0f)
                .setHumidity(50.0f)
                .setLightIntensity(1000.0f)
                .build();
        responseObserver.onNext(sensorData);
        responseObserver.onCompleted();
    }
}
