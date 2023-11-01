package org.example;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("exemplo.md");

            Markdown titulo = new Titulo(new Texto("Título"));
            Markdown linha = new Concatena(new Texto("Uma simples linha, com "), new Negrito(new Texto("negrito")));
            Markdown italico = new Concatena(linha, new Texto(" e "));
            Markdown linhaCompleta = new Concatena(italico, new Italico(new Texto("itálico.")));
            Markdown item = new Item(new Italico(new Texto("Primeiro item da linha com itálico.")));

            titulo.exibe(writer);
            linhaCompleta.exibe(writer);
            writer.println();
            item.exibe(writer);

            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

