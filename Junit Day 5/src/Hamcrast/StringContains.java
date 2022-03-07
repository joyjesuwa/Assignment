package Hamcrast;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
public class StringContains {
    @Test
    public void testcontainsString(){  // litter slow
        assertThat("joyjesuwa@gmail.com",containsString("@gmail.com"));
    }
    @Test
    public void testendsWith(){ // fastest approach
        assertThat("joyjesuwa@gmail.com",endsWith("@unihut.com"));
    }
    @Test
    public void testbeginsWith(){ // fastest approach
        assertThat("joyjesuwa@gmail.com",startsWith("@unihut.com"));
    }
}

