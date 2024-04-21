package smartagriculture;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: DataAnalysisService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataAnalysisServiceGrpc {

  private DataAnalysisServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartagriculture.DataAnalysisService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartagriculture.DataAnalysisServiceOuterClass.SensorData,
      smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis> getAnalyzeSensorDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "analyzeSensorData",
      requestType = smartagriculture.DataAnalysisServiceOuterClass.SensorData.class,
      responseType = smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartagriculture.DataAnalysisServiceOuterClass.SensorData,
      smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis> getAnalyzeSensorDataMethod() {
    io.grpc.MethodDescriptor<smartagriculture.DataAnalysisServiceOuterClass.SensorData, smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis> getAnalyzeSensorDataMethod;
    if ((getAnalyzeSensorDataMethod = DataAnalysisServiceGrpc.getAnalyzeSensorDataMethod) == null) {
      synchronized (DataAnalysisServiceGrpc.class) {
        if ((getAnalyzeSensorDataMethod = DataAnalysisServiceGrpc.getAnalyzeSensorDataMethod) == null) {
          DataAnalysisServiceGrpc.getAnalyzeSensorDataMethod = getAnalyzeSensorDataMethod =
              io.grpc.MethodDescriptor.<smartagriculture.DataAnalysisServiceOuterClass.SensorData, smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "analyzeSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.DataAnalysisServiceOuterClass.SensorData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis.getDefaultInstance()))
              .setSchemaDescriptor(new DataAnalysisServiceMethodDescriptorSupplier("analyzeSensorData"))
              .build();
        }
      }
    }
    return getAnalyzeSensorDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataAnalysisServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceStub>() {
        @java.lang.Override
        public DataAnalysisServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataAnalysisServiceStub(channel, callOptions);
        }
      };
    return DataAnalysisServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataAnalysisServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceBlockingStub>() {
        @java.lang.Override
        public DataAnalysisServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataAnalysisServiceBlockingStub(channel, callOptions);
        }
      };
    return DataAnalysisServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataAnalysisServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataAnalysisServiceFutureStub>() {
        @java.lang.Override
        public DataAnalysisServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataAnalysisServiceFutureStub(channel, callOptions);
        }
      };
    return DataAnalysisServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void analyzeSensorData(smartagriculture.DataAnalysisServiceOuterClass.SensorData request,
        io.grpc.stub.StreamObserver<smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeSensorDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataAnalysisService.
   */
  public static abstract class DataAnalysisServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataAnalysisServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataAnalysisService.
   */
  public static final class DataAnalysisServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataAnalysisServiceStub> {
    private DataAnalysisServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceStub(channel, callOptions);
    }

    /**
     */
    public void analyzeSensorData(smartagriculture.DataAnalysisServiceOuterClass.SensorData request,
        io.grpc.stub.StreamObserver<smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeSensorDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataAnalysisService.
   */
  public static final class DataAnalysisServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataAnalysisServiceBlockingStub> {
    private DataAnalysisServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis analyzeSensorData(smartagriculture.DataAnalysisServiceOuterClass.SensorData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeSensorDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataAnalysisService.
   */
  public static final class DataAnalysisServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataAnalysisServiceFutureStub> {
    private DataAnalysisServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis> analyzeSensorData(
        smartagriculture.DataAnalysisServiceOuterClass.SensorData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzeSensorDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANALYZE_SENSOR_DATA = 0;

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
        case METHODID_ANALYZE_SENSOR_DATA:
          serviceImpl.analyzeSensorData((smartagriculture.DataAnalysisServiceOuterClass.SensorData) request,
              (io.grpc.stub.StreamObserver<smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis>) responseObserver);
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
          getAnalyzeSensorDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartagriculture.DataAnalysisServiceOuterClass.SensorData,
              smartagriculture.DataAnalysisServiceOuterClass.SensorAnalysis>(
                service, METHODID_ANALYZE_SENSOR_DATA)))
        .build();
  }

  private static abstract class DataAnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataAnalysisServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartagriculture.DataAnalysisServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataAnalysisService");
    }
  }

  private static final class DataAnalysisServiceFileDescriptorSupplier
      extends DataAnalysisServiceBaseDescriptorSupplier {
    DataAnalysisServiceFileDescriptorSupplier() {}
  }

  private static final class DataAnalysisServiceMethodDescriptorSupplier
      extends DataAnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataAnalysisServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DataAnalysisServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataAnalysisServiceFileDescriptorSupplier())
              .addMethod(getAnalyzeSensorDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
