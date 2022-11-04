package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

@Tag("unit")
public class SalaTest {
    Sala s = new Sala();

    @BeforeEach
    public void setup(){
        System.out.println("Before each");
        this.s = new Sala();

    }

    @DisplayName("Sin dimensiones")
    @Test

    public void testDimensionessinparametro(){
        Sala s = new Sala();
        assertEquals("", s.getDimensiones());

    };

    @Tag("smoke")
    @DisplayName("Dimensiones 10x10")
    @Test

    public void testDimensionesconparametro(){
        Sala s = new Sala("10x10",true);
        assertEquals("10x10", s.getDimensiones());

    };

    @DisplayName("Aire on")
    @Test

    public void testAireconparametro(){
        Sala s = new Sala("10x10",true);
        assertEquals(true, s.getAire().booleanValue());

    };
    @DisplayName("Aire off")
    @Test

    public void testAiresinparametro(){
        Sala s = new Sala();
        assertEquals(false, s.getAire().booleanValue());

    };





}
