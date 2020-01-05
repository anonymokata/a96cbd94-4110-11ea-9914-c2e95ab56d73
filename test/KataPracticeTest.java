import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class KataPracticeTest {

    // Test to check that returned string is an integer if inputs are valid
    @Test
    public void returnNumericValue() {
        KataPractice kataPractice = new KataPractice();
        // assertEquals("0", kataPractice.getInput(0,0, "A" ));
        assertTrue(KataPractice.isInteger(kataPractice.getInput("1700","2200", "A" )));
    }

    // Test to check that returned string is >= 0 if inputs are valid
    @Test
    public void returnPositiveValue() {
        KataPractice kataPractice = new KataPractice();
        Integer outputValue = Integer.parseInt(kataPractice.getInput("1700","2200", "A" ));
        assertTrue(outputValue >= 0);
    }

    // Test to check that inputStartTime is integer, is between 1700 and 2359, or between 0000 and 0400;  return -1 if invalid
    @Test
    public void returnErrorBadStartTime() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("-1", kataPractice.getInput("1600", "2200", "A"));
    }

    // Test to check that inputEndTime is integer, is between 1700 and 2359, or between 0000 and 0400;  return -1 if invalid
    @Test
    public void returnErrorBadEndTime() {
        KataPractice kataPractice = new KataPractice();
        assertEquals( "-1", kataPractice.getInput("1700","2500","A"));
    }

    // Test to check that inputStartTime is before inputEndTime;  return -1 if invalid
    @Test
    public void returnErrorTimeRangeReversed() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("-1", kataPractice.getInput("2300","1800","A"));
    }

    // Test to check that inputFamily == A, B, or C;  return -1 if invalid
    @Test
    public void returnErrorInvalidFamily() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("-1", kataPractice.getInput("1800","2300","D"));
    }

    // Check various input combinations and validate results
}
