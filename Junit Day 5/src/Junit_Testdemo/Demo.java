package Junit_Testdemo;
import org.junit.Assert;
import org.junit.Test;

public class Demo {
    @Test
    public static void test() {
        int a = 15, b = 17, c = 8;
        int result =18;
        Greatest g=new Greatest();
        int result1 = Greatest.greatest(a, b, c);
        Assert.assertEquals(result,result1);
    }
}
