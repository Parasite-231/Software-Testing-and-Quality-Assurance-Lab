package Test;

import Main.DivisionOperation;
//import org.junit.jupiter.api.Test;
import org.junit.*;


import static org.junit.jupiter.api.Assertions.*;

public class DivisionOperationTest {

    DivisionOperation testCase15 = new DivisionOperation(4,2);
    DivisionOperation testCase16 = new DivisionOperation(4.00,2.00);

    DivisionOperation testCase17 = new DivisionOperation(-2,-3);

    DivisionOperation testCase18 = new DivisionOperation(1000000001,1000000001);

    DivisionOperation testCase19 = new DivisionOperation(-1000000001,-1000000001);

    DivisionOperation testCase20 = new DivisionOperation(2,-1000000001);

    DivisionOperation testCase21 = new DivisionOperation(-1000000001,2);

    DivisionOperation testCase22 = new DivisionOperation(2,0);
    DivisionOperation testCase23 = new DivisionOperation(0,0);



    @BeforeClass
    public static void testExecutionBeforeExecutingAllTestsCases(){
        System.out.println("...All Test execution - started");
    }
    @AfterClass
    public static void testExecutionAfterExecutingAllTestsCases(){
        System.out.println("...All Test execution - completed");
    }

    @Before
    public void testExecutionBeforeExecutingEachTestsCases(){
        System.out.println("...Test Running ");
    }
    @After
    public void testExecutionAfterExecutingEachTestsCases(){
        System.out.println("---Test Executed");
    }

    @Test
    public void testingForFirstIntegerInputNumber() {


        double testResult = testCase15.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingForSecondIntegerInputNumber() {


        double testResult = testCase15.getNum2();
        assertEquals(3,testResult);


    }

    @Test
    public  void testingResultForIntegerDivisionOperation() {

        double testResult = testCase15.getResult();
        assertEquals(2,testResult);

    }

    @Test
    public void testingForFirstFloatInputNumber() {

        double testResult = testCase16.getNum1();
        assertNotNull(testResult);


    }
    @Test(timeout = 10)
    public void testingForSecondFloatInputNumber() {


        double testResult = testCase16.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForFloatDivisionOperation() {

        double testResult = testCase16.getResult();
        assertEquals(5,testResult);

    }

    @Test
    public void testingForFirstNegativeInputNumber() {


        double testResult = testCase17.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSecondNegativeInputNumber() {


        double testResult = testCase17.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForNegativeDivisionOperation() {

        double testResult = testCase17.getResult();
        assertEquals(5,testResult);

    }

    @Test
    public void testingForFirstLargeInputNumber() {


        double testResult = testCase18.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSecondLargeInputNumber() {


        double testResult = testCase18.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForLargeDivisionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase18.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    public void testingForFirstNegativeLargeInputNumber() {


        double testResult = testCase19.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForNegativeSecondLargeInputNumber() {


        double testResult = testCase19.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForNegativeLargeDivisionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase19.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }



    @Test
    public void testingForPositiveSmallInputNumber() {


        double testResult = testCase20.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForNegativeLargeInputNumber() {

        double testResult = testCase20.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForSmallPositiveAndLargeNegativeNumberDivisionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase20.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    public void testingForLargeNegativeInputNumber() {

        double testResult = testCase21.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSmallPositiveInputNumber() {

        double testResult = testCase21.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForLargeNegativeAndSmallPositiveNumberDivisionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase21.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }


    @Test
    public void testingForFirstNonZeroInputNumber() {


        double testResult = testCase22.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSecondZeroInputNumber() {


        double testResult = testCase22.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForDivisibleByZeroDivisionOperation() {


        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase22.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());

    }


    @Test
    public void testingForFirstZeroInputNumber() {


        double testResult = testCase23.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public  void testingResultForZeroByZeroDivisionOperation() {


        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase23.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());

    }




}