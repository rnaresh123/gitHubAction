package codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfOccurance {
    public static void main(String[] args) {
        String str = "naresh raipalle khaja sameer sameer preetam";
        HashMap<String, Integer> map = new HashMap<>();
        String[] split = str.split(" ");
        for (String word : split) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        String maxString = "";
        int maxValue = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > maxValue) {
                maxString = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        System.out.println(maxString);

        String maxDuplicateString = maxDuplicateString(str);
        System.out.println(maxDuplicateString);
    }

    public static String maxDuplicateString(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] split = str.split(" ");
        for (String word : split) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);                                    //value=number key=string
            }
        }
        String maxString = "";
        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxString = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return maxString;

    }

}
