import Characters.Enemy;
import Items.Armour;
import Items.EArmourType;
import Items.EWeaponDamageType;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Weapon dagger;
    Armour cloth;
    Enemy goblin;

    @Before
    public void setup() {
        dagger = new Weapon("Basic Dagger", EWeaponDamageType.SLASHING, 2);
        cloth = new Armour("Basic Cloth", EArmourType.LIGHT, 0);
        goblin = new Enemy("Basic Goblin", 5, 1, dagger, cloth);
    }

    @Test
    public void getGoblin() {
        assertEquals("Basic Goblin", goblin.getName());
        assertEquals(5, goblin.getHp());
        assertEquals(1, goblin.getXp());
        assertEquals(dagger, goblin.getWeapon());
        assertEquals(cloth, goblin.getArmour());
        assertEquals("Basic Dagger", goblin.getWeapon().getWeaponName());
        assertEquals("Basic Cloth", goblin.getArmour().getArmourName());
    }

    @Test
    public void setGoblin() {
        goblin.setName("Goblin");
        goblin.setXp(2);
        assertEquals("Goblin", goblin.getName());
        assertEquals(2, goblin.getXp());
    }

}