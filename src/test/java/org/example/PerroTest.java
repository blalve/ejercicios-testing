package org.example;

import org.junit.jupiter.api.*;

import static junit.framework.Assert.assertEquals;

public class PerroTest {
Perro p = new Perro();



    @BeforeEach
    public void setup(){
        System.out.println("Before each");
        this.p = new Perro();

    }

    @Test

    public void testPerrosinparametros(){
        Perro p = new Perro();
        assertEquals("", p.getRaza());
    };

    @Test
    public void testPerroconparametros(){
        Perro p = new Perro("terrier");
        assertEquals("terrier", p.getRaza());
    };

}

