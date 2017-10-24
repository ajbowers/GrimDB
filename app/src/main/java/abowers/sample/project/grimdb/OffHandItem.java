package abowers.sample.project.grimdb;

/**
 * Created by FDIC on 10/24/17.
 */

public class OffHandItem extends ItemCard {
    // shield or caster-offhand
    String type;

    double blockChance;
    double blockValue;
    double blockCooldown;

    int shieldDamage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(double blockChance) {
        this.blockChance = blockChance;
    }

    public double getBlockValue() {
        return blockValue;
    }

    public void setBlockValue(double blockValue) {
        this.blockValue = blockValue;
    }

    public double getBlockCooldown() {
        return blockCooldown;
    }

    public void setBlockCooldown(double blockCooldown) {
        this.blockCooldown = blockCooldown;
    }

    public int getShieldDamage() {
        return shieldDamage;
    }

    public void setShieldDamage(int shieldDamage) {
        this.shieldDamage = shieldDamage;
    }
}
