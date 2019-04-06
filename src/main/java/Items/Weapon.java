package Items;

public class Weapon {

    private String weaponName;
    private EWeaponDamageType weaponType;
    private int weaponDamage;

    public Weapon(String name, EWeaponDamageType weaponType, int weaponDamage) {
        this.weaponName = name;
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String name) {
        this.weaponName = name;
    }

    public EWeaponDamageType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(EWeaponDamageType weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }



}