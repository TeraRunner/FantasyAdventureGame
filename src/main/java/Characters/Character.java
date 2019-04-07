package Characters;

import Items.Armour;
import Items.Weapon;

public abstract class Character {

    private String name;
    private int hp;
    private int xp;
    Weapon weapon;
    Armour armour;

    public Character(String name, int hp, int xp, Weapon weapon, Armour armour) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.weapon = weapon;
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public int damageDeal(Character enemyCharacter) {
        if (enemyCharacter.getArmour().getArmourDefense() >= weapon.getWeaponDamage()) {
            return enemyCharacter.hp -= 1;
        } else {
            int damage = weapon.getWeaponDamage() - enemyCharacter.getArmour().getArmourDefense();
            return enemyCharacter.hp -= damage;
        }
    }

}
