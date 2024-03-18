package collection;

import java.util.ArrayList;
import java.util.List;

public class IndianDefenceSample {
    public static void main(String[] args) {
        List<IndianDefence> defences = new ArrayList<>();
        defences.add(new IndianDefence(786, "naresh", "militry", "A"));
        defences.add(new IndianDefence(788, "Khaja", "Navy", "S"));
        defences.add(new IndianDefence(980, "Sameer", "BSF", "F"));
        defences.add(new IndianDefence(875, "Preetam", "Comm", "D"));
//        for (IndianDefence defence : defences) {
//            if (defence.getId() == 786 || defence.getId() == 787 ) {
//                String name = defence.getName();
//                System.out.println(name);
//            }else {
//                System.out.println("ho");
//            }
//        }
        for (IndianDefence defence:defences) {
            if(defence.getGrade().equalsIgnoreCase("S")){
                defence.setName("rahul");
            }

        }
        System.out.println(defences);

    }
}
