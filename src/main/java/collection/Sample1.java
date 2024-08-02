package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample1 {
    public static void main(String[] args) {

        int[] marks = {43, 76, 97, 45, 67, 41};
        int[] nareshMarks = {87, 54, 89, 72, 77, 90};
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(87,"khaja","A",marks));
        list.add(new Student1(78,"naresh","B",nareshMarks));
        list.add(new Student1(20,"veer","C",new int[]{34,43,56,76,45,23}));
        list.add(new Student1(22,"rahul","B",new int[]{34,77,56,76,55,53}));
        list.add(new Student1(24,"aadi","B",new int[]{44,77,99,41,55,60}));
        list.add(new Student1(26,"preetam","C",new int[]{87,77,63,76,27,35}));
        Map<Double,List<String>>map=new HashMap<>();
        for (Student1 student:list) {
            double avgMarks = student.getAvgMarks();
            if (!map.containsKey(avgMarks)){
                map.put(avgMarks,new ArrayList<>());
            }
            map.get(avgMarks).add(student.getName());

        }
        System.out.println(map);
        System.out.println(list);
    }

}
