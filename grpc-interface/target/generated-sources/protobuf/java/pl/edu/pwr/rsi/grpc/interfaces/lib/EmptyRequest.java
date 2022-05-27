// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello-world.proto

package pl.edu.pwr.rsi.grpc.interfaces.lib;

/**
 * <pre>
 * do metod ReadImage i StreamRead
 * </pre>
 *
 * Protobuf type {@code pl.edu.pwr.rsi.grpc.interface.EmptyRequest}
 */
public final class EmptyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pl.edu.pwr.rsi.grpc.interface.EmptyRequest)
    EmptyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmptyRequest.newBuilder() to construct.
  private EmptyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmptyRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmptyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmptyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pl.edu.pwr.rsi.grpc.interfaces.lib.HelloWorldProto.internal_static_pl_edu_pwr_rsi_grpc_interface_EmptyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pl.edu.pwr.rsi.grpc.interfaces.lib.HelloWorldProto.internal_static_pl_edu_pwr_rsi_grpc_interface_EmptyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.class, pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest)) {
      return super.equals(obj);
    }
    pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest other = (pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * do metod ReadImage i StreamRead
   * </pre>
   *
   * Protobuf type {@code pl.edu.pwr.rsi.grpc.interface.EmptyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pl.edu.pwr.rsi.grpc.interface.EmptyRequest)
      pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.pwr.rsi.grpc.interfaces.lib.HelloWorldProto.internal_static_pl_edu_pwr_rsi_grpc_interface_EmptyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.pwr.rsi.grpc.interfaces.lib.HelloWorldProto.internal_static_pl_edu_pwr_rsi_grpc_interface_EmptyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.class, pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.Builder.class);
    }

    // Construct using pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pl.edu.pwr.rsi.grpc.interfaces.lib.HelloWorldProto.internal_static_pl_edu_pwr_rsi_grpc_interface_EmptyRequest_descriptor;
    }

    @java.lang.Override
    public pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest getDefaultInstanceForType() {
      return pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest build() {
      pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest buildPartial() {
      pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest result = new pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest) {
        return mergeFrom((pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest other) {
      if (other == pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pl.edu.pwr.rsi.grpc.interface.EmptyRequest)
  }

  // @@protoc_insertion_point(class_scope:pl.edu.pwr.rsi.grpc.interface.EmptyRequest)
  private static final pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest();
  }

  public static pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmptyRequest>
      PARSER = new com.google.protobuf.AbstractParser<EmptyRequest>() {
    @java.lang.Override
    public EmptyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmptyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmptyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmptyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pl.edu.pwr.rsi.grpc.interfaces.lib.EmptyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

