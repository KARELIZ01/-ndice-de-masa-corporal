package kare_dev_imc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    @Test
    public void testCalcularIMC() {
        assertEquals(22.86, App.calcularIMC(70, 1.75), 0.01);
    }
    
    @Test
    public void testCategorizarIMC() {
        assertEquals("Bajo peso", App.categorizarIMC(18.4));
        assertEquals("Normal", App.categorizarIMC(22.0));
        assertEquals("Sobrepeso", App.categorizarIMC(27.0));
        assertEquals("Obesidad", App.categorizarIMC(31.0));
    }
}