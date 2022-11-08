package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ModeloTest {

    private Modelo modelo;

    @BeforeEach
    public void setUp(){
        modelo = new Modelo();

    }

    @Test
    public void testConstructor() {

    assertNotNull(modelo.list());

    assertEquals(2,modelo.list().size());
    assertEquals("PrimerValor", modelo.list().get(0));
    assertEquals("SegundoValor", modelo.list().get(1));

    }


}
