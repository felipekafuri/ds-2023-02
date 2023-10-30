package org.example;

public class Divide implements Expressao {
    private Expressao expr1;
    private Expressao expr2;

    public Divide(Expressao expr1, Expressao expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public float valor() {
        // Atenção: Divisão por zero não está sendo tratada neste exemplo.
        return expr1.valor() / expr2.valor();
    }
}
