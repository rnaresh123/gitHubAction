package collection;

public class IndianDefence {
    private int id;
    private String name;
    private String dept;
    private String grade;

    public IndianDefence(int id, String name, String dept, String grade) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "IndianDefence{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

