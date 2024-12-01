package kata_dni;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

class AppTest {
    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    void testCalcularLetra() {
        assertEquals('Z', App.calcularLetra(12345678));
        assertEquals('M', App.calcularLetra(87654321));
        assertEquals('T', App.calcularLetra(0));
        assertEquals('E', App.calcularLetra(99999999));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 100000000})
    void testPedirNumeroInvalido(int numero) {
        String input = numero + "\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(0, App.pedirNumero(new Scanner(System.in)));
    }

    @Test
    void testPedirNumeroValido() {
        String input = "12345678\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(12345678, App.pedirNumero(new Scanner(System.in)));
    }

    @Test
    void testPedirNumeroConEntradaNoNumerica() {
        String input = "abc\n12345678\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(12345678, App.pedirNumero(new Scanner(System.in)));
    }
}






