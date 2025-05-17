package calculadora;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: calculadora.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculadoraServiceGrpc {

  private CalculadoraServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "calculadora.CalculadoraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<calculadora.DoisNumeros,
      calculadora.Resultado> getSomarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Somar",
      requestType = calculadora.DoisNumeros.class,
      responseType = calculadora.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calculadora.DoisNumeros,
      calculadora.Resultado> getSomarMethod() {
    io.grpc.MethodDescriptor<calculadora.DoisNumeros, calculadora.Resultado> getSomarMethod;
    if ((getSomarMethod = CalculadoraServiceGrpc.getSomarMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getSomarMethod = CalculadoraServiceGrpc.getSomarMethod) == null) {
          CalculadoraServiceGrpc.getSomarMethod = getSomarMethod =
              io.grpc.MethodDescriptor.<calculadora.DoisNumeros, calculadora.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Somar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculadora.DoisNumeros.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculadora.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("Somar"))
              .build();
        }
      }
    }
    return getSomarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calculadora.DoisNumeros,
      calculadora.Resultado> getSubtrairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subtrair",
      requestType = calculadora.DoisNumeros.class,
      responseType = calculadora.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calculadora.DoisNumeros,
      calculadora.Resultado> getSubtrairMethod() {
    io.grpc.MethodDescriptor<calculadora.DoisNumeros, calculadora.Resultado> getSubtrairMethod;
    if ((getSubtrairMethod = CalculadoraServiceGrpc.getSubtrairMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getSubtrairMethod = CalculadoraServiceGrpc.getSubtrairMethod) == null) {
          CalculadoraServiceGrpc.getSubtrairMethod = getSubtrairMethod =
              io.grpc.MethodDescriptor.<calculadora.DoisNumeros, calculadora.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subtrair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculadora.DoisNumeros.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculadora.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("Subtrair"))
              .build();
        }
      }
    }
    return getSubtrairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calculadora.DoisNumeros,
      calculadora.Resultado> getMultiplicarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiplicar",
      requestType = calculadora.DoisNumeros.class,
      responseType = calculadora.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calculadora.DoisNumeros,
      calculadora.Resultado> getMultiplicarMethod() {
    io.grpc.MethodDescriptor<calculadora.DoisNumeros, calculadora.Resultado> getMultiplicarMethod;
    if ((getMultiplicarMethod = CalculadoraServiceGrpc.getMultiplicarMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getMultiplicarMethod = CalculadoraServiceGrpc.getMultiplicarMethod) == null) {
          CalculadoraServiceGrpc.getMultiplicarMethod = getMultiplicarMethod =
              io.grpc.MethodDescriptor.<calculadora.DoisNumeros, calculadora.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Multiplicar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculadora.DoisNumeros.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculadora.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("Multiplicar"))
              .build();
        }
      }
    }
    return getMultiplicarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calculadora.DoisNumeros,
      calculadora.Resultado> getDividirMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Dividir",
      requestType = calculadora.DoisNumeros.class,
      responseType = calculadora.Resultado.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calculadora.DoisNumeros,
      calculadora.Resultado> getDividirMethod() {
    io.grpc.MethodDescriptor<calculadora.DoisNumeros, calculadora.Resultado> getDividirMethod;
    if ((getDividirMethod = CalculadoraServiceGrpc.getDividirMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getDividirMethod = CalculadoraServiceGrpc.getDividirMethod) == null) {
          CalculadoraServiceGrpc.getDividirMethod = getDividirMethod =
              io.grpc.MethodDescriptor.<calculadora.DoisNumeros, calculadora.Resultado>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Dividir"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculadora.DoisNumeros.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculadora.Resultado.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("Dividir"))
              .build();
        }
      }
    }
    return getDividirMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculadoraServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceStub>() {
        @java.lang.Override
        public CalculadoraServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculadoraServiceStub(channel, callOptions);
        }
      };
    return CalculadoraServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculadoraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceBlockingStub>() {
        @java.lang.Override
        public CalculadoraServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculadoraServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculadoraServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculadoraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceFutureStub>() {
        @java.lang.Override
        public CalculadoraServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculadoraServiceFutureStub(channel, callOptions);
        }
      };
    return CalculadoraServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void somar(calculadora.DoisNumeros request,
        io.grpc.stub.StreamObserver<calculadora.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSomarMethod(), responseObserver);
    }

    /**
     */
    default void subtrair(calculadora.DoisNumeros request,
        io.grpc.stub.StreamObserver<calculadora.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubtrairMethod(), responseObserver);
    }

    /**
     */
    default void multiplicar(calculadora.DoisNumeros request,
        io.grpc.stub.StreamObserver<calculadora.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplicarMethod(), responseObserver);
    }

    /**
     */
    default void dividir(calculadora.DoisNumeros request,
        io.grpc.stub.StreamObserver<calculadora.Resultado> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDividirMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CalculadoraService.
   */
  public static abstract class CalculadoraServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CalculadoraServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CalculadoraService.
   */
  public static final class CalculadoraServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CalculadoraServiceStub> {
    private CalculadoraServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculadoraServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculadoraServiceStub(channel, callOptions);
    }

    /**
     */
    public void somar(calculadora.DoisNumeros request,
        io.grpc.stub.StreamObserver<calculadora.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSomarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subtrair(calculadora.DoisNumeros request,
        io.grpc.stub.StreamObserver<calculadora.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubtrairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiplicar(calculadora.DoisNumeros request,
        io.grpc.stub.StreamObserver<calculadora.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplicarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dividir(calculadora.DoisNumeros request,
        io.grpc.stub.StreamObserver<calculadora.Resultado> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDividirMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CalculadoraService.
   */
  public static final class CalculadoraServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CalculadoraServiceBlockingStub> {
    private CalculadoraServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculadoraServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculadoraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public calculadora.Resultado somar(calculadora.DoisNumeros request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSomarMethod(), getCallOptions(), request);
    }

    /**
     */
    public calculadora.Resultado subtrair(calculadora.DoisNumeros request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubtrairMethod(), getCallOptions(), request);
    }

    /**
     */
    public calculadora.Resultado multiplicar(calculadora.DoisNumeros request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplicarMethod(), getCallOptions(), request);
    }

    /**
     */
    public calculadora.Resultado dividir(calculadora.DoisNumeros request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDividirMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CalculadoraService.
   */
  public static final class CalculadoraServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CalculadoraServiceFutureStub> {
    private CalculadoraServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculadoraServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculadoraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<calculadora.Resultado> somar(
        calculadora.DoisNumeros request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSomarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<calculadora.Resultado> subtrair(
        calculadora.DoisNumeros request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubtrairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<calculadora.Resultado> multiplicar(
        calculadora.DoisNumeros request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplicarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<calculadora.Resultado> dividir(
        calculadora.DoisNumeros request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDividirMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SOMAR = 0;
  private static final int METHODID_SUBTRAIR = 1;
  private static final int METHODID_MULTIPLICAR = 2;
  private static final int METHODID_DIVIDIR = 3;

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
        case METHODID_SOMAR:
          serviceImpl.somar((calculadora.DoisNumeros) request,
              (io.grpc.stub.StreamObserver<calculadora.Resultado>) responseObserver);
          break;
        case METHODID_SUBTRAIR:
          serviceImpl.subtrair((calculadora.DoisNumeros) request,
              (io.grpc.stub.StreamObserver<calculadora.Resultado>) responseObserver);
          break;
        case METHODID_MULTIPLICAR:
          serviceImpl.multiplicar((calculadora.DoisNumeros) request,
              (io.grpc.stub.StreamObserver<calculadora.Resultado>) responseObserver);
          break;
        case METHODID_DIVIDIR:
          serviceImpl.dividir((calculadora.DoisNumeros) request,
              (io.grpc.stub.StreamObserver<calculadora.Resultado>) responseObserver);
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
          getSomarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              calculadora.DoisNumeros,
              calculadora.Resultado>(
                service, METHODID_SOMAR)))
        .addMethod(
          getSubtrairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              calculadora.DoisNumeros,
              calculadora.Resultado>(
                service, METHODID_SUBTRAIR)))
        .addMethod(
          getMultiplicarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              calculadora.DoisNumeros,
              calculadora.Resultado>(
                service, METHODID_MULTIPLICAR)))
        .addMethod(
          getDividirMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              calculadora.DoisNumeros,
              calculadora.Resultado>(
                service, METHODID_DIVIDIR)))
        .build();
  }

  private static abstract class CalculadoraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculadoraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return calculadora.Calculadora.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculadoraService");
    }
  }

  private static final class CalculadoraServiceFileDescriptorSupplier
      extends CalculadoraServiceBaseDescriptorSupplier {
    CalculadoraServiceFileDescriptorSupplier() {}
  }

  private static final class CalculadoraServiceMethodDescriptorSupplier
      extends CalculadoraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CalculadoraServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CalculadoraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculadoraServiceFileDescriptorSupplier())
              .addMethod(getSomarMethod())
              .addMethod(getSubtrairMethod())
              .addMethod(getMultiplicarMethod())
              .addMethod(getDividirMethod())
              .build();
        }
      }
    }
    return result;
  }
}
