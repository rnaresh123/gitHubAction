package abcd;

import java.util.Arrays;

public class InsertAlternativeCharater {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd'};
        char[] b = {'p', 'q', 'r', 's'};
        int maxLength = Math.max(a.length, b.length);
        int index = 0;
        int length = a.length + b.length;
        char[] c = new char[length];
        for (int i = 0; i < maxLength; i++) {

            if (i >= 0) {
                c[index++] = a[i];
            }
            if (i >= 0) {
                c[index++] = b[i];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
