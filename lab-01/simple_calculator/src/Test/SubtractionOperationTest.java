package Test;

import Main.SubtractionOperation;
import Main.SubtractionOperation;
//import org.junit.jupiter.api.Test;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubtractionOperationTest {

    SubtractionOperation testCase8 = new SubtractionOperation(2,3);
    SubtractionOperation testCase9 = new SubtractionOperation(2.02,3.90);

    SubtractionOperation testCase10 = new SubtractionOperation(-2,-3);

    SubtractionOperation testCase11 = new SubtractionOperation(1000000001,1000000001);

    SubtractionOperation testCase12 = new SubtractionOperation(-1000000001,-1000000001);

    SubtractionOperation testCase13 = new SubtractionOperation(2,-1000000001);

    SubtractionOperation testCase14 = new SubtractionOperation(-1000000001,2);




    @Test
    public void testingForFirstIntegerInputNumber() {


        double testResult = testCase8.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingForSecondIntegerInputNumber() {


        double testResult = testCase8.getNum2();
        assertEquals(3,testResult);


    }

    @Test
    public void testingResultForIntegerSubtractionOperation() {

        double testResult = testCase8.getResult();
        assertEquals(5,testResult);

    }

    @Test
    public  void testingForFirstFloatInputNumber() {


        double testResult = testCase9.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSecondFloatInputNumber() {


        double testResult = testCase9.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForFloatSubtractionOperation() {

        double testResult = testCase9.getResult();
        assertEquals(5,testResult);

    }

    @Test
    public void testingForFirstNegativeInputNumber() {


        double testResult = testCase10.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSecondNegativeInputNumber() {


        double testResult = testCase10.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public  void testingResultForNegativeSubtractionOperation() {

        double testResult = testCase10.getResult();
        assertEquals(5,testResult);

    }

    @Test
    public  void testingForFirstLargeInputNumber() {


        double testResult = testCase11.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public   void testingForSecondLargeInputNumber() {


        double testResult = testCase11.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForLargeSubtractionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase11.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    public void testingForFirstNegativeLargeInputNumber() {


        double testResult = testCase12.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForNegativeSecondLargeInputNumber() {


        double testResult = testCase12.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public  void testingResultForNegativeLargeSubtractionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase12.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }



    @Test
    public void testingForPositiveSmallInputNumber() {


        double testResult = testCase13.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForNegativeLargeInputNumber() {


        double testResult = testCase13.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public  void testingResultForSmallPositiveAndLargeNegativeNumberSubtractionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase13.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    public void testingForLargeNegativeInputNumber() {


        double testResult = testCase14.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public  void testingForSmallPositiveInputNumber() {

        double testResult = testCase14.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForLargeNegativeAndSmallPositiveNumberSubtractionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase14.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

}