import io.grpc.stub.StreamObserver;
import smartfarming.WaterAndFertilizerServiceGrpc;
import smartfarming.WaterAndFertilizerServiceOuterClass.*;

public class WaterAndFertilizerServiceImpl extends WaterAndFertilizerServiceGrpc.WaterAndFertilizerServiceImplBase {

    @Override
    public void waterAll(WaterRequest request, StreamObserver<ActionResponse> responseObserver) {
        // Implement logic to water all blocks
        // For demonstration purposes, assume success
        ActionResponse response = ActionResponse.newBuilder()
                .setSuccess(true)
                .setMessage("All blocks watered successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void waterBlock(WaterRequest request, StreamObserver<ActionResponse> responseObserver) {
        // Implement logic to water a specific block
        // For demonstration purposes, assume success
        ActionResponse response = ActionResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Block " + request.getBlockId() + " watered successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void fertilizeAll(FertilizeRequest request, StreamObserver<ActionResponse> responseObserver) {
        // Implement logic to fertilize all blocks
        // For demonstration purposes, assume success
        ActionResponse response = ActionResponse.newBuilder()
                .setSuccess(true)
                .setMessage("All blocks fertilized successfully with " + request.getFertilizerAmount() + " amount of fertilizer")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void fertilizeBlock(FertilizeRequest request, StreamObserver<ActionResponse> responseObserver) {
        // Implement logic to fertilize a specific block
        // For demonstration purposes, assume success
        ActionResponse response = ActionResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Block " + request.getBlockId() + " fertilized successfully with " + request.getFertilizerAmount() + " amount of fertilizer")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
