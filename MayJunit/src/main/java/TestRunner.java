import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

    public static void main(String[] args) {
        System.out.println("Here I Have Started..");
        Result result= JUnitCore.runClasses(JunitMayTestCases.class);
        result.getFailures().forEach(failure -> System.out.println(failure.toString()));
        System.out.println(result.wasSuccessful());
    }
}
