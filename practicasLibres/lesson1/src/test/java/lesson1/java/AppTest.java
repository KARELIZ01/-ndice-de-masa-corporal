package lesson1.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class AppTest {

    @Test
    void testSuma() {
       assertEquals(8, Lesson1.suma(5, 3), "5 + 3 should equal 8");
       assertEquals(0, Lesson1.suma(0, 0), "0 + 0 sould equal 0");
       assertEquals(-2, Lesson1.suma(-1, -1), "-1 + -1 should equal -2");
    }

    @Test
    void testObtenerNombre() {
        assertEquals("Kareliz", Lesson1.obtenerNOmbre(), "El nombre debe ser Kareliz");
    }

    @Test
    void testEsEstudiante() {
        assertTrue(Lesson1.esEstudiante(), "Debe ser estudiante");
    }

    @Test
    void testObtenerAltura() {
        assertEquals(1.65, Lesson1.obtenerAltura(), 0.001, "La altura debe ser 1.65");
    }

    @Test
    void testObtenerEdad() {
        assertEquals(25, Lesson1.obtenerEdad(), "La edad debe ser 25");
    }
    
    }


    