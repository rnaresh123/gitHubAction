package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        //declare arrarylist
        // ArrayList al=new ArrayList();
        // ArrayList <Integer>al=new ArrayList<Integer>();
        // ArrayList <String>al=new ArrayList<String>();
        //  List al=new ArrayList();

        ArrayList a = new ArrayList();
        //adding the elements
        a.add(45);
        a.add(76.78);
        a.add("naresh");
        a.add('B');
        a.add(true);
        a.add(768);
        System.out.println(a);
        System.out.println("number odf element in array :" + a.size());
        System.out.println(a.remove(5));
        System.out.println("number odf element in array :" + a.size());
        System.out.println(a.remove("naresh"));
        System.out.println("after removing element from arrary :" + a);
        //insert new element
        a.add(2, "khaja");
        System.out.println("after insertion: " + a);
        //retreive specific element
        System.out.println("retreived element :" + a.get(2));
        //replece element
        System.out.println(a.set(2, "sameer"));
        System.out.println("after replace the element :" + a);
        System.out.println(a.contains("sameer"));


    }
}
