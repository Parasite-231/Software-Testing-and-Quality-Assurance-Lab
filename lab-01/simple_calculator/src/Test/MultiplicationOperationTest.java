package Test;

import Main.AdditionOperation;
import Main.MultiplicationOperation;
import Main.MultiplicationOperation;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationOperationTest {


    MultiplicationOperation testCase60 = new MultiplicationOperation(1,2);

    MultiplicationOperation testCase61 = new MultiplicationOperation(1,2);

    MultiplicationOperation testCase62 = new MultiplicationOperation(-1,-2);

    MultiplicationOperation testCase63 = new MultiplicationOperation(0,0);
    MultiplicationOperation testCase64 = new MultiplicationOperation(1000000001,1000000001);

    MultiplicationOperation testCase65 = new MultiplicationOperation(1.1,2.2);
    MultiplicationOperation testCase66 = new MultiplicationOperation(1000000001,2);
    MultiplicationOperation testCase67 = new MultiplicationOperation(2,1000000001);


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
    public void testingInputNumbersAreNotNullForMultiplicationOperation() {


        double testResult1 = testCase60.getNum1();
        double testResult2 = testCase60.getNum2();

        assertNotNull(testResult1);
        assertNotNull(testResult2);



    }
    @Test
    public void testingResultForPositiveIntegerInputNumberForMultiplicationOperation() {


        double testResult = testCase61.getResult();
        assertEquals(2,testResult);


    }
    @Test
    public void testingResultForNegativeIntegerInputNumberForMultiplicationOperation() {


        double testResult = testCase62.getResult();
        assertEquals(2,testResult);


    }
    @Test
    public  void testingResultForZeroIntegerInputNumberForMultiplicationOperation() {


        double testResult = testCase63.getResult();
        assertEquals(0,testResult);


    }
    @Test
    public void testingResultForFloatIntegerInputNumberForMultiplicationOperation() {


        double testResult = testCase65.getResult();
        assertEquals(2.42,testResult);


    }


    @Test
    public void testingResultForLargeInputInMultiplicationOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase64.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());

    }
    @Test
    public void testingResultForSecondLargeInputInMultiplicationOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase67.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());

    }
    @Test
    public  void testingResultForFirstLargeInputInMultiplicationOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase66.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());

    }


}