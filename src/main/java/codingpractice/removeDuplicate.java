package codingpractice;

import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] a={23,54,75,32,67,97,56,45,23};
        Set<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for (int b:a) {
            set.add(b);
            list.add(b);
        }
        System.out.println(set);
        Collections.sort(list);
    }
}
