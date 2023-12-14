package task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int treeSize = scanner.nextInt();
        int numberOfCompaniesOfInterest = scanner.nextInt();
        Map<String, Integer> companies = new HashMap<>();
        for (int i = 0; i < numberOfCompaniesOfInterest; i++) {
            companies.put(scanner.next(), i + 1);
        }
        CompanyNode[] nodesArray = new CompanyNode[treeSize + 1];
        for (int i = 1; i <= treeSize; i++) {
            int parent = scanner.nextInt();
            int cost = scanner.nextInt();
            String companyName = scanner.next();
            nodesArray[i] = new CompanyNode(parent, cost, companyName);
        }
        int[] stocks = new int[numberOfCompaniesOfInterest + 1];
        Arrays.fill(stocks, Integer.MAX_VALUE);
        for (int i = 1; i <= treeSize; i++) {
            if (companies.containsKey(nodesArray[i].companyName)) {
                int companyIndex = companies.get(nodesArray[i].companyName);
                int currentCost = nodesArray[i].cost;
                while (i > 0 && stocks[companyIndex] == Integer.MAX_VALUE) {
                    stocks[companyIndex] = currentCost;
                    i = nodesArray[i].parent;
                }
            }
        }
        long totalCost = 0;
        for (int i = 1; i <= numberOfCompaniesOfInterest; i++) {
            if (stocks[i] == Integer.MAX_VALUE) {
                totalCost = -1;
                break;
            }
            totalCost += stocks[i];
        }
        System.out.println(totalCost);
    }
}