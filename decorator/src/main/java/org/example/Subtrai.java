package org.example;

public class Subtrai implements Expressao {
    private Expressao expr1;
    private Expressao expr2;

    public Subtrai(Expressao expr1, Expressao expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public float valor() {
        return expr1.valor() - expr2.valor();
    }
}
