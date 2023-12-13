package day9;

public class Human {
    public String getName() {
        return name;
    }

    String printInfo() {
        return "Этот человек с именем " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    String name;
}