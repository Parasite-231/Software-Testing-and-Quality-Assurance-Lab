package Test;

import Main.LogOperation;
import Main.LogOperation;
import Main.SquareRootOperation;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogOperationTest {


    LogOperation testCase46 = new LogOperation(1);

    LogOperation testCase47 = new LogOperation(0);

    LogOperation testCase48 = new LogOperation(-1);

    LogOperation testCase49 = new LogOperation(200);
    LogOperation testCase50 = new LogOperation(2000000001);

    LogOperation testCase51 = new LogOperation(2.1);







    @Test
    public void testingInputNumberIsNotNullForLogOperation() {

        double testResult = testCase46.getNum1();
        assertNotNull(testResult);


    }



    @Test
    public  void testingResultForZeroInputInLogOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase47.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());

    }

    @Test
    public void testingResultForNegativeIntegerInputInLogOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase48.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());

    }


    @Test
    public  void testingResultForPositiveIntegerInputInLogOperation() {


        double testResult = testCase49.getResult();
        assertEquals(5.2983,testResult);


    }

    @Test
    public void testingResultForLargeIntegerToBinaryConversion() {




        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase50.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());


    }
    @Test
    public  void testingResultForFractionalIntegerInputInLogOperation() {


        double testResult = testCase51.getResult();
        assertEquals(0.7419,testResult);


    }


}
