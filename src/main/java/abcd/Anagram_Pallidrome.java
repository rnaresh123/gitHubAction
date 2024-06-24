package abcd;

import java.util.HashSet;

public class Anagram_Pallidrome {

    public static void main(String[] args) {
        String S = "geeksogeeks";
        HashSet<Character>set=new HashSet<>();           //duplicate not accepted
        for (char ch:S.toCharArray()){
            if (set.contains(ch)){
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        if (set.size()<=1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
