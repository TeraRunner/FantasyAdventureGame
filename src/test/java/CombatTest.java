import Characters.Enemy;
import Characters.Skills.Skill;
import Characters.Warrior;
import Items.Armour;
import Items.EArmourType;
import Items.EWeaponDamageType;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

public class CombatTest {

    Weapon dagger;
    Weapon sword;
    Armour cloth;
    Armour chainMail;
    Skill doubleEdge;
    Warrior player1;
    Enemy goblin;
    Combat combat;

    @Before
    public void setup() {
        dagger = new Weapon("Bronze Dagger", EWeaponDamageType.PIERCING, 1);
        sword = new Weapon("Bronze Sword", EWeaponDamageType.SLASHING, 5);
        cloth = new Armour("Cloth", EArmourType.LIGHT, 0);
        chainMail = new Armour("Chain mail", EArmourType.MEDIUM, 3);
        doubleEdge = new Skill("Double Edge");
        player1 = new Warrior("Dir'Galad", 20, 0, sword, chainMail, doubleEdge);
        goblin = new Enemy("Goblin", 5, 1, dagger, cloth);
    }

    @Test
    public void combatTest() {

    }

}
