package codingpractice;

public class CharacterCount {
    public static void main(String[] args) {
        String str="NARASGONDA BHOJGONDA";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='A'|| str.charAt(i)=='O'){
                count++;
            }

        }
        System.out.println(count);
        int[] a={2,3,4,6,9,6};
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum= sum+a[i];
        }
        System.out.println(sum);

        int sum1 = arrarySum(a);
        System.out.println(sum1);
    }
    public  static int arrarySum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }

}
