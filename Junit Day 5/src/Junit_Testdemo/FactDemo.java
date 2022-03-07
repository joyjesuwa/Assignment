package Junit_Testdemo;

import org.junit.Assert;
import org.junit.Test;

public class FactDemo {
    @Test
    public void factD() {
        int n = 5;
        int rec = 120;
        Factorial F = new Factorial();
        int b = F.fact(5);
        Assert.assertEquals(n, b);
    }
}
