import Characters.Enemy;
import Characters.Skills.Skill;
import Characters.Warrior;
import Items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombatTest {

    Weapon dagger;
    Weapon sword;
    Armour cloth;
    Armour chainMail;
    Skill doubleEdge;
    HealingTool potion;
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
        potion = new HealingTool("Potion", 10);
        player1 = new Warrior("Dir'Galad", 20, 0, sword, chainMail, doubleEdge);
        goblin = new Enemy("Goblin", 5, 1, dagger, cloth);
    }

    @Test
    public void combatTest() {
        assertEquals(0, player1.getXp());
        combat = new Combat(player1, goblin);
        combat.combat(player1, goblin, potion);
        assertEquals(1, player1.getXp());
    }

}
