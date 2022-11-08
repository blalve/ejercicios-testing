package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProcesadorTest {
    Procesador p = new Procesador();
    @BeforeEach
    public void setUp(){
        p = new Procesador();
    }

    @Test

    public void testProcesadorSinparametros() {

        assertNotNull(p.getComando());
        assertEquals("", p.getComando());
    }

    ;

    @Test
    public void testProcesadorConparametros() {
        Procesador p = new Procesador("comando", null);
        assertNotNull(p.getComando());
        assertEquals("comando", p.getComando());
    }
    ;

    @Test
    public void testSetter(){
        Proceso proceso = new Proceso();
        Procesador procesador = new Procesador();
        procesador.setProceso(proceso);
        assertEquals(proceso,procesador.getProceso());
    }

}
