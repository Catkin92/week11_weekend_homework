import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassangerTest {

    private Passanger passanger;

    @Before
    public void before() {
        passanger = new Passanger("Eugene Kim", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Eugene Kim", passanger.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(2, passanger.getNumberOfBags());
    }
}
