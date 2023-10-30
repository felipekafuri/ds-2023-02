package org.example;

public class Multiplica extends OperacaoDecorator {
    private Expressao outraExpressao;

    public Multiplica(Expressao expressao, Expressao outraExpressao) {
        super(expressao);
        this.outraExpressao = outraExpressao;
    }

    @Override
    public float valor() {
        return super.valor() * outraExpressao.valor();
    }
}