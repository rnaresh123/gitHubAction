package collection;

import java.util.Arrays;

public class Student1 {
    private int id;
    private String name;
    private String grade;
    private int[] marks;

    public Student1(int id, String name, String grade, int[] marks) {
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

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getSumMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;
    }

    public double getAvgMarks() {
        int noOfSub = marks.length;
        int sumMarks = getSumMarks();
        double avgmarks = sumMarks / noOfSub;
        return avgmarks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
