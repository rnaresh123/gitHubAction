package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        //Student s = new Student(20,"naresh","c");
        int[] markss = {35, 35, 35};
        int[] markrsOfnaresh = {78, 72, 70};
        int[] marksOfSameer = {23, 54, 23};


        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(10, "khaja", "c", markss));
        list1.add(new Student(20, "naresh", "c", markrsOfnaresh));
        list1.add(new Student(22, "sameer", "A", new int[]{80, 98, 70}));
        list1.add(new Student(40, "preetam", "A", new int[]{72, 71, 78}));
        list1.add(new Student(43, "Aadesh", "A", new int[]{80, 98, 70}));
        list1.add(new Student(76, "rahul", "D", new int[]{76, 71, 70}));
        list1.add(new Student(65, "Veer", "S", new int[]{72, 71, 78}));
        Map<Double, List<String>> map = new HashMap<>();
        for (Student student : list1) {
            double avgMarks = student.getAvgMarks();
            if (!map.containsKey(avgMarks)) {
                map.put(avgMarks, new ArrayList<>());
            }
//            List<String> values = map.get(sumOfMarks);
//            values.add(student.getName());
            map.get(avgMarks).add(student.getName());
        }
        System.out.println(map);
        System.out.println(list1);

//        for (Student st:list1) {
//            int sumOfMarks = st.getSumOfMarks();
//            if(sumOfMarks >=200){
//                st.setGrade("A");
//            } else if (sumOfMarks>=120 && sumOfMarks<=200) {
//                st.setGrade("B");
//            }else {
//                st.setGrade("C");
//            }
//        }
//        System.out.println(list1);
        for (Student std : list1) {
            double avgMarks = std.getAvgMarks();
            if (avgMarks >= 70.00) {
                std.setGrade("A");
            } else if (avgMarks >= 50.00 && avgMarks <= 70.00) {
                std.setGrade("B");
            } else {
                std.setGrade("C");
            }

        }
        System.out.println(list1);
        List<String> stName = new ArrayList<>();
        for (Student st : list1) {
            double avgMarks = st.getAvgMarks();
            if (avgMarks >= 70.00) {
//                System.out.println(st.getName());
                stName.add(st.getName());
            }
        }
        System.out.println(stName);
    }

    public static List<String> getStudentsName(List<Student> students, String grade) {
        List<String> stdNames = new ArrayList<>();
        for (Student std : students) {
            if (std.getGrade().equalsIgnoreCase(grade)) {
                stdNames.add(std.getName());
            }
        }
        return stdNames;
    }
}
