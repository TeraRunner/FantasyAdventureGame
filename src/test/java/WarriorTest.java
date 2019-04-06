import Characters.Skills.Skill;
import Characters.Warrior;
import Items.Armour;
import Items.EArmourType;
import Items.EWeaponDamageType;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Weapon sword;
    Armour chainMail;
    Skill doubleEdge;
    Warrior warrior;

    @Before
    public void setup() {
        sword = new Weapon("Basic Sword", EWeaponDamageType.SLASHING, 5);
        chainMail = new Armour("Chain mail", EArmourType.HEAVY, 5);
        doubleEdge = new Skill("Double Edge");
        warrior = new Warrior("Dir'Galad", 20, 0, sword, chainMail, doubleEdge);
    }

    @Test
    public void getWarriorTest() {
        assertEquals("Dir'Galad", warrior.getName());
        assertEquals(20, warrior.getHp());
    }

}
