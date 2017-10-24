package abowers.sample.project.grimdb;

/**
 * Created by FDIC on 10/24/17.
 */

/*

    Equipment slots:
    helm: 0
    shoulders: 1
    chest: 2
    gloves: 3
    legs: 4
    boots: 5
    amulet: 6
    ring1: 7
    ring2: 8
    belt: 9
    medal: 10
    relic: 11
    mainhand: 12
    offhand: 13

 */
public class ItemCard {

    int itemId;
    int rarity;
    int levelRequirement;
    int equipmentSlot;
    int armorValue;

    String equipRequirementStat;
    int equipRequirementValue;

    String[] baseAttributes;
    String[] prefixes;
    String[] suffixes;

    String   name;

    Skill additionalSkill;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public void setLevelRequirement(int levelRequirement) {
        this.levelRequirement = levelRequirement;
    }

    public int getEquipmentSlot() {
        return equipmentSlot;
    }

    public void setEquipmentSlot(int equipmentSlot) {
        this.equipmentSlot = equipmentSlot;
    }

    public int getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(int armorValue) {
        this.armorValue = armorValue;
    }

    public String getEquipRequirementStat() {
        return equipRequirementStat;
    }

    public void setEquipRequirementStat(String equipRequirementStat) {
        this.equipRequirementStat = equipRequirementStat;
    }

    public int getEquipRequirementValue() {
        return equipRequirementValue;
    }

    public void setEquipRequirementValue(int equipRequirementValue) {
        this.equipRequirementValue = equipRequirementValue;
    }

    public String[] getBaseAttributes() {
        return baseAttributes;
    }

    public void setBaseAttributes(String[] baseAttributes) {
        this.baseAttributes = baseAttributes;
    }

    public String[] getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(String[] prefixes) {
        this.prefixes = prefixes;
    }

    public String[] getSuffixes() {
        return suffixes;
    }

    public void setSuffixes(String[] suffixes) {
        this.suffixes = suffixes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getAdditionalSkill() {
        return additionalSkill;
    }

    public void setAdditionalSkill(Skill additionalSkill) {
        this.additionalSkill = additionalSkill;
    }
}
