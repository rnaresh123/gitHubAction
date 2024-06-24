package codingpractice;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeCharacterAlternatively {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd'};
        char[] b = {'e', 'f', 'g', 'h'};
        char[] c = new char[a.length + b.length];
        int maxlength = Math.max(a.length, b.length);
        int index = 0;
        for (int i = 0; i < maxlength; i++) {
            if (i < a.length) {
                c[index++] = a[i];
            }
            if (i < b.length) {
                c[index++] = b[i];
            }

        }
        String str = new String(c, 0, index);
        System.out.println(Arrays.toString(c));


    }
}
