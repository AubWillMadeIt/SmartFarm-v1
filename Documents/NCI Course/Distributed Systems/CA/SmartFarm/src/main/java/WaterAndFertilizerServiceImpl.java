import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import smartfarming.WaterAndFertilizerServiceGrpc;
import smartfarming.WaterAndFertilizerServiceOuterClass.*;

// Implementation of gRPC service for water and fertilizer actions
public class WaterAndFertilizerServiceImpl extends WaterAndFertilizerServiceGrpc.WaterAndFertilizerServiceImplBase {

    protected FarmEnvironmentSimulator farmEnvironmentSimulator;

    // Constructor for WaterAndFertilizerServiceImpl
    public WaterAndFertilizerServiceImpl(FarmEnvironmentSimulator farmEnvironmentSimulator) {
        this.farmEnvironmentSimulator = farmEnvironmentSimulator;
    }

    // gRPC method to water all blocks
    @Override
    public void waterAll(WaterRequest request, StreamObserver<ActionResponse> responseObserver) {
        try {

            // Validate the request
            if (request == null || request.getWateringTime() <= 0) {
                throw new IllegalArgumentException("Invalid request: wateringTime must be a positive value");
            }

            // Implement logic to water all blocks
            // For demonstration purposes, assume success
            farmEnvironmentSimulator.changeAllHumidity(request.getWateringTime() / 10); // Increase humidity based on watering time
            ActionResponse response = ActionResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("All blocks watered successfully")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Handle any errors
            responseObserver.onError(e);
        }
    }

    // gRPC method to water a specific block
    @Override
    public void waterBlock(WaterRequest request, StreamObserver<ActionResponse> responseObserver) {
        try {
            // Validate the request
            if (request == null || request.getBlockId() <= 0 || request.getWateringTime() <= 0) {
                throw new IllegalArgumentException("Invalid request: blockId must be a positive value, and wateringTime must be a positive value");
            }

            // block not found
            FarmEnvironmentSimulator.CropStatus cropStatus = farmEnvironmentSimulator.getBlockStatus(request.getBlockId());
            if(cropStatus==null) {
                responseObserver.onError(Status.NOT_FOUND.withDescription("BlockId not found: " + request.getBlockId()).asRuntimeException());
                return;
            }
            // Implement logic to water a specific block
            // For demonstration purposes, assume success
            farmEnvironmentSimulator.changeHumidity(request.getBlockId(), request.getWateringTime() / 10); // Increase humidity based on watering time
            ActionResponse response = ActionResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Block " + request.getBlockId() + " watered successfully")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Handle any errors
            responseObserver.onError(e);
        }
    }

    // gRPC method to fertilize all blocks
    @Override
    public void fertilizeAll(FertilizeRequest request, StreamObserver<ActionResponse> responseObserver) {
        try {
            // Validate the request
            if (request == null || request.getFertilizerAmount() <= 0) {
                throw new IllegalArgumentException("Invalid request: fertilizerAmount must be a positive value");
            }
            // Implement logic to fertilize all blocks
            // For demonstration purposes, assume success
            farmEnvironmentSimulator.changeAllSoilFertility(request.getFertilizerAmount() * 0.05); // Increase soil fertility by the fertilizer amount
            ActionResponse response = ActionResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("All blocks fertilized successfully with " + request.getFertilizerAmount() + " amount of fertilizer")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Handle any errors
            responseObserver.onError(e);
        }
    }

    // gRPC method to fertilize a specific block
    @Override
    public void fertilizeBlock(FertilizeRequest request, StreamObserver<ActionResponse> responseObserver) {
        try {
            // Validate the request
            if (request == null || request.getBlockId() <= 0 || request.getFertilizerAmount() <= 0) {
                throw new IllegalArgumentException("Invalid request: blockId must be a positive value, and fertilizerAmount must be a positive value");
            }

            // block not found
            FarmEnvironmentSimulator.CropStatus cropStatus = farmEnvironmentSimulator.getBlockStatus(request.getBlockId());
            if(cropStatus==null) {
                responseObserver.onError(Status.NOT_FOUND.withDescription("BlockId not found: " + request.getBlockId()).asRuntimeException());
                return;
            }

            // Implement logic to fertilize a specific block
            // For demonstration purposes, assume success
            farmEnvironmentSimulator.changeSoilFertility(request.getBlockId(), request.getFertilizerAmount() * 0.05 ); // Increase soil fertility by the fertilizer amount
            ActionResponse response = ActionResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Block " + request.getBlockId() + " fertilized successfully with " + request.getFertilizerAmount() + " amount of fertilizer")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Handle any errors
            responseObserver.onError(e);
        }
    }

}
