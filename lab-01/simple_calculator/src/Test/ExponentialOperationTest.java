package Test;

import Main.ExponentialOperation;
import Main.ExponentialOperation;
import Main.LogOperation;
//import org.junit.jupiter.api.Test;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExponentialOperationTest {

    ExponentialOperation testCase24 = new ExponentialOperation(0);
    ExponentialOperation testCase25 = new ExponentialOperation(-1);

    ExponentialOperation testCase26 = new ExponentialOperation(2.1);

    ExponentialOperation testCase27 = new ExponentialOperation(-1.2);

    ExponentialOperation testCase28 = new ExponentialOperation(1000000001);
    ExponentialOperation testCase29 = new ExponentialOperation(-1000000001);








    @Test
    public void testingForPositiveExponentPowerInput() {


        double testResult = testCase24.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingForPositiveExponentialOperation() {


        double testResult = testCase24.getNum1();
        assertEquals(0,testResult);


    }

    @Test
    public void testingForNegativeExponentPowerInput() {


        double testResult = testCase25.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingForNegativeExponentialOperation() {


        double testResult = testCase25.getNum1();
        assertEquals(0,testResult);


    }
    @Test
    public void testingForPositiveFloatExponentPowerInput() {


        double testResult = testCase26.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingForPositiveFloatExponentialOperation() {


        double testResult = testCase26.getNum1();
        assertEquals(0,testResult);


    }

    @Test
    public void testingForNegativeFloatExponentPowerInput() {


        double testResult = testCase27.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingForNegativeFloatExponentialOperation() {


        double testResult = testCase27.getNum1();
        assertEquals(0,testResult);


    }

    @Test
    public void testingForLargePositiveExponentPowerInput() {

        double testResult = testCase28.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingLargePositiveExponentialOperation() {




        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase28.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }

    @Test
    public void testingForLargeNegativeExponentPowerInput() {

        double testResult = testCase29.getNum1();
        assertNotNull(testResult);


    }

    @Test
    public void testingLargeNegativeExponentialOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase29.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }

}
