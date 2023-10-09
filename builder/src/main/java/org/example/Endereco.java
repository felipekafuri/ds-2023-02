package org.example;

public class Endereco {
    private final String rua;
    private final String numero;
    private final String bairro;
    // Adicione mais atributos conforme necessário

    private Endereco(Builder builder) {
        this.rua = builder.rua;
        this.numero = builder.numero;
        this.bairro = builder.bairro;
        // Inicialize mais atributos aqui, se necessário
    }

    public static class Builder {
        private String rua;
        private String numero;
        private String bairro;
        // Adicione mais atributos conforme necessário

        public Builder withRua(String rua) {
            this.rua = rua;
            return this;
        }

        public Builder withNumero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder withBairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        // Adicione mais métodos `with` conforme necessário

        public Endereco build() {
            // Aqui você pode adicionar verificações de validação
            return new Endereco(this);
        }
    }

    // Métodos getters (opcional, dependendo do seu caso de uso)
    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    // Adicione mais getters conforme necessário
}
