// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubscribeReq.proto

// Protobuf Java Version: 3.25.1
package com.xhf.protobuf;

public interface SubscribeReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:netty.SubscribeReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int32 subReqID = 1;</code>
   * @return Whether the subReqID field is set.
   */
  boolean hasSubReqID();
  /**
   * <code>required int32 subReqID = 1;</code>
   * @return The subReqID.
   */
  int getSubReqID();

  /**
   * <code>required string userName = 2;</code>
   * @return Whether the userName field is set.
   */
  boolean hasUserName();
  /**
   * <code>required string userName = 2;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>required string userName = 2;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>required string productName = 3;</code>
   * @return Whether the productName field is set.
   */
  boolean hasProductName();
  /**
   * <code>required string productName = 3;</code>
   * @return The productName.
   */
  java.lang.String getProductName();
  /**
   * <code>required string productName = 3;</code>
   * @return The bytes for productName.
   */
  com.google.protobuf.ByteString
      getProductNameBytes();

  /**
   * <code>required string address = 4;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>required string address = 4;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>required string address = 4;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}
