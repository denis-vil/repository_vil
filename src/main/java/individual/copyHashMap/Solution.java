package copyHashMap;

import java.util.*;

public class Solution {
    static long chatID = 4343524543l;

    public static void main(String[] args) {
        HashMap<Long, List<String>> worlds = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("World1");
        list.add("World2");
        list.add("World3");
        list.add("World1");
        list.add("World2");
        list.add("World3");
        worlds.put(chatID, list);
        collectionsShuffle(worlds);
    }

    private static void collectionsShuffle(HashMap<Long, List<String>> hashMap) {
        System.out.println();
        System.out.println(hashMap + " Original");
        HashMap<Long, List<String>> worldsRevers = new HashMap<>();
        for (Map.Entry<Long, List<String>> entry : hashMap.entrySet()) {
            List<String> listOriginal = entry.getValue();
            List<String> listResult = new ArrayList<>(listOriginal);
            Collections.shuffle(listResult);
            worldsRevers.put(entry.getKey(), listResult);
        }
        System.out.println();
        System.out.println(worldsRevers + " Collections.shuffle");
        System.out.println(hashMap + " Original");
    }
}
