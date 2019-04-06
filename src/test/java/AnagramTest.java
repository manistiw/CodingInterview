import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class AnagramTest {
    @Test
    public void testAnagram(){
        Assert.assertTrue(Anagram.isAnagram("anagram","margana"));
        Assert.assertTrue(Anagram.isAnagram(" man","MAN"));
        Assert.assertTrue(Anagram.isAnagram("9man","MAN9"));
        Assert.assertFalse(Anagram.isAnagram("man","nam1"));

    }
}
