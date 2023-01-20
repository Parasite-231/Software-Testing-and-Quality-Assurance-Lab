package Test;

import Main.SquareRootOperation;
import Main.SquareRootOperation;
import Main.SubtractionOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootOperationTest {

    SquareRootOperation testCase76 = new SquareRootOperation(1);

    SquareRootOperation testCase77 = new SquareRootOperation(4);

    SquareRootOperation testCase78 = new SquareRootOperation(4.2);

    SquareRootOperation testCase79 = new SquareRootOperation(-1);
    SquareRootOperation testCase80 = new SquareRootOperation(1000000001);




    @Test
    void testingInputNumbersAreNotNullForSquareRootOperation() {

        double testResult1 = testCase76.getNum1();


        assertNotNull(testResult1);




    }
    @Test
    void testingResultForPositiveIntegerInputNumberForSquareRootOperation() {


        double testResult = testCase77.getResult();
        assertEquals(2,testResult);


    }
    @Test
    void testingResultForNegativeIntegerInputNumberForSquareRootOperation() {


        double testResult = testCase78.getResult();
        assertEquals(2.0494,testResult);


    }
    @Test
    void testingResultForZeroIntegerInputNumberForSquareRootOperation() {



        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase79.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());


    }
    @Test
    void testingResultLargeIntegerInputNumberForSquareRootOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase80.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());


    }



}


