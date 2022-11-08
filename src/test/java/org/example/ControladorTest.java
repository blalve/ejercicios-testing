package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ControladorTest {
    private Controlador controlador;

    @BeforeEach
    public void setUp(){
        controlador = new Controlador();
    }

    @Test
    public void testConstructor() {
        assertNotNull(controlador.getModelo());
        assertNotNull(controlador.getDatosProcesados());
        assertEquals(0, controlador.getDatosProcesados().size());

    };

    @Test
    public void testProcessData(){
        List<String> lEsperado = new ArrayList<>();
        lEsperado.add("Ana");
        lEsperado.add("Alba");
        lEsperado.add("Blanca");
        controlador.setDatosProcesados(lEsperado);
        controlador.processData();
        assertEquals("Ana1",controlador.getDatosProcesados().get(0));
        assertEquals("Alba1",controlador.getDatosProcesados().get(1));
        assertEquals("Blanca1",controlador.getDatosProcesados().get(2));
        assertEquals(3,controlador.getDatosProcesados().size());
    }

}
