package org.example;

import java.io.PrintWriter;

public class Titulo implements Markdown {
    private Markdown markdown;

    public Titulo(Markdown markdown) {
        this.markdown = markdown;
    }

    @Override
    public void exibe(PrintWriter writer) {
        writer.print("# ");
        markdown.exibe(writer);
        writer.println();
    }
}
