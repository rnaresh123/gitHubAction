package abcd;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        String str = "naresh bidar raipalle karanji aurad bidar karanji bidar";
        String s = stringReplace(str, "bidar", "bangalore", 2);
        System.out.println(s);

    }

    public static String stringReplace(String input, String target, String replace, int occurance) {
        String[] split = input.split(" ");
        int count=0;
        for (int i = 0; i < split.length; i++) {

            if (split[i]==target){
                count++;
            }
            if(count==occurance){
                split[i]=replace;
                break;
            }

        }
        return new String(Arrays.toString(split));
    }
}
