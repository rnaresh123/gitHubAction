package capgemini_programs;

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid
        System.out.println("Number Pyramid:");
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces before numbers
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print spaces
            }
            // Inner loop for numbers in each row
            int num = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " "); // Print numbers
                num++;
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}

