import java.util.Objects;

public class Mage {
    public String name;
    public int level;
    public int damage;
    public String type;
    private final String  fire = "fire";
    private final String  ice = "ice";
    private final String  earth = "earth";

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return name + ", " + level + ", " + damage + ", " + type;
    }

    public String fight(Mage mage) {
        if (!Objects.equals(this.type, mage.type)) {
            if (Objects.equals(this.type, ice)) {
                if (Objects.equals(mage.type, fire)) {
                    return mage.name;
                } else {
                    return this.name;
                }
            } else if (Objects.equals(this.type, fire)) {
                if (Objects.equals(mage.type, ice)) {
                    return this.name;
                } else {
                    return mage.name;
                }
            } else {
                if (Objects.equals(mage.type, fire)) {
                    return this.name;
                } else {
                    return mage.name;
                }
            }
        } else {
            if (this.level > mage.level) {
                return this.name;
            } else if (this.level < mage.level) {
                return mage.name;
            } else {
                if (this.damage > mage.damage) {
                    return this.name;
                } else if (this.damage < mage.damage) {
                    return mage.name;
                } else {
                    return "draw";
                }
            }
        }
    }
}
