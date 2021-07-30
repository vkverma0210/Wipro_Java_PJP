import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class Demo2Test {
    Demo2 d1 = new Demo2();

    @Test
    public void testPalindromeCheck() {
        assertTrue(d1.palindromeCheck("madam"));
        assertTrue(d1.palindromeCheck("mom"));
        assertTrue(d1.palindromeCheck("dad"));
        assertTrue(d1.palindromeCheck("Malayalam"));
    }
}
