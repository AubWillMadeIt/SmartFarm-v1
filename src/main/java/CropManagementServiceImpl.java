import io.grpc.stub.StreamObserver;
import smartagriculture.CropManagementServiceGrpc.*;
import smartagriculture.CropManagementServiceOuterClass.*;

public class CropManagementServiceImpl extends CropManagementServiceImplBase {
    @Override
    public void irrigateAll(IrrigationRequest request, StreamObserver<IrrigationResponse> responseObserver) {
        // 实现全部灌溉逻辑
         IrrigationResponse response = IrrigationResponse.newBuilder()
                .setMessage("All crops irrigated for " + request.getIrrigationTime() + " minutes.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void irrigateCrop(IrrigationCropRequest request, StreamObserver<IrrigationResponse> responseObserver) {
        // 实现单个作物灌溉逻辑
        IrrigationResponse response = IrrigationResponse.newBuilder()
                .setMessage("Crop with ID " + request.getCropId() + " irrigated for " + request.getIrrigationTime() + " minutes.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void fertilizeAll(FertilizationRequest request, StreamObserver<FertilizationResponse> responseObserver) {
        // 实现全部施肥逻辑
        FertilizationResponse response = FertilizationResponse.newBuilder()
                .setMessage("All crops fertilized with amount " + request.getFertilizerAmount())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void fertilizeCrop(FertilizationCropRequest request, StreamObserver<FertilizationResponse> responseObserver) {
        // 实现单个作物施肥逻辑
        FertilizationResponse response = FertilizationResponse.newBuilder()
                .setMessage("Crop with ID " + request.getCropId() + " fertilized with amount " + request.getFertilizerAmount())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sprayPesticidesAll(SprayPesticidesRequest request, StreamObserver<SprayPesticidesResponse> responseObserver) {
        // 实现全部喷洒农药逻辑
        SprayPesticidesResponse response = SprayPesticidesResponse.newBuilder()
                .setMessage("All crops sprayed with pesticides amount " + request.getPesticidesAmount())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sprayPesticidesCrop(SprayPesticidesCropRequest request, StreamObserver<SprayPesticidesResponse> responseObserver) {
        // 实现单个作物喷洒农药逻辑
        SprayPesticidesResponse response = SprayPesticidesResponse.newBuilder()
                .setMessage("Crop with ID " + request.getCropId() + " sprayed with pesticides amount " + request.getPesticidesAmount())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
