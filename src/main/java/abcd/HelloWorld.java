package abcd;

import java.util.HashMap;
import java.util.Map;



   class Helloworld{
       public static void main(String[] args) {
           String str = "automation";

           printUniqueCharacters(str);
       }

       public static void printUniqueCharacters(String str) {
           Map<Character, Integer> map = new HashMap<>();

           // Count the occurrences of each character
           for (char c : str.toCharArray()) {
               map.put(c, map.getOrDefault(c, 0) + 1);
           }

           // Print characters that appear exactly once
           for (Map.Entry<Character, Integer> entry : map.entrySet()) {
               if (entry.getValue() == 1) {
                   System.out.print(entry.getKey() + " ");
               }
           }
       }
   }


