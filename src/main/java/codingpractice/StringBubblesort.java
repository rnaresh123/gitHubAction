package codingpractice;

public class StringBubblesort {
    public static void main(String[] args) {
        String str = "racecer";
        boolean flag = true;
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                flag = false;
                //System.out.println("it is not palindrome");
                break;
            }
        }
        if (flag == true) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }
    }
}
