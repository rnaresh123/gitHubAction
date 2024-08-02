package abcd;


import java.util.*;

public class practicee {
    public static void main(String[] args) {
    Object[] arrays={"apple","banana","grapes",2,6,12};
    List<Integer>integerList=new ArrayList<>();
    List<String>stringList=new ArrayList<>();
        for (Object element:arrays) {
            if (element instanceof String){
                stringList.add((String) element);
            } else if (element instanceof Integer) {
                integerList.add((Integer) element);
            }
        }
        System.out.println(integerList);
        System.out.println(stringList);
    }
}




