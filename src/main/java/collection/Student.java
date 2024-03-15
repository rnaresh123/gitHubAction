package collection;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String grade;
    private int[] marks;

    public Student(int id, String name, String grade, int[] marks) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }
    public int getSumOfMarks(){
        int sum = 0;
        for (int mark:marks) {
            sum = sum+mark;
        }
        return sum;
    }
    public double getAvgMarks(){
        int noOfSub = marks.length;
        int sumOfMarks = getSumOfMarks();
        double avg=sumOfMarks/noOfSub;
        return avg;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
