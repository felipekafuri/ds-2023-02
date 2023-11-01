package org.example;

import java.io.PrintWriter;

public class Texto implements Markdown {
    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    @Override
    public void exibe(PrintWriter writer) {
        writer.print(texto);
    }
}

