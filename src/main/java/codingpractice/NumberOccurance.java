package codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOccurance {

    public static void main(String[] args) {
        String st = "naresh raipalle";
        String reverseString = reverseString(st);
        System.out.println(reverseString);
        int countOfA = countOfA(st);
        System.out.println(countOfA);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < st.length() - 1; i++) {
            if (map.containsKey(st.charAt(i))) {
                map.put(st.charAt(i), map.get(st.charAt(i)) + 1);
            } else {
                map.put(st.charAt(i), 1);
            }
        }
        //System.out.println(map);
        int mfv = 0;
        char c = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            //System.out.println(entry.getKey()+" "+entry.getValue());
            if (entry.getValue() > mfv) {
                mfv = entry.getValue();
                c = entry.getKey();
            }
        }
        System.out.println(c);
    }

    public static String reverseString(String str) {
        String rev = "";
        char[] chars = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + chars[i];
        }
        return rev;
    }

    public static int countOfA(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'r') {
                count++;
            }
        }
        return count;
    }

}
