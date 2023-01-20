package Test;

import Main.SubtractionOperation;
import Main.SubtractionOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionOperationTest {

    SubtractionOperation testCase8 = new SubtractionOperation(2,3);
    SubtractionOperation testCase9 = new SubtractionOperation(2.02,3.90);

    SubtractionOperation testCase10 = new SubtractionOperation(-2,-3);

    SubtractionOperation testCase11 = new SubtractionOperation(1000000001,1000000001);

    SubtractionOperation testCase12 = new SubtractionOperation(-1000000001,-1000000001);

    SubtractionOperation testCase13 = new SubtractionOperation(2,-1000000001);

    SubtractionOperation testCase14 = new SubtractionOperation(-1000000001,2);




    @Test
    void testingForFirstIntegerInputNumber() {


        double testResult = testCase8.getNum1();
        assertNotNull(testResult);


    }

    @Test
    void testingForSecondIntegerInputNumber() {


        double testResult = testCase8.getNum2();
        assertEquals(3,testResult);


    }

    @Test
    void testingResultForIntegerSubtractionOperation() {

        double testResult = testCase8.getResult();
        assertEquals(5,testResult);

    }

    @Test
    void testingForFirstFloatInputNumber() {


        double testResult = testCase9.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSecondFloatInputNumber() {


        double testResult = testCase9.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForFloatSubtractionOperation() {

        double testResult = testCase9.getResult();
        assertEquals(5,testResult);

    }

    @Test
    void testingForFirstNegativeInputNumber() {


        double testResult = testCase10.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSecondNegativeInputNumber() {


        double testResult = testCase10.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForNegativeSubtractionOperation() {

        double testResult = testCase10.getResult();
        assertEquals(5,testResult);

    }

    @Test
    void testingForFirstLargeInputNumber() {


        double testResult = testCase11.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSecondLargeInputNumber() {


        double testResult = testCase11.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForLargeSubtractionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase11.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    void testingForFirstNegativeLargeInputNumber() {


        double testResult = testCase12.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForNegativeSecondLargeInputNumber() {


        double testResult = testCase12.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForNegativeLargeSubtractionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase12.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }



    @Test
    void testingForPositiveSmallInputNumber() {


        double testResult = testCase13.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForNegativeLargeInputNumber() {


        double testResult = testCase13.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForSmallPositiveAndLargeNegativeNumberSubtractionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase13.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    void testingForLargeNegativeInputNumber() {


        double testResult = testCase14.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingForSmallPositiveInputNumber() {

        double testResult = testCase14.getNum1();
        assertNotNull(testResult);


    }
    @Test
    void testingResultForLargeNegativeAndSmallPositiveNumberSubtractionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase14.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

}