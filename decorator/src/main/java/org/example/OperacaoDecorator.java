package org.example;

public abstract class OperacaoDecorator implements Expressao {
    protected Expressao expressao;

    public OperacaoDecorator(Expressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public float valor() {
        return expressao.valor();
    }
}
