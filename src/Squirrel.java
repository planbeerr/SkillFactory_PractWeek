public class Squirrel {
    private int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {
//        if (nuts[index] > 0) {
//            return nuts[index];
//        } else {
//            return nuts[index] * -1;
//        }
        return nuts[index];
    }

    public int maxNuts() {
        int count = 0;
        for (int i = 0; i < nuts.length; i++) {
            if (i == nuts.length - 1) {
                if (count + nuts[i] > count) {
                    count += nuts[i];
                }
                break;
            }
            if (nuts[i] > 0) {
                count += nuts[i];
            } else if (count + nuts[i] > count + nuts[i + 1]) {
                count += nuts[i];
            } else {
                count += nuts[i + 1];
                i++;
            }
        }
        if (count < 0) {
            count = 0;
        }
        return count;
    }
}
