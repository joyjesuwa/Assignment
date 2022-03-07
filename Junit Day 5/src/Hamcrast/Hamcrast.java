package Hamcrast;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class Hamcrast {
    @Test
    public void testEmailID(){  // JUnit Test case
        String email="joyjesuwa@gmail.com";
        Assert.assertTrue(email.contains("@"));
    }
    @Test
    public void testEmailIDHamcrest(){  // Hamcrest Test case
        String email="joyjesuwa@gmail.com";
        Assert.assertThat(email, StringContains.containsString("gmail.com"));
    }
    @Test
    public void testWordEnds(){
        String name="Jesuwa";
        Assert.assertThat("Jesuwa", endsWith("wa"));
    }
    @Test
    public void testWordSts(){
        String name="Jesuwa";
        Assert.assertThat("Jesuwa", startsWith("Je"));
    }
    @Test
    public void add()
    {
        int a=4;
        Assert.assertTrue(3<4);
    }
    @Test
    public void shouldTellIfPrime(){

        Assertion.assertAll(
                () -> assertTrue(isPrime(2))
        () -> assertFalse(isPrime(4)));
    }


    //  Assertions.assertAll(
            //    () -> assertTrue(isPrime(2)),
               // () -> assertFalse(isPrime(4))
      //  );
  //  }

    public class ExampleUnitTest {
        @Test
        public void testAdditionIsCorrect() throws Exception {
            assertEquals(4, 2 + 2);
        }
    }
}
