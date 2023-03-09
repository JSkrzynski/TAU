import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParsingTest {
    private IntegerParser parser;

    @Before
    public void setUp() {
        parser = new IntegerParser();
    }

    @After
    public void tearDown() {
        parser = null;
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
