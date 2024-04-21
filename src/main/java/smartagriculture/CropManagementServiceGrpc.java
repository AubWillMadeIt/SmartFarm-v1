package smartagriculture;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: CropManagementService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CropManagementServiceGrpc {

  private CropManagementServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartagriculture.CropManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.IrrigationRequest,
      smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> getIrrigateAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "irrigateAll",
      requestType = smartagriculture.CropManagementServiceOuterClass.IrrigationRequest.class,
      responseType = smartagriculture.CropManagementServiceOuterClass.IrrigationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.IrrigationRequest,
      smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> getIrrigateAllMethod() {
    io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.IrrigationRequest, smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> getIrrigateAllMethod;
    if ((getIrrigateAllMethod = CropManagementServiceGrpc.getIrrigateAllMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getIrrigateAllMethod = CropManagementServiceGrpc.getIrrigateAllMethod) == null) {
          CropManagementServiceGrpc.getIrrigateAllMethod = getIrrigateAllMethod =
              io.grpc.MethodDescriptor.<smartagriculture.CropManagementServiceOuterClass.IrrigationRequest, smartagriculture.CropManagementServiceOuterClass.IrrigationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "irrigateAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.IrrigationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.IrrigationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("irrigateAll"))
              .build();
        }
      }
    }
    return getIrrigateAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest,
      smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> getIrrigateCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "irrigateCrop",
      requestType = smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest.class,
      responseType = smartagriculture.CropManagementServiceOuterClass.IrrigationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest,
      smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> getIrrigateCropMethod() {
    io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest, smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> getIrrigateCropMethod;
    if ((getIrrigateCropMethod = CropManagementServiceGrpc.getIrrigateCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getIrrigateCropMethod = CropManagementServiceGrpc.getIrrigateCropMethod) == null) {
          CropManagementServiceGrpc.getIrrigateCropMethod = getIrrigateCropMethod =
              io.grpc.MethodDescriptor.<smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest, smartagriculture.CropManagementServiceOuterClass.IrrigationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "irrigateCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.IrrigationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("irrigateCrop"))
              .build();
        }
      }
    }
    return getIrrigateCropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.FertilizationRequest,
      smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> getFertilizeAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fertilizeAll",
      requestType = smartagriculture.CropManagementServiceOuterClass.FertilizationRequest.class,
      responseType = smartagriculture.CropManagementServiceOuterClass.FertilizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.FertilizationRequest,
      smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> getFertilizeAllMethod() {
    io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.FertilizationRequest, smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> getFertilizeAllMethod;
    if ((getFertilizeAllMethod = CropManagementServiceGrpc.getFertilizeAllMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getFertilizeAllMethod = CropManagementServiceGrpc.getFertilizeAllMethod) == null) {
          CropManagementServiceGrpc.getFertilizeAllMethod = getFertilizeAllMethod =
              io.grpc.MethodDescriptor.<smartagriculture.CropManagementServiceOuterClass.FertilizationRequest, smartagriculture.CropManagementServiceOuterClass.FertilizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fertilizeAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.FertilizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.FertilizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("fertilizeAll"))
              .build();
        }
      }
    }
    return getFertilizeAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest,
      smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> getFertilizeCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fertilizeCrop",
      requestType = smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest.class,
      responseType = smartagriculture.CropManagementServiceOuterClass.FertilizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest,
      smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> getFertilizeCropMethod() {
    io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest, smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> getFertilizeCropMethod;
    if ((getFertilizeCropMethod = CropManagementServiceGrpc.getFertilizeCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getFertilizeCropMethod = CropManagementServiceGrpc.getFertilizeCropMethod) == null) {
          CropManagementServiceGrpc.getFertilizeCropMethod = getFertilizeCropMethod =
              io.grpc.MethodDescriptor.<smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest, smartagriculture.CropManagementServiceOuterClass.FertilizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fertilizeCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.FertilizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("fertilizeCrop"))
              .build();
        }
      }
    }
    return getFertilizeCropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest,
      smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> getSprayPesticidesAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sprayPesticidesAll",
      requestType = smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest.class,
      responseType = smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest,
      smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> getSprayPesticidesAllMethod() {
    io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest, smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> getSprayPesticidesAllMethod;
    if ((getSprayPesticidesAllMethod = CropManagementServiceGrpc.getSprayPesticidesAllMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getSprayPesticidesAllMethod = CropManagementServiceGrpc.getSprayPesticidesAllMethod) == null) {
          CropManagementServiceGrpc.getSprayPesticidesAllMethod = getSprayPesticidesAllMethod =
              io.grpc.MethodDescriptor.<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest, smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sprayPesticidesAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("sprayPesticidesAll"))
              .build();
        }
      }
    }
    return getSprayPesticidesAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest,
      smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> getSprayPesticidesCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sprayPesticidesCrop",
      requestType = smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest.class,
      responseType = smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest,
      smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> getSprayPesticidesCropMethod() {
    io.grpc.MethodDescriptor<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest, smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> getSprayPesticidesCropMethod;
    if ((getSprayPesticidesCropMethod = CropManagementServiceGrpc.getSprayPesticidesCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getSprayPesticidesCropMethod = CropManagementServiceGrpc.getSprayPesticidesCropMethod) == null) {
          CropManagementServiceGrpc.getSprayPesticidesCropMethod = getSprayPesticidesCropMethod =
              io.grpc.MethodDescriptor.<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest, smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sprayPesticidesCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("sprayPesticidesCrop"))
              .build();
        }
      }
    }
    return getSprayPesticidesCropMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CropManagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CropManagementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CropManagementServiceStub>() {
        @java.lang.Override
        public CropManagementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CropManagementServiceStub(channel, callOptions);
        }
      };
    return CropManagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CropManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CropManagementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CropManagementServiceBlockingStub>() {
        @java.lang.Override
        public CropManagementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CropManagementServiceBlockingStub(channel, callOptions);
        }
      };
    return CropManagementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CropManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CropManagementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CropManagementServiceFutureStub>() {
        @java.lang.Override
        public CropManagementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CropManagementServiceFutureStub(channel, callOptions);
        }
      };
    return CropManagementServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void irrigateAll(smartagriculture.CropManagementServiceOuterClass.IrrigationRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIrrigateAllMethod(), responseObserver);
    }

    /**
     */
    default void irrigateCrop(smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIrrigateCropMethod(), responseObserver);
    }

    /**
     */
    default void fertilizeAll(smartagriculture.CropManagementServiceOuterClass.FertilizationRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFertilizeAllMethod(), responseObserver);
    }

    /**
     */
    default void fertilizeCrop(smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFertilizeCropMethod(), responseObserver);
    }

    /**
     */
    default void sprayPesticidesAll(smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSprayPesticidesAllMethod(), responseObserver);
    }

    /**
     */
    default void sprayPesticidesCrop(smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSprayPesticidesCropMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CropManagementService.
   */
  public static abstract class CropManagementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CropManagementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CropManagementService.
   */
  public static final class CropManagementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CropManagementServiceStub> {
    private CropManagementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropManagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CropManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void irrigateAll(smartagriculture.CropManagementServiceOuterClass.IrrigationRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIrrigateAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void irrigateCrop(smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIrrigateCropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fertilizeAll(smartagriculture.CropManagementServiceOuterClass.FertilizationRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFertilizeAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fertilizeCrop(smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFertilizeCropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sprayPesticidesAll(smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSprayPesticidesAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sprayPesticidesCrop(smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest request,
        io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSprayPesticidesCropMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CropManagementService.
   */
  public static final class CropManagementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CropManagementServiceBlockingStub> {
    private CropManagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropManagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CropManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartagriculture.CropManagementServiceOuterClass.IrrigationResponse irrigateAll(smartagriculture.CropManagementServiceOuterClass.IrrigationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIrrigateAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartagriculture.CropManagementServiceOuterClass.IrrigationResponse irrigateCrop(smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIrrigateCropMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartagriculture.CropManagementServiceOuterClass.FertilizationResponse fertilizeAll(smartagriculture.CropManagementServiceOuterClass.FertilizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFertilizeAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartagriculture.CropManagementServiceOuterClass.FertilizationResponse fertilizeCrop(smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFertilizeCropMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse sprayPesticidesAll(smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSprayPesticidesAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse sprayPesticidesCrop(smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSprayPesticidesCropMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CropManagementService.
   */
  public static final class CropManagementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CropManagementServiceFutureStub> {
    private CropManagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropManagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CropManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> irrigateAll(
        smartagriculture.CropManagementServiceOuterClass.IrrigationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIrrigateAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.CropManagementServiceOuterClass.IrrigationResponse> irrigateCrop(
        smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIrrigateCropMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> fertilizeAll(
        smartagriculture.CropManagementServiceOuterClass.FertilizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFertilizeAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.CropManagementServiceOuterClass.FertilizationResponse> fertilizeCrop(
        smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFertilizeCropMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> sprayPesticidesAll(
        smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSprayPesticidesAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse> sprayPesticidesCrop(
        smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSprayPesticidesCropMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IRRIGATE_ALL = 0;
  private static final int METHODID_IRRIGATE_CROP = 1;
  private static final int METHODID_FERTILIZE_ALL = 2;
  private static final int METHODID_FERTILIZE_CROP = 3;
  private static final int METHODID_SPRAY_PESTICIDES_ALL = 4;
  private static final int METHODID_SPRAY_PESTICIDES_CROP = 5;

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
        case METHODID_IRRIGATE_ALL:
          serviceImpl.irrigateAll((smartagriculture.CropManagementServiceOuterClass.IrrigationRequest) request,
              (io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.IrrigationResponse>) responseObserver);
          break;
        case METHODID_IRRIGATE_CROP:
          serviceImpl.irrigateCrop((smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest) request,
              (io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.IrrigationResponse>) responseObserver);
          break;
        case METHODID_FERTILIZE_ALL:
          serviceImpl.fertilizeAll((smartagriculture.CropManagementServiceOuterClass.FertilizationRequest) request,
              (io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.FertilizationResponse>) responseObserver);
          break;
        case METHODID_FERTILIZE_CROP:
          serviceImpl.fertilizeCrop((smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest) request,
              (io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.FertilizationResponse>) responseObserver);
          break;
        case METHODID_SPRAY_PESTICIDES_ALL:
          serviceImpl.sprayPesticidesAll((smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest) request,
              (io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse>) responseObserver);
          break;
        case METHODID_SPRAY_PESTICIDES_CROP:
          serviceImpl.sprayPesticidesCrop((smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest) request,
              (io.grpc.stub.StreamObserver<smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse>) responseObserver);
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
          getIrrigateAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartagriculture.CropManagementServiceOuterClass.IrrigationRequest,
              smartagriculture.CropManagementServiceOuterClass.IrrigationResponse>(
                service, METHODID_IRRIGATE_ALL)))
        .addMethod(
          getIrrigateCropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartagriculture.CropManagementServiceOuterClass.IrrigationCropRequest,
              smartagriculture.CropManagementServiceOuterClass.IrrigationResponse>(
                service, METHODID_IRRIGATE_CROP)))
        .addMethod(
          getFertilizeAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartagriculture.CropManagementServiceOuterClass.FertilizationRequest,
              smartagriculture.CropManagementServiceOuterClass.FertilizationResponse>(
                service, METHODID_FERTILIZE_ALL)))
        .addMethod(
          getFertilizeCropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartagriculture.CropManagementServiceOuterClass.FertilizationCropRequest,
              smartagriculture.CropManagementServiceOuterClass.FertilizationResponse>(
                service, METHODID_FERTILIZE_CROP)))
        .addMethod(
          getSprayPesticidesAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartagriculture.CropManagementServiceOuterClass.SprayPesticidesRequest,
              smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse>(
                service, METHODID_SPRAY_PESTICIDES_ALL)))
        .addMethod(
          getSprayPesticidesCropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartagriculture.CropManagementServiceOuterClass.SprayPesticidesCropRequest,
              smartagriculture.CropManagementServiceOuterClass.SprayPesticidesResponse>(
                service, METHODID_SPRAY_PESTICIDES_CROP)))
        .build();
  }

  private static abstract class CropManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CropManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartagriculture.CropManagementServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CropManagementService");
    }
  }

  private static final class CropManagementServiceFileDescriptorSupplier
      extends CropManagementServiceBaseDescriptorSupplier {
    CropManagementServiceFileDescriptorSupplier() {}
  }

  private static final class CropManagementServiceMethodDescriptorSupplier
      extends CropManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CropManagementServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CropManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CropManagementServiceFileDescriptorSupplier())
              .addMethod(getIrrigateAllMethod())
              .addMethod(getIrrigateCropMethod())
              .addMethod(getFertilizeAllMethod())
              .addMethod(getFertilizeCropMethod())
              .addMethod(getSprayPesticidesAllMethod())
              .addMethod(getSprayPesticidesCropMethod())
              .build();
        }
      }
    }
    return result;
  }
}
