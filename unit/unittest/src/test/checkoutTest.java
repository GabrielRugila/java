package unit.unittest.src.test;

import org.junit.jupiter.api.Test;
import unit.unittest.src.main.Main;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkoutTest {
    @Test
    public void subtotalIsValida() {
        //assert => (expected value, actual result) => refers to main
        assertEquals(19.2, Main.getSubtotal());
    }

    @Test
    public void taxIsValid() {
        assertEquals(3.9, Main.getTax(30));
    }

    @Test
    public void totalIsEqual() {
        assertEquals(113, Main.getTotal(100, 13));
    }
}
