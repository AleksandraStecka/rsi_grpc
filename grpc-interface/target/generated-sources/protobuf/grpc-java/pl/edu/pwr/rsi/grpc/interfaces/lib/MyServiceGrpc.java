package pl.edu.pwr.rsi.grpc.interfaces.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * definicja serwisu
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: hello-world.proto")
public final class MyServiceGrpc {

  private MyServiceGrpc() {}

  public static final String SERVICE_NAME = "pl.edu.pwr.rsi.grpc.interface.MyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getSayHelloMethod;
    if ((getSayHelloMethod = MyServiceGrpc.getSayHelloMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getSayHelloMethod = MyServiceGrpc.getSayHelloMethod) == null) {
          MyServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply> getRecordsCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordsCount",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply> getRecordsCountMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply> getRecordsCountMethod;
    if ((getRecordsCountMethod = MyServiceGrpc.getRecordsCountMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getRecordsCountMethod = MyServiceGrpc.getRecordsCountMethod) == null) {
          MyServiceGrpc.getRecordsCountMethod = getRecordsCountMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordsCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("RecordsCount"))
              .build();
        }
      }
    }
    return getRecordsCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getUploadMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getUploadMethod;
    if ((getUploadMethod = MyServiceGrpc.getUploadMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getUploadMethod = MyServiceGrpc.getUploadMethod) == null) {
          MyServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("Upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getReadMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getReadMethod;
    if ((getReadMethod = MyServiceGrpc.getReadMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getReadMethod = MyServiceGrpc.getReadMethod) == null) {
          MyServiceGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getReadAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadAsync",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getReadAsyncMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getReadAsyncMethod;
    if ((getReadAsyncMethod = MyServiceGrpc.getReadAsyncMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getReadAsyncMethod = MyServiceGrpc.getReadAsyncMethod) == null) {
          MyServiceGrpc.getReadAsyncMethod = getReadAsyncMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("ReadAsync"))
              .build();
        }
      }
    }
    return getReadAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getStreamUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamUpload",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getStreamUploadMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getStreamUploadMethod;
    if ((getStreamUploadMethod = MyServiceGrpc.getStreamUploadMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getStreamUploadMethod = MyServiceGrpc.getStreamUploadMethod) == null) {
          MyServiceGrpc.getStreamUploadMethod = getStreamUploadMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("StreamUpload"))
              .build();
        }
      }
    }
    return getStreamUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getStreamReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamRead",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getStreamReadMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getStreamReadMethod;
    if ((getStreamReadMethod = MyServiceGrpc.getStreamReadMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getStreamReadMethod = MyServiceGrpc.getStreamReadMethod) == null) {
          MyServiceGrpc.getStreamReadMethod = getStreamReadMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("StreamRead"))
              .build();
        }
      }
    }
    return getStreamReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getUploadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadImage",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getUploadImageMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> getUploadImageMethod;
    if ((getUploadImageMethod = MyServiceGrpc.getUploadImageMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getUploadImageMethod = MyServiceGrpc.getUploadImageMethod) == null) {
          MyServiceGrpc.getUploadImageMethod = getUploadImageMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("UploadImage"))
              .build();
        }
      }
    }
    return getUploadImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply> getReadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadImage",
      requestType = pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.class,
      responseType = pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
      pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply> getReadImageMethod() {
    io.grpc.MethodDescriptor<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply> getReadImageMethod;
    if ((getReadImageMethod = MyServiceGrpc.getReadImageMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getReadImageMethod = MyServiceGrpc.getReadImageMethod) == null) {
          MyServiceGrpc.getReadImageMethod = getReadImageMethod =
              io.grpc.MethodDescriptor.<pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest, pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("ReadImage"))
              .build();
        }
      }
    }
    return getReadImageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceStub>() {
        @java.lang.Override
        public MyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceStub(channel, callOptions);
        }
      };
    return MyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub>() {
        @java.lang.Override
        public MyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceBlockingStub(channel, callOptions);
        }
      };
    return MyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub>() {
        @java.lang.Override
        public MyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceFutureStub(channel, callOptions);
        }
      };
    return MyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * definicja serwisu
   * </pre>
   */
  public static abstract class MyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * metoda testowa do sprawdzenia polaczenia miedzy serwerem a klientem
     * </pre>
     */
    public void sayHello(pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * metoda pomocnicza do wyswietlania * na kliencie
     * </pre>
     */
    public void recordsCount(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordsCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * metoda do synchronicznego wgrywania danych
     * </pre>
     */
    public void upload(pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * metoda do synchronicznego czytania danych
     * </pre>
     */
    public void read(pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * metoda do asynchronicznego czytania danych
     * </pre>
     */
    public void readAsync(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadAsyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * metoda do strumieniowego wgrywania danych
     * </pre>
     */
    public io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest> streamUpload(
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * metoda do strumieniowego czytania danych
     * </pre>
     */
    public void streamRead(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * metoda do wgrania obrazka na serwer
     * </pre>
     */
    public void uploadImage(pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * metoda do pobrania obrazka z serwera
     * </pre>
     */
    public void readImage(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadImageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getRecordsCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply>(
                  this, METHODID_RECORDS_COUNT)))
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getReadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>(
                  this, METHODID_READ)))
          .addMethod(
            getReadAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>(
                  this, METHODID_READ_ASYNC)))
          .addMethod(
            getStreamUploadMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>(
                  this, METHODID_STREAM_UPLOAD)))
          .addMethod(
            getStreamReadMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>(
                  this, METHODID_STREAM_READ)))
          .addMethod(
            getUploadImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>(
                  this, METHODID_UPLOAD_IMAGE)))
          .addMethod(
            getReadImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest,
                pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply>(
                  this, METHODID_READ_IMAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * definicja serwisu
   * </pre>
   */
  public static final class MyServiceStub extends io.grpc.stub.AbstractAsyncStub<MyServiceStub> {
    private MyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * metoda testowa do sprawdzenia polaczenia miedzy serwerem a klientem
     * </pre>
     */
    public void sayHello(pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * metoda pomocnicza do wyswietlania * na kliencie
     * </pre>
     */
    public void recordsCount(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordsCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * metoda do synchronicznego wgrywania danych
     * </pre>
     */
    public void upload(pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * metoda do synchronicznego czytania danych
     * </pre>
     */
    public void read(pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * metoda do asynchronicznego czytania danych
     * </pre>
     */
    public void readAsync(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * metoda do strumieniowego wgrywania danych
     * </pre>
     */
    public io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest> streamUpload(
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamUploadMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * metoda do strumieniowego czytania danych
     * </pre>
     */
    public void streamRead(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * metoda do wgrania obrazka na serwer
     * </pre>
     */
    public void uploadImage(pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * metoda do pobrania obrazka z serwera
     * </pre>
     */
    public void readImage(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request,
        io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadImageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * definicja serwisu
   * </pre>
   */
  public static final class MyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyServiceBlockingStub> {
    private MyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * metoda testowa do sprawdzenia polaczenia miedzy serwerem a klientem
     * </pre>
     */
    public pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply sayHello(pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * metoda pomocnicza do wyswietlania * na kliencie
     * </pre>
     */
    public pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply recordsCount(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordsCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * metoda do synchronicznego wgrywania danych
     * </pre>
     */
    public pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply upload(pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * metoda do synchronicznego czytania danych
     * </pre>
     */
    public pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply read(pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * metoda do asynchronicznego czytania danych
     * </pre>
     */
    public pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply readAsync(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadAsyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * metoda do strumieniowego czytania danych
     * </pre>
     */
    public java.util.Iterator<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> streamRead(
        pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * metoda do wgrania obrazka na serwer
     * </pre>
     */
    public pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply uploadImage(pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * metoda do pobrania obrazka z serwera
     * </pre>
     */
    public pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply readImage(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadImageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * definicja serwisu
   * </pre>
   */
  public static final class MyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MyServiceFutureStub> {
    private MyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * metoda testowa do sprawdzenia polaczenia miedzy serwerem a klientem
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> sayHello(
        pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * metoda pomocnicza do wyswietlania * na kliencie
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply> recordsCount(
        pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordsCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * metoda do synchronicznego wgrywania danych
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> upload(
        pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * metoda do synchronicznego czytania danych
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> read(
        pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * metoda do asynchronicznego czytania danych
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> readAsync(
        pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadAsyncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * metoda do wgrania obrazka na serwer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply> uploadImage(
        pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * metoda do pobrania obrazka z serwera
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply> readImage(
        pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadImageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_RECORDS_COUNT = 1;
  private static final int METHODID_UPLOAD = 2;
  private static final int METHODID_READ = 3;
  private static final int METHODID_READ_ASYNC = 4;
  private static final int METHODID_STREAM_READ = 5;
  private static final int METHODID_UPLOAD_IMAGE = 6;
  private static final int METHODID_READ_IMAGE = 7;
  private static final int METHODID_STREAM_UPLOAD = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>) responseObserver);
          break;
        case METHODID_RECORDS_COUNT:
          serviceImpl.recordsCount((pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.CountReply>) responseObserver);
          break;
        case METHODID_UPLOAD:
          serviceImpl.upload((pl.edu.pwr.rsi.grpc.interfaces.lib.UploadRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>) responseObserver);
          break;
        case METHODID_READ_ASYNC:
          serviceImpl.readAsync((pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>) responseObserver);
          break;
        case METHODID_STREAM_READ:
          serviceImpl.streamRead((pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>) responseObserver);
          break;
        case METHODID_UPLOAD_IMAGE:
          serviceImpl.uploadImage((pl.edu.pwr.rsi.grpc.interfaces.lib.UploadImageRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>) responseObserver);
          break;
        case METHODID_READ_IMAGE:
          serviceImpl.readImage((pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.ReadImageReply>) responseObserver);
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
        case METHODID_STREAM_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamUpload(
              (io.grpc.stub.StreamObserver<pl.edu.pwr.rsi.grpc.interfaces.lib.SimpleReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pl.edu.pwr.rsi.grpc.interfaces.lib.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService");
    }
  }

  private static final class MyServiceFileDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier {
    MyServiceFileDescriptorSupplier() {}
  }

  private static final class MyServiceMethodDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getRecordsCountMethod())
              .addMethod(getUploadMethod())
              .addMethod(getReadMethod())
              .addMethod(getReadAsyncMethod())
              .addMethod(getStreamUploadMethod())
              .addMethod(getStreamReadMethod())
              .addMethod(getUploadImageMethod())
              .addMethod(getReadImageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
