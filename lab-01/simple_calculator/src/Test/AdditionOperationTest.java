package Test;

import Main.AdditionOperation;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionOperationTest {

    AdditionOperation testCase1 = new AdditionOperation(2,3);
    AdditionOperation testCase2 = new AdditionOperation(2.02,3.90);

    AdditionOperation testCase3 = new AdditionOperation(-2,-3);

    AdditionOperation testCase4 = new AdditionOperation(1000000001,1000000001);

    AdditionOperation testCase5 = new AdditionOperation(-1000000001,-1000000001);

    AdditionOperation testCase6 = new AdditionOperation(2,-1000000001);

    AdditionOperation testCase7 = new AdditionOperation(-1000000001,2);





    @Test(timeout = 1)
    public void testingForFirstIntegerInputNumber() {

        double testResult = testCase1.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingForSecondIntegerInputNumber() {

        double testResult = testCase1.getNum2();
        assertEquals(3,testResult);


    }

    @Test
    public void testingResultForIntegerAdditionOperation() {

        double testResult = testCase1.getResult();
        assertEquals(5,testResult);

    }

    @Test
    public void testingForFirstFloatInputNumber() {


        double testResult = testCase2.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSecondFloatInputNumber() {


        double testResult = testCase2.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForFloatAdditionOperation() {

        double testResult = testCase2.getResult();
        assertEquals(5,testResult);

    }

    @Test
    public void testingForFirstNegativeInputNumber() {


        double testResult = testCase3.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSecondNegativeInputNumber() {


        double testResult = testCase3.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForNegativeAdditionOperation() {

        double testResult = testCase3.getResult();
        assertEquals(5,testResult);

    }

    @Test
    public void testingForFirstLargeInputNumber() {


        double testResult = testCase4.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSecondLargeInputNumber() {


        double testResult = testCase4.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForLargeAdditionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase4.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    public void testingForFirstNegativeLargeInputNumber() {


        double testResult = testCase5.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForNegativeSecondLargeInputNumber() {


        double testResult = testCase5.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForNegativeLargeAdditionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase5.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }



    @Test
    public void testingForPositiveSmallInputNumber() {

        double testResult = testCase6.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForNegativeLargeInputNumber() {

        double testResult = testCase6.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForSmallPositiveAndLargeNegativeNumberAdditionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase6.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

    @Test
    public void testingForLargeNegativeInputNumber() {

        double testResult = testCase7.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingForSmallPositiveInputNumber() {


        double testResult = testCase7.getNum1();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForLargeNegativeAndSmallPositiveNumberAdditionOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase7.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());

    }

}