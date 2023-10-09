package org.example;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco.Builder()
                .withRua("Rua Exemplo")
                .withNumero("123")
                .withBairro("Bairro Exemplo")
                .build();


        System.out.println(endereco.getRua());

    }
}