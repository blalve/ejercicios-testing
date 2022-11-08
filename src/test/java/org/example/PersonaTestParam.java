package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static junit.framework.Assert.assertEquals;

public class PersonaTestParam {
    @ParameterizedTest
    @CsvFileSource(resources = "/nombres.csv", numLinesToSkip = 1)
    void addFromFile(
            String input, String expected) {
        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);
    }
}
