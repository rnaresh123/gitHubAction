package abcd;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "automation";

        printUniqueCharacters(str);
    }

    public static void printUniqueCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print characters that appear exactly once
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
