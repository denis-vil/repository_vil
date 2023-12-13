package day9;

public class Student extends Human {
    public String getNameGroup() {
        return nameGroup;
    }

    public Student(String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    String nameGroup;

    public String printInfo() {
        super.printInfo();
        return "Этот студент с именем " + name;
    }
}