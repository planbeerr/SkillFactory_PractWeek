import java.util.Arrays;

public class Separator1 {
    private int[] array;

    public Separator1(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int j = 0;
        int[] even = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                even[j] = array[i];
                j++;
            }
        }
        return Arrays.copyOf(even, j);
    }

    public int[] odd() {
        int j = 0;
        int[] odd = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                odd[j] = array[i];
                j++;
            }
        }
        return Arrays.copyOf(odd, j);
    }
}
