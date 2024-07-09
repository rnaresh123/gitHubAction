package patternprograms;

public class AlternativeNumbers {
    public static void main(String[] args) {
                int n = 4; // Initial length of the pattern
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j % 2 == 0 ? 2 : 1);
                    }
                    System.out.println();
                }
            }
        }


