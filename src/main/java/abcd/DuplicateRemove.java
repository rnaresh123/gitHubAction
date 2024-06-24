package abcd;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {
        String str = "AABBCDDTGGY";
        String emp="";
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (char ch:set){
            emp=emp+ch;
        }
        System.out.println(emp);
    }
}
