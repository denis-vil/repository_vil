package day14;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", year=" + year + '}';
    }

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    String name;
    int year;
}