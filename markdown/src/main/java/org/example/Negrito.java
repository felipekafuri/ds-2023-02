package org.example;

import java.io.PrintWriter;

public class Negrito implements Markdown {
    private Markdown markdown;

    public Negrito(Markdown markdown) {
        this.markdown = markdown;
    }

    @Override
    public void exibe(PrintWriter writer) {
        writer.print("**");
        markdown.exibe(writer);
        writer.print("**");
    }
}

