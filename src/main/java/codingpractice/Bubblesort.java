package codingpractice;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {

        int[] arr = {12, 54, 34, 65, 46, 21, 69, 32};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length-1 ; j++) {
                if (arr[i]>arr[j]){
                   int temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
                }

            }

        }
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//
//        }
        System.out.println(Arrays.toString(arr));
    }
}
