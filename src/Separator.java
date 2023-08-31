import java.util.Arrays;

public class Separator {
    private int[] array;

    public Separator() {
        array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
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
