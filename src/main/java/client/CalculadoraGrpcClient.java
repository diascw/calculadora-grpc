package client;

import calculadora.CalculadoraServiceGrpc;
import calculadora.DoisNumeros;
import calculadora.Resultado;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculadoraGrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        CalculadoraServiceGrpc.CalculadoraServiceBlockingStub stub =
                CalculadoraServiceGrpc.newBlockingStub(channel);

        Resultado soma = stub.somar(DoisNumeros.newBuilder().setA(10).setB(5).build());
        System.out.println("10 + 5 = " + soma.getValor());

        Resultado sub = stub.subtrair(DoisNumeros.newBuilder().setA(10).setB(3).build());
        System.out.println("10 - 3 = " + sub.getValor());

        Resultado mult = stub.multiplicar(DoisNumeros.newBuilder().setA(6).setB(7).build());
        System.out.println("6 * 7 = " + mult.getValor());

        Resultado div = stub.dividir(DoisNumeros.newBuilder().setA(20).setB(4).build());
        System.out.println("20 / 4 = " + div.getValor());

        channel.shutdown();
    }
}
