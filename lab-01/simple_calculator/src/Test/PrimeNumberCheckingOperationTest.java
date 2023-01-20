package Test;

import Main.PrimeNumberCheckingOperation;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCheckingOperationTest {

    PrimeNumberCheckingOperation testCase100 = new PrimeNumberCheckingOperation(20);

    PrimeNumberCheckingOperation testCase101 = new PrimeNumberCheckingOperation(2);

    PrimeNumberCheckingOperation testCase102 = new PrimeNumberCheckingOperation(-20);

    PrimeNumberCheckingOperation testCase103 = new PrimeNumberCheckingOperation(1000000000001d);

    PrimeNumberCheckingOperation testCase104 = new PrimeNumberCheckingOperation(2.4);

    PrimeNumberCheckingOperation testCase105 = new PrimeNumberCheckingOperation(1);





    @Test
    public void testingInputNumbersAreNotNullForPrimeNumberCheckingOperation() {


        boolean testResult = testCase100.getResult();
        assertNotNull(testResult);


    }
    @Test
    public void testingResultForPositiveInputNumbersForPrimeNumberCheckingOperation(){


        boolean testResult = testCase101.getResult();
        assertEquals(true,testResult);
    }



    @Test
    public void testingResultForNegativeInputNumbersForPrimeNumberCheckingOperation(){

        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase102.getResult();
                }
        );

        assertEquals("Number is a negative number !", exception.getMessage());
    }
    @Test
    public void testingResultForLargeInputNumbersForPrimeNumberCheckingOperation(){
        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase103.getResult();
                }
        );

        assertEquals("Number is too large !", exception.getMessage());
    }
    @Test
    public void testingResultForFloatInputNumbersForPrimeNumberCheckingOperation(){
        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase104.getResult();
                }
        );

        assertEquals("Number is not integer !", exception.getMessage());
    }
    @Test
    public void testingTestCaseFive(){
        boolean testResult = testCase105.getResult();
        assertFalse(false);
    }



}