package letterCombinationsOfPhoneNumber;


import java.util.ArrayList;
import java.util.List;

public class Solutions {
    public List<String> letterCombinations(String digits) {
        List<List<String>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of("a", "b", "c"))); //2
        list.add(new ArrayList<>(List.of("d", "e", "f"))); //3
        list.add(new ArrayList<>(List.of("g", "h", "i"))); //4
        list.add(new ArrayList<>(List.of("j", "k", "l"))); //5
        list.add(new ArrayList<>(List.of("m", "n", "o"))); //6
        list.add(new ArrayList<>(List.of("p", "q", "r", "s"))); // 7
        list.add(new ArrayList<>(List.of("t", "u", "v"))); // 8
        list.add(new ArrayList<>(List.of("w", "x", "y", "z"))); // 9
        if (digits.length() == 1) {
            return list.get(Integer.valueOf(digits) - 2);
        } else if (digits.length() == 2) {
            int oneNumber = Integer.valueOf(String.valueOf(digits.charAt(0))) - 2;
            int secondNumber = Integer.valueOf(String.valueOf(digits.charAt(1))) - 2;
            List<String> stringList = new ArrayList<>();
            for (int i = 0; i < list.get(oneNumber).size(); i++) {
                for (int j = 0; j < list.get(secondNumber).size(); j++) {
                    stringList.add(list.get(oneNumber).get(i) + list.get(secondNumber).get(j));
                }
            }
            return stringList;
        } else if (digits.length() == 3) {
            int oneNumber = Integer.valueOf(String.valueOf(digits.charAt(0))) - 2;
            int secondNumber = Integer.valueOf(String.valueOf(digits.charAt(1))) - 2;
            int threeNumber = Integer.valueOf(String.valueOf(digits.charAt(2))) - 2;
            List<String> stringList = new ArrayList<>();
            for (int i = 0; i < list.get(oneNumber).size(); i++) {
                for (int j = 0; j < list.get(secondNumber).size(); j++) {
                    for (int k = 0; k < list.get(threeNumber).size(); k++) {
                        stringList.add(list.get(oneNumber).get(i) + list.get(secondNumber).get(j) + list.get(threeNumber).get(k));
                    }
                }
            }
            return stringList;
        } else if (digits.length() == 4) {
            int oneNumber = Integer.valueOf(String.valueOf(digits.charAt(0))) - 2;
            int secondNumber = Integer.valueOf(String.valueOf(digits.charAt(1))) - 2;
            int threeNumber = Integer.valueOf(String.valueOf(digits.charAt(2))) - 2;
            int fourNumber = Integer.valueOf(String.valueOf(digits.charAt(3))) - 2;
            List<String> stringList = new ArrayList<>();
            for (int i = 0; i < list.get(oneNumber).size(); i++) {
                for (int j = 0; j < list.get(secondNumber).size(); j++) {
                    for (int k = 0; k < list.get(threeNumber).size(); k++) {
                        for (int l = 0; l < list.get(fourNumber).size(); l++) {
                            stringList.add(list.get(oneNumber).get(i) + list.get(secondNumber).get(j) + list.get(threeNumber).get(k) + list.get(fourNumber).get(l));
                        }
                    }
                }
            }
            return stringList;
        } else {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Solutions solutions = new Solutions();
        System.out.println(solutions.letterCombinations("234"));
    }
}