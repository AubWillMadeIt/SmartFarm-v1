import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import smartfarming.CropManagementServiceGrpc;
import smartfarming.CropManagementServiceOuterClass.*;
import smartfarming.CropMonitoringServiceGrpc;
import smartfarming.CropMonitoringServiceOuterClass.*;
import smartfarming.WaterAndFertilizerServiceGrpc;
import smartfarming.WaterAndFertilizerServiceOuterClass.*;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class SmartFarmClient {

    private final CropMonitoringServiceGrpc.CropMonitoringServiceBlockingStub cropMonitoringStub;
    private final WaterAndFertilizerServiceGrpc.WaterAndFertilizerServiceBlockingStub waterAndFertilizerStub;
    private final CropManagementServiceGrpc.CropManagementServiceBlockingStub cropManagementStub;
    public SmartFarmClient(ManagedChannel channel) {
        cropMonitoringStub = CropMonitoringServiceGrpc.newBlockingStub(channel);
        waterAndFertilizerStub = WaterAndFertilizerServiceGrpc.newBlockingStub(channel);
        cropManagementStub = CropManagementServiceGrpc.newBlockingStub(channel);
    }

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        SmartFarmClient client = new SmartFarmClient(channel);
        client.start();
        channel.shutdown();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. View crop block status");
            System.out.println("2. View all crop block statuses");
            System.out.println("3. Water a specific block");
            System.out.println("4. Water all blocks");
            System.out.println("5. Fertilize a specific block");
            System.out.println("6. Fertilize all blocks");
            System.out.println("7. Adjust pH of a specific block");
            System.out.println("8. Adjust light intensity of a specific block");
            System.out.println("9. Perform pest control for a specific block");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    viewCropBlockStatus(scanner);
                    break;
                case 2:
                    viewAllCropBlockStatuses();
                    break;
                case 3:
                    waterSpecificBlock(scanner);
                    break;
                case 4:
                    waterAllBlocks(scanner);
                    break;
                case 5:
                    fertilizeSpecificBlock(scanner);
                    break;
                case 6:
                    fertilizeAllBlocks(scanner);
                    break;
                case 7:
                    adjustPh(scanner);
                    break;
                case 8:
                    adjustLightIntensity(scanner);
                    break;
                case 9:
                    pestControl(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void viewCropBlockStatus(Scanner scanner) {
        System.out.print("Enter block ID: ");
        int blockId = scanner.nextInt();
        CropBlockStatusRequest request = CropBlockStatusRequest.newBuilder()
                .setBlockId(blockId)
                .build();
        CropBlockStatus status = cropMonitoringStub.getBlockStatus(request);
        System.out.println("Crop block status:");
        System.out.println(status);
    }

    private void viewAllCropBlockStatuses() {
        System.out.println("All crop block statuses:");
        final CountDownLatch finishLatch = new CountDownLatch(1); // 创建一个CountDownLatch实例

        StreamObserver<CropBlockStatus> responseObserver = new StreamObserver<CropBlockStatus>() {
            @Override
            public void onNext(CropBlockStatus status) {
                System.out.println("Crop Block ID: " + status.getBlockId());
                System.out.println("Light Intensity: " + status.getLightIntensity());
                System.out.println("Humidity: " + status.getHumidity());
                System.out.println("Soil Fertility: " + status.getSoilFertility());
                System.out.println("Pest Presence: " + status.getPestPresence());
                System.out.println("pH Level: " + status.getPHLevel());
                System.out.println("---------------------------------------------");
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error: " + t.getMessage());

            }

            @Override
            public void onCompleted() {
                System.out.println("Completed");

            }
        };

        cropMonitoringStub.getAllStatuses(Empty.newBuilder().build(), responseObserver);
    }

    private void waterSpecificBlock(Scanner scanner) {
        System.out.print("Enter block ID: ");
        int blockId = scanner.nextInt();
        System.out.print("Enter watering time (seconds): ");
        double wateringTime = scanner.nextDouble();
        WaterRequest request = WaterRequest.newBuilder()
                .setBlockId(blockId)
                .setWateringTime(wateringTime)
                .build();
        ActionResponse response = waterAndFertilizerStub.waterBlock(request);
        System.out.println(response.getMessage());
    }

    private void waterAllBlocks(Scanner scanner) {
        System.out.print("Enter watering time (seconds): ");
        double wateringTime = scanner.nextDouble();
        WaterRequest request = WaterRequest.newBuilder()
                .setWateringTime(wateringTime)
                .build();
        ActionResponse response = waterAndFertilizerStub.waterAll(request);
        System.out.println(response.getMessage());
    }

    private void fertilizeSpecificBlock(Scanner scanner) {
        System.out.print("Enter block ID: ");
        int blockId = scanner.nextInt();
        System.out.print("Enter fertilizer amount: ");
        double fertilizerAmount = scanner.nextDouble();
        FertilizeRequest request = FertilizeRequest.newBuilder()
                .setBlockId(blockId)
                .setFertilizerAmount(fertilizerAmount)
                .build();
        ActionResponse response = waterAndFertilizerStub.fertilizeBlock(request);
        System.out.println(response.getMessage());
    }

    private void fertilizeAllBlocks(Scanner scanner) {
        System.out.print("Enter fertilizer amount: ");
        double fertilizerAmount = scanner.nextDouble();
        FertilizeRequest request = FertilizeRequest.newBuilder()
                .setFertilizerAmount(fertilizerAmount)
                .build();
        ActionResponse response = waterAndFertilizerStub.fertilizeAll(request);
        System.out.println(response.getMessage());
    }

    private void adjustPh(Scanner scanner) {
        System.out.print("Enter block ID: ");
        int blockId = scanner.nextInt();
        System.out.print("Enter target pH level: ");
        double pHLevel = scanner.nextDouble();
         AdjustPHRequest request = AdjustPHRequest.newBuilder()
                .setBlockId(blockId)
                .setPHLevel(pHLevel)
                .build();
        AdjustResponse response = cropManagementStub.adjustPh(request);
        System.out.println(response.getMessage());
    }

    private void adjustLightIntensity(Scanner scanner) {
        System.out.print("Enter block ID: ");
        int blockId = scanner.nextInt();
        System.out.print("Enter target light intensity: ");
        double lightIntensity = scanner.nextDouble();
        AdjustLightIntensityRequest request = AdjustLightIntensityRequest.newBuilder()
                .setBlockId(blockId)
                .setLightIntensity(lightIntensity)
                .build();
        AdjustResponse response = cropManagementStub.adjustLightIntensity(request);
        System.out.println(response.getMessage());
    }

    private void pestControl(Scanner scanner) {
        System.out.print("Enter block ID: ");
        int blockId = scanner.nextInt();
        PestControlRequest request = PestControlRequest.newBuilder()
                .setBlockId(blockId)
                .build();
        AdjustResponse response = cropManagementStub.pestControl(request);
        System.out.println(response.getMessage());
    }
}
