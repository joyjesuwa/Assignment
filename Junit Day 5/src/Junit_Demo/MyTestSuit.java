package Junit_Demo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({MyTestCase.class, ParametersDemo.class, SubtractionTest.class})
public class MyTestSuit {
}



