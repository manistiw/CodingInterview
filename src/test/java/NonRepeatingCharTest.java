import general.FirstNonRepeatingCharacter;
import org.junit.Test;
import static org.junit.Assert.*;

public class NonRepeatingCharTest {
    @Test
    public void test(){
        assertEquals('b', FirstNonRepeatingCharacter.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', FirstNonRepeatingCharacter.firstNonRepeatingChar("hello"));
        assertEquals('J', FirstNonRepeatingCharacter.firstNonRepeatingChar("Java"));
        assertEquals('i', FirstNonRepeatingCharacter.firstNonRepeatingChar("simplest"));
    }
}
