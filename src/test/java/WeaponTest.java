import Items.EWeaponDamageType;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon dagger;

    @Before
    public void setup() {
        dagger = new Weapon("Basic Dagger", EWeaponDamageType.PIERCING, 1);
    }

    @Test
    public void getWeaponTest() {
        assertEquals("Basic Dagger", dagger.getWeaponName());
        assertEquals(EWeaponDamageType.PIERCING, dagger.getWeaponType());
        assertEquals(1, dagger.getWeaponDamage());
    }

    @Test
    public void setWeaponTest() {
        dagger.setWeaponName("Dagger");
        dagger.setWeaponType(EWeaponDamageType.SLASHING);
        dagger.setWeaponDamage(2);
        assertEquals("Dagger", dagger.getWeaponName());
        assertEquals(EWeaponDamageType.SLASHING, dagger.getWeaponType());
        assertEquals(2, dagger.getWeaponDamage());
    }

}