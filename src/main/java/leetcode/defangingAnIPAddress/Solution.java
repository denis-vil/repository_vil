package defangingAnIPAddress;

public class Solution {
    public String defangIPaddr(String address) {
        String[] words = address.split("\\.");
        String resultStr = "";
        int max = words.length;
        int count = -1;
        for (int i = 0; i < words.length; i++) {
            count++;
            if (count == max - 1) {
                resultStr = resultStr + words[i];
            } else {
                resultStr = resultStr + words[i] + "[.]";
            }
        }
        return resultStr;
    }
}