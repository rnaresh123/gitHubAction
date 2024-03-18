package codingpractice;

public class StringPallidrome {
    public static void main(String[] args) {
        String str="racecar";
        String rev="";
        char[] chars = str.toCharArray();
        for (int i = chars.length-1; i >=0 ; i--) {
            rev=rev+chars[i];
        }
        if (rev.equals(str)){
            System.out.println("given string is pallidrome");
        }else {
            System.out.println("given string is not a pallidrome");
        }
    }
}
