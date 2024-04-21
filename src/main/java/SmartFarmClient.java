import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import smartagriculture.*;
import smartagriculture.CropManagementServiceGrpc.*;
import smartagriculture.CropManagementServiceOuterClass.*;

import smartagriculture.CropMonitoringServiceGrpc.*;
import smartagriculture.CropMonitoringServiceOuterClass.*;
import smartagriculture.DataAnalysisServiceGrpc.*;
import smartagriculture.DataAnalysisServiceOuterClass.*;
import smartagriculture.SensorServiceGrpc.*;


import java.util.Scanner;

public class SmartFarmClient {
    private final ManagedChannel channel;
    private final  SensorServiceBlockingStub sensorStub;
    private final CropMonitoringServiceBlockingStub cropMonitoringStub;
    private final  CropManagementServiceBlockingStub cropManagementStub;
    private final  DataAnalysisServiceBlockingStub dataAnalysisStub;

    public SmartFarmClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext() // 仅用于示例，实际生产环境应使用安全连接
                .build();
        this.sensorStub = SensorServiceGrpc.newBlockingStub(channel);
        this.cropMonitoringStub = CropMonitoringServiceGrpc.newBlockingStub(channel);
        this.cropManagementStub = CropManagementServiceGrpc.newBlockingStub(channel);
        this.dataAnalysisStub = DataAnalysisServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() {
        channel.shutdown();
    }

    public void monitorCropGrowth() {
        CropStatusList response = cropMonitoringStub.getAllCropStatus(Empty.newBuilder().build());
        System.out.println("All Crop Status:");
        for (CropStatus cropStatus : response.getCropStatusListList()) {
            System.out.println("Crop ID: " + cropStatus.getId());
            System.out.println("Crop Status: " + cropStatus.getStatus());
            System.out.println("Growth Stage: " + cropStatus.getGrowthStage());
            System.out.println("Pests: " + String.join(", ", cropStatus.getPestsList()));
            System.out.println("Moisture Level: " + cropStatus.getMoistureLevel());
            System.out.println();
        }
    }

    public void monitorSensorData() {
        SensorServiceOuterClass.SensorData response = sensorStub.getLatestSensorData(Empty.newBuilder().build());
        System.out.println("Latest Sensor Data:");
        System.out.println("Temperature: " + response.getTemperature());
        System.out.println("Humidity: " + response.getHumidity());
        System.out.println("Light Intensity: " + response.getLightIntensity());
    }

    public void irrigateAll(int irrigationTime) {
        IrrigationResponse response = cropManagementStub.irrigateAll(IrrigationRequest.newBuilder().setIrrigationTime(irrigationTime).build());
        System.out.println("Irrigation Response: " + response.getMessage());
    }

    public void fertilizeAll(float fertilizerAmount) {
        FertilizationResponse response = cropManagementStub.fertilizeAll(FertilizationRequest.newBuilder().setFertilizerAmount(fertilizerAmount).build());
        System.out.println("Fertilization Response: " + response.getMessage());
    }

    public void analyzeSensorData(float temperature, float humidity, float lightIntensity) {
        SensorAnalysis response = dataAnalysisStub.analyzeSensorData(SensorData.newBuilder()
                .setTemperature(temperature)
                .setHumidity(humidity)
                .setLightIntensity(lightIntensity)
                .build());
        System.out.println("Sensor Data Analysis Result: " + response.getAnalysisResult());
    }

    public static void main(String[] args) {
        SmartFarmClient client = new SmartFarmClient("localhost", 50051);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Monitor Crop Growth");
            System.out.println("2. Monitor Sensor Data");
            System.out.println("3. Irrigate All Crops");
            System.out.println("4. Fertilize All Crops");
            System.out.println("5. Analyze Sensor Data");
            System.out.println("6. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    client.monitorCropGrowth();
                    break;
                case 2:
                    client.monitorSensorData();
                    break;
                case 3:
                    System.out.println("Enter irrigation time (minutes):");
                    int irrigationTime = scanner.nextInt();
                    client.irrigateAll(irrigationTime);
                    break;
                case 4:
                    System.out.println("Enter fertilizer amount:");
                    float fertilizerAmount = scanner.nextFloat();
                    client.fertilizeAll(fertilizerAmount);
                    break;
                case 5:
                    System.out.println("Enter temperature:");
                    float temperature = scanner.nextFloat();
                    System.out.println("Enter humidity:");
                    float humidity = scanner.nextFloat();
                    System.out.println("Enter light intensity:");
                    float lightIntensity = scanner.nextFloat();
                    client.analyzeSensorData(temperature, humidity, lightIntensity);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        client.shutdown();
    }
}
