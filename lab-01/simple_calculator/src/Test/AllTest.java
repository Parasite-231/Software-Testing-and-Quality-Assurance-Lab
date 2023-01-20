package Test;
import Test.AdditionOperationTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdditionOperationTest.class,

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
}
