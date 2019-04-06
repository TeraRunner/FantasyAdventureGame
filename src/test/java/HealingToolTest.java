import Items.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    HealingTool potion;

    @Before
    public void setup() {
        potion = new HealingTool("Low Potion", -10);
    }

    @Test
    public void getHealingToolTest() {
        assertEquals("Low Potion", potion.getHealingToolName());
        assertEquals(-10, potion.getHealingToolDamage());
    }
}
