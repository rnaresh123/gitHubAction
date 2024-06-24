package abcd;

public class Dil {

        public static void main(String[] args) {
            int n = 10;
            StringBuilder str = new StringBuilder();

            // First part of the pattern
            for (int i = n / 2; i < n; i += 2) {
                for (int j = 1; j < n - i; j += 2) {
                    str.append(" ");
                }
                for (int j = 1; j < i + 1; j++) {
                    str.append("*");
                }
                for (int j = 1; j < n - i + 1; j++) {
                    str.append(" ");
                }
                for (int j = 1; j < i + 1; j++) {
                    str.append("*");
                }
                str.append("\n");
            }

            // Second part of the pattern
            for (int i = n; i > 0; i--) {
                for (int j = 0; j < n - i; j++) {
                    str.append(" ");
                }
                for (int j = 1; j < i * 2; j++) {
                    str.append("*");
                }
                str.append("\n");
            }

            // Print the pattern
            System.out.println(str.toString());
        }
    }



