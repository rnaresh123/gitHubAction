package patternprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
/* output
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
 */