// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculadora.proto

// Protobuf Java Version: 3.25.1
package com.proto.calc;

public final class Calculadora {
  private Calculadora() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calc_OperacionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calc_OperacionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calc_OperacionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calc_OperacionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021calculadora.proto\022\004calc\"*\n\020OperacionRe" +
      "quest\022\n\n\002n1\030\001 \001(\001\022\n\n\002n2\030\002 \001(\001\"#\n\021Operaci" +
      "onResponse\022\016\n\006result\030\001 \001(\0012\370\001\n\022Calculado" +
      "raService\0227\n\004suma\022\026.calc.OperacionReques" +
      "t\032\027.calc.OperacionResponse\0228\n\005resta\022\026.ca" +
      "lc.OperacionRequest\032\027.calc.OperacionResp" +
      "onse\0227\n\004mult\022\026.calc.OperacionRequest\032\027.c" +
      "alc.OperacionResponse\0226\n\003div\022\026.calc.Oper" +
      "acionRequest\032\027.calc.OperacionResponseB\022\n" +
      "\016com.proto.calcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calc_OperacionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calc_OperacionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calc_OperacionRequest_descriptor,
        new java.lang.String[] { "N1", "N2", });
    internal_static_calc_OperacionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calc_OperacionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calc_OperacionResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
