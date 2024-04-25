package smartfarming;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for managing crop-related actions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: CropManagementService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CropManagementServiceGrpc {

  private CropManagementServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartfarming.CropManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.AdjustPHRequest,
      smartfarming.CropManagementServiceOuterClass.AdjustResponse> getAdjustPhMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustPh",
      requestType = smartfarming.CropManagementServiceOuterClass.AdjustPHRequest.class,
      responseType = smartfarming.CropManagementServiceOuterClass.AdjustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.AdjustPHRequest,
      smartfarming.CropManagementServiceOuterClass.AdjustResponse> getAdjustPhMethod() {
    io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.AdjustPHRequest, smartfarming.CropManagementServiceOuterClass.AdjustResponse> getAdjustPhMethod;
    if ((getAdjustPhMethod = CropManagementServiceGrpc.getAdjustPhMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getAdjustPhMethod = CropManagementServiceGrpc.getAdjustPhMethod) == null) {
          CropManagementServiceGrpc.getAdjustPhMethod = getAdjustPhMethod =
              io.grpc.MethodDescriptor.<smartfarming.CropManagementServiceOuterClass.AdjustPHRequest, smartfarming.CropManagementServiceOuterClass.AdjustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustPh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropManagementServiceOuterClass.AdjustPHRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropManagementServiceOuterClass.AdjustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("AdjustPh"))
              .build();
        }
      }
    }
    return getAdjustPhMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.PestControlRequest,
      smartfarming.CropManagementServiceOuterClass.AdjustResponse> getPestControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PestControl",
      requestType = smartfarming.CropManagementServiceOuterClass.PestControlRequest.class,
      responseType = smartfarming.CropManagementServiceOuterClass.AdjustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.PestControlRequest,
      smartfarming.CropManagementServiceOuterClass.AdjustResponse> getPestControlMethod() {
    io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.PestControlRequest, smartfarming.CropManagementServiceOuterClass.AdjustResponse> getPestControlMethod;
    if ((getPestControlMethod = CropManagementServiceGrpc.getPestControlMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getPestControlMethod = CropManagementServiceGrpc.getPestControlMethod) == null) {
          CropManagementServiceGrpc.getPestControlMethod = getPestControlMethod =
              io.grpc.MethodDescriptor.<smartfarming.CropManagementServiceOuterClass.PestControlRequest, smartfarming.CropManagementServiceOuterClass.AdjustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PestControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropManagementServiceOuterClass.PestControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropManagementServiceOuterClass.AdjustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("PestControl"))
              .build();
        }
      }
    }
    return getPestControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest,
      smartfarming.CropManagementServiceOuterClass.AdjustResponse> getAdjustLightIntensityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustLightIntensity",
      requestType = smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest.class,
      responseType = smartfarming.CropManagementServiceOuterClass.AdjustResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest,
      smartfarming.CropManagementServiceOuterClass.AdjustResponse> getAdjustLightIntensityMethod() {
    io.grpc.MethodDescriptor<smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest, smartfarming.CropManagementServiceOuterClass.AdjustResponse> getAdjustLightIntensityMethod;
    if ((getAdjustLightIntensityMethod = CropManagementServiceGrpc.getAdjustLightIntensityMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getAdjustLightIntensityMethod = CropManagementServiceGrpc.getAdjustLightIntensityMethod) == null) {
          CropManagementServiceGrpc.getAdjustLightIntensityMethod = getAdjustLightIntensityMethod =
              io.grpc.MethodDescriptor.<smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest, smartfarming.CropManagementServiceOuterClass.AdjustResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustLightIntensity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropManagementServiceOuterClass.AdjustResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("AdjustLightIntensity"))
              .build();
        }
      }
    }
    return getAdjustLightIntensityMethod;
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
   * <pre>
   * Service for managing crop-related actions
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RPC method to adjust pH level for a specific block
     * </pre>
     */
    default void adjustPh(smartfarming.CropManagementServiceOuterClass.AdjustPHRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdjustPhMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method for pest control in a specific block
     * </pre>
     */
    default void pestControl(smartfarming.CropManagementServiceOuterClass.PestControlRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPestControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to adjust light intensity for a specific block
     * </pre>
     */
    default void adjustLightIntensity(smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdjustLightIntensityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CropManagementService.
   * <pre>
   * Service for managing crop-related actions
   * </pre>
   */
  public static abstract class CropManagementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CropManagementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CropManagementService.
   * <pre>
   * Service for managing crop-related actions
   * </pre>
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
     * <pre>
     * RPC method to adjust pH level for a specific block
     * </pre>
     */
    public void adjustPh(smartfarming.CropManagementServiceOuterClass.AdjustPHRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdjustPhMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method for pest control in a specific block
     * </pre>
     */
    public void pestControl(smartfarming.CropManagementServiceOuterClass.PestControlRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPestControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to adjust light intensity for a specific block
     * </pre>
     */
    public void adjustLightIntensity(smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdjustLightIntensityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CropManagementService.
   * <pre>
   * Service for managing crop-related actions
   * </pre>
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
     * <pre>
     * RPC method to adjust pH level for a specific block
     * </pre>
     */
    public smartfarming.CropManagementServiceOuterClass.AdjustResponse adjustPh(smartfarming.CropManagementServiceOuterClass.AdjustPHRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdjustPhMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method for pest control in a specific block
     * </pre>
     */
    public smartfarming.CropManagementServiceOuterClass.AdjustResponse pestControl(smartfarming.CropManagementServiceOuterClass.PestControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPestControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to adjust light intensity for a specific block
     * </pre>
     */
    public smartfarming.CropManagementServiceOuterClass.AdjustResponse adjustLightIntensity(smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdjustLightIntensityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CropManagementService.
   * <pre>
   * Service for managing crop-related actions
   * </pre>
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
     * <pre>
     * RPC method to adjust pH level for a specific block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.CropManagementServiceOuterClass.AdjustResponse> adjustPh(
        smartfarming.CropManagementServiceOuterClass.AdjustPHRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdjustPhMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method for pest control in a specific block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.CropManagementServiceOuterClass.AdjustResponse> pestControl(
        smartfarming.CropManagementServiceOuterClass.PestControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPestControlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to adjust light intensity for a specific block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.CropManagementServiceOuterClass.AdjustResponse> adjustLightIntensity(
        smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdjustLightIntensityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADJUST_PH = 0;
  private static final int METHODID_PEST_CONTROL = 1;
  private static final int METHODID_ADJUST_LIGHT_INTENSITY = 2;

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
        case METHODID_ADJUST_PH:
          serviceImpl.adjustPh((smartfarming.CropManagementServiceOuterClass.AdjustPHRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse>) responseObserver);
          break;
        case METHODID_PEST_CONTROL:
          serviceImpl.pestControl((smartfarming.CropManagementServiceOuterClass.PestControlRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse>) responseObserver);
          break;
        case METHODID_ADJUST_LIGHT_INTENSITY:
          serviceImpl.adjustLightIntensity((smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.CropManagementServiceOuterClass.AdjustResponse>) responseObserver);
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
          getAdjustPhMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.CropManagementServiceOuterClass.AdjustPHRequest,
              smartfarming.CropManagementServiceOuterClass.AdjustResponse>(
                service, METHODID_ADJUST_PH)))
        .addMethod(
          getPestControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.CropManagementServiceOuterClass.PestControlRequest,
              smartfarming.CropManagementServiceOuterClass.AdjustResponse>(
                service, METHODID_PEST_CONTROL)))
        .addMethod(
          getAdjustLightIntensityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.CropManagementServiceOuterClass.AdjustLightIntensityRequest,
              smartfarming.CropManagementServiceOuterClass.AdjustResponse>(
                service, METHODID_ADJUST_LIGHT_INTENSITY)))
        .build();
  }

  private static abstract class CropManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CropManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartfarming.CropManagementServiceOuterClass.getDescriptor();
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
              .addMethod(getAdjustPhMethod())
              .addMethod(getPestControlMethod())
              .addMethod(getAdjustLightIntensityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
