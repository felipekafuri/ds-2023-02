package org.example;

public class Soma extends OperacaoDecorator {
    private Expressao outraExpressao;

    public Soma(Expressao expressao, Expressao outraExpressao) {
        super(expressao);
        this.outraExpressao = outraExpressao;
    }

    @Override
    public float valor() {
        return super.valor() + outraExpressao.valor();
    }
}
