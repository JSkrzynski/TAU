import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    private PalindromeCheck  palindrome;

    @Before
    public void setUp() {
        palindrome = new PalindromeCheck();
    }

    @After
    public void tearDown() {
        palindrome = null;
    }

    @Test
    public void kamilslimakIsPalindrome(){
        String response = palindrome.isPalindrome("kamilslimak");
        assertEquals("YES", response);
    }
    @Test
    public void kajakIsPalindrome() {
        String response = palindrome.isPalindrome("kajak");
        assertEquals("YES", response);
    }
    @Test
    public void kajaczekIsNotPalindrome() {
        String response = palindrome.isPalindrome("kajaczek");
        assertEquals("NO", response);
    }
    @Test
    public void responseIsNotNull(){
        String response = palindrome.isPalindrome("kajak");
        assertNotNull(response);
    }
    @Test
    public void kajakIsPalindromeButInBoolean(){
        boolean response = palindrome.isPalindromeButResponseInBoolean("kajak");
        assertTrue(response);
    }
    @Test
    public void kajaczekIsNotPalindromeButInBoolean() {
        Boolean response = palindrome.isPalindromeButResponseInBoolean("kajaczek");
        assertFalse(response);
    }
}
