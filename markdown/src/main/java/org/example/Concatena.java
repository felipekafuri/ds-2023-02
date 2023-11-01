package org.example;

import java.io.PrintWriter;


public class Concatena implements Markdown {
    private Markdown primeiro;
    private Markdown segundo;

    public Concatena(Markdown primeiro, Markdown segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    @Override
    public void exibe(PrintWriter writer) {
        primeiro.exibe(writer);
        segundo.exibe(writer);
    }
}

