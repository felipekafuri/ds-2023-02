package org.example;


public class Planilha {
    public static void main(String[] args) {
        Celula a1 = new Celula(5);
        Celula a2 = new Celula(10);
        Celula a3 = new Celula(0);

        a3.adicionarDependencia(a1);
        a3.adicionarDependencia(a2);

        System.out.println("Valores Iniciais:");
        System.out.println("A1: " + a1.getValor());
        System.out.println("A2: " + a2.getValor());
        System.out.println("A3 (depende de A1 e A2): " + a3.getValor());

        a1.setValor(8); // Ao mudar o valor de a1, a3 deveria ser notificada e atualizada

        System.out.println("\nA1 foi atualizado para: " + a1.getValor());
        System.out.println("A3 agora é: " + a3.getValor());

        a2.setValor(15); // Ao mudar o valor de a2, a3 também deveria ser notificada e atualizada

        System.out.println("\nA2 foi atualizado para: " + a2.getValor());
        System.out.println("A3 agora é: " + a3.getValor());
    }
}