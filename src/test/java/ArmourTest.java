import Items.Armour;
import Items.EArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmourTest {

    Armour cloth;

    @Before
    public void setup() {
        cloth = new Armour("Cloth", EArmourType.LIGHT, 1);
    }

    @Test
    public void getArmourTest() {
        assertEquals("Cloth", cloth.getArmourName());
        assertEquals(EArmourType.LIGHT, cloth.getArmourType());
        assertEquals(1, cloth.getArmourDefense());
    }

    @Test
    public void setArmourTest() {
        cloth.setArmourName("Chain Mail");
        cloth.setArmourType(EArmourType.MEDIUM);
        cloth.setArmourDefense(5);
        assertEquals("Chain Mail", cloth.getArmourName());
        assertEquals(EArmourType.MEDIUM, cloth.getArmourType());
        assertEquals(5, cloth.getArmourDefense());
    }

}
