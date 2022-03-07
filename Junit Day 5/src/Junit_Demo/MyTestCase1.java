package Junit_Demo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MyTestCase1 {
    int x=0;
    int y=0;
    int result=0;
    Calculator calculator =null;

    @Before
    public void setup(){
        x=30;
        y=20;
        calculator =new Calculator();
    }
    @Test
    public void addtionTest(){
        result=50;
        int finalResult=calculator.addition(x,y);
        Assert.assertEquals(result, finalResult);
    }
    @Test
    public void subtractionTest(){
        x=30;
        y=20;
        result=10;
        int finalResult=calculator.subtraction(x,y);
        Assert.assertEquals(result, finalResult);
    }
    @After
    public void cleaning(){
        x=0;
        y=0;
        calculator =null;
    }
}
