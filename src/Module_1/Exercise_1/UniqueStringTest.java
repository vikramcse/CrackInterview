package Module_1.Exercise_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueStringTest {

    UniqueString uniqueString;

    @Before
    public void createInstance () {
        uniqueString = new UniqueString();
    }

    @Test
    public void checkUniqueAttempt1 () {
        String str = "abcdefghia";
        assertEquals(false, uniqueString.checkForUniqueBruteForce(str));
    }

    @Test
    public void checkUniqueAttempt2 () {
        String strTrue = "abcde";
        String strFalse = "abcdd";
        assertEquals(true, uniqueString.checkForUniqueUsingArray(strTrue));
        assertEquals(false, uniqueString.checkForUniqueUsingArray(strFalse));
    }
}