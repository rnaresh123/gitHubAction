package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample2 {
    public static void main(String[] args) {
        int[] marks = {42, 48, 98, 76, 56, 78, 65};
        int[] nareshMarks = {35, 98, 78, 65, 55, 45, 88};
        List<Student2> list = new ArrayList<>();
        list.add(new Student2(30, "khaja", "A", marks));
        list.add(new Student2(32, "naresh", "A", nareshMarks));
        list.add(new Student2(34, "sameer", "B", new int[]{56, 98, 78, 65, 45, 55, 35}));
        list.add(new Student2(33, "veer", "C", new int[]{56, 77, 78, 25, 65, 32, 18}));
        list.add(new Student2(34, "aadi", "D", new int[]{22, 92, 33, 65, 50, 55, 47}));
        list.add(new Student2(35, "rahul", "E", new int[]{29, 18, 78, 35, 45, 55, 72}));

        Map<Double, List<String>> map = new HashMap<>();
        for (Student2 student : list) {
            double avgMarks = student.getAvgMarks();
            if (!map.containsKey(avgMarks)) {
                map.put(avgMarks, new ArrayList<>());
            }
            map.get(avgMarks).add(student.getName());
        }
        System.out.println(map);
        System.out.println(list);


    }
}
