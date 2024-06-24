package codingpractice;

public class SwappingOfVowel {
    public static void main(String[] args) {
        String str = "practice";
        char[] chars = str.toCharArray();

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(chars));
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

