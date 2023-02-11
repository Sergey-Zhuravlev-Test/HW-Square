package ru.netology.Square.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SquareServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Square.csv")

    public void shouldCalcExactOne(int expected, int x, int y) {

        SquareService service = new SquareService();

        int actual = service.calcSquareInLimit(x, y);


        Assertions.assertEquals(expected, actual);
    }
}
