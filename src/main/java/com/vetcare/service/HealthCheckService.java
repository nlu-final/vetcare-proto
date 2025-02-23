package com.vetcare.service;

import com.vetcare.grpc.health.HealthCheckRequest;
import com.vetcare.grpc.health.HealthCheckResponse;
import com.vetcare.grpc.health.HealthGrpc;
import io.grpc.stub.StreamObserver;

public class HealthCheckService extends HealthGrpc.HealthImplBase {

  @Override
  public void check(HealthCheckRequest request, StreamObserver<HealthCheckResponse> responseObserver) {
    HealthCheckResponse response = HealthCheckResponse.newBuilder()
            .setStatus(HealthCheckResponse.ServingStatus.SERVING)
            .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}