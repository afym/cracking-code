package cracking.solution02test;

import cracking.solution02.WeirdNumbers;
import junit.framework.TestCase;

public class WeirdNumberTest extends TestCase {
    public void testSolutions() {
        assertEquals("Weird", WeirdNumbers.output(3));
        assertEquals("Not Weird", WeirdNumbers.output(24));
        assertEquals("Not Weird", WeirdNumbers.output(4));
        assertEquals("Weird", WeirdNumbers.output(18));
        assertEquals("Weird", WeirdNumbers.output(29));
        assertEquals("Weird", WeirdNumbers.output(5));
        assertEquals("Not Weird", WeirdNumbers.output(100));
        assertEquals("Weird", WeirdNumbers.output(20));
    }
}
