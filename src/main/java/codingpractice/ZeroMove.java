package codingpractice;

public class ZeroMove {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 0, 8, 3, 0, 5};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0 && a[j] == 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
            if (a[j] != 0) {
                j++;
            }

        }
        for (int b : a) {
            System.out.print(b + " ");
        }
        String st = "RACECAR";
        if (stringPallidrome(st)) {
            System.out.println("given string is pallidrome string");
        } else {
            System.out.println("given string is not a pallidrome");
        }

    }

    public static boolean stringPallidrome(String str) {
        String rev = "";
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i++) {
            rev = rev + chars[i];
        }
        if (rev.equals(str)) {
            return true;
        }
        return false;
    }


}
