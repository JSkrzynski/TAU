import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    private PalindromeCheck  palindrome;
    private IntegerParser parser;

    @Before
    public void setUp() {
        palindrome = new PalindromeCheck();
        parser = new IntegerParser();
    }

    @After
    public void tearDown() {
        palindrome = null;
        parser = null;
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
    public void kajaczekIsNotPalindromeButInBoolean(){
        Boolean response = palindrome.isPalindromeButResponseInBoolean("kajaczek");
        assertFalse(response);
    }
    @Test
    public void parsingStringWillTriggerException(){
        assertThrows(Exception.class,() -> parser.convertStringToInt("hmm"));
    }
    @Test
    public void parsing1WillReturnParsedValue() throws Exception {
        assertEquals(1, parser.convertStringToInt("1"));
    }
    @Test
    public void parsing34WillReturnParsedValue() throws Exception {
        assertEquals(34, parser.convertStringToInt("34"));
    }
    @Test
    public void responseIsNotNullWhileParsing() throws Exception {
        assertNotNull(parser.convertStringToInt("1"));
    }
}
