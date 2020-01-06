import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class KataPracticeTest {

    // Test to check that returned string is an integer if inputs are valid
    @Test
    public void returnNumericValue() {
        KataPractice kataPractice = new KataPractice();
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
        assertEquals("Start Time must be between 1700 and 0400", kataPractice.getInput("1600", "2200", "A"));
    }

    // Test to check that inputEndTime is integer, is between 1700 and 2359, or between 0000 and 0400;  return -1 if invalid
    @Test
    public void returnErrorBadEndTime() {
        KataPractice kataPractice = new KataPractice();
        assertEquals( "End Time must be between 1700 and 0400", kataPractice.getInput("1700","2500","A"));
    }

    // Test to check that inputStartTime is before inputEndTime;  return -1 if invalid
    @Test
    public void returnErrorTimeRangeReversed() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("Start Time must be before End Time", kataPractice.getInput("2300","1800","A"));
    }

    // Test to check that inputFamily == A, B, or C;  return -1 if invalid
    @Test
    public void returnErrorInvalidFamily() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("Family must be A, B, or C", kataPractice.getInput("1800","2300","D"));
    }

    // Check various input combinations and validate results
    @Test
    public void returnPayFamilyA() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("75", kataPractice.getInput("1700","2200","A"));
        assertEquals("80", kataPractice.getInput("2300","300","A"));
        assertEquals("80", kataPractice.getInput("1900","2400","A"));
        assertEquals("60", kataPractice.getInput("1700","2130","A"));
    }

    @Test
    public void returnPayFamilyB() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("36", kataPractice.getInput("1700","2000","B"));
        assertEquals("68", kataPractice.getInput("1700","2300","B"));
        assertEquals("124", kataPractice.getInput("1700","300","B"));
        assertEquals("32", kataPractice.getInput("100","300","B"));
        assertEquals("56", kataPractice.getInput("2300","300","B"));
        assertEquals("16", kataPractice.getInput("2200","2400","B"));
    }

    @Test
    public void returnPayFamilyC() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("63", kataPractice.getInput("1700","2000","C"));
        assertEquals("60", kataPractice.getInput("2300","300","C"));
        assertEquals("87", kataPractice.getInput("1900","2400","C"));
        assertEquals("84", kataPractice.getInput("1700","2130","C"));
    }
}
