package Junit_Testdemo;

import org.junit.Assert;
import org.junit.Test;

public class RecDemo {
    @Test
    public void recurDe() {
        int reverse = 20;
        int number = 30;
        RecursiveNumber r = new RecursiveNumber();
        int a = r.reverseNumber(number);
        Assert.assertEquals(reverse,a);

    }
}
