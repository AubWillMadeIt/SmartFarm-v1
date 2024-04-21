package smartagriculture;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: CropMonitoringService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CropMonitoringServiceGrpc {

  private CropMonitoringServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartagriculture.CropMonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      smartagriculture.CropMonitoringServiceOuterClass.CropStatusList> getGetAllCropStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCropStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = smartagriculture.CropMonitoringServiceOuterClass.CropStatusList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      smartagriculture.CropMonitoringServiceOuterClass.CropStatusList> getGetAllCropStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, smartagriculture.CropMonitoringServiceOuterClass.CropStatusList> getGetAllCropStatusMethod;
    if ((getGetAllCropStatusMethod = CropMonitoringServiceGrpc.getGetAllCropStatusMethod) == null) {
      synchronized (CropMonitoringServiceGrpc.class) {
        if ((getGetAllCropStatusMethod = CropMonitoringServiceGrpc.getGetAllCropStatusMethod) == null) {
          CropMonitoringServiceGrpc.getGetAllCropStatusMethod = getGetAllCropStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, smartagriculture.CropMonitoringServiceOuterClass.CropStatusList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllCropStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropMonitoringServiceOuterClass.CropStatusList.getDefaultInstance()))
              .setSchemaDescriptor(new CropMonitoringServiceMethodDescriptorSupplier("getAllCropStatus"))
              .build();
        }
      }
    }
    return getGetAllCropStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartagriculture.CropMonitoringServiceOuterClass.CropId,
      smartagriculture.CropMonitoringServiceOuterClass.CropStatus> getGetCropStatusByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCropStatusById",
      requestType = smartagriculture.CropMonitoringServiceOuterClass.CropId.class,
      responseType = smartagriculture.CropMonitoringServiceOuterClass.CropStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartagriculture.CropMonitoringServiceOuterClass.CropId,
      smartagriculture.CropMonitoringServiceOuterClass.CropStatus> getGetCropStatusByIdMethod() {
    io.grpc.MethodDescriptor<smartagriculture.CropMonitoringServiceOuterClass.CropId, smartagriculture.CropMonitoringServiceOuterClass.CropStatus> getGetCropStatusByIdMethod;
    if ((getGetCropStatusByIdMethod = CropMonitoringServiceGrpc.getGetCropStatusByIdMethod) == null) {
      synchronized (CropMonitoringServiceGrpc.class) {
        if ((getGetCropStatusByIdMethod = CropMonitoringServiceGrpc.getGetCropStatusByIdMethod) == null) {
          CropMonitoringServiceGrpc.getGetCropStatusByIdMethod = getGetCropStatusByIdMethod =
              io.grpc.MethodDescriptor.<smartagriculture.CropMonitoringServiceOuterClass.CropId, smartagriculture.CropMonitoringServiceOuterClass.CropStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCropStatusById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropMonitoringServiceOuterClass.CropId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropMonitoringServiceOuterClass.CropStatus.getDefaultInstance()))
              .setSchemaDescriptor(new CropMonitoringServiceMethodDescriptorSupplier("getCropStatusById"))
              .build();
        }
      }
    }
    return getGetCropStatusByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CropMonitoringServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CropMonitoringServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CropMonitoringServiceStub>() {
        @java.lang.Override
        public CropMonitoringServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CropMonitoringServiceStub(channel, callOptions);
        }
      };
    return CropMonitoringServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CropMonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CropMonitoringServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CropMonitoringServiceBlockingStub>() {
        @java.lang.Override
        public CropMonitoringServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CropMonitoringServiceBlockingStub(channel, callOptions);
        }
      };
    return CropMonitoringServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CropMonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CropMonitoringServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CropMonitoringServiceFutureStub>() {
        @java.lang.Override
        public CropMonitoringServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CropMonitoringServiceFutureStub(channel, callOptions);
        }
      };
    return CropMonitoringServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllCropStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<smartagriculture.CropMonitoringServiceOuterClass.CropStatusList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCropStatusMethod(), responseObserver);
    }

    /**
     */
    default void getCropStatusById(smartagriculture.CropMonitoringServiceOuterClass.CropId request,
        io.grpc.stub.StreamObserver<smartagriculture.CropMonitoringServiceOuterClass.CropStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCropStatusByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CropMonitoringService.
   */
  public static abstract class CropMonitoringServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CropMonitoringServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CropMonitoringService.
   */
  public static final class CropMonitoringServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CropMonitoringServiceStub> {
    private CropMonitoringServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropMonitoringServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CropMonitoringServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCropStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<smartagriculture.CropMonitoringServiceOuterClass.CropStatusList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCropStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCropStatusById(smartagriculture.CropMonitoringServiceOuterClass.CropId request,
        io.grpc.stub.StreamObserver<smartagriculture.CropMonitoringServiceOuterClass.CropStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCropStatusByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CropMonitoringService.
   */
  public static final class CropMonitoringServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CropMonitoringServiceBlockingStub> {
    private CropMonitoringServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropMonitoringServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CropMonitoringServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartagriculture.CropMonitoringServiceOuterClass.CropStatusList getAllCropStatus(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCropStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartagriculture.CropMonitoringServiceOuterClass.CropStatus getCropStatusById(smartagriculture.CropMonitoringServiceOuterClass.CropId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCropStatusByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CropMonitoringService.
   */
  public static final class CropMonitoringServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CropMonitoringServiceFutureStub> {
    private CropMonitoringServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropMonitoringServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CropMonitoringServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.CropMonitoringServiceOuterClass.CropStatusList> getAllCropStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCropStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.CropMonitoringServiceOuterClass.CropStatus> getCropStatusById(
        smartagriculture.CropMonitoringServiceOuterClass.CropId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCropStatusByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CROP_STATUS = 0;
  private static final int METHODID_GET_CROP_STATUS_BY_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CROP_STATUS:
          serviceImpl.getAllCropStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<smartagriculture.CropMonitoringServiceOuterClass.CropStatusList>) responseObserver);
          break;
        case METHODID_GET_CROP_STATUS_BY_ID:
          serviceImpl.getCropStatusById((smartagriculture.CropMonitoringServiceOuterClass.CropId) request,
              (io.grpc.stub.StreamObserver<smartagriculture.CropMonitoringServiceOuterClass.CropStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAllCropStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              smartagriculture.CropMonitoringServiceOuterClass.CropStatusList>(
                service, METHODID_GET_ALL_CROP_STATUS)))
        .addMethod(
          getGetCropStatusByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartagriculture.CropMonitoringServiceOuterClass.CropId,
              smartagriculture.CropMonitoringServiceOuterClass.CropStatus>(
                service, METHODID_GET_CROP_STATUS_BY_ID)))
        .build();
  }

  private static abstract class CropMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CropMonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartagriculture.CropMonitoringServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CropMonitoringService");
    }
  }

  private static final class CropMonitoringServiceFileDescriptorSupplier
      extends CropMonitoringServiceBaseDescriptorSupplier {
    CropMonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class CropMonitoringServiceMethodDescriptorSupplier
      extends CropMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CropMonitoringServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CropMonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CropMonitoringServiceFileDescriptorSupplier())
              .addMethod(getGetAllCropStatusMethod())
              .addMethod(getGetCropStatusByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
