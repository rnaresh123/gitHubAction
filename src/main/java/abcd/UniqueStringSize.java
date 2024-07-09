package abcd;

import java.util.HashSet;
import java.util.Set;

public class UniqueStringSize {
    public static void main(String[] args) {
        String str="naresh";
        Set<String>unique=new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length(); j++) {
                String substring = str.substring(i, j);
               unique.add(substring);
            }
        }
        System.out.println(unique.size());

    }
}
