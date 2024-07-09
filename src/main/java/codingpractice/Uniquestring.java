package codingpractice;


import java.util.LinkedHashSet;
import java.util.Set;

public class Uniquestring {

    public static void main(String[] args) {
        String str = "narasgonda bhojgonda";
        String uniqueStr = getUniqueString(str);

        System.out.println("Original String: " + str);
        System.out.println("Unique String: " + uniqueStr);
    }

    public static String getUniqueString(String str) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        StringBuilder uniqueStrBuilder = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (uniqueChars.add(ch)) {
                uniqueStrBuilder.append(ch);
            }
        }

        return uniqueStrBuilder.toString();
    }
}


