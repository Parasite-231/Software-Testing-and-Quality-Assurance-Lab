package Test;

import Main.ModuloOperation;
import Main.ModuloOperation;
import Main.MultiplicationOperation;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class ModuloOperationTest {


    ModuloOperation testCase52 = new ModuloOperation(4,2);

    ModuloOperation testCase53 = new ModuloOperation(2.5,2.5);

    ModuloOperation testCase54 = new ModuloOperation(-3,-2);

    ModuloOperation testCase55 = new ModuloOperation(1000000001,1000000001);
    ModuloOperation testCase56 = new ModuloOperation(1000000001,2);

    ModuloOperation testCase57 = new ModuloOperation(2,1000000001);

    ModuloOperation testCase58 = new ModuloOperation(4,2);
    ModuloOperation testCase59 = new ModuloOperation(4,0);




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
    public void testingInputNumbersAreNotNullForModuloOperation() {


        double testResult1 = testCase52.getNum1();
        double testResult2 = testCase52.getNum2();

        assertNotNull(testResult1);
        assertNotNull(testResult2);



    }
    @Test
    public  void testingResultForFloatIntegerInputNumbersForModuloOperation() {


        double testResult = testCase53.getResult();
        assertEquals(0,testResult);


    }
    @Test
    public  void testingResultForPositiveIntegerInputNumbersForModuloOperation() {


        double testResult = testCase58.getResult();
        assertEquals(0,testResult);


    }
    @Test
    public void testingResultForNegativeIntegerInputNumbersForModuloOperation() {


        double testResult = testCase54.getResult();
        assertEquals(-1,testResult);


    }
    @Test
    public void testingResultForLargeIntegerInputInModuloOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase55.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());

    }


    @Test
    public void testingResultForLargeFirstIntegerInputInModuloOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase56.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());

    }
    @Test
    public  void testingResultForLargeSecondIntegerInputInModuloOperation() {

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase57.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());

    }

    @Test
    public void testingResultForZeroIntegerInDenominatorInputInModuloOperation() {

        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase59.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());

    }




}