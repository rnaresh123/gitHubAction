package codingpractice;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int a = 370;
        int b = 0;
        int c = a;
        while (a != 0) {
            int rem = a % 10;
            b = b + rem * rem * rem;
            a = a / 10;
        }
        if (b==c){
            System.out.println("its arm strong number");
        }else {
            System.out.println("its not a armstrong number");
        }
        int num=371;
        boolean armStrongNumber = isArmStrongNumber(num);
        if (armStrongNumber==true){
            System.out.println("its Arm strong number");
        }else{
            System.out.println("its not arm strong number");
        }
    }
    public static boolean isArmStrongNumber(int no){
        int b = 0;
        int c = no;
        while (no != 0) {
            int rem = no % 10;
            b = b + rem * rem * rem;
            no = no / 10;
        }
        if (b==c){
            return true;
        }

        return false;
    }
}
