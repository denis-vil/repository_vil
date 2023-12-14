package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        for (int i = 0; i < numberOfTests; i++) {
            int numberOfProgrammers = scanner.nextInt();
            int[] socialThresholds = new int[numberOfProgrammers];
            for (int j = 0; j < numberOfProgrammers; j++) {
                socialThresholds[j] = scanner.nextInt();
            }
            boolean possible = canEstablishContact(numberOfProgrammers, socialThresholds);
            System.out.println(possible ? "Yes" : "No");
        }
    }

    public static boolean canEstablishContact(int numberOfProgrammers, int[] socialThresholds) {
        int sum = 0;
        for (int threshold : socialThresholds) {
            sum += threshold;
        }
        for (int threshold : socialThresholds) {
            if (threshold > numberOfProgrammers - 1) {
                return false;
            }
        }
        return sum >= 2 * (numberOfProgrammers - 1);
    }
}
/*
1) В первом наборе данных у нас всего один программист с порогом 1000000000
    Он не сможет установить контакт с кем-либо из-за своего высокого порога, поэтому вывод будет "No" и он один.
2) Втором наборе данных два программиста с порогами 1 и 1. Они могут напрямую контактировать друг с другом, поэтому вывод будет "Yes".
3) В третьем наборе данных три программиста с порогами 1, 1 и 1. Каждый из них может контактировать напрямую с остальными, так что ответ будет "Yes".
4) В четвертом наборе данных у нас четыре программиста с порогами 1, 1, 2 и 2. Первые два программиста могут контактировать напрямую, а оставшиеся двое могут контактировать через них, поэтому вывод будет "Yes".
Возможно не так понял условие, но в моем понимании это так, оч много времени потратил, другого ничего не придумал(((
*/