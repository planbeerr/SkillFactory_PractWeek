import java.util.Objects;

public class Programmer {
    private String name;
    private String company;
    private String position;
    private String intern = "intern";
    private String junior = "junior";
    private String middle = "middle";
    private String senior = "senior";
    private String lead = "lead";

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = intern;
    }

    public String getPosition() {
        return this.position;
    }

    public void work() {
        if (Objects.equals(position, intern)) {
            position = junior;
        } else if (Objects.equals(position, junior)) {
            position = middle;
        } else if (Objects.equals(position, middle)) {
            position = senior;
        } else if (Objects.equals(position, senior)) {
            position = lead;
        } else {
            position = lead;
        }
    }
}
