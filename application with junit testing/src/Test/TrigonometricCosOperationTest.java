package Test;

import Main.TrigonometricCosOperation;
import Main.TrigonometricCosOperation;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrigonometricCosOperationTest {

    TrigonometricCosOperation testCase87 = new TrigonometricCosOperation(0);

    TrigonometricCosOperation testCase88 = new TrigonometricCosOperation(90);

    TrigonometricCosOperation testCase89 = new TrigonometricCosOperation(2.5);

    TrigonometricCosOperation testCase90 = new TrigonometricCosOperation(-2);
    TrigonometricCosOperation testCase91 = new TrigonometricCosOperation(201);
    TrigonometricCosOperation testCase92 = new TrigonometricCosOperation(-201);



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
    public  void testingInputNumbersAreNotNullForTrigonometricCosOperation() {


        double testResult1 = testCase87.getNum1();


        assertNotNull(testResult1);




    }
    @Test
    public void testingResultForPositiveIntegerInputNumberForTrigonometricCosOperation() {

        double testResult = testCase88.getResult();
        assertEquals(-1,testResult);


    }
    @Test
    public void testingResultForFloatIntegerInputNumberForTrigonometricCosOperation() {


        double testResult = testCase89.getResult();
        assertEquals(-1.0,testResult);


    }
    @Test
    public void testingResultForNegativeIntegerInputNumberForTrigonometricCosOperation() {


        double testResult = testCase90.getResult();
        assertEquals(-1,testResult);


    }
    @Test
    public void testingResultForNegativeLargeIntegerInputNumberForTrigonometricCosOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase91.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }
    @Test
    public void testingResultForPositiveLargeIntegerInputNumberForTrigonometricCosOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase92.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }

}
