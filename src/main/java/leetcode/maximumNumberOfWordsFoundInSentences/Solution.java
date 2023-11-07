package maximumNumberOfWordsFoundInSentences;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] split = sentences[i].split(" ");
            count = split.length;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}