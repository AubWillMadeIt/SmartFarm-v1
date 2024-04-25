import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import smartfarming.CropMonitoringServiceGrpc;
import smartfarming.CropMonitoringServiceOuterClass.*;

import java.util.List;

public class CropMonitoringServiceImpl extends CropMonitoringServiceGrpc.CropMonitoringServiceImplBase {

    protected FarmEnvironmentSimulator farmEnvironmentSimulator;

    // Constructor for CropMonitoringServiceImpl
    public CropMonitoringServiceImpl(FarmEnvironmentSimulator farmEnvironmentSimulator) {
        this.farmEnvironmentSimulator = farmEnvironmentSimulator;
    }

    // gRPC method to get the status of a specific crop block
    @Override
    public void getBlockStatus(CropBlockStatusRequest request, StreamObserver<CropBlockStatus> responseObserver) {
        int blockId = request.getBlockId();
        if (blockId <= 0) {
            // Invalid block ID, send error status to client
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Block ID must be a positive integer.").asRuntimeException());
            return;
        }

        // Get the status of a specific crop block from the simulator
        FarmEnvironmentSimulator.CropStatus cropStatus = farmEnvironmentSimulator.getBlockStatus(blockId);
        if (cropStatus != null) {
            // Convert CropStatus to CropBlockStatus and send to the client
            CropBlockStatus status = CropBlockStatus.newBuilder()
                    .setBlockId(cropStatus.getBlockId())
                    .setLightIntensity(cropStatus.getLightIntensity())
                    .setHumidity(cropStatus.getHumidity())
                    .setSoilFertility(cropStatus.getSoilFertility())
                    .setPestPresence(cropStatus.isPestPresence())
                    .setPHLevel(cropStatus.getPHLevel())
                    .build();
            responseObserver.onNext(status);
            responseObserver.onCompleted();
        } else {
            // If blockId not found, send an error status to the client
            responseObserver.onError(Status.NOT_FOUND.withDescription("BlockId not found: " + blockId).asRuntimeException());
        }
    }

    // gRPC method to get the statuses of all crop blocks
    @Override
    public void getAllStatuses(Empty request, StreamObserver<CropAllStatusesResponse> responseObserver) {
        // Get all crop block statuses from the simulator
        List<FarmEnvironmentSimulator.CropStatus> cropStatuses = farmEnvironmentSimulator.getAllStatuses();

        // Convert crop statuses to RepeatedBlockStatus
        CropAllStatusesResponse.Builder repeatedBlockStatusBuilder = CropAllStatusesResponse.newBuilder();
        for (FarmEnvironmentSimulator.CropStatus cropStatus : cropStatuses) {
            CropBlockStatus status = CropBlockStatus.newBuilder()
                    .setBlockId(cropStatus.getBlockId())
                    .setLightIntensity(cropStatus.getLightIntensity())
                    .setHumidity(cropStatus.getHumidity())
                    .setSoilFertility(cropStatus.getSoilFertility())
                    .setPestPresence(cropStatus.isPestPresence())
                    .setPHLevel(cropStatus.getPHLevel())
                    .build();
            repeatedBlockStatusBuilder.addStatuses(status);
        }

        // Send the repeated block statuses to the client
        responseObserver.onNext(repeatedBlockStatusBuilder.build());
        responseObserver.onCompleted();
    }

    // gRPC method to analyze the status of a specific crop block
    @Override
    public void analyzeBlockStatus(CropBlockStatusRequest request, StreamObserver<AnalyzeBlockStatusResponse> responseObserver) {
        int blockId = request.getBlockId();
        if (blockId <= 0) {
            // Invalid block ID, send error status to client
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Block ID must be a positive integer.").asRuntimeException());
            return;
        }

        // Get the status of a specific crop block from the simulator
        FarmEnvironmentSimulator.CropStatus cropStatus = farmEnvironmentSimulator.getBlockStatus(blockId);

        if (cropStatus != null) {
            // Analyze the crop status
            String analysis = analyzeCropStatus(cropStatus);
            // Send the analysis response to the client
            AnalyzeBlockStatusResponse response = AnalyzeBlockStatusResponse.newBuilder()
                    .setMessage(analysis)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            // If blockId not found, send an error status to the client
            responseObserver.onError(Status.NOT_FOUND.withDescription("BlockId not found: " + blockId).asRuntimeException());
        }
    }

    // gRPC method to analyze the statuses of all crop blocks
    @Override
    public void analyzeAllStatuses(Empty request, StreamObserver<AnalyzeAllBlockStatusesResponse> responseObserver) {
        try {
            // Get all crop block statuses from the simulator
            List<FarmEnvironmentSimulator.CropStatus> cropStatuses = farmEnvironmentSimulator.getAllStatuses();

            if (cropStatuses.isEmpty()) {
                // If no crop statuses are available, send an error status to the client
                responseObserver.onError(Status.NOT_FOUND.withDescription("No crop statuses found.").asRuntimeException());
                return;
            }

            // Build AnalyzeAllBlockStatusesResponse containing all analysis results
            AnalyzeAllBlockStatusesResponse.Builder builder = AnalyzeAllBlockStatusesResponse.newBuilder();

            // Analyze each crop status and add the analysis result to the list
            for (FarmEnvironmentSimulator.CropStatus cropStatus : cropStatuses) {
                String analysis = analyzeCropStatus(cropStatus);
                AnalyzeBlockStatusResponse analyzeAllBlockStatusesResponse =  AnalyzeBlockStatusResponse.newBuilder().setMessage(analysis).build();
                builder.addResponses(analyzeAllBlockStatusesResponse);
            }

            // Send the response to the client
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            // If an unexpected error occurs, send an error status to the client
            responseObserver.onError(Status.INTERNAL.withDescription("An unexpected error occurred.").asRuntimeException());
        }
    }

    // Method to analyze the crop status based on environmental factors
    public String analyzeCropStatus(FarmEnvironmentSimulator.CropStatus cropStatus) {
        StringBuilder status = new StringBuilder();

        // Get attributes from CropStatus object
        double lightIntensity = cropStatus.getLightIntensity();
        double humidity = cropStatus.getHumidity();
        double soilFertility = cropStatus.getSoilFertility();
        boolean pestPresence = cropStatus.isPestPresence();

        // Analyze light intensity
        if (lightIntensity >= 80 && lightIntensity <= 120) {
            status.append("Light intensity: Suitable, ");
        } else if (lightIntensity < 80) {
            status.append("Light intensity: Low, ");
        } else {
            status.append("Light intensity: High, ");
        }

        // Analyze humidity
        if (humidity >= 60 && humidity <= 80) {
            status.append("Humidity: Suitable, ");
        } else if (humidity < 60) {
            status.append("Humidity: Low, ");
        } else {
            status.append("Humidity: High, ");
        }

        // Analyze soil fertility
        if (soilFertility >= 0.6 && soilFertility <= 0.8) {
            status.append("Soil fertility: Suitable, ");
        } else if (soilFertility < 0.6) {
            status.append("Soil fertility: Low, ");
        } else {
            status.append("Soil fertility: High, ");
        }

        // Analyze pest presence
        if (!pestPresence) {
            status.append("Pest presence: None");
        } else {
            status.append("Pest presence: Present");
        }

        return status.toString();
    }
}
