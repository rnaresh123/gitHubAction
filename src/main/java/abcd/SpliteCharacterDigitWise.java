package abcd;

public class SpliteCharacterDigitWise {
    public static void main(String[] args) {
        String str = "auto150pi123n t5e3s5a100";//......150

        String[] parts = str.split("\\D+");
        int sum = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }
        System.out.println("Sum of all numbers in the string: " + sum);
    }
}
