package abcd;

public class Sample11 {
    public static void main(String[] args) {
        String str = "maduam";
        if (isPallidrome(str)){
            System.out.println("Its pallidrome");
        }else{
            System.out.println("its not pallidrome");
        }
    }

    public static boolean isPallidrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}

