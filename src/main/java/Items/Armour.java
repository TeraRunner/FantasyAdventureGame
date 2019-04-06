package Items;

public class Armour {

    private String armourName;
    private EArmourType armourType;
    private int armourDefense;

    public Armour(String armourName, EArmourType armourType, int armourDefense)  {
        this.armourName = armourName;
        this.armourType = armourType;
        this.armourDefense = armourDefense;
    }

    public String getArmourName() {
        return armourName;
    }

    public void setArmourName(String armourName) {
        this.armourName = armourName;
    }

    public EArmourType getArmourType() {
        return armourType;
    }

    public void setArmourType(EArmourType armourType) {
        this.armourType = armourType;
    }

    public int getArmourDefense() {
        return armourDefense;
    }

    public void setArmourDefense(int armourDefense) {
        this.armourDefense = armourDefense;
    }
}
