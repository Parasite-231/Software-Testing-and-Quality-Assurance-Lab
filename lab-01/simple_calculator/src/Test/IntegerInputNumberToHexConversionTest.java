package Test;

import Main.IntegerInputNumberToHexConversion;
import Main.IntegerInputNumberToHexConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerInputNumberToHexConversionTest {


    IntegerInputNumberToHexConversion testCase41 = new IntegerInputNumberToHexConversion(4);
    IntegerInputNumberToHexConversion testCase42 = new IntegerInputNumberToHexConversion(9);

    IntegerInputNumberToHexConversion testCase43 = new IntegerInputNumberToHexConversion(-2);

    IntegerInputNumberToHexConversion testCase44 = new IntegerInputNumberToHexConversion(10001);

    IntegerInputNumberToHexConversion testCase45 = new IntegerInputNumberToHexConversion(1.5);




    @Test
    void testingIntegerInputNumberForBinaryConversion() {


        double testResult = testCase41.getNum1();
        assertNotNull(testResult);


    }



    @Test
    void testingResultForPositiveIntegerToBinaryConversion() {

        String testResult = testCase42.getResult();
        assertEquals("9",testResult);

    }


    @Test
    void testingResultForNegativeIntegerToBinaryConversion() {

        System.out.println("Running test -> 2 " );



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase43.getResult();
                }
        );

        assertEquals("Input number cannot be negative !", exception.getMessage());


    }

    @Test
    void testingResultForLargeIntegerToBinaryConversion() {



        Throwable exception = assertThrows(
                ArrayIndexOutOfBoundsException.class, () -> {

                    testCase44.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());


    }

    @Test
    void testingResultForFloatInputNumberInIntegerToBinaryConversion() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase45.getResult();
                }
        );

        assertEquals("Input number cannot be fractional !", exception.getMessage());


    }
}
