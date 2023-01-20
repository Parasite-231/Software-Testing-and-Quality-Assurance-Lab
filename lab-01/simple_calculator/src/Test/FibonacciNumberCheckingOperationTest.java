package Test;

import Main.FibonacciNumberCheckingOperation;
import Main.PrimeNumberGenerationOperation;
import org.junit.jupiter.api.Test;

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




    @Test
    void testingNSequencePositiveFibonacciNumbers() {
        FibonacciNumberCheckingOperation nFibonacci1 = new FibonacciNumberCheckingOperation();
        ArrayList<Integer> list;
        list = new ArrayList<Integer>(Arrays.asList(2 ,8, 5, 1 ,13 ));
        assertEquals(list,testCase30.checkFib(new int[]{4, 2, 8, 5, 20, 1, 40, 13, 23},9));



    }

    @Test
    void testingNSequenceNegativeFibonacciNumbers() {
        FibonacciNumberCheckingOperation nFibonacci1 = new FibonacciNumberCheckingOperation();
        ArrayList<Integer> list;
        list = new ArrayList<Integer>(Arrays.asList(1,2));
        assertEquals(list,testCase31.checkFib(new int[]{-4, -2, -8},3));



    }
    @Test
    void testingForNullArrayLengthInputForFibonacciSequence() {




        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase32.checkFib(new int[]{-4, -2, -8},0);
                }
        );

        assertEquals("Number of terms is not specified !", exception.getMessage());


    }

    @Test
    void testingForLargeArrayLengthInputForFibonacciSequence() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase33.checkFib(new int[]{-4, -2, -8},101);
                }
        );

        assertEquals("Number of terms is too large !", exception.getMessage());


    }
    @Test
    void testingForNegativeArrayLengthInputForFibonacciSequence() {




        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase34.checkFib(new int[]{-4, -2, -8},-2);
                }
        );

        assertEquals("Number of terms cannot be negative !", exception.getMessage());


    }
    @Test
    void testingForFractionalArrayLengthInputForFibonacciSequence() {



        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase35.checkFib(new int[]{-4, -2, -8},2.7);
                }
        );

        assertEquals("Number of terms cannot be fractional !", exception.getMessage());


    }




}
