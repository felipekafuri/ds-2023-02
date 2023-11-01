package org.example;

import java.io.PrintWriter;

public class Item implements Markdown {
    private Markdown markdown;

    public Item(Markdown markdown) {
        this.markdown = markdown;
    }

    @Override
    public void exibe(PrintWriter writer) {
        writer.print("- ");
        markdown.exibe(writer);
        writer.println();
    }
}

