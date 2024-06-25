package abcd;

public class practicee {
    public static void main(String[] args) {

        String str = "RETYURACECARIUY";
        String abc = "";
        String longpalli = "";
        int maxlen = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                abc = str.substring(i, j);
                String bf = new StringBuffer(abc).reverse().toString();
                if (bf.equalsIgnoreCase(abc) && maxlen < abc.length()) {
                    longpalli = abc;
                    maxlen = abc.length();
                }
            }

        }
        System.out.println(longpalli);

    }
}


