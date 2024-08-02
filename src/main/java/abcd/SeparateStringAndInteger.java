package abcd;

import java.util.ArrayList;
import java.util.List;

public class SeparateStringAndInteger {
    public static void main(String[] args) {
        Object[] array = {"apple", 10, "banana", 20, 30, "cherry", "date", 40};

        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();

        for (Object element : array) {
            if (element instanceof String) {
                stringList.add((String) element);
            } else if (element instanceof Integer) {
                intList.add((Integer) element);
            }
        }

        System.out.println("Strings: " + stringList);
        System.out.println("Integers: " + intList);
    }
}
