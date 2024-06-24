package codingpractice;

public class PracticePrm {

    public static void duplicateCharacter(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[j]);
                    break;

                }

            }

        }

    }

    public static void main(String[] args) {
        String str = "automation";
        duplicateCharacter(str);
    }
}


