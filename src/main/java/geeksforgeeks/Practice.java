package geeksforgeeks;

public class Practice
    {
        public static void main(String[] args) {
            String s="practice";
            System.out.println(modify(s));
        }
       static String modify (String s)
        {
            // your code here
            char[] chars = s.toCharArray();
            int i = 0, j = chars.length - 1;
            String vowels = "aeiouAEIOU";

            while (i < j) {
                while (i < j && !vowels.contains(chars[i] + ""))
                    i++;
                while (i < j && !vowels.contains(chars[j] + ""))
                    j--;

                if (i < j) {
                    chars[i] = chars[j];
                    char temp = chars[i];
                    chars[j] = temp;
                    i++;
                    j--;
                }
            }

            return new String(chars);
        }
}
