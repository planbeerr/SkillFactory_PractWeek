public class Bell {
    private int dingCount = 1;

    public void sound() {
        if (dingCount % 2 == 1) {
            System.out.println("Ding");
        } else {
            System.out.println("Dong");
        }
        dingCount++;
    }
}
