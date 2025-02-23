module vetcare.proto {
  requires io.grpc.stub;
  requires com.google.protobuf;
  exports com.vetcare.service;
  exports com.vetcare.grpc;
}