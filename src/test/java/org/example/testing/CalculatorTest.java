package org.example.testing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.assertj.core.api.AbstractByteArrayAssert;
import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    private static Instant startedAt;


    @BeforeAll
    public static void startTimer(){
        System.out.println("Le Timer est lancée !");
        startedAt= Instant.now();
    }

    @AfterAll
    public static void endTimer(){
        System.out.println("Fin du Timer !");
        Instant endedAt=Instant.now();
        long duration = Duration.between(startedAt,endedAt).toMillis();
        System.out.println("Durée des test :"+duration+" ms");
    }


    @BeforeEach
    void initCalculator(){
        calculator = new Calculator();
        System.out.println("Le Calculateur est instancié ! trop cool");
    }


    @AfterEach
    void endCalculator(){
        calculator=null;
        System.out.println("Le Calculateur n'est plus instancié :( FF");
    }



    @Test
    void testAddTwoNumbers(){
        int a =2;
        int b =3;

        int somme=calculator.add(a,b);
        assertThat(somme).isEqualTo(5);

    }

    @Test
    void testMultiply(){
        int a=9;
        int b=8;

        int mul=calculator.mul(a,b);

        assertThat(mul).isEqualTo(72);
        //assertEquals(72,mul);
    }

    @ParameterizedTest(name = "{0} x 0 doit être égal à 0")
    @ValueSource(ints = { 1, 2, 42, 1011, 5089 })
    public void multiplication_par_zero(int arg) {

        int actualResult = calculator.mul(arg, 0);
        assertThat(actualResult).isEqualTo(0);
        //assertEquals(0, actualResult);

    }

    @ParameterizedTest(name = "{0} + {1} should equal to {2}")
    @CsvSource({ "1,1,2", "2,3,5", "42,57,99" })
    public void add_shouldReturnTheSum_ofMultipleIntegers(int arg1, int arg2, int expectResult) {

        int actualResult = calculator.add(arg1, arg2);
        assertThat(actualResult).isEqualTo(expectResult);
        //assertEquals(expectResult, actualResult);

    }

    @Timeout(1)
    @Test
    public void longCalculationTest() {

        calculator.longCalculation();
    }

    @Test
    public void listDigits_shouldReturnsTheListOfDigits_ofPositiveInteger() {

        // GIVEN
        int number = 95897;
        // WHEN
        Set<Integer> actualDigits = calculator.digitsSet(number);
        // THEN
        assertThat(actualDigits).containsExactlyInAnyOrder(5, 7, 8, 9);
    }

}
