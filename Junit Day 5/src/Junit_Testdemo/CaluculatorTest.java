package Junit_Testdemo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CaluculatorTest {
    @Test(timeout=10)
    public void testAdd() {
        Calculators instance = new Calculators();
        assertEquals(7, instance.add(3,4));
    }
    @Test(timeout=7)
    public void testSubtract() {
        Calculators instance = new Calculators();
        assertEquals(5, instance.subtract(10,5));


    }
}
