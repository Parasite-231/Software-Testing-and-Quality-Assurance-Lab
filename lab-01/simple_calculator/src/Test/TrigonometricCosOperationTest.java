package Test;

import Main.TrigonometricCosOperation;
import Main.TrigonometricCosOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrigonometricCosOperationTest {

    TrigonometricCosOperation testCase87 = new TrigonometricCosOperation(0);

    TrigonometricCosOperation testCase88 = new TrigonometricCosOperation(90);

    TrigonometricCosOperation testCase89 = new TrigonometricCosOperation(2.5);

    TrigonometricCosOperation testCase90 = new TrigonometricCosOperation(-2);
    TrigonometricCosOperation testCase91 = new TrigonometricCosOperation(201);
    TrigonometricCosOperation testCase92 = new TrigonometricCosOperation(-201);






    @Test
    void testingInputNumbersAreNotNullForTrigonometricCosOperation() {

        System.out.println("Running test -> 1 " );
        System.out.println("...Testing first input number for addition operation ");
        double testResult1 = testCase87.getNum1();


        assertNotNull(testResult1);




    }
    @Test
    void testingResultForPositiveIntegerInputNumberForTrigonometricCosOperation() {

        double testResult = testCase88.getResult();
        assertEquals(-1,testResult);


    }
    @Test
    void testingResultForFloatIntegerInputNumberForTrigonometricCosOperation() {


        double testResult = testCase89.getResult();
        assertEquals(-1.0,testResult);


    }
    @Test
    void testingResultForNegativeIntegerInputNumberForTrigonometricCosOperation() {


        double testResult = testCase90.getResult();
        assertEquals(-1,testResult);


    }
    @Test
    void testingResultForNegativeLargeIntegerInputNumberForTrigonometricCosOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase91.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }
    @Test
    void testingResultForPositiveLargeIntegerInputNumberForTrigonometricCosOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase92.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }

}
