package org.example;

import org.junit.jupiter.api.*;

import static junit.framework.Assert.assertEquals;

@Tag ("unit")
@Tag ("smoke")
public class PerroTest {
Perro p = new Perro();



    @BeforeEach
    public void setup(){
        System.out.println("Before each");
        this.p = new Perro();

    }

    @DisplayName("Sin raza")
    @Test

    public void testPerrosinparametros(){
        Perro p = new Perro();
        assertEquals("", p.getRaza());
    };

    @DisplayName("Raza: Terrier")
    @Test
    public void testPerroconparametros(){
        Perro p = new Perro("terrier");
        assertEquals("terrier", p.getRaza());
    };

}

