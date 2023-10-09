import org.example.Endereco;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class TestEndereco {

    @Test
    void builderShouldSetRua() {
        String expectedRua = "Rua Exemplo";
        Endereco endereco = new Endereco.Builder().withRua(expectedRua).build();
        assertEquals(expectedRua, endereco.getRua());
    }

    @Test
    void builderShouldSetNumero() {
        String expectedNumero = "123";
        Endereco endereco = new Endereco.Builder().withNumero(expectedNumero).build();
        assertEquals(expectedNumero, endereco.getNumero());
    }

    @Test
    void builderShouldSetBairro() {
        String expectedBairro = "Bairro Exemplo";
        Endereco endereco = new Endereco.Builder().withBairro(expectedBairro).build();
        assertEquals(expectedBairro, endereco.getBairro());
    }

    @Test
    void builderShouldCreateDistinctObjects() {
        Endereco endereco1 = new Endereco.Builder()
                .withRua("Rua 1")
                .withNumero("100")
                .withBairro("Bairro 1")
                .build();
        Endereco endereco2 = new Endereco.Builder()
                .withRua("Rua 2")
                .withNumero("200")
                .withBairro("Bairro 2")
                .build();

        assertNotEquals(endereco1.getRua(), endereco2.getRua());
        assertNotEquals(endereco1.getNumero(), endereco2.getNumero());
        assertNotEquals(endereco1.getBairro(), endereco2.getBairro());
    }
}
