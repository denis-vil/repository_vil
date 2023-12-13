package day9;

public class HumanImpl {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Group 6");
        Teacher teacher = new Teacher("Ksenia", "Ximia");
        System.out.println(student.printInfo());
        System.out.println(teacher.printInfo());
    }
}