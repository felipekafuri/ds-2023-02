package org.example;

public class Main {
    public static void main(String[] args) {
        Expressao expressao = new Soma(new Constante(5), new Multiplica(new Constante(2), new Constante(3)));
        System.out.println("Resultado da expressão: " + expressao.valor());
    }
}

