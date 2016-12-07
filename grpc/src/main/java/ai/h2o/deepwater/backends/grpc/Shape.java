// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_service.proto

package ai.h2o.deepwater.backends.grpc;

/**
 * Protobuf type {@code deepwater.Shape}
 */
public  final class Shape extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deepwater.Shape)
    ShapeOrBuilder {
  // Use Shape.newBuilder() to construct.
  private Shape(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Shape() {
    dim_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Shape(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              dim_ = new java.util.ArrayList<ai.h2o.deepwater.backends.grpc.Shape.Dim>();
              mutable_bitField0_ |= 0x00000001;
            }
            dim_.add(
                input.readMessage(ai.h2o.deepwater.backends.grpc.Shape.Dim.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        dim_ = java.util.Collections.unmodifiableList(dim_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.h2o.deepwater.backends.grpc.Shape.class, ai.h2o.deepwater.backends.grpc.Shape.Builder.class);
  }

  public interface DimOrBuilder extends
      // @@protoc_insertion_point(interface_extends:deepwater.Shape.Dim)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 size = 1;</code>
     */
    long getSize();
  }
  /**
   * Protobuf type {@code deepwater.Shape.Dim}
   */
  public  static final class Dim extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:deepwater.Shape.Dim)
      DimOrBuilder {
    // Use Dim.newBuilder() to construct.
    private Dim(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Dim() {
      size_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Dim(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              size_ = input.readInt64();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_Dim_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_Dim_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.h2o.deepwater.backends.grpc.Shape.Dim.class, ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder.class);
    }

    public static final int SIZE_FIELD_NUMBER = 1;
    private long size_;
    /**
     * <code>optional int64 size = 1;</code>
     */
    public long getSize() {
      return size_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (size_ != 0L) {
        output.writeInt64(1, size_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (size_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, size_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ai.h2o.deepwater.backends.grpc.Shape.Dim)) {
        return super.equals(obj);
      }
      ai.h2o.deepwater.backends.grpc.Shape.Dim other = (ai.h2o.deepwater.backends.grpc.Shape.Dim) obj;

      boolean result = true;
      result = result && (getSize()
          == other.getSize());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSize());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ai.h2o.deepwater.backends.grpc.Shape.Dim parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ai.h2o.deepwater.backends.grpc.Shape.Dim prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code deepwater.Shape.Dim}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:deepwater.Shape.Dim)
        ai.h2o.deepwater.backends.grpc.Shape.DimOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_Dim_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_Dim_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ai.h2o.deepwater.backends.grpc.Shape.Dim.class, ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder.class);
      }

      // Construct using ai.h2o.deepwater.backends.grpc.Shape.Dim.newBuilder()
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
      public Builder clear() {
        super.clear();
        size_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_Dim_descriptor;
      }

      public ai.h2o.deepwater.backends.grpc.Shape.Dim getDefaultInstanceForType() {
        return ai.h2o.deepwater.backends.grpc.Shape.Dim.getDefaultInstance();
      }

      public ai.h2o.deepwater.backends.grpc.Shape.Dim build() {
        ai.h2o.deepwater.backends.grpc.Shape.Dim result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ai.h2o.deepwater.backends.grpc.Shape.Dim buildPartial() {
        ai.h2o.deepwater.backends.grpc.Shape.Dim result = new ai.h2o.deepwater.backends.grpc.Shape.Dim(this);
        result.size_ = size_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ai.h2o.deepwater.backends.grpc.Shape.Dim) {
          return mergeFrom((ai.h2o.deepwater.backends.grpc.Shape.Dim)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ai.h2o.deepwater.backends.grpc.Shape.Dim other) {
        if (other == ai.h2o.deepwater.backends.grpc.Shape.Dim.getDefaultInstance()) return this;
        if (other.getSize() != 0L) {
          setSize(other.getSize());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ai.h2o.deepwater.backends.grpc.Shape.Dim parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ai.h2o.deepwater.backends.grpc.Shape.Dim) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long size_ ;
      /**
       * <code>optional int64 size = 1;</code>
       */
      public long getSize() {
        return size_;
      }
      /**
       * <code>optional int64 size = 1;</code>
       */
      public Builder setSize(long value) {
        
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 size = 1;</code>
       */
      public Builder clearSize() {
        
        size_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:deepwater.Shape.Dim)
    }

    // @@protoc_insertion_point(class_scope:deepwater.Shape.Dim)
    private static final ai.h2o.deepwater.backends.grpc.Shape.Dim DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ai.h2o.deepwater.backends.grpc.Shape.Dim();
    }

    public static ai.h2o.deepwater.backends.grpc.Shape.Dim getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Dim>
        PARSER = new com.google.protobuf.AbstractParser<Dim>() {
      public Dim parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Dim(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Dim> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Dim> getParserForType() {
      return PARSER;
    }

    public ai.h2o.deepwater.backends.grpc.Shape.Dim getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int DIM_FIELD_NUMBER = 2;
  private java.util.List<ai.h2o.deepwater.backends.grpc.Shape.Dim> dim_;
  /**
   * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
   */
  public java.util.List<ai.h2o.deepwater.backends.grpc.Shape.Dim> getDimList() {
    return dim_;
  }
  /**
   * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
   */
  public java.util.List<? extends ai.h2o.deepwater.backends.grpc.Shape.DimOrBuilder> 
      getDimOrBuilderList() {
    return dim_;
  }
  /**
   * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
   */
  public int getDimCount() {
    return dim_.size();
  }
  /**
   * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
   */
  public ai.h2o.deepwater.backends.grpc.Shape.Dim getDim(int index) {
    return dim_.get(index);
  }
  /**
   * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
   */
  public ai.h2o.deepwater.backends.grpc.Shape.DimOrBuilder getDimOrBuilder(
      int index) {
    return dim_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < dim_.size(); i++) {
      output.writeMessage(2, dim_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dim_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, dim_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.h2o.deepwater.backends.grpc.Shape)) {
      return super.equals(obj);
    }
    ai.h2o.deepwater.backends.grpc.Shape other = (ai.h2o.deepwater.backends.grpc.Shape) obj;

    boolean result = true;
    result = result && getDimList()
        .equals(other.getDimList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getDimCount() > 0) {
      hash = (37 * hash) + DIM_FIELD_NUMBER;
      hash = (53 * hash) + getDimList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.h2o.deepwater.backends.grpc.Shape parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.Shape parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.h2o.deepwater.backends.grpc.Shape prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code deepwater.Shape}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deepwater.Shape)
      ai.h2o.deepwater.backends.grpc.ShapeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.h2o.deepwater.backends.grpc.Shape.class, ai.h2o.deepwater.backends.grpc.Shape.Builder.class);
    }

    // Construct using ai.h2o.deepwater.backends.grpc.Shape.newBuilder()
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
        getDimFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (dimBuilder_ == null) {
        dim_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dimBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_Shape_descriptor;
    }

    public ai.h2o.deepwater.backends.grpc.Shape getDefaultInstanceForType() {
      return ai.h2o.deepwater.backends.grpc.Shape.getDefaultInstance();
    }

    public ai.h2o.deepwater.backends.grpc.Shape build() {
      ai.h2o.deepwater.backends.grpc.Shape result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ai.h2o.deepwater.backends.grpc.Shape buildPartial() {
      ai.h2o.deepwater.backends.grpc.Shape result = new ai.h2o.deepwater.backends.grpc.Shape(this);
      int from_bitField0_ = bitField0_;
      if (dimBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          dim_ = java.util.Collections.unmodifiableList(dim_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dim_ = dim_;
      } else {
        result.dim_ = dimBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.h2o.deepwater.backends.grpc.Shape) {
        return mergeFrom((ai.h2o.deepwater.backends.grpc.Shape)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.h2o.deepwater.backends.grpc.Shape other) {
      if (other == ai.h2o.deepwater.backends.grpc.Shape.getDefaultInstance()) return this;
      if (dimBuilder_ == null) {
        if (!other.dim_.isEmpty()) {
          if (dim_.isEmpty()) {
            dim_ = other.dim_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimIsMutable();
            dim_.addAll(other.dim_);
          }
          onChanged();
        }
      } else {
        if (!other.dim_.isEmpty()) {
          if (dimBuilder_.isEmpty()) {
            dimBuilder_.dispose();
            dimBuilder_ = null;
            dim_ = other.dim_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dimBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDimFieldBuilder() : null;
          } else {
            dimBuilder_.addAllMessages(other.dim_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.h2o.deepwater.backends.grpc.Shape parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.h2o.deepwater.backends.grpc.Shape) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ai.h2o.deepwater.backends.grpc.Shape.Dim> dim_ =
      java.util.Collections.emptyList();
    private void ensureDimIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        dim_ = new java.util.ArrayList<ai.h2o.deepwater.backends.grpc.Shape.Dim>(dim_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.h2o.deepwater.backends.grpc.Shape.Dim, ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder, ai.h2o.deepwater.backends.grpc.Shape.DimOrBuilder> dimBuilder_;

    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public java.util.List<ai.h2o.deepwater.backends.grpc.Shape.Dim> getDimList() {
      if (dimBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dim_);
      } else {
        return dimBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public int getDimCount() {
      if (dimBuilder_ == null) {
        return dim_.size();
      } else {
        return dimBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Shape.Dim getDim(int index) {
      if (dimBuilder_ == null) {
        return dim_.get(index);
      } else {
        return dimBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder setDim(
        int index, ai.h2o.deepwater.backends.grpc.Shape.Dim value) {
      if (dimBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimIsMutable();
        dim_.set(index, value);
        onChanged();
      } else {
        dimBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder setDim(
        int index, ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder builderForValue) {
      if (dimBuilder_ == null) {
        ensureDimIsMutable();
        dim_.set(index, builderForValue.build());
        onChanged();
      } else {
        dimBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder addDim(ai.h2o.deepwater.backends.grpc.Shape.Dim value) {
      if (dimBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimIsMutable();
        dim_.add(value);
        onChanged();
      } else {
        dimBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder addDim(
        int index, ai.h2o.deepwater.backends.grpc.Shape.Dim value) {
      if (dimBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimIsMutable();
        dim_.add(index, value);
        onChanged();
      } else {
        dimBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder addDim(
        ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder builderForValue) {
      if (dimBuilder_ == null) {
        ensureDimIsMutable();
        dim_.add(builderForValue.build());
        onChanged();
      } else {
        dimBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder addDim(
        int index, ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder builderForValue) {
      if (dimBuilder_ == null) {
        ensureDimIsMutable();
        dim_.add(index, builderForValue.build());
        onChanged();
      } else {
        dimBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder addAllDim(
        java.lang.Iterable<? extends ai.h2o.deepwater.backends.grpc.Shape.Dim> values) {
      if (dimBuilder_ == null) {
        ensureDimIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dim_);
        onChanged();
      } else {
        dimBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder clearDim() {
      if (dimBuilder_ == null) {
        dim_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dimBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public Builder removeDim(int index) {
      if (dimBuilder_ == null) {
        ensureDimIsMutable();
        dim_.remove(index);
        onChanged();
      } else {
        dimBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder getDimBuilder(
        int index) {
      return getDimFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Shape.DimOrBuilder getDimOrBuilder(
        int index) {
      if (dimBuilder_ == null) {
        return dim_.get(index);  } else {
        return dimBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public java.util.List<? extends ai.h2o.deepwater.backends.grpc.Shape.DimOrBuilder> 
         getDimOrBuilderList() {
      if (dimBuilder_ != null) {
        return dimBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dim_);
      }
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder addDimBuilder() {
      return getDimFieldBuilder().addBuilder(
          ai.h2o.deepwater.backends.grpc.Shape.Dim.getDefaultInstance());
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder addDimBuilder(
        int index) {
      return getDimFieldBuilder().addBuilder(
          index, ai.h2o.deepwater.backends.grpc.Shape.Dim.getDefaultInstance());
    }
    /**
     * <code>repeated .deepwater.Shape.Dim dim = 2;</code>
     */
    public java.util.List<ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder> 
         getDimBuilderList() {
      return getDimFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.h2o.deepwater.backends.grpc.Shape.Dim, ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder, ai.h2o.deepwater.backends.grpc.Shape.DimOrBuilder> 
        getDimFieldBuilder() {
      if (dimBuilder_ == null) {
        dimBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.h2o.deepwater.backends.grpc.Shape.Dim, ai.h2o.deepwater.backends.grpc.Shape.Dim.Builder, ai.h2o.deepwater.backends.grpc.Shape.DimOrBuilder>(
                dim_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        dim_ = null;
      }
      return dimBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:deepwater.Shape)
  }

  // @@protoc_insertion_point(class_scope:deepwater.Shape)
  private static final ai.h2o.deepwater.backends.grpc.Shape DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.h2o.deepwater.backends.grpc.Shape();
  }

  public static ai.h2o.deepwater.backends.grpc.Shape getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Shape>
      PARSER = new com.google.protobuf.AbstractParser<Shape>() {
    public Shape parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Shape(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Shape> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Shape> getParserForType() {
    return PARSER;
  }

  public ai.h2o.deepwater.backends.grpc.Shape getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
