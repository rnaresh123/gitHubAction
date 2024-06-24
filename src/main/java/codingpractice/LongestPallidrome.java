package codingpractice;

public class LongestPallidrome {
    public static void main(String[] args) {
        String str = "uytrewsdxfcgvhggfdrertyuih";
        String hold = "";
        int len = 0;
        String pallidrome ="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < str.length(); j++) {
                hold = str.substring(i, j);
                if (new StringBuffer(hold).reverse().toString().equals(hold) && hold.length() > len) {
                    pallidrome = hold;
                    System.out.println(hold);
                    len = pallidrome.length();
                }

            }

        }
        System.out.println(pallidrome);


    }
}
