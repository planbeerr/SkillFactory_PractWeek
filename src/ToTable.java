public class ToTable {
    private int[] data;
    private int x;
    private int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] arr = new int[x][y];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = data[count];
                count++;
            }
        }
        return arr;
    }
}
