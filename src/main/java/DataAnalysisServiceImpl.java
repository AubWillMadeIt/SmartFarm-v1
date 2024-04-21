import io.grpc.stub.StreamObserver;
import smartagriculture.DataAnalysisServiceGrpc;
import smartagriculture.DataAnalysisServiceOuterClass.*;

public class DataAnalysisServiceImpl extends DataAnalysisServiceGrpc.DataAnalysisServiceImplBase {
    @Override
    public void analyzeSensorData( SensorData request, StreamObserver<SensorAnalysis> responseObserver) {
        // 实现传感器数据分析逻辑
        float temperature = request.getTemperature();
        float humidity = request.getHumidity();
        float lightIntensity = request.getLightIntensity();

        // 简单示例：根据温度、湿度、光照进行分析
        String analysisResult = "Temperature: " + temperature + ", Humidity: " + humidity + ", Light Intensity: " + lightIntensity;
        if (temperature > 25 && humidity < 50 && lightIntensity > 1000) {
            analysisResult += " - Optimal conditions for crops.";
        } else {
            analysisResult += " - Suboptimal conditions for crops.";
        }

        SensorAnalysis analysis = SensorAnalysis.newBuilder()
                .setAnalysisResult(analysisResult)
                .build();
        responseObserver.onNext(analysis);
        responseObserver.onCompleted();
    }
}
