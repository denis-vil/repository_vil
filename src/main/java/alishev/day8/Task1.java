package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        long start1 = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            str += i + " ";
        }
        System.out.println(System.currentTimeMillis()-start1 + " String");
        StringBuilder stringBuilder = new StringBuilder();
        long start2 = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(System.currentTimeMillis()-start2 + " String builder");
    }
}