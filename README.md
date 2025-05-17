#  Calculadora gRPC

Este projeto é uma calculadora simples implementada com **gRPC** em **Java**. Ela oferece quatro operações básicas: soma, subtração, multiplicação e divisão, utilizando comunicação entre cliente e servidor via **Protocol Buffers (protobuf)**.

---

## Tecnologias

- Java 11
- gRPC
- Protocol Buffers
- Gradle

---

## Como executar

1. **Gere os arquivos a partir do `.proto`**
```bash
gradle clean generateProto
```

2. **Compile o projeto**
```bash
gradle build
```

3. **Execute o servidor**
```bash
gradle run
```

> O servidor será iniciado e ficará aguardando chamadas RPC.

4. **Execute o cliente**
Você pode criar um método `main` separado no cliente para executar as chamadas (ou executar manualmente pela IDE).

---

## calculadora.proto

```proto
syntax = "proto3";

package calculadora;

service CalculadoraService {
  rpc Somar (DoisNumeros) returns (Resultado);
  rpc Subtrair (DoisNumeros) returns (Resultado);
  rpc Multiplicar (DoisNumeros) returns (Resultado);
  rpc Dividir (DoisNumeros) returns (Resultado);
}

message DoisNumeros {
  double a = 1;
  double b = 2;
}

message Resultado {
  double valor = 1;
}
```

