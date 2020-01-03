import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KataPracticeTest {
    @Test
    public void returnNumericValue() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("0", kataPractice.getInput(0,0, "A" ));
    }
}
