package Test;

import Main.DivisionOperation;
import Main.DivisionOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionOperationTest {

    DivisionOperation testCase15 = new DivisionOperation(4,2);
    DivisionOperation testCase16 = new DivisionOperation(4.00,2.00);

    DivisionOperation testCase17 = new DivisionOperation(-2,-3);

    DivisionOperation testCase18 = new DivisionOperation(1000000001,1000000001);

    DivisionOperation testCase19 = new DivisionOperation(-1000000001,-1000000001);

    DivisionOperation testCase20 = new DivisionOperation(2,-1000000001);

    DivisionOperation testCase21 = new DivisionOperation(-1000000001,2);

    DivisionOperation testCase22 = new DivisionOperation(2,0);
    DivisionOperation testCase23 = new DivisionOperation(0,0);





    @Test
    void testingForFirstIntegerInputNumber() {


        double testResult = testCase15.getNum1();
        assertNotNull(testResult);


    }

    @Test
    void testingForSecondIntegerInputNumber() {


        double testResult = testCase15.getNum2();
        assertEquals(3,testResult);


    }

    @Test
    void testingResultForIntegerDivisionOperation() {

        double testResult = testCase15.getResult();
        assertEquals(2,testResult);

    }

    @Test
    void testingForFirstFloatInputNumber() {

        double testResult = testCase16.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSecondFloatInputNumber() {


        double testResult = testCase16.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForFloatDivisionOperation() {

        double testResult = testCase16.getResult();
        assertEquals(5,testResult);

    }

    @Test
    void testingForFirstNegativeInputNumber() {


        double testResult = testCase17.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSecondNegativeInputNumber() {


        double testResult = testCase17.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForNegativeDivisionOperation() {

        double testResult = testCase17.getResult();
        assertEquals(5,testResult);

    }

    @Test
    void testingForFirstLargeInputNumber() {


        double testResult = testCase18.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSecondLargeInputNumber() {


        double testResult = testCase18.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForLargeDivisionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase18.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    void testingForFirstNegativeLargeInputNumber() {


        double testResult = testCase19.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForNegativeSecondLargeInputNumber() {


        double testResult = testCase19.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForNegativeLargeDivisionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase19.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }



    @Test
    void testingForPositiveSmallInputNumber() {


        double testResult = testCase20.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForNegativeLargeInputNumber() {

        double testResult = testCase20.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForSmallPositiveAndLargeNegativeNumberDivisionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase20.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    void testingForLargeNegativeInputNumber() {

        double testResult = testCase21.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSmallPositiveInputNumber() {

        double testResult = testCase21.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForLargeNegativeAndSmallPositiveNumberDivisionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase21.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }


    @Test
    void testingForFirstNonZeroInputNumber() {


        double testResult = testCase22.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSecondZeroInputNumber() {


        double testResult = testCase22.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForDivisibleByZeroDivisionOperation() {


        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase22.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());

    }


    @Test
    void testingForFirstZeroInputNumber() {


        double testResult = testCase23.getNum1();
        assertNotNull(testResult);


    }

    @Test
    void testingResultForZeroByZeroDivisionOperation() {


        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase23.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());

    }




}