package Characters;

import Characters.Skills.Skill;
import Items.Armour;
import Items.Weapon;

public class Warrior extends Character{

    private Skill skill;

    public Warrior(String name, int hp, int xp, Weapon weapon, Armour armour, Skill skill) {
        super(name, hp, xp, weapon, armour);
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

}
