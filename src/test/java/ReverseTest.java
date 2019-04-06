import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {
    @Test
    public void testReverse(){
        String reverse=ReverseString.reverse("manish");
        System.out.println(reverse);
        Assert.assertTrue(reverse.equals("hsinam"));
    }
}
