package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CalcuTest {
    @BeforeEach
    public void setup(){
        System.out.println("Before each");

    }

    @Test

    public void testSuma(){
       Float resultado = Calcu.suma(4F,2F);
       assertEquals(6F,resultado);
    };

    @Test

    public void testResta(){
        Float resultado = Calcu.resta(4F,2F);
        assertEquals(2F,resultado);
    };

    @Test

    public void testMulti(){
        Float resultado = Calcu.multi(4F,2F);
        assertEquals(8F,resultado);
    };

    @Test

    public void testDivi(){
        Float resultado = Calcu.divi(4F,2F);
        assertEquals(2F,resultado);
    };

}