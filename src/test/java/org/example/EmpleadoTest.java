package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

@Tag("unit")
public class EmpleadoTest {
    Empleado e = new Empleado();

    @BeforeEach
    public void setup() {
        System.out.println("Before each");
        this.e = new Empleado();

    }
    @Tag("smoke")
@DisplayName("Sin dni")
    @Test
    public void testDnisinparametros() {

        Empleado e = new Empleado();
        assertEquals("", e.getDni());
    };

    @Tag("smoke")
    @DisplayName("Dni 2")
    @Test
    public void testDniconparametros() {

        Empleado e = new Empleado("","2","",0F,"");
        assertEquals("2", e.getDni());
    };

    @DisplayName("Sin tlf")
    @Test
    public void testTlfsinparametros() {

        Empleado e = new Empleado();
        assertEquals("", e.getTlf());
    };

    @DisplayName("Tlf 2")
    @Test
    public void testTlfconparametros() {

        Empleado e = new Empleado("","","2",0F,"");
        assertEquals("2", e.getTlf());
    };

    @DisplayName("Sin sueldo")
    @Test
    public void testSueldosinparametros() {

        Empleado e = new Empleado();
        assertEquals(0F, e.getSueldo());
    };
    @DisplayName("Sueldo 0F")
    @Test
    public void testSueldoconparametros() {

        Empleado e = new Empleado("","","",0F,"");
        assertEquals(0F, e.getSueldo());
    };

    @DisplayName("Sin rango")
    @Test
    public void testRangosinparametros() {

        Empleado e = new Empleado();
        assertEquals("", e.getRango());
    };

    @DisplayName("Rango 2")
    @Test
    public void testRangoconparametros() {

        Empleado e = new Empleado("","","",0F,"2");
        assertEquals("2", e.getRango());
    };


    }
