package org.example;

import java.io.PrintWriter;

public class Italico implements Markdown {
    private Markdown markdown;

    public Italico(Markdown markdown) {
        this.markdown = markdown;
    }

    @Override
    public void exibe(PrintWriter writer) {
        writer.print("_");
        markdown.exibe(writer);
        writer.print("_");
    }
}
