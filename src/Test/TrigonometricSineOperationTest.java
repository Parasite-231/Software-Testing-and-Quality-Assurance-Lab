package Test;

import Main.TrigonometricSineOperation;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrigonometricSineOperationTest {

    TrigonometricSineOperation testCase81 = new TrigonometricSineOperation(0);

    TrigonometricSineOperation testCase82 = new TrigonometricSineOperation(90);

    TrigonometricSineOperation testCase83 = new TrigonometricSineOperation(2.5);

    TrigonometricSineOperation testCase84 = new TrigonometricSineOperation(-2);
    TrigonometricSineOperation testCase85 = new TrigonometricSineOperation(201);
    TrigonometricSineOperation testCase86 = new TrigonometricSineOperation(-201);




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
    public void testingInputNumbersAreNotNullForTrigonometricSineOperation() {


        double testResult1 = testCase81.getNum1();


        assertNotNull(testResult1);




    }
    @Test
    public  void testingResultForPositiveIntegerInputNumberForTrigonometricSineOperation() {

        double testResult = testCase82.getResult();
        assertEquals(1,testResult);


    }
    @Test
    public void testingResultForFloatIntegerInputNumberForTrigonometricSineOperation() {


        double testResult = testCase83.getResult();
        assertEquals(1.0,testResult);


    }
    @Test
    public  void testingResultForNegativeIntegerInputNumberForTrigonometricSineOperation() {


        double testResult = testCase84.getResult();
        assertEquals(-0.0,testResult);


    }
    @Test
    public  void testingResultForNegativeLargeIntegerInputNumberForTrigonometricSineOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase85.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }
    @Test
    public void testingResultForPositiveLargeIntegerInputNumberForTrigonometricSineOperation() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase86.getResult();
                }
        );

        assertEquals("Input Number is too large !", exception.getMessage());


    }


}