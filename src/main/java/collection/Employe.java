package collection;

public class Employe {
    private String name;
    private int id;
    private String dept;
    private double salary;
    private String designation;

    public Employe(String name, int id, String dept, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {

        return name;
    }

    public int getId() {

        return id;
    }

    public String getDept() {

        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {

         return designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getAnnivalSalary() {
        double sal = salary;
        return sal;
    }

    public double getSalaryIncrement() {
        double incrSal = getAnnivalSalary() * 1.1;
        return incrSal;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
