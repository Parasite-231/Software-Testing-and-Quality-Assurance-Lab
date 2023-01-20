package Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Test;
import org.junit.jupiter.api.*;

//org.junit.jupiter.api.Test;
import Main.PrimeNumberChecker;

public class PrimeNumberCheckerTest {



    @BeforeAll
    public static void testExecutionBeforeExecutingAllTestsCases(){
        System.out.println("...Test execution - started");
    }
    @AfterEach
    public void testCaseExecutionEnds(){
        System.out.println("---Test Executed");
    }
    PrimeNumberChecker isNumberPrime = new PrimeNumberChecker();
    @Test
    public void testingTestCaseOne() {

        System.out.println("Running test -> 1 " );
        System.out.println("...Testing 2 is a prime number");
        boolean testResult = isNumberPrime.isTheNumberPrime(2);
        assertEquals(true,testResult);


    }
    @Test
    public void testingTestCaseTwo(){
        System.out.println("Running test -> 2 " );
        System.out.println("...Testing 20 is not a prime number");
        boolean testResult = isNumberPrime.isTheNumberPrime(20);
        assertEquals(false,testResult);
    }

    @Test
    public void testingTestCaseThree(){
        System.out.println("Running test -> 3 " );
        System.out.println("...Testing 47 is a prime number");
        boolean testResult = isNumberPrime.isTheNumberPrime(47);
        assertEquals(true,testResult);
    }

    @Test
    public void testingTestCaseFour(){
        System.out.println("Running test -> 4 " );
        System.out.println("...Testing 933 is not a prime number");
        boolean testResult = isNumberPrime.isTheNumberPrime(933);
        assertEquals(false,testResult);
    }

    @Test
    public void testingTestCaseFive(){
        System.out.println("Running test -> 5 " );
        System.out.println("...Testing 1000000000000 is a prime number");
        boolean testResult = isNumberPrime.isTheNumberPrime(1000000000000d);
        assertEquals(false,testResult);
    }
    @Test
    public void testingTestCaseSix(){
        System.out.println("Running test -> 6 " );
        System.out.println("...Testing throw of error message on input of non-integer number 2.5");

        try
        {
            isNumberPrime.isTheNumberPrime(2.5);
            fail();
        }

        catch (RuntimeException exception

        ){

            assertEquals("Number is not integer!", exception.getMessage());

        }


    }
    @Test
    public void testingTestCaseSeven(){
        System.out.println("Running test -> 7 " );
        System.out.println("...Testing throw of error message on input of number less than 2");
        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    isNumberPrime.isTheNumberPrime(1);
                }
        );

        assertEquals("Number is less than 2!", exception.getMessage());

    }
    @Test
    public void testingTestCaseEight(){
        System.out.println("Running test -> 8 " );
        System.out.println("...Testing throw of error message on input of negative number -14");
        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    isNumberPrime.isTheNumberPrime(-14);
                }
        );

        assertEquals("The number is a negative number!", exception.getMessage());

    }
    @Test
    public void testingTestCaseNine(){
        System.out.println("Running test -> 9 " );
        System.out.println("...Testing exception throw message on input of too large number 1000000000001");
        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    isNumberPrime.isTheNumberPrime(1000000000001d);
                }
        );

        assertEquals("Number is too large!", exception.getMessage());

    }



    @AfterAll
    public static void testExecutionAfterExecutingAllTestsCases(){
        System.out.println("...All Test execution - ended");
    }
}