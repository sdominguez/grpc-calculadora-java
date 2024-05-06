package calc.client;

import com.proto.calc.CalculadoraServiceGrpc;
import com.proto.calc.OperacionRequest;
import com.proto.calc.OperacionResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalcClient {

    public static void main(String[] args) {
        ManagedChannel ch = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        CalculadoraServiceGrpc.CalculadoraServiceBlockingStub stub =
                CalculadoraServiceGrpc.newBlockingStub(ch);

        double n1 = 13;
        double n2 = 7;

        OperacionRequest or = OperacionRequest.newBuilder()
                .setN1(n1)
                .setN2(n2)
                .build();

        OperacionResponse rsum = stub.suma(or);
        OperacionResponse rrest = stub.resta(or);
        OperacionResponse rmult = stub.mult(or);
        OperacionResponse rdiv = stub.div(or);

        System.out.println(n1+" + "+n2+" = "+rsum);
        System.out.println(n1+" - "+n2+" = "+rrest);
        System.out.println(n1+" * "+n2+" = "+rmult);
        System.out.println(n1+" / "+n2+" = "+rdiv);

        System.out.println("end client..");
        ch.shutdown();
    }


}
