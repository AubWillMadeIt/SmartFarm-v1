import io.grpc.stub.StreamObserver;
import smartfarming.CropManagementServiceGrpc;
import smartfarming.CropManagementServiceOuterClass.*;

public class CropManagementServiceImpl extends CropManagementServiceGrpc.CropManagementServiceImplBase {

    @Override
    public void adjustPh(AdjustPhRequest request, StreamObserver<AdjustResponse> responseObserver) {
        // Implement logic to adjust pH level for a specific block
        // For demonstration purposes, assume success
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
        // For demonstration purposes, assume success
        AdjustResponse response = AdjustResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Light intensity adjusted successfully for block " + request.getBlockId() + " to " + request.getLightIntensity())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
