package codingpractice;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 7, 6, 3};//24
        int n = a.length + 1;
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        int totalSum = n * (n + 1) / 2;  //(56/2)=28
        int missingNumber = totalSum - sum;
        System.out.println("The missing number is: " + missingNumber);

        int missingNum = missingNum(a);
        System.out.println(missingNum);
    }
    public static int missingNum(int[] arr){
        int n = arr.length + 1;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int totalSum = n * (n + 1) / 2;  //(56/2)=28
        int missingNumber = totalSum - sum;
        return missingNumber;
    }
}

