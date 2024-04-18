package smartfarming;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for managing water and fertilizer actions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: WaterAndFertilizerService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WaterAndFertilizerServiceGrpc {

  private WaterAndFertilizerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartfarming.WaterAndFertilizerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest,
      smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getWaterAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaterAll",
      requestType = smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest.class,
      responseType = smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest,
      smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getWaterAllMethod() {
    io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest, smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getWaterAllMethod;
    if ((getWaterAllMethod = WaterAndFertilizerServiceGrpc.getWaterAllMethod) == null) {
      synchronized (WaterAndFertilizerServiceGrpc.class) {
        if ((getWaterAllMethod = WaterAndFertilizerServiceGrpc.getWaterAllMethod) == null) {
          WaterAndFertilizerServiceGrpc.getWaterAllMethod = getWaterAllMethod =
              io.grpc.MethodDescriptor.<smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest, smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaterAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WaterAndFertilizerServiceMethodDescriptorSupplier("WaterAll"))
              .build();
        }
      }
    }
    return getWaterAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest,
      smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getWaterBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaterBlock",
      requestType = smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest.class,
      responseType = smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest,
      smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getWaterBlockMethod() {
    io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest, smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getWaterBlockMethod;
    if ((getWaterBlockMethod = WaterAndFertilizerServiceGrpc.getWaterBlockMethod) == null) {
      synchronized (WaterAndFertilizerServiceGrpc.class) {
        if ((getWaterBlockMethod = WaterAndFertilizerServiceGrpc.getWaterBlockMethod) == null) {
          WaterAndFertilizerServiceGrpc.getWaterBlockMethod = getWaterBlockMethod =
              io.grpc.MethodDescriptor.<smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest, smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaterBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WaterAndFertilizerServiceMethodDescriptorSupplier("WaterBlock"))
              .build();
        }
      }
    }
    return getWaterBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest,
      smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getFertilizeAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FertilizeAll",
      requestType = smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest.class,
      responseType = smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest,
      smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getFertilizeAllMethod() {
    io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest, smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getFertilizeAllMethod;
    if ((getFertilizeAllMethod = WaterAndFertilizerServiceGrpc.getFertilizeAllMethod) == null) {
      synchronized (WaterAndFertilizerServiceGrpc.class) {
        if ((getFertilizeAllMethod = WaterAndFertilizerServiceGrpc.getFertilizeAllMethod) == null) {
          WaterAndFertilizerServiceGrpc.getFertilizeAllMethod = getFertilizeAllMethod =
              io.grpc.MethodDescriptor.<smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest, smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FertilizeAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WaterAndFertilizerServiceMethodDescriptorSupplier("FertilizeAll"))
              .build();
        }
      }
    }
    return getFertilizeAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest,
      smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getFertilizeBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FertilizeBlock",
      requestType = smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest.class,
      responseType = smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest,
      smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getFertilizeBlockMethod() {
    io.grpc.MethodDescriptor<smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest, smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> getFertilizeBlockMethod;
    if ((getFertilizeBlockMethod = WaterAndFertilizerServiceGrpc.getFertilizeBlockMethod) == null) {
      synchronized (WaterAndFertilizerServiceGrpc.class) {
        if ((getFertilizeBlockMethod = WaterAndFertilizerServiceGrpc.getFertilizeBlockMethod) == null) {
          WaterAndFertilizerServiceGrpc.getFertilizeBlockMethod = getFertilizeBlockMethod =
              io.grpc.MethodDescriptor.<smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest, smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FertilizeBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WaterAndFertilizerServiceMethodDescriptorSupplier("FertilizeBlock"))
              .build();
        }
      }
    }
    return getFertilizeBlockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterAndFertilizerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterAndFertilizerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterAndFertilizerServiceStub>() {
        @java.lang.Override
        public WaterAndFertilizerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterAndFertilizerServiceStub(channel, callOptions);
        }
      };
    return WaterAndFertilizerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterAndFertilizerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterAndFertilizerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterAndFertilizerServiceBlockingStub>() {
        @java.lang.Override
        public WaterAndFertilizerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterAndFertilizerServiceBlockingStub(channel, callOptions);
        }
      };
    return WaterAndFertilizerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterAndFertilizerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterAndFertilizerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterAndFertilizerServiceFutureStub>() {
        @java.lang.Override
        public WaterAndFertilizerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterAndFertilizerServiceFutureStub(channel, callOptions);
        }
      };
    return WaterAndFertilizerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for managing water and fertilizer actions
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RPC method to water all blocks
     * </pre>
     */
    default void waterAll(smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest request,
        io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWaterAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to water a specific block
     * </pre>
     */
    default void waterBlock(smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest request,
        io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWaterBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to fertilize all blocks
     * </pre>
     */
    default void fertilizeAll(smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest request,
        io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFertilizeAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to fertilize a specific block
     * </pre>
     */
    default void fertilizeBlock(smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest request,
        io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFertilizeBlockMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WaterAndFertilizerService.
   * <pre>
   * Service for managing water and fertilizer actions
   * </pre>
   */
  public static abstract class WaterAndFertilizerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WaterAndFertilizerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WaterAndFertilizerService.
   * <pre>
   * Service for managing water and fertilizer actions
   * </pre>
   */
  public static final class WaterAndFertilizerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WaterAndFertilizerServiceStub> {
    private WaterAndFertilizerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterAndFertilizerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterAndFertilizerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to water all blocks
     * </pre>
     */
    public void waterAll(smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest request,
        io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWaterAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to water a specific block
     * </pre>
     */
    public void waterBlock(smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest request,
        io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWaterBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to fertilize all blocks
     * </pre>
     */
    public void fertilizeAll(smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest request,
        io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFertilizeAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to fertilize a specific block
     * </pre>
     */
    public void fertilizeBlock(smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest request,
        io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFertilizeBlockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WaterAndFertilizerService.
   * <pre>
   * Service for managing water and fertilizer actions
   * </pre>
   */
  public static final class WaterAndFertilizerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WaterAndFertilizerServiceBlockingStub> {
    private WaterAndFertilizerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterAndFertilizerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterAndFertilizerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to water all blocks
     * </pre>
     */
    public smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse waterAll(smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWaterAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to water a specific block
     * </pre>
     */
    public smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse waterBlock(smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWaterBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to fertilize all blocks
     * </pre>
     */
    public smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse fertilizeAll(smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFertilizeAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to fertilize a specific block
     * </pre>
     */
    public smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse fertilizeBlock(smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFertilizeBlockMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WaterAndFertilizerService.
   * <pre>
   * Service for managing water and fertilizer actions
   * </pre>
   */
  public static final class WaterAndFertilizerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WaterAndFertilizerServiceFutureStub> {
    private WaterAndFertilizerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterAndFertilizerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterAndFertilizerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to water all blocks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> waterAll(
        smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWaterAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to water a specific block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> waterBlock(
        smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWaterBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to fertilize all blocks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> fertilizeAll(
        smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFertilizeAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to fertilize a specific block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse> fertilizeBlock(
        smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFertilizeBlockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WATER_ALL = 0;
  private static final int METHODID_WATER_BLOCK = 1;
  private static final int METHODID_FERTILIZE_ALL = 2;
  private static final int METHODID_FERTILIZE_BLOCK = 3;

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
        case METHODID_WATER_ALL:
          serviceImpl.waterAll((smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>) responseObserver);
          break;
        case METHODID_WATER_BLOCK:
          serviceImpl.waterBlock((smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>) responseObserver);
          break;
        case METHODID_FERTILIZE_ALL:
          serviceImpl.fertilizeAll((smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>) responseObserver);
          break;
        case METHODID_FERTILIZE_BLOCK:
          serviceImpl.fertilizeBlock((smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>) responseObserver);
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
          getWaterAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest,
              smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>(
                service, METHODID_WATER_ALL)))
        .addMethod(
          getWaterBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.WaterAndFertilizerServiceOuterClass.WaterRequest,
              smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>(
                service, METHODID_WATER_BLOCK)))
        .addMethod(
          getFertilizeAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest,
              smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>(
                service, METHODID_FERTILIZE_ALL)))
        .addMethod(
          getFertilizeBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.WaterAndFertilizerServiceOuterClass.FertilizeRequest,
              smartfarming.WaterAndFertilizerServiceOuterClass.ActionResponse>(
                service, METHODID_FERTILIZE_BLOCK)))
        .build();
  }

  private static abstract class WaterAndFertilizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterAndFertilizerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartfarming.WaterAndFertilizerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterAndFertilizerService");
    }
  }

  private static final class WaterAndFertilizerServiceFileDescriptorSupplier
      extends WaterAndFertilizerServiceBaseDescriptorSupplier {
    WaterAndFertilizerServiceFileDescriptorSupplier() {}
  }

  private static final class WaterAndFertilizerServiceMethodDescriptorSupplier
      extends WaterAndFertilizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WaterAndFertilizerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WaterAndFertilizerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterAndFertilizerServiceFileDescriptorSupplier())
              .addMethod(getWaterAllMethod())
              .addMethod(getWaterBlockMethod())
              .addMethod(getFertilizeAllMethod())
              .addMethod(getFertilizeBlockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
