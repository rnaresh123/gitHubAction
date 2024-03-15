package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>m=new HashMap<Integer,String>();
        m.put(101,"naresh");
        m.put(107,"sameer");
        m.put(103,"veer");
        m.put(104,"khaja");
        m.put(105,"sameer");
        m.put(103,"preetam");
        m.put(106,"rahul");
        System.out.println(m);
        System.out.println(m.get(105));
        System.out.println(m.remove(101));
        System.out.println(m);
        System.out.println(m.containsKey(104));//true
        System.out.println(m.containsKey(101));//false
        System.out.println(m.containsValue("preetam"));//true
        System.out.println(m.containsValue("naresh"));//false

        System.out.println(m.isEmpty());//false
        System.out.println(m.keySet());//returns all the keys as set //[103, 104, 105, 107]
        for (Object i:m.keySet()) {
            System.out.println(i);
        }
        System.out.println(m.values());//return all the values as collection //[preetam, khaja, sameer, sameer]
        for (Object i:m.values()) {
            System.out.println(i);
        }
        System.out.println(m.entrySet());// return all the entries as set format //[103=preetam, 104=khaja, 105=sameer, 107=sameer]
//        for (Object i:m.keySet()) {
//            System.out.println(i+" "+m.get(i));
//        }
        for (Map.Entry entry:m.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
