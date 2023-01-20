package Test;

import Main.PrimeNumberGenerationOperation;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;

import static java.sql.Types.NULL;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberGenerationOperationTest {

    PrimeNumberGenerationOperation testCase106 = new PrimeNumberGenerationOperation();
    PrimeNumberGenerationOperation testCase107 = new PrimeNumberGenerationOperation();
    PrimeNumberGenerationOperation testCase108 = new PrimeNumberGenerationOperation();
    PrimeNumberGenerationOperation testCase109 = new PrimeNumberGenerationOperation();
    PrimeNumberGenerationOperation testCase110 = new PrimeNumberGenerationOperation();




    @Test
    public void testingCaseForFirstNPositivePrimes() {
        ArrayList<Integer> list;
        list = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11));
        assertEquals(list,testCase106.firstNPrimes(5));



    }


    @Test
    public void testingCaseOneForIncorrectArrayLengthInputForPrimeNumberGenerationChecking() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase107.firstNPrimes(NULL);
                }
        );

        assertEquals("Array Length is not specified correctly !", exception.getMessage());



    }
    @Test
    public  void testingCaseTwoForIncorrectArrayLengthInputForPrimeNumberGenerationChecking() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase108.firstNPrimes(0);
                }
        );

        assertEquals("Array Length is not specified correctly !", exception.getMessage());



    }
    @Test
    public  void testingCaseThreeForIncorrectArrayLengthInputForPrimeNumberGenerationChecking() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase109.firstNPrimes(-1);
                }
        );

        assertEquals("Array Length is not specified correctly !", exception.getMessage());



    }
    @Test
    public  void testingCaseFourForIncorrectArrayLengthInputForPrimeNumberGenerationChecking() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase110.firstNPrimes(51);
                }
        );

        assertEquals("Array Length is not specified correctly !", exception.getMessage());



    }
}