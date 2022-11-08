package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class ProcesoTest {
    @Test

    public void testProcesoSinparametros() {
        Proceso p = new Proceso();
        assertEquals("", p.getNombre());
    }

    ;

    @Test

    public void testProcesoConparametros() {
        Proceso p = new Proceso("nombre");
        assertEquals("nombre", p.getNombre());

    }
    ;

    @Test
    public void testSetter(){
        String inicial = "inicial";
        Proceso proceso = new Proceso();
        proceso.setNombre(inicial);
        assertEquals(inicial, proceso.getNombre());
    }
}
