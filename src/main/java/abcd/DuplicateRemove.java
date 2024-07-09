package abcd;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {
        String str = "narasgonda";
        String dupli = dupli(str);
        System.out.println(dupli);

    }

    public static String dupli(String str) {
        String rev = " ";
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length() - 1; i++) {
            set.add(str.charAt(i));

        }
        for (char ch : set) {
            rev = rev + ch;
        }
        return rev;
    }
}
