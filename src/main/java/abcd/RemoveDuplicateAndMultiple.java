package abcd;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateAndMultiple {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 1, 2};

        // Use a Set to remove duplicates
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : input) {
            uniqueElements.add(num);
        }

        // Calculate the product of the elements in the Set
        int product = 1;
        for (int num : uniqueElements) {
            product *= num;
        }

        // Print the result
        System.out.println("The product of the unique elements is: " + product);
    }
}
