package codingpractice;

import java.util.ArrayList;
import java.util.List;

public class StringPallidrome {
    public static void main(String[] args) {
        String str="nitingupta";
        List<String> palindrome = findPalindrome(str);
        String s = "";
        for (String st : palindrome){
            if(st.length()>s.length()){
                s =st;
            }
        }
        System.out.println(s);
    }

    public  static List<String> findPalindrome(String str){
        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1+i; j < str.length(); j++) {
                if(isPalindrome(str.substring(i,j))){//nitingupta
                  palindromes.add(str.substring(i,j));
                    System.out.println(str.substring(i,j));
                }
            }
        }
        return palindromes;
    }

    public static boolean isPalindrome1(String str){
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = reverse+str.charAt(i);
        }
        if(reverse == str){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String str){
        if(str.isEmpty() || str.equals(null)){
            return false;
        }
        int i = 0;
        int j = str.length()-1;
        while (i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
}
