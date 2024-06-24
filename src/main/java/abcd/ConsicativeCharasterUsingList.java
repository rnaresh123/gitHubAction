package abcd;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConsicativeCharasterUsingList {
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeConsecutiveCharacter(str));


        char[] a = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (list.isEmpty() || a[i] != list.get(list.size() - 1)) {
                list.add(a[i]);
            } else {
                list.remove(list.size() - 1);
            }
        }
        String str1 = "";
        StringBuffer sb = new StringBuffer();
        for (char c : list) {
            sb.append(c);
        }
        System.out.println(sb);
    }




    public static String removeConsecutiveCharacter(String str){
        Stack<Character>stack=new Stack<>();
        for (char ch:str.toCharArray()){
            if(stack.isEmpty() || ch!=stack.peek()){
                stack.add(ch);
            }else {
                stack.pop();
            }
        }
        StringBuffer bf=new StringBuffer();
        for (char ch:stack){
            bf.append(ch);
        }
        return bf.toString();
    }

}
