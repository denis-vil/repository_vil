package task1;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    private List<City> readFile(List<City> cities) {
        try (Scanner scanner = new Scanner(new File("/Users/denis/Documents/ideaProject/repository_vil/src/main/java/sber/SB.csv"))) {
            while (scanner.hasNextLine()) {
                cities.add(parse(scanner.nextLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cities;
    }

    private static City parse(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter("\\s*;\\s*");
        String name = "";
        String region = "";
        String district = "";
        int population = 0;
        String foundation = "";
        try {
            scanner.nextInt();
            name = scanner.next();
            region = scanner.next();
            district = scanner.next();
            population = scanner.nextInt();
            foundation = scanner.next();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        return new City(name, region, district, population, foundation);
    }

    private List<City> sortedName(List<City> cities) {
        Collections.sort(cities, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return cities;
    }

    private List<City> sortedDistrictAndRegion(List<City> cities) {
        Collections.sort(cities, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                int districtCompare = o1.getDistrict().compareTo(o2.getDistrict());
                if (districtCompare == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return districtCompare;
            }
        });
        return cities;
    }

    private String searchMaximumResidents(List<City> cities) {
        City[] arrayCitiesList = cities.toArray(new City[0]);
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arrayCitiesList.length; i++) {
            if (arrayCitiesList[i].getPopulation() > max) {
                max = arrayCitiesList[i].getPopulation();
                index = i;
            }
        }
        return "[" + index + "] = " + String.format("%,d", max).replace(",", " ");
    }

    private List<String> numberCitiesInRegion(List<City> cities) {
        int index = 0;
        String comparisonString = "";
        List<String> resultList = new ArrayList<>();
        Collections.sort(cities, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getRegion().compareToIgnoreCase(o2.getRegion());
            }
        });
        comparisonString = cities.get(0).getRegion();
        for (int i = 0; i < cities.size(); i++) {
            if (!cities.get(i).getRegion().equalsIgnoreCase(comparisonString)) {
                resultList.add(comparisonString + " - " + (i - index));
                comparisonString = cities.get(i).getRegion();
                index = i;
            }
        }
        return resultList;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        List<City> cities = main.readFile(new ArrayList<>());
        System.out.println(main.sortedName(cities));
        System.out.println(main.sortedDistrictAndRegion(cities));
        System.out.println(main.searchMaximumResidents(cities));
        System.out.println(main.numberCitiesInRegion(cities));
    }
}