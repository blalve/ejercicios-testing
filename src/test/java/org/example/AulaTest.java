

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

@Tag("unit")
public class AulaTest {
    Aula a = new Aula();

    @BeforeEach
    public void setup() {
        System.out.println("Before each");
        this.a = new Aula();

    }

    @Test

    public void testAulasinparametros() {
        Aula a = new Aula();
        assertEquals("", a.getProfesorAsignado());
    }

    ;

    @Tag("smoke")
    @DisplayName("David")
    @Test

    public void testAulaconparametros() {
        Aula a = new Aula("", false, "David");
        assertEquals("David", a.getProfesorAsignado());
    }

    ;

}
