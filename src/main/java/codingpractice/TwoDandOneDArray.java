package codingpractice;

import java.util.ArrayList;

public class TwoDandOneDArray {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] b = {3, 6, 9};
        int n = 3;
        // Equivalent logic from the array method
        int sum = 0;
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }
        list.add(sum);
        list.add(max);

        // Print the results
        System.out.println(list.get(0)); // Print the sum of the diagonal elements
        System.out.println(list.get(1)); // Print the maximum element from the array b
    }
}

