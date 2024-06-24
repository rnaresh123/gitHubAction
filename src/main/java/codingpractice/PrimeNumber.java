package codingpractice;

import java.util.HashMap;
import java.util.Map;

public class PrimeNumber {

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

//        String[] arr = {"khaja","narashGonda","sameer"};
//        int maxLength = 0;
//        String maxStr = "";
//        for (String str : arr){
//            if(str.length()>maxLength){
//                maxStr = str;
//                maxLength = str.length();
//            }
//        }
//        System.out.println(maxStr);
        Map<String,Integer>map = new HashMap<>();
        map.put("song1",150);
        map.put("song2",200);
        map.put("song3",300);
        map.put("song4",50);
        //find the song which is played most time
//        int fistMax = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//        String secondMaxSong = "";
//        for(Map.Entry<String,Integer>entry: map.entrySet()){
//            if(entry.getValue() > fistMax){
//                secondMax = fistMax;
//                fistMax = entry.getValue();
//            }else if (entry.getValue() != fistMax && entry.getValue()>secondMax){
//                secondMax = entry.getValue();
//                secondMaxSong = entry.getKey();
//            }
//        }
//        System.out.println(secondMaxSong);
//        int flag = 0;
//        for (int i = 0; i <= 100; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = flag + 1;
//                }
//
//            }
//            if (flag == 0) {
//                System.out.print(i+" ");
//
//            } else {
//                flag = 0;
//            }
//
//        }
    }
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}



