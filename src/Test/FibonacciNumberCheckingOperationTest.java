package Test;

import Main.FibonacciNumberCheckingOperation;
import Main.PrimeNumberGenerationOperation;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciNumberCheckingOperationTest {

    FibonacciNumberCheckingOperation testCase30 = new FibonacciNumberCheckingOperation();
    FibonacciNumberCheckingOperation testCase31 = new FibonacciNumberCheckingOperation();
    FibonacciNumberCheckingOperation testCase32 = new FibonacciNumberCheckingOperation();

    FibonacciNumberCheckingOperation testCase33 = new FibonacciNumberCheckingOperation();

    FibonacciNumberCheckingOperation testCase34 = new FibonacciNumberCheckingOperation();
    FibonacciNumberCheckingOperation testCase35 = new FibonacciNumberCheckingOperation();

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
    public void testingNSequencePositiveFibonacciNumbers() {
        FibonacciNumberCheckingOperation nFibonacci1 = new FibonacciNumberCheckingOperation();
        ArrayList<Integer> list;
        list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7));
        assertEquals(list,testCase30.checkFib(new int[]{4, 2, 8, 5, 20, 1, 40, 13, 23},9));



    }

    @Test
    public void testingNSequenceNegativeFibonacciNumbers() {
        FibonacciNumberCheckingOperation nFibonacci1 = new FibonacciNumberCheckingOperation();
        ArrayList<Integer> list;
        list = new ArrayList<Integer>(Arrays.asList(1,2));
        assertEquals(list,testCase31.checkFib(new int[]{-4, -2, -8},3));



    }
    @Test
    public void testingForNullArrayLengthInputForFibonacciSequence() {




        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase32.checkFib(new int[]{-4, -2, -8},0);
                }
        );

        assertEquals("Number of terms is not specified !", exception.getMessage());


    }

    @Test
    public  void testingForLargeArrayLengthInputForFibonacciSequence() {



        Throwable exception = assertThrows(
                ArrayIndexOutOfBoundsException.class, () -> {

                    testCase33.checkFib(new int[]{-4, -2, -8},101);
                }
        );

        assertEquals("Number of terms is too large !", exception.getMessage());


    }
    @Test
    public   void testingForNegativeArrayLengthInputForFibonacciSequence() {




        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase34.checkFib(new int[]{-4, -2, -8},-2);
                }
        );

        assertEquals("Number of terms cannot be negative !", exception.getMessage());


    }
    @Test
    public  void testingForFractionalArrayLengthInputForFibonacciSequence() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase35.checkFib(new int[]{-4, -2, -8},2.7);
                }
        );

        assertEquals("Number of terms cannot be fractional !", exception.getMessage());


    }




}
