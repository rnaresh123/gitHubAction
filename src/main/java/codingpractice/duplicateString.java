package codingpractice;

public class duplicateString {
    public static void main(String[] args) {
        String[] s={"sameer","naresh","khaja","veer","naresh","veer","preetam"};
        int count = 0;
        for (int i = 0; i <s.length ; i++) {
            for (int j = i+1; j <s.length-1 ; j++) {
                if (s[i]==s[j]){
                    System.out.println(s[j]);
                    count++;
                    break;
                }

            }

        }
       // System.out.println(count);
        duplicateString1(s);
        String d="narasgondabhojgonda";
        repetedCharacter(d);


    }
    public static void duplicateString1(String[] str){
        int count=0;
        for (int i = 0; i <str.length ; i++) {
            for (int j = i+1; j < str.length-1; j++) {
                if (str[i]==str[j]){
                    System.out.println(str[j]);
                    count++;
                    break;

                }

            }

        }
        System.out.println(count);

    }
    public static void repetedCharacter(String str){
        int count=0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
