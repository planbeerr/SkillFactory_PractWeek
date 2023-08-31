public class LimittingRectangle {
    private int[][] points;
    private static int minX;
    private static int maxX;
    private static int minY;
    private static int maxY;
    public LimittingRectangle(int[][] points) {
        this.points = points;
        calculation(points);
    }
    private static void calculation(int[][] points) {
        for (int i = 0; i < points.length; i++) {
                if (points[i][0] < minX) {
                    minX = points[i][0];
                } else if (points[i][0] > maxX) {
                    maxX = points[i][0];
                }
                if (points[i][1] < minY) {
                    minY = points[i][1];
                } else if (points[i][1] > maxY) {
                    maxY = points[i][1];
                }
        }
    }

    public int getWidth() {
        return maxX - minX;
    }

    public int getHeight() {
        return maxY - minY;
    }

    public String getBorders() {
        return minY + ", " + maxY + ", " + minX + ", " + maxX;
    }
}
