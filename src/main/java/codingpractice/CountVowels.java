package codingpractice;

public class CountVowels {

        public static void main(String[] args) {
            String str = "NareshRaipalle";
            int vowelCount = countVowels(str);
            System.out.println("Number of vowels in the string: " + vowelCount);
        }

        public static int countVowels(String str) {
            int count = 0;
            str = str.toLowerCase(); // Convert the string to lower case to handle both upper and lower case letters
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (isVowel(ch)) {
                    count++;
                }
            }
            return count;
        }

        public static boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }

