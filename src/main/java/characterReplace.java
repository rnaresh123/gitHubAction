public class characterReplace {
    public static void main(String[] args) {
        String str="NARASGONDA";
        String output = characterReplace(str, 'A', 'K', 3);
        System.out.println(str);
        System.out.println(output);

    }
    public static String characterReplace(String input, char target, char replace, int occurance){
        char[] chars = input.toCharArray();
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==target){
                count++;
            }
            if(count==occurance){
                chars[i]=replace;
                break;
            }

        }
        return new String(chars);
    }
}

