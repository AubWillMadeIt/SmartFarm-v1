package smartfarming;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for managing crop block statuses
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: CropMonitoringService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CropMonitoringServiceGrpc {

  private CropMonitoringServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartfarming.CropMonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest,
      smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus> getGetBlockStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockStatus",
      requestType = smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest.class,
      responseType = smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest,
      smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus> getGetBlockStatusMethod() {
    io.grpc.MethodDescriptor<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest, smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus> getGetBlockStatusMethod;
    if ((getGetBlockStatusMethod = CropMonitoringServiceGrpc.getGetBlockStatusMethod) == null) {
      synchronized (CropMonitoringServiceGrpc.class) {
        if ((getGetBlockStatusMethod = CropMonitoringServiceGrpc.getGetBlockStatusMethod) == null) {
          CropMonitoringServiceGrpc.getGetBlockStatusMethod = getGetBlockStatusMethod =
              io.grpc.MethodDescriptor.<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest, smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus.getDefaultInstance()))
              .setSchemaDescriptor(new CropMonitoringServiceMethodDescriptorSupplier("GetBlockStatus"))
              .build();
        }
      }
    }
    return getGetBlockStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse> getGetAllStatusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStatuses",
      requestType = com.google.protobuf.Empty.class,
      responseType = smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse> getGetAllStatusesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse> getGetAllStatusesMethod;
    if ((getGetAllStatusesMethod = CropMonitoringServiceGrpc.getGetAllStatusesMethod) == null) {
      synchronized (CropMonitoringServiceGrpc.class) {
        if ((getGetAllStatusesMethod = CropMonitoringServiceGrpc.getGetAllStatusesMethod) == null) {
          CropMonitoringServiceGrpc.getGetAllStatusesMethod = getGetAllStatusesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStatuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropMonitoringServiceMethodDescriptorSupplier("GetAllStatuses"))
              .build();
        }
      }
    }
    return getGetAllStatusesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest,
      smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse> getAnalyzeBlockStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeBlockStatus",
      requestType = smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest.class,
      responseType = smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest,
      smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse> getAnalyzeBlockStatusMethod() {
    io.grpc.MethodDescriptor<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest, smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse> getAnalyzeBlockStatusMethod;
    if ((getAnalyzeBlockStatusMethod = CropMonitoringServiceGrpc.getAnalyzeBlockStatusMethod) == null) {
      synchronized (CropMonitoringServiceGrpc.class) {
        if ((getAnalyzeBlockStatusMethod = CropMonitoringServiceGrpc.getAnalyzeBlockStatusMethod) == null) {
          CropMonitoringServiceGrpc.getAnalyzeBlockStatusMethod = getAnalyzeBlockStatusMethod =
              io.grpc.MethodDescriptor.<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest, smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzeBlockStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropMonitoringServiceMethodDescriptorSupplier("AnalyzeBlockStatus"))
              .build();
        }
      }
    }
    return getAnalyzeBlockStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse> getAnalyzeAllStatusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeAllStatuses",
      requestType = com.google.protobuf.Empty.class,
      responseType = smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse> getAnalyzeAllStatusesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse> getAnalyzeAllStatusesMethod;
    if ((getAnalyzeAllStatusesMethod = CropMonitoringServiceGrpc.getAnalyzeAllStatusesMethod) == null) {
      synchronized (CropMonitoringServiceGrpc.class) {
        if ((getAnalyzeAllStatusesMethod = CropMonitoringServiceGrpc.getAnalyzeAllStatusesMethod) == null) {
          CropMonitoringServiceGrpc.getAnalyzeAllStatusesMethod = getAnalyzeAllStatusesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzeAllStatuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CropMonitoringServiceMethodDescriptorSupplier("AnalyzeAllStatuses"))
              .build();
        }
      }
    }
    return getAnalyzeAllStatusesMethod;
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
   * <pre>
   * Service for managing crop block statuses
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RPC method to get the status of a specific crop block
     * </pre>
     */
    default void getBlockStatus(smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to get the statuses of all crop blocks
     * </pre>
     */
    default void getAllStatuses(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStatusesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to analyze the status of a specific crop block
     * </pre>
     */
    default void analyzeBlockStatus(smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeBlockStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to analyze the statuses of all crop blocks
     * </pre>
     */
    default void analyzeAllStatuses(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeAllStatusesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CropMonitoringService.
   * <pre>
   * Service for managing crop block statuses
   * </pre>
   */
  public static abstract class CropMonitoringServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CropMonitoringServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CropMonitoringService.
   * <pre>
   * Service for managing crop block statuses
   * </pre>
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
     * <pre>
     * RPC method to get the status of a specific crop block
     * </pre>
     */
    public void getBlockStatus(smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to get the statuses of all crop blocks
     * </pre>
     */
    public void getAllStatuses(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStatusesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to analyze the status of a specific crop block
     * </pre>
     */
    public void analyzeBlockStatus(smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest request,
        io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeBlockStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to analyze the statuses of all crop blocks
     * </pre>
     */
    public void analyzeAllStatuses(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeAllStatusesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CropMonitoringService.
   * <pre>
   * Service for managing crop block statuses
   * </pre>
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
     * <pre>
     * RPC method to get the status of a specific crop block
     * </pre>
     */
    public smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus getBlockStatus(smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to get the statuses of all crop blocks
     * </pre>
     */
    public smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse getAllStatuses(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStatusesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to analyze the status of a specific crop block
     * </pre>
     */
    public smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse analyzeBlockStatus(smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeBlockStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to analyze the statuses of all crop blocks
     * </pre>
     */
    public smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse analyzeAllStatuses(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeAllStatusesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CropMonitoringService.
   * <pre>
   * Service for managing crop block statuses
   * </pre>
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
     * <pre>
     * RPC method to get the status of a specific crop block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus> getBlockStatus(
        smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to get the statuses of all crop blocks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse> getAllStatuses(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllStatusesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to analyze the status of a specific crop block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse> analyzeBlockStatus(
        smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzeBlockStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to analyze the statuses of all crop blocks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse> analyzeAllStatuses(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzeAllStatusesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BLOCK_STATUS = 0;
  private static final int METHODID_GET_ALL_STATUSES = 1;
  private static final int METHODID_ANALYZE_BLOCK_STATUS = 2;
  private static final int METHODID_ANALYZE_ALL_STATUSES = 3;

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
        case METHODID_GET_BLOCK_STATUS:
          serviceImpl.getBlockStatus((smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus>) responseObserver);
          break;
        case METHODID_GET_ALL_STATUSES:
          serviceImpl.getAllStatuses((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse>) responseObserver);
          break;
        case METHODID_ANALYZE_BLOCK_STATUS:
          serviceImpl.analyzeBlockStatus((smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest) request,
              (io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse>) responseObserver);
          break;
        case METHODID_ANALYZE_ALL_STATUSES:
          serviceImpl.analyzeAllStatuses((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse>) responseObserver);
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
          getGetBlockStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest,
              smartfarming.CropMonitoringServiceOuterClass.CropBlockStatus>(
                service, METHODID_GET_BLOCK_STATUS)))
        .addMethod(
          getGetAllStatusesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              smartfarming.CropMonitoringServiceOuterClass.CropAllStatusesResponse>(
                service, METHODID_GET_ALL_STATUSES)))
        .addMethod(
          getAnalyzeBlockStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartfarming.CropMonitoringServiceOuterClass.CropBlockStatusRequest,
              smartfarming.CropMonitoringServiceOuterClass.AnalyzeBlockStatusResponse>(
                service, METHODID_ANALYZE_BLOCK_STATUS)))
        .addMethod(
          getAnalyzeAllStatusesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              smartfarming.CropMonitoringServiceOuterClass.AnalyzeAllBlockStatusesResponse>(
                service, METHODID_ANALYZE_ALL_STATUSES)))
        .build();
  }

  private static abstract class CropMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CropMonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartfarming.CropMonitoringServiceOuterClass.getDescriptor();
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
              .addMethod(getGetBlockStatusMethod())
              .addMethod(getGetAllStatusesMethod())
              .addMethod(getAnalyzeBlockStatusMethod())
              .addMethod(getAnalyzeAllStatusesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
