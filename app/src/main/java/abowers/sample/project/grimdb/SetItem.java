package abowers.sample.project.grimdb;

/**
 * Created by FDIC on 10/24/17.
 */

public class SetItem extends ItemCard {

    int   setID;
    int   numberOfItemsInSet;

    ItemCard[] setItems;

    String[] setBonuses;
    String   setName;

    Skill grantedSkill;

    public int getSetID() {
        return setID;
    }

    public void setSetID(int setID) {
        this.setID = setID;
    }

    public int getNumberOfItemsInSet() {
        return numberOfItemsInSet;
    }

    public void setNumberOfItemsInSet(int numberOfItemsInSet) {
        this.numberOfItemsInSet = numberOfItemsInSet;
    }

    public ItemCard[] getSetItems() {
        return setItems;
    }

    public void setSetItems(ItemCard[] setItems) {
        this.setItems = setItems;
    }

    public String[] getSetBonuses() {
        return setBonuses;
    }

    public void setSetBonuses(String[] setBonuses) {
        this.setBonuses = setBonuses;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public Skill getGrantedSkill() {
        return grantedSkill;
    }

    public void setGrantedSkill(Skill grantedSkill) {
        this.grantedSkill = grantedSkill;
    }
}
