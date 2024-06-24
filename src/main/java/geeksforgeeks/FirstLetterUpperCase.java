package geeksforgeeks;

public class FirstLetterUpperCase {

        public static void main(String[] args) {
            String s="i love programming";
            System.out.println(transform(s));
        }
        public static String transform(String s)
        {
            String[] str = s.split(" ");
            StringBuilder bf=new StringBuilder();
            for (int i = 0; i < str.length ; i++) {
                String s1 = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
                bf.append(s1+" ");

            }
            return bf.toString();



        }
    }

