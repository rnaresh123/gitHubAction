package capgemini_programs;


import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4};

        // Use HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int element : array) {
            set.add(element);
        }

        // Convert set back to array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int element : set) {
            uniqueArray[index++] = element;
        }

        // Print the unique array
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}


