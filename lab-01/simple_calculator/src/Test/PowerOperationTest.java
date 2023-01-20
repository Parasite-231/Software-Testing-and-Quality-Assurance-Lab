package Test;

import Main.PowerOperation;
import Main.PowerOperation;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PowerOperationTest {


    PowerOperation testCase68 = new PowerOperation(1,2);

    PowerOperation testCase69 = new PowerOperation(1,2);

    PowerOperation testCase70 = new PowerOperation(-1,-2);

    PowerOperation testCase71 = new PowerOperation(0,0);
    PowerOperation testCase72 = new PowerOperation(1000000001,1000000001);

    PowerOperation testCase73 = new PowerOperation(1.1,2.2);
    PowerOperation testCase74 = new PowerOperation(1000000001,2);
    PowerOperation testCase75 = new PowerOperation(2,1000000001);






    @Test
    public  void testingInputNumbersAreNotNullForPowerOperation() {


        double testResult1 = testCase68.getNum1();
        double testResult2 = testCase68.getNum2();

        assertNotNull(testResult1);
        assertNotNull(testResult2);



    }
    @Test
    public void testingResultForPositiveIntegerInputNumberForPowerOperation() {


        double testResult = testCase69.getResult();
        assertEquals(1,testResult);


    }
    @Test
    public  void testingResultForNegativeIntegerInputNumberForPowerOperation() {

        double testResult = testCase70.getResult();
        assertEquals(1,testResult);


    }
    @Test
    public  void testingResultForZeroIntegerInputNumberForPowerOperation() {



        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase71.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());


    }
    @Test
    public  void testingResultLargeIntegerInputNumberForPowerOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase72.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());


    }
    @Test
    public void testingResultForFloatIntegerInputNumberForPowerOperation() {


        double testResult = testCase73.getResult();
        assertEquals(1.2333,testResult);


    }


    @Test
    public void testingResultForFirstLargeInputInPowerOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase74.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());

    }
    @Test
    public  void testingResultForSecondLargeInputInPowerOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase75.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());

    }

}
