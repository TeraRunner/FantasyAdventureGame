package Characters;

import Characters.Skills.Skill;
import Interfaces.IUseHealingTool;
import Items.Armour;
import Items.HealingTool;
import Items.Weapon;

public class Warrior extends Character implements IUseHealingTool {

    private Skill skill;
    private HealingTool healingTool;

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

    public int drinkPotion(HealingTool healingTool) {
        while (this.getHp() < 20 && healingTool.getHealingToolDamage() >= 0) {
            this.setHp(+ 1);
            healingTool.setHealingToolDamage(- 1);
        }
        return this.getHp();
    }

}
