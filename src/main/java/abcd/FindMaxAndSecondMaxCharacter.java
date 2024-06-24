package abcd;

import java.util.HashMap;
import java.util.Map;

public class FindMaxAndSecondMaxCharacter {
    public static void main(String[] args) {
        String str = "NARASGONDA BHOJGONDA";
        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        char maxChar = ' ';
        char secondMaxChar = ' ';
        int maxCount = 0;
        int secondMaxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                secondMaxCount = maxCount;
                secondMaxChar = maxChar;
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            } else if (entry.getValue() > secondMaxCount) {
                secondMaxCount = entry.getValue();
                secondMaxChar = entry.getKey();
            }
        }

        System.out.println("Maximum repeated character: " + maxChar + " (count: " + maxCount + ")");
        System.out.println("Second maximum repeated character: " + secondMaxChar + " (count: " + secondMaxCount + ")");
    }
}
