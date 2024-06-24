package codingpractice;

import java.util.HashMap;

public class NumberOfOccurance1 {
        public static void main(String[] args) {
            String str = "ALL THE BEST";
            HashMap<Character, Integer> map = new HashMap<>();
            char charAt = ' ';
            for (int i = 0; i < str.length(); i++) {
                charAt = str.charAt(i);
                if (map.containsKey(charAt)) {

                    map.put(charAt, map.get(charAt) + 1);
                } else {
                    map.put(charAt, 1);
                }

            }
            System.out.println(map);

        }
    }


