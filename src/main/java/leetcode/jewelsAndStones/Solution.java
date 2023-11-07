package jewelsAndStones;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        String[] jewelsArray = jewels.split("");
        String[] stonesArray = stones.split("");
        for (int i = 0; i < jewelsArray.length; i++) {
            for (int j = 0; j < stonesArray.length; j++) {
                if (jewelsArray[i].equals(stonesArray[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}