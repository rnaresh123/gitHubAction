package codingpractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class PracticePrm {
    public static void main(String[] args) {
        int arr[]={2,4,1,7,4,8,9,5};
        int firstmax=-1;
        int secondmax=-1;
        for(int a:arr){
            if (firstmax<a){
                secondmax=firstmax;
                firstmax=a;
                
            } else if (a>secondmax && a!=firstmax) {
                secondmax=a;
            }
        }
        System.out.println(secondmax);
    }
    }





