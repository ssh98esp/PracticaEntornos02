package CalculadoraEntornos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name = "La suma de {0} y {1} es {2}")
    @CsvSource({"5, 5, 10",
            "10, 15, 25",
            "4, 3, 7"})
    void sumar(double num1, double num2, double expectedResult){
        assertEquals(expectedResult,
                Calculadora.sumar(num1,num2), 0.1);
    }

    @ParameterizedTest(name = "La resta de {0} y {1} es {2}")
    @CsvSource({"8, 5, 3",
            "209, 9, 200",
            "1.1, 5, -3.9"})
    void restar(double num1, double num2, double expectedResult){
        assertEquals(expectedResult,
                Calculadora.restar(num1,num2), 0.1);
    }
}