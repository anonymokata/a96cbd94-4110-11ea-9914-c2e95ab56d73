import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KataPracticeTest {
    @Test
    public void returnPassedValue() {
        KataPractice kataPractice = new KataPractice();
        assertEquals("1", kataPractice.getInput(1));
    }
}
