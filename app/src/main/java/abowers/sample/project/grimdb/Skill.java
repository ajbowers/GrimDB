package abowers.sample.project.grimdb;

/**
 * Created by FDIC on 10/24/17.
 */

public class Skill {
    int id;
    String name;

    double chanceToActivate;
    String description;
    String conditionDesc;
    String[] modifiers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChanceToActivate() {
        return chanceToActivate;
    }

    public void setChanceToActivate(double chanceToActivate) {
        this.chanceToActivate = chanceToActivate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConditionDesc() {
        return conditionDesc;
    }

    public void setConditionDesc(String conditionDesc) {
        this.conditionDesc = conditionDesc;
    }

    public String[] getModifiers() {
        return modifiers;
    }

    public void setModifiers(String[] modifiers) {
        this.modifiers = modifiers;
    }
}
