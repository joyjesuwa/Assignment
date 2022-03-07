package Junit_Demo;


    import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

    public class SubtractionTest {
        @Test

        public void subtractionTest(){
            int x=30;   // requirement collection
            int y=20;
            int result=600;
            Calculator calculator = new Calculator();
            int finalResult=calculator.multiplication(x,y);
            Assert.assertEquals(result, finalResult);
        }
        @Test(expected = AssertionError.class)
        public void testModulo(){
            int x=30;   // requirement collection
            int y=20;
            int result=600;
            Calculator calculator = new Calculator();
            int finalResult=calculator.modulo(x,y);
            Assert.assertEquals(result, finalResult);
        }
        @Test
        @Ignore
        public void testCaseNotYetImplimented(){

        }
    }


