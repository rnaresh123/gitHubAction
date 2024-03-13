package codingpractice;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 7, 6, 3};
        int n = a.length + 1;
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        int totalSum = n * (n + 1) / 2;
        int missingNumber = totalSum - sum;
        System.out.println("The missing number is: " + missingNumber);
    }
}

