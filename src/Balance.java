public class Balance {
    private int rightBowl;
    private int leftBowl;

    public void addRight(int n) {
        this.rightBowl += n;
    }

    public void addLeft(int n) {
        this.leftBowl += n;
    }

    public String getSituation() {
        if (rightBowl == leftBowl) {
            return "=";
        } else if (rightBowl > leftBowl) {
            return "R";
        } else {
            return "L";
        }
    }
}
