package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class ProcesadorTest {

    @Test

    public void testProcesadorSinparametros() {
        Procesador p = new Procesador();
        assertEquals(null, p.getComando());
    }

    ;

    @Test
    public void testProcesadorConparametros() {
        Procesador p = new Procesador("comando", null);
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
