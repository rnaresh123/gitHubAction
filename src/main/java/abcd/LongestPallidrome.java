package abcd;

import javax.swing.text.TabableView;

public class LongestPallidrome {
    public static void main(String[] args) {
        String str = "jkhhdgfracecarMANGOOOGNAGMggfnitinjkndj";
        String abc = "";
        String longestPali = "";
        //aba abba abbcbba
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                abc = str.substring(i, j);
                String string = new StringBuffer(abc).reverse().toString();
                if (string.equalsIgnoreCase(abc) && maxLength < abc.length()) {
                    longestPali = abc;
                    maxLength = longestPali.length();
                }
            }
        }
        System.out.println(longestPali);
    }
}
