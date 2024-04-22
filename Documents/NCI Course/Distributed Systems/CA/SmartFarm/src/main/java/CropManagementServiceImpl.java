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
        // Implement logic to adjust pH level for a specific block
        farmEnvironmentSimulator.setPhLevel(request.getBlockId(), request.getPHLevel()); // Set pH level for the block
        AdjustResponse response = AdjustResponse.newBuilder()
                .setSuccess(true)
                .setMessage("pH level adjusted successfully for block " + request.getBlockId() + " to " + request.getPHLevel())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void pestControl(PestControlRequest request, StreamObserver<AdjustResponse> responseObserver) {
        // Implement logic for pest control in a specific block
        // For demonstration purposes, assume success
        // Here you can implement pest control actions like spraying pesticides, etc.
        farmEnvironmentSimulator.setPestPresence(request.getBlockId(),false);
        AdjustResponse response = AdjustResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Pest control performed successfully for block " + request.getBlockId())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void adjustLightIntensity(AdjustLightIntensityRequest request, StreamObserver<AdjustResponse> responseObserver) {
        // Implement logic to adjust light intensity for a specific block
        farmEnvironmentSimulator.setLightIntensity(request.getBlockId(), request.getLightIntensity()); // Set light intensity for the block
        AdjustResponse response = AdjustResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Light intensity adjusted successfully for block " + request.getBlockId() + " to " + request.getLightIntensity())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
