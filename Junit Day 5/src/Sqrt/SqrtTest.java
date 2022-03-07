package Sqrt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {
    public  void sqrtTest() { }

    @Test
    public void testFindSquareroot() {
        Arithmetic instance = new Arithmetic();

        double expResult = 2.5;

        double result = instance.findSquareroot(6.25);
        assertEquals("findSquareroot",expResult, result, 0.0);

    }}

