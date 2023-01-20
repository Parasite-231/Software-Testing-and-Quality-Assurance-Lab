package Test;

import Main.TrigonometricTanOperation;
import Main.TrigonometricSineOperation;
import Main.TrigonometricTanOperation;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrigonometricTanOperationTest {

    TrigonometricTanOperation testCase93 = new TrigonometricTanOperation(0);

    TrigonometricTanOperation testCase94 = new TrigonometricTanOperation(45);

    TrigonometricTanOperation testCase95 = new TrigonometricTanOperation(2.5);

    TrigonometricTanOperation testCase96 = new TrigonometricTanOperation(-2);

    TrigonometricTanOperation testCase97 = new TrigonometricTanOperation(201);
    TrigonometricTanOperation testCase98 = new TrigonometricTanOperation(-201);

    TrigonometricTanOperation testCase99 = new TrigonometricTanOperation(90);



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
    public void testingInputNumbersAreNotNullForTrigonometricTanOperation() {


        double testResult1 = testCase93.getNum1();


        assertNotNull(testResult1);




    }
    @Test
    public void testingResultForPositiveIntegerInputNumberForTrigonometricTanOperation() {


        double testResult = testCase94.getResult();
        assertEquals(1,testResult);


    }
    @Test
    public  void testingResultForFloatIntegerInputNumberForTrigonometricTanOperation() {

        double testResult = testCase95.getResult();
        assertEquals(-1,testResult);


    }
    @Test
    public void testingResultForNegativeIntegerInputNumberForTrigonometricTanOperation() {


        double testResult = testCase96.getResult();
        assertEquals(2,testResult);


    }
    @Test
    public  void testingResultForNegativeLargeIntegerInputNumberForTrigonometricTanOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase97.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }
    @Test
    public  void testingResultForPositiveLargeIntegerInputNumberForTrigonometricTanOperation() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase98.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }
    @Test
    public  void testingResultForUndefinedScenarioForTrigonometricTanOperation() {



        Throwable exception = assertThrows(
                ArithmeticException.class, () -> {

                    testCase99.getResult();
                }
        );

        assertEquals("Undefined Result !", exception.getMessage());


    }



}
