package codingpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PracticePrm {
    public static void main(String[] args) {
        String str = "NARASGONDA";
        char[] chars = str.toCharArray();
        Map<Character,Integer>map=new HashMap<>();
        for (char ch:chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //System.out.println(map);
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey()+"");
            }
        }
    }
}





