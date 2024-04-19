import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import smartfarming.CropManagementServiceGrpc;
import smartfarming.CropManagementServiceOuterClass.*;

public class CropManagementServiceImpl extends CropManagementServiceGrpc.CropManagementServiceImplBase {

    protected FarmEnvironmentSimulator farmEnvironmentSimulator;
    
    public CropManagementServiceImpl(FarmEnvironmentSimulator farmEnvironmentSimulator) {
        this.farmEnvironmentSimulator = farmEnvironmentSimulator;
    }

    @Override
    public void adjustPh(AdjustPHRequest request, StreamObserver<AdjustResponse> responseObserver) {
        int blockId = request.getBlockId();
        double pHLevel = request.getPHLevel();
        if (blockId <= 0) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Block ID must be a positive integer.").asRuntimeException());
            return;
        }
        if (pHLevel < 0 || pHLevel > 14) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("pH level must be between 0 and 14.").asRuntimeException());
            return;
        }
        // Implement logic to adjust pH level for a specific block
        farmEnvironmentSimulator.setPhLevel(blockId, pHLevel); // Set pH level for the block
        AdjustResponse response = AdjustResponse.newBuilder()
                .setSuccess(true)
                .setMessage("pH level adjusted successfully for block " + blockId + " to " + pHLevel)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void pestControl(PestControlRequest request, StreamObserver<AdjustResponse> responseObserver) {
        int blockId = request.getBlockId();
        if (blockId <= 0) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Block ID must be a positive integer.").asRuntimeException());
            return;
        }
        // Implement logic for pest control in a specific block
        // For demonstration purposes, assume success
        // Here you can implement pest control actions like spraying pesticides, etc.
        farmEnvironmentSimulator.setPestPresence(blockId, false);
        AdjustResponse response = AdjustResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Pest control performed successfully for block " + blockId)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void adjustLightIntensity(AdjustLightIntensityRequest request, StreamObserver<AdjustResponse> responseObserver) {
        int blockId = request.getBlockId();
        double lightIntensity = request.getLightIntensity();
        if (blockId <= 0) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Block ID must be a positive integer.").asRuntimeException());
            return;
        }
        // Implement logic to adjust light intensity for a specific block
        farmEnvironmentSimulator.setLightIntensity(blockId, lightIntensity); // Set light intensity for the block
        AdjustResponse response = AdjustResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Light intensity adjusted successfully for block " + blockId + " to " + lightIntensity)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
