package Test;

import Main.IntegerInputNumberToBinaryConversion;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerInputNumberToBinaryConversionTest {

    IntegerInputNumberToBinaryConversion testCase36 = new IntegerInputNumberToBinaryConversion(4);
    IntegerInputNumberToBinaryConversion testCase37 = new IntegerInputNumberToBinaryConversion(9);

    IntegerInputNumberToBinaryConversion testCase38 = new IntegerInputNumberToBinaryConversion(-2);

    IntegerInputNumberToBinaryConversion testCase39 = new IntegerInputNumberToBinaryConversion(10001);

    IntegerInputNumberToBinaryConversion testCase40 = new IntegerInputNumberToBinaryConversion(1.5);


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
    public void testingIntegerInputNumberForBinaryConversion() {

        double testResult = testCase36.getNum1();
        assertNotNull(testResult);


    }



    @Test
    public  void testingResultForPositiveIntegerToBinaryConversion() {

        String testResult = testCase37.getResult();
        assertEquals("1001",testResult);

    }


    @Test
    public  void testingResultForNegativeIntegerToBinaryConversion() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase38.getResult();
                }
        );

        assertEquals("Input number cannot be negative !", exception.getMessage());


    }

    @Test
    public void testingResultForLargeIntegerToBinaryConversion() {




        Throwable exception = assertThrows(
                ArrayIndexOutOfBoundsException.class, () -> {

                    testCase39.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());


    }

    @Test
    public  void testingResultForFloatInputNumberInIntegerToBinaryConversion() {




        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase40.getResult();
                }
        );

        assertEquals("Input number cannot be fractional !", exception.getMessage());


    }


}