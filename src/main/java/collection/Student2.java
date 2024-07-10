package collection;

import java.util.Arrays;

public class Student2 {
    private int id;
    private String name;
    private String grade;
    private int[] marks;

    public Student2(int id, String name, String grade, int[] marks) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getSumOfMarks(){
        int sum=0;
        for (int mark:marks){
            sum=sum+mark;
        }
        return sum;
    }
    public int getAvgMarks(){
        int numSub = marks.length;
        int sumOfMarks = getSumOfMarks();
        int avgNum=getSumOfMarks()/numSub;
        return avgNum;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
