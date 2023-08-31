public class Human {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String work;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 50;
        this.address = null;
        this.work = null;
    }

    public Human(String name, String address) {
        this.name = name;
        this.age = 25;
        this.weight = 50;
        this.address = address;
        this.work = null;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.work = null;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.weight = 50;
        this.address = null;
        this.work = work;
    }

    public Human(int age, int weight, String address, String work) {
        this.name = "Alexey";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}
