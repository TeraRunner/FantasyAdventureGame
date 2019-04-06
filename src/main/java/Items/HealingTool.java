package Items;

public class HealingTool {

    private String healingToolName;
    private int healingToolDamage;

    public HealingTool(String healingToolName, int healingToolDamage) {
        this.healingToolName = healingToolName;
        this.healingToolDamage = healingToolDamage;
    }

    public String getHealingToolName() {
        return healingToolName;
    }

    public void setHealingToolName(String healingToolName) {
        this.healingToolName = healingToolName;
    }

    public int getHealingToolDamage() {
        return healingToolDamage;
    }

    public void setHealingToolDamage(int healingToolDamage) {
        this.healingToolDamage = healingToolDamage;
    }
}
