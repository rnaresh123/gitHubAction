package codingpractice;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "WELCOME TO TESTING";
        String rev = "";
        char[] chars = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + chars[i];
        }
        System.out.println(rev);
    }
}
