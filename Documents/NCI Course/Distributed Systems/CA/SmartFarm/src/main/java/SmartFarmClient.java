import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import smartfarming.CropManagementServiceOuterClass.*;
import smartfarming.CropManagementServiceGrpc;
import smartfarming.CropMonitoringServiceOuterClass.*;
import smartfarming.CropMonitoringServiceGrpc;
import smartfarming.WaterAndFertilizerServiceOuterClass.*;
import smartfarming.WaterAndFertilizerServiceGrpc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartFarmClient {

    // gRPC stubs for accessing different services
    private final CropMonitoringServiceGrpc.CropMonitoringServiceBlockingStub cropMonitoringStub;
    private final WaterAndFertilizerServiceGrpc.WaterAndFertilizerServiceBlockingStub waterAndFertilizerStub;
    private final CropManagementServiceGrpc.CropManagementServiceBlockingStub cropManagementStub;

    // Constructor to initialize the gRPC stubs
    public SmartFarmClient(ManagedChannel channel) {
        cropMonitoringStub = CropMonitoringServiceGrpc.newBlockingStub(channel);
        waterAndFertilizerStub = WaterAndFertilizerServiceGrpc.newBlockingStub(channel);
        cropManagementStub = CropManagementServiceGrpc.newBlockingStub(channel);
    }

    // Main method to start the SmartFarmClient
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // Using plaintext communication (no encryption)
                .build();
        SmartFarmClient client = new SmartFarmClient(channel);
        client.start(); // Start the client application
        channel.shutdown(); // Shut down the gRPC channel when done
    }

    // Method to start the client application
    private void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Display menu options
                System.out.println("Choose an option:");
                System.out.println("┌──────────────────────────────────┐");
                System.out.println("│ 1. View crop block status        │");
                System.out.println("│ 2. View all crop block statuses  │");
                System.out.println("│ 3. Water a specific block        │");
                System.out.println("│ 4. Water all blocks              │");
                System.out.println("│ 5. Fertilize a specific block    │");
                System.out.println("│ 6. Fertilize all blocks          │");
                System.out.println("│ 7. Adjust pH of a specific block │");
                System.out.println("│ 8. Adjust light intensity        │");
                System.out.println("│ 9. Perform pest control          │");
                System.out.println("│ 10. Analyze crop block status    │");
                System.out.println("│ 0. Exit                          │");
                System.out.println("└──────────────────────────────────┘");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt(); // Read user input
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
                    case 10:
                        analyzeCropBlockStatus(scanner);
                        break;
                    case 0:
                        return; // Exit the application
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine(); // clear input buffer
            }
        }
    }

    // Method to view the status of a specific crop block
    private void viewCropBlockStatus(Scanner scanner) {
        try {
            System.out.print("Enter block ID: ");
            int blockId = scanner.nextInt();
            CropBlockStatusRequest request = CropBlockStatusRequest.newBuilder()
                    .setBlockId(blockId)
                    .build();
            CropBlockStatus status = cropMonitoringStub.getBlockStatus(request);
            System.out.println();
            System.out.println("Crop block status:");
            System.out.println(status);
        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error retrieving crop block status: " + e.getStatus());
        } finally {
            System.out.println();
        }
    }

    // Method to view statuses of all crop blocks
    private void viewAllCropBlockStatuses() {
        try {
            System.out.println("All crop block statuses:");
            CropAllStatusesResponse response = cropMonitoringStub.getAllStatuses(Empty.getDefaultInstance());
            System.out.println("");
            for (CropBlockStatus status : response.getStatusesList()) {
                System.out.println("Crop Block ID: " + status.getBlockId());
                System.out.println("Light Intensity: " + status.getLightIntensity());
                System.out.println("Humidity: " + status.getHumidity());
                System.out.println("Soil Fertility: " + status.getSoilFertility());
                System.out.println("Pest Presence: " + status.getPestPresence());
                System.out.println("pH Level: " + status.getPHLevel());
                System.out.println("---------------------------------------------");
            }
            System.out.println();
        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error retrieving all crop block statuses: " + e.getStatus());
        }finally {
            System.out.println();
        }
    }

    // Method to water a specific block
    private void waterSpecificBlock(Scanner scanner) {
        try {
            System.out.print("Enter block ID: ");
            int blockId = scanner.nextInt();
            System.out.print("Enter watering time (seconds): ");
            double wateringTime = scanner.nextDouble();
            WaterRequest request = WaterRequest.newBuilder()
                    .setBlockId(blockId)
                    .setWateringTime(wateringTime)
                    .build();
            ActionResponse response = waterAndFertilizerStub.waterBlock(request);
            System.out.println();
            System.out.println(response.getMessage());
        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error watering specific block: " + e.getStatus());
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Invalid input for block ID or watering time.");
            scanner.nextLine(); // clear input buffer
        }finally {
            System.out.println();
        }
    }

    // Method to water all blocks
    private void waterAllBlocks(Scanner scanner) {
        try {
            System.out.print("Enter watering time (seconds): ");
            double wateringTime = scanner.nextDouble();
            WaterRequest request = WaterRequest.newBuilder()
                    .setWateringTime(wateringTime)
                    .build();
            ActionResponse response = waterAndFertilizerStub.waterAll(request);
            System.out.println();
            System.out.println(response.getMessage());
        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error watering all blocks: " + e.getStatus());
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Invalid input for watering time.");
            scanner.nextLine(); // clear input buffer
        }finally {
            System.out.println();
        }
    }

    // Method to fertilize a specific block
    private void fertilizeSpecificBlock(Scanner scanner) {
        try {
            System.out.print("Enter block ID: ");
            int blockId = scanner.nextInt();
            System.out.print("Enter fertilizer amount: ");
            double fertilizerAmount = scanner.nextDouble();
            FertilizeRequest request = FertilizeRequest.newBuilder()
                    .setBlockId(blockId)
                    .setFertilizerAmount(fertilizerAmount)
                    .build();
            ActionResponse response = waterAndFertilizerStub.fertilizeBlock(request);
            System.out.println();
            System.out.println(response.getMessage());

        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error fertilizing specific block: " + e.getStatus());
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Invalid input for block ID or fertilizer amount.");
            scanner.nextLine(); // clear input buffer
        }finally {
            System.out.println();
        }
    }

    // Method to fertilize all blocks
    private void fertilizeAllBlocks(Scanner scanner) {
        try {
            System.out.print("Enter fertilizer amount: ");
            double fertilizerAmount = scanner.nextDouble();
            FertilizeRequest request = FertilizeRequest.newBuilder()
                    .setFertilizerAmount(fertilizerAmount)
                    .build();
            ActionResponse response = waterAndFertilizerStub.fertilizeAll(request);
            System.out.println();
            System.out.println(response.getMessage());

        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error fertilizing all blocks: " + e.getStatus());
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Invalid input for fertilizer amount.");
            scanner.nextLine(); // clear input buffer
        }finally {
            System.out.println();
        }
    }

    // Method to adjust pH level of a specific block
    private void adjustPh(Scanner scanner) {
        try {
            System.out.print("Enter block ID: ");
            int blockId = scanner.nextInt();
            System.out.print("Enter target pH level: ");
            double pHLevel = scanner.nextDouble();
            AdjustPHRequest request = AdjustPHRequest.newBuilder()
                    .setBlockId(blockId)
                    .setPHLevel(pHLevel)
                    .build();
            AdjustResponse response = cropManagementStub.adjustPh(request);
            System.out.println();
            System.out.println(response.getMessage());

        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error adjusting pH level: " + e.getStatus());
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Invalid input for block ID or pH level.");
            scanner.nextLine(); // clear input buffer
        }finally {
            System.out.println();
        }
    }

    // Method to adjust light intensity of a specific block
    private void adjustLightIntensity(Scanner scanner) {
        try {
            System.out.print("Enter block ID: ");
            int blockId = scanner.nextInt();
            System.out.print("Enter target light intensity: ");
            double lightIntensity = scanner.nextDouble();
            AdjustLightIntensityRequest request = AdjustLightIntensityRequest.newBuilder()
                    .setBlockId(blockId)
                    .setLightIntensity(lightIntensity)
                    .build();
            AdjustResponse response = cropManagementStub.adjustLightIntensity(request);
            System.out.println();
            System.out.println(response.getMessage());

        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error adjusting light intensity: " + e.getStatus());
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Invalid input for block ID or light intensity.");
            scanner.nextLine(); // clear input buffer
        }finally {
            System.out.println();
        }
    }

    // Method to perform pest control on a specific block
    private void pestControl(Scanner scanner) {
        try {
            System.out.print("Enter block ID: ");
            int blockId = scanner.nextInt();
            PestControlRequest request = PestControlRequest.newBuilder()
                    .setBlockId(blockId)
                    .build();
            AdjustResponse response = cropManagementStub.pestControl(request);
            System.out.println();
            System.out.println(response.getMessage());

        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error performing pest control: " + e.getStatus());
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Invalid input for block ID.");
            scanner.nextLine(); // clear input buffer
        }finally {
            System.out.println();
        }
    }

    // Method to analyze the status of a specific crop block
    private void analyzeCropBlockStatus(Scanner scanner) {
        try {
            System.out.print("Enter block ID: ");
            int blockId = scanner.nextInt();
            CropBlockStatusRequest request = CropBlockStatusRequest.newBuilder()
                    .setBlockId(blockId)
                    .build();
            AnalyzeBlockStatusResponse analyzeBlockStatusResponse = cropMonitoringStub.analyzeBlockStatus(request);

            System.out.println();
            System.out.println("Analysis of crop block status:");
            System.out.println(analyzeBlockStatusResponse.getMessage());
            System.out.println();
        } catch (StatusRuntimeException e) {
            System.out.println();
            System.out.println("Error analyzing crop block status: " + e.getStatus());
            System.out.println();
        } finally {
            System.out.println();
        }
    }
}
