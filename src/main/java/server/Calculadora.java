package server;

import calculadora.CalculadoraServiceGrpc;
import calculadora.DoisNumeros;
import calculadora.Resultado;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class Calculadora {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new CalculadoraServiceImpl())
                .build();

        System.out.println("Servidor gRPC iniciado na porta 50051...");
        server.start();
        server.awaitTermination();
    }

    static class CalculadoraServiceImpl extends CalculadoraServiceGrpc.CalculadoraServiceImplBase {
        @Override
        public void somar(DoisNumeros request, StreamObserver<Resultado> responseObserver) {
            double resultado = request.getA() + request.getB();
            Resultado resposta = Resultado.newBuilder().setValor(resultado).build();
            responseObserver.onNext(resposta);
            responseObserver.onCompleted();
        }

        @Override
        public void subtrair(DoisNumeros request, StreamObserver<Resultado> responseObserver) {
            double resultado = request.getA() - request.getB();
            Resultado resposta = Resultado.newBuilder().setValor(resultado).build();
            responseObserver.onNext(resposta);
            responseObserver.onCompleted();
        }

        @Override
        public void multiplicar(DoisNumeros request, StreamObserver<Resultado> responseObserver) {
            double resultado = request.getA() * request.getB();
            Resultado resposta = Resultado.newBuilder().setValor(resultado).build();
            responseObserver.onNext(resposta);
            responseObserver.onCompleted();
        }

        @Override
        public void dividir(DoisNumeros request, StreamObserver<Resultado> responseObserver) {
            double resultado = request.getB() != 0 ? request.getA() / request.getB() : 0;
            Resultado resposta = Resultado.newBuilder().setValor(resultado).build();
            responseObserver.onNext(resposta);
            responseObserver.onCompleted();
        }
    }
}
