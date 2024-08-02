package abcd;

public class PrimeNumber {

        public static void main(String[] args) {
            int flag = 0;
            for (int i = 0; i <= 100; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = flag + 1;
                    }

                }
                if (flag == 0) {
                    System.out.print(i+" ");

                } else {
                    flag = 0;
                }

            }
        }
    }
    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 and 97.

