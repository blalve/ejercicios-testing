package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Calcu2Test {

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    void add(Float first, Float second, Float expectedResult) {
        Calcu c = new Calcu();
        Float res =  c.suma(first, second);
        assertEquals(expectedResult,res,
                () -> first + " + " + second + " should equal " + expectedResult);
    }


}
