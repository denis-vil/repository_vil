package day9;

public class Teacher extends Human {
    String nameItem;

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public Teacher(String name, String nameItem) {
        super(name);
        this.nameItem = nameItem;
    }

    public String printInfo() {
        super.printInfo();
        return "Этот преподаватель с именем " + name;
    }
}