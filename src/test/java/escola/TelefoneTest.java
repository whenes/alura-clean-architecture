package escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {
    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
    }
    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "123"));
    }
    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "123456789"));
    }
}
