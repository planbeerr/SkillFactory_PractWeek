public class ToLine {
    private int[][] data;
    private int x;
    private int y;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int[] arr = new int[data.length * data[0].length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                arr[count] = data[i][j];
                count++;
            }
        }
        return arr;
    }
}
