package abowers.sample.project.grimdb;

/**
 * Created by FDIC on 10/24/17.
 */

public class WeaponItem extends ItemCard {

    // arrays to account for items with multiple damage types. baseDamageLow[0] corresponds with baseDamageHigh[0]... and low[n] to high[n]
    int[] baseDamageLow;
    int[] baseDamageHigh;

    double piercingPercentage;

    // one handed, twohanded
    String wieldType;

    public int[] getBaseDamageLow() {
        return baseDamageLow;
    }

    public void setBaseDamageLow(int[] baseDamageLow) {
        this.baseDamageLow = baseDamageLow;
    }

    public int[] getBaseDamageHigh() {
        return baseDamageHigh;
    }

    public void setBaseDamageHigh(int[] baseDamageHigh) {
        this.baseDamageHigh = baseDamageHigh;
    }

    public double getPiercingPercentage() {
        return piercingPercentage;
    }

    public void setPiercingPercentage(double piercingPercentage) {
        this.piercingPercentage = piercingPercentage;
    }

    public String getWieldType() {
        return wieldType;
    }

    public void setWieldType(String wieldType) {
        this.wieldType = wieldType;
    }
}
