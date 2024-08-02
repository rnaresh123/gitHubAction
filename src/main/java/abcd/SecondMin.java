package abcd;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr={10,50,70,55,20,90};
        int firstMin=Integer.MIN_VALUE;
        int secondMin=Integer.MIN_VALUE;
        for (int num:arr) {
            if (num<firstMin){
                secondMin=firstMin;
                firstMin=num;
            } else if (num<secondMin && secondMin!=firstMin) {
               secondMin=num;
            }
        }
        System.out.println("second minimum value " +secondMin);
    }
}
