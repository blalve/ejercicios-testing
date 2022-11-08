package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

@Tag("unit")

public class PersonaTest {
    Persona p = new Persona();

    @BeforeEach
    public void setup() {
        System.out.println("Before each");
        this.p = new Persona();

    }


    @Tag("sanity")
    @DisplayName("Sin nombre")
    @Test

    public void testPersonasinparametros() {
        Persona p = new Persona();
        assertEquals("", p.getNombre());
    }

    ;
    @Tag("smoke")
    @DisplayName("Blanca")
    @Test

    public void testPersonaconparametros() {
        Persona p = new Persona("Blanca");
        assertEquals("Blanca", p.getNombre());
    }

    ;
}
