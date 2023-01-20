package Test;

import Main.TrigonometricSineOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrigonometricSineOperationTest {

    TrigonometricSineOperation testCase81 = new TrigonometricSineOperation(0);

    TrigonometricSineOperation testCase82 = new TrigonometricSineOperation(90);

    TrigonometricSineOperation testCase83 = new TrigonometricSineOperation(2.5);

    TrigonometricSineOperation testCase84 = new TrigonometricSineOperation(-2);
    TrigonometricSineOperation testCase85 = new TrigonometricSineOperation(201);
    TrigonometricSineOperation testCase86 = new TrigonometricSineOperation(-201);






    @Test
    void testingInputNumbersAreNotNullForTrigonometricSineOperation() {


        double testResult1 = testCase81.getNum1();


        assertNotNull(testResult1);




    }
    @Test
    void testingResultForPositiveIntegerInputNumberForTrigonometricSineOperation() {

        double testResult = testCase82.getResult();
        assertEquals(1,testResult);


    }
    @Test
    void testingResultForFloatIntegerInputNumberForTrigonometricSineOperation() {


        double testResult = testCase83.getResult();
        assertEquals(1.0,testResult);


    }
    @Test
    void testingResultForNegativeIntegerInputNumberForTrigonometricSineOperation() {


        double testResult = testCase84.getResult();
        assertEquals(-0.0,testResult);


    }
    @Test
    void testingResultForNegativeLargeIntegerInputNumberForTrigonometricSineOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase85.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }
    @Test
    void testingResultForPositiveLargeIntegerInputNumberForTrigonometricSineOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase86.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }


}