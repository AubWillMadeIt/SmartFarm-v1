import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import smartagriculture.CropMonitoringServiceOuterClass.*;
import smartagriculture.CropMonitoringServiceGrpc;
import java.util.ArrayList;
import java.util.List;

public class CropMonitoringServiceImpl extends CropMonitoringServiceGrpc.CropMonitoringServiceImplBase {
    private List<CropStatus> cropStatuses = new ArrayList<>();

    @Override
    public void getAllCropStatus(Empty request, StreamObserver<CropStatusList> responseObserver) {
        CropStatusList.Builder cropStatusListBuilder = CropStatusList.newBuilder();
        cropStatusListBuilder.addAllCropStatusList(cropStatuses);
        responseObserver.onNext(cropStatusListBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getCropStatusById(CropId request, StreamObserver<CropStatus> responseObserver) {
        for (CropStatus cropStatus : cropStatuses) {
            if (cropStatus.getId() == request.getId()) {
                responseObserver.onNext(cropStatus);
                responseObserver.onCompleted();
                return;
            }
        }
        responseObserver.onError(new StatusRuntimeException(Status.NOT_FOUND.withDescription("Crop with id " + request.getId() + " not found.")));
    }
}