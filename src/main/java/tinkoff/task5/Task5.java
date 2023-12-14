package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfChildren = scanner.nextInt();
        int numberOfFriendships = scanner.nextInt();
        int numberOfRequests = scanner.nextInt();
        int[] manuls = new int[amountOfChildren + 1];
        for (int i = 1; i <= amountOfChildren; i++) {
            manuls[i] = scanner.nextInt();
        }
        List<List<Integer>> friends = new ArrayList<>();
        for (int i = 0; i <= amountOfChildren; i++) {
            friends.add(new ArrayList<>());
        }
        for (int i = 0; i < numberOfFriendships; i++) {
            int v = scanner.nextInt();
            int u = scanner.nextInt();
            friends.get(v).add(u);
            friends.get(u).add(v);
        }
        for (int i = 0; i < numberOfRequests; i++) {
            char symbol = scanner.next().charAt(0);
            int v = scanner.nextInt();
            if (symbol == '+') {
                int x = scanner.nextInt();
                for (int friend : friends.get(v)) {
                    manuls[friend] += x;
                }
            } else {
                System.out.println(manuls[v]);
            }
        }
    }
}