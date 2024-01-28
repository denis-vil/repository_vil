package passwordGeneration;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class Solution {
    private final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String specChar = "!@#$%^&*()-_+=";

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Logger logger = Logger.getLogger(Solution.class.getName());
        logger.info("Введите длину пароля -> ");
        Scanner scanner = new Scanner(System.in);
        int lengthPassword = scanner.nextInt();
        logger.info("Пароль должен содержать буквы? y/n");
        String lettersStr = scanner1.nextLine().toLowerCase();
        logger.info("Пароль должен содержать сцепсимволы? y/n");
        String specialCharactersStr = scanner1.nextLine().toLowerCase();
        boolean letters = true;
        boolean specialCharacters = true;
        if (!lettersStr.equals("y")) {
            letters = false;
        }
        if (!specialCharactersStr.equals("y")) {
            specialCharacters = false;
        }
        Solution solution = new Solution();
        System.out.println(solution.generation(letters, specialCharacters, lengthPassword));
    }

    private StringBuilder generation(boolean letters, boolean specialCharacters, int length) {
        Solution solution = new Solution();
        if (length % 2 == 0 && !letters && !specialCharacters) {
            return solution.evenLengthGenerationOneRules(length);
        } else if (length % 2 == 0 && letters && !specialCharacters) {
            return solution.evenLengthGenerationSecondRulesLetters(length);
        } else if (length % 2 == 0 && specialCharacters && !letters) {
            return solution.evenLengthGenerationSecondRulesSpecialCharacters(length);
        } else if (length % 2 == 0 && specialCharacters && letters) {
            return solution.evenLengthGenerationThreeRules(length);
        } else if (length % 2 != 0 && !letters && !specialCharacters) {
            return solution.evenLengthGenerationOneRules(length);
        } else if (length % 2 != 0 && letters && !specialCharacters) {
            return solution.generationOfOddLengthSecondRulesLetters(length);
        } else if (length % 2 != 0 && specialCharacters && !letters) {
            return solution.generationOfOddLengthSecondRulesSpecialCharacters(length);
        } else if (length % 2 != 0 && specialCharacters && letters) {
            return solution.generationOfOddLengthThreeRules(length);
        } else {
            return null;
        }
    }

    private StringBuilder evenLengthGenerationOneRules(int length) {
        StringBuilder resultPassword = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            resultPassword.append(random.nextInt(9));
        }
        return resultPassword;
    }

    private StringBuilder evenLengthGenerationSecondRulesLetters(int length) {
        StringBuilder resultPassword = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length / 2; i++) {
            resultPassword.append(random.nextInt(9));
            resultPassword.append(alphabet.charAt(random.nextInt(52)));
        }
        return resultPassword;
    }

    private StringBuilder evenLengthGenerationSecondRulesSpecialCharacters(int length) {
        StringBuilder resultPassword = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length / 2; i++) {
            resultPassword.append(random.nextInt(9));
            resultPassword.append(specChar.charAt(random.nextInt(14)));
        }
        return resultPassword;
    }

    private StringBuilder evenLengthGenerationThreeRules(int length) {
        StringBuilder resultPassword = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length / 3; i++) {
            resultPassword.append(random.nextInt(9));
            resultPassword.append(alphabet.charAt(random.nextInt(52)));
            resultPassword.append(specChar.charAt(random.nextInt(14)));
        }
        while (resultPassword.length() != length) {
            resultPassword.append(specChar.charAt(random.nextInt(14)));
        }
        return resultPassword;
    }

    private StringBuilder generationOfOddLengthSecondRulesLetters(int length) {
        StringBuilder resultPassword = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length / 2; i++) {
            resultPassword.append(random.nextInt(9));
            resultPassword.append(alphabet.charAt(random.nextInt(52)));
        }
        while (resultPassword.length() != length) {
            resultPassword.append(specChar.charAt(random.nextInt(14)));
        }
        return resultPassword;
    }

    private StringBuilder generationOfOddLengthSecondRulesSpecialCharacters(int length) {
        StringBuilder resultPassword = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length / 2; i++) {
            resultPassword.append(random.nextInt(9));
            resultPassword.append(specChar.charAt(random.nextInt(14)));
        }
        while (resultPassword.length() != length) {
            resultPassword.append(specChar.charAt(random.nextInt(14)));
        }
        return resultPassword;
    }

    private StringBuilder generationOfOddLengthThreeRules(int length) {
        StringBuilder resultPassword = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length / 3; i++) {
            resultPassword.append(random.nextInt(9));
            resultPassword.append(alphabet.charAt(random.nextInt(52)));
            resultPassword.append(specChar.charAt(random.nextInt(14)));
        }
        while (resultPassword.length() != length) {
            resultPassword.append(specChar.charAt(random.nextInt(14)));
        }
        return resultPassword;
    }
}