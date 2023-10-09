package org.example;

import java.util.ArrayList;
import java.util.List;

class Celula {
    private int valor;
    private List<Celula> observadores = new ArrayList<>();
    private List<Celula> dependencias = new ArrayList<>();

    public Celula(int valor) {
        this.valor = valor;
    }

    public void adicionarObservador(Celula celula) {
        observadores.add(celula);
    }

    public void adicionarDependencia(Celula celula) {
        dependencias.add(celula);
        celula.adicionarObservador(this);
    }

    public void setValor(int valor) {
        this.valor = valor;
        notificarObservadores();
    }

    public int getValor() {
        return valor;
    }

    private void notificarObservadores() {
        for (Celula celula : observadores) {
            celula.atualizar();
        }
    }

    public void atualizar() {
        int novoValor = 0;
        for (Celula celula : dependencias) {
            novoValor += celula.getValor();
        }
        setValor(novoValor);
    }
}


