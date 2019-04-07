import Characters.Character;
import Characters.Warrior;
import Items.HealingTool;

public class Combat {

    private Character character1;
    private Character character2;

    public Combat(Character character1, Character character2) {
        this.character1 = character1;
        this.character2 = character2;
    }

    public Character combat(Warrior character1, Character character2, HealingTool healingTool) {
        while (character1.getHp() > 0 || character2.getHp() > 0) {
            character1.damageDeal(character2);
            character2.damageDeal(character1);
            if (character1.getHp() < 10) {
                character1.drinkPotion(healingTool);
            }
        }
        character1.setXp(1);
        return character1;
    }

}
