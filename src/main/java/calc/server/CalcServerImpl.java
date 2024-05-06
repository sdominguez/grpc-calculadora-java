package calc.server;

import com.proto.calc.CalculadoraServiceGrpc;
import com.proto.calc.OperacionRequest;
import com.proto.calc.OperacionResponse;
import io.grpc.stub.StreamObserver;

public class CalcServerImpl extends CalculadoraServiceGrpc.CalculadoraServiceImplBase{

    @Override
    public void suma(OperacionRequest request, StreamObserver<OperacionResponse> responseObserver) {
        responseObserver.onNext(OperacionResponse.newBuilder()
                .setResult(request.getN1() + request.getN2())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void resta(OperacionRequest request, StreamObserver<OperacionResponse> responseObserver) {
        responseObserver.onNext(OperacionResponse.newBuilder()
                .setResult(request.getN1() - request.getN2())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void mult(OperacionRequest request, StreamObserver<OperacionResponse> responseObserver) {
        responseObserver.onNext(OperacionResponse.newBuilder()
                .setResult(request.getN1() * request.getN2())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void div(OperacionRequest request, StreamObserver<OperacionResponse> responseObserver) {
        responseObserver.onNext(OperacionResponse.newBuilder()
                .setResult(request.getN1()/request.getN2())
                .build());
        responseObserver.onCompleted();
    }
}
