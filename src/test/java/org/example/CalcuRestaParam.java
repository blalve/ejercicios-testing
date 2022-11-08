package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcuRestaParam {
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvFileSource(resources = "/resta.csv")
    void addFromFile(Float first, Float second, Float expectedResult) {

    Calcu c = new Calcu();
    Float res = c.resta(first, second);
        assertEquals(expectedResult,res,
                () -> first + " - " + second + " should equal " + expectedResult);
    }
}
