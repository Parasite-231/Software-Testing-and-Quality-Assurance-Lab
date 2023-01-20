package Test;
import Main.PowerOperation;
import Main.PrimeNumberCheckingOperation;
//import Test.SquareRootOperation;
import Main.TrigonometricTanOperation;
import Test.AdditionOperationTest;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdditionOperationTest.class,
        DivisionOperationTest.class,
        ExponentialOperationTest.class,
        FibonacciNumberCheckingOperationTest.class,
        IntegerInputNumberToBinaryConversionTest.class,
        IntegerInputNumberToHexConversionTest.class,
        LogOperationTest.class,
        ModuloOperationTest.class,
        MultiplicationOperationTest.class,
        PowerOperationTest.class,
        PrimeNumberCheckingOperationTest.class,
        PrimeNumberGenerationOperationTest.class,
        SquareRootOperationTest.class,
        SubtractionOperationTest.class,
        TrigonometricCosOperationTest.class,
        TrigonometricSineOperationTest.class,
        TrigonometricTanOperationTest.class





})
public class AllTest {


    @BeforeAll
    public static void testExecutionBeforeExecutingAllTestsCases(){
        System.out.println("...Test execution - started");
    }
    @AfterAll
    public static void testExecutionAfterExecutingAllTestsCases(){
        System.out.println("...Test execution - completed");
    }
    @BeforeEach
    public void testCaseExecutionStarts(){
        System.out.println("---Test Running");
    }

    @AfterEach
    public void testCaseExecutionEnds(){
        System.out.println("---Test Executed");
    }
}
