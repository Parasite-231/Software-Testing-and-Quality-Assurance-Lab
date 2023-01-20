package Test;

import Main.TrigonometricTanOperation;
import Main.TrigonometricSineOperation;
import Main.TrigonometricTanOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrigonometricTanOperationTest {

    TrigonometricTanOperation testCase93 = new TrigonometricTanOperation(0);

    TrigonometricTanOperation testCase94 = new TrigonometricTanOperation(45);

    TrigonometricTanOperation testCase95 = new TrigonometricTanOperation(2.5);

    TrigonometricTanOperation testCase96 = new TrigonometricTanOperation(-2);

    TrigonometricTanOperation testCase97 = new TrigonometricTanOperation(201);
    TrigonometricTanOperation testCase98 = new TrigonometricTanOperation(-201);

    TrigonometricTanOperation testCase99 = new TrigonometricTanOperation(90);







    @Test
    void testingInputNumbersAreNotNullForTrigonometricTanOperation() {


        double testResult1 = testCase93.getNum1();


        assertNotNull(testResult1);




    }
    @Test
    void testingResultForPositiveIntegerInputNumberForTrigonometricTanOperation() {


        double testResult = testCase94.getResult();
        assertEquals(1,testResult);


    }
    @Test
    void testingResultForFloatIntegerInputNumberForTrigonometricTanOperation() {

        double testResult = testCase95.getResult();
        assertEquals(-1,testResult);


    }
    @Test
    void testingResultForNegativeIntegerInputNumberForTrigonometricTanOperation() {


        double testResult = testCase96.getResult();
        assertEquals(2,testResult);


    }
    @Test
    void testingResultForNegativeLargeIntegerInputNumberForTrigonometricTanOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase97.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }
    @Test
    void testingResultForPositiveLargeIntegerInputNumberForTrigonometricTanOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase98.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }
    @Test
    void testingResultForUndefinedScenarioForTrigonometricTanOperation() {



        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase99.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());


    }



}