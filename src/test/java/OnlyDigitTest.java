import org.junit.Test;
import static org.junit.Assert.*;

public class OnlyDigitTest {
    @Test
    public void digitTest(){
        assertTrue(StringWithDigits.isDigit("123"));
        assertFalse(StringWithDigits.isDigit("1ab23"));
    }
}
