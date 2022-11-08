package org.example;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AplicacionTest {
    private Aplicacion app;
    @Before
    public void setup(){
        app = new Aplicacion();
    }
    @Test
    public void testConstructor(){
        assertNotNull(app.getControlador());
    }
    @Test
    public void testSetControlador(){
        Controlador controlador = new Controlador();
        app.setControlador(controlador);
        assertEquals(controlador, app.getControlador());
    }
}
