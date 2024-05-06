package com.proto.calc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: calculadora.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculadoraServiceGrpc {

  private CalculadoraServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "calc.CalculadoraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest,
      com.proto.calc.OperacionResponse> getSumaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "suma",
      requestType = com.proto.calc.OperacionRequest.class,
      responseType = com.proto.calc.OperacionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest,
      com.proto.calc.OperacionResponse> getSumaMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest, com.proto.calc.OperacionResponse> getSumaMethod;
    if ((getSumaMethod = CalculadoraServiceGrpc.getSumaMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getSumaMethod = CalculadoraServiceGrpc.getSumaMethod) == null) {
          CalculadoraServiceGrpc.getSumaMethod = getSumaMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.OperacionRequest, com.proto.calc.OperacionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "suma"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.OperacionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.OperacionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("suma"))
              .build();
        }
      }
    }
    return getSumaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest,
      com.proto.calc.OperacionResponse> getRestaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resta",
      requestType = com.proto.calc.OperacionRequest.class,
      responseType = com.proto.calc.OperacionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest,
      com.proto.calc.OperacionResponse> getRestaMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest, com.proto.calc.OperacionResponse> getRestaMethod;
    if ((getRestaMethod = CalculadoraServiceGrpc.getRestaMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getRestaMethod = CalculadoraServiceGrpc.getRestaMethod) == null) {
          CalculadoraServiceGrpc.getRestaMethod = getRestaMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.OperacionRequest, com.proto.calc.OperacionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "resta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.OperacionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.OperacionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("resta"))
              .build();
        }
      }
    }
    return getRestaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest,
      com.proto.calc.OperacionResponse> getMultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mult",
      requestType = com.proto.calc.OperacionRequest.class,
      responseType = com.proto.calc.OperacionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest,
      com.proto.calc.OperacionResponse> getMultMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest, com.proto.calc.OperacionResponse> getMultMethod;
    if ((getMultMethod = CalculadoraServiceGrpc.getMultMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getMultMethod = CalculadoraServiceGrpc.getMultMethod) == null) {
          CalculadoraServiceGrpc.getMultMethod = getMultMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.OperacionRequest, com.proto.calc.OperacionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "mult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.OperacionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.OperacionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("mult"))
              .build();
        }
      }
    }
    return getMultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest,
      com.proto.calc.OperacionResponse> getDivMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "div",
      requestType = com.proto.calc.OperacionRequest.class,
      responseType = com.proto.calc.OperacionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest,
      com.proto.calc.OperacionResponse> getDivMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.OperacionRequest, com.proto.calc.OperacionResponse> getDivMethod;
    if ((getDivMethod = CalculadoraServiceGrpc.getDivMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getDivMethod = CalculadoraServiceGrpc.getDivMethod) == null) {
          CalculadoraServiceGrpc.getDivMethod = getDivMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.OperacionRequest, com.proto.calc.OperacionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "div"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.OperacionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.OperacionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("div"))
              .build();
        }
      }
    }
    return getDivMethod;
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
    default void suma(com.proto.calc.OperacionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumaMethod(), responseObserver);
    }

    /**
     */
    default void resta(com.proto.calc.OperacionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestaMethod(), responseObserver);
    }

    /**
     */
    default void mult(com.proto.calc.OperacionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultMethod(), responseObserver);
    }

    /**
     */
    default void div(com.proto.calc.OperacionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDivMethod(), responseObserver);
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
    public void suma(com.proto.calc.OperacionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resta(com.proto.calc.OperacionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mult(com.proto.calc.OperacionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void div(com.proto.calc.OperacionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDivMethod(), getCallOptions()), request, responseObserver);
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
    public com.proto.calc.OperacionResponse suma(com.proto.calc.OperacionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calc.OperacionResponse resta(com.proto.calc.OperacionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calc.OperacionResponse mult(com.proto.calc.OperacionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calc.OperacionResponse div(com.proto.calc.OperacionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDivMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calc.OperacionResponse> suma(
        com.proto.calc.OperacionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calc.OperacionResponse> resta(
        com.proto.calc.OperacionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calc.OperacionResponse> mult(
        com.proto.calc.OperacionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calc.OperacionResponse> div(
        com.proto.calc.OperacionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDivMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUMA = 0;
  private static final int METHODID_RESTA = 1;
  private static final int METHODID_MULT = 2;
  private static final int METHODID_DIV = 3;

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
        case METHODID_SUMA:
          serviceImpl.suma((com.proto.calc.OperacionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse>) responseObserver);
          break;
        case METHODID_RESTA:
          serviceImpl.resta((com.proto.calc.OperacionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse>) responseObserver);
          break;
        case METHODID_MULT:
          serviceImpl.mult((com.proto.calc.OperacionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse>) responseObserver);
          break;
        case METHODID_DIV:
          serviceImpl.div((com.proto.calc.OperacionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calc.OperacionResponse>) responseObserver);
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
          getSumaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.proto.calc.OperacionRequest,
              com.proto.calc.OperacionResponse>(
                service, METHODID_SUMA)))
        .addMethod(
          getRestaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.proto.calc.OperacionRequest,
              com.proto.calc.OperacionResponse>(
                service, METHODID_RESTA)))
        .addMethod(
          getMultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.proto.calc.OperacionRequest,
              com.proto.calc.OperacionResponse>(
                service, METHODID_MULT)))
        .addMethod(
          getDivMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.proto.calc.OperacionRequest,
              com.proto.calc.OperacionResponse>(
                service, METHODID_DIV)))
        .build();
  }

  private static abstract class CalculadoraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculadoraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calc.Calculadora.getDescriptor();
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
              .addMethod(getSumaMethod())
              .addMethod(getRestaMethod())
              .addMethod(getMultMethod())
              .addMethod(getDivMethod())
              .build();
        }
      }
    }
    return result;
  }
}
