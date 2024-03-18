package collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeSample {
    public static void main(String[] args) {
        List<Employe> emp = new ArrayList<>();
        emp.add(new Employe("naresh", 789, "IT", 10000, "QA"));
        emp.add(new Employe("khaja", 56, "IT", 200000, "Developer"));
        emp.add(new Employe("Sameer", 567, "DRDO", 45678, "lead"));
        emp.add(new Employe("preetam", 87675, "Mech", 7876, "production engg"));
        System.out.println(emp);
        for (Employe e : emp) {
            if (e.getDept().equalsIgnoreCase("IT")) {
                double salaryIncrement = e.getSalaryIncrement();
                e.setSalary(salaryIncrement);
            }
        }
        System.out.println(emp);
        List<String> empName = new ArrayList<>();
        for (Employe e : emp) {
            if (e.getDept() != "IT") {
//                String name = e.getName();
//                System.out.println(name);
                empName.add(e.getName());
            }
        }
        System.out.println(empName);
        for (Employe e : emp) {
            if (e.getDesignation().equalsIgnoreCase("QA") && e.getName().equalsIgnoreCase("naresh")) {
                e.setDesignation("scrumMaster");
            }
        }
        System.out.println(emp);
        List<String> nonItEmpName = getNonItEmpName(emp);
        System.out.println(nonItEmpName);
        changeTheDesignation(emp, "khaja", "developer lead");
        System.out.println(emp);
    }

    public static List<String> getNonItEmpName(List<Employe> employes) {
        List<String> empName = new ArrayList<>();
        for (Employe emp : employes) {
            if (emp.getDept() != "IT") {
                empName.add(emp.getName());
            }
        }
        return empName;
    }

    public static void changeTheDesignation(List<Employe> employes, String empName, String newDesignation) {
        //List<String> designation = new ArrayList<>();
        for (Employe emp : employes) {
            if (emp.getName().equalsIgnoreCase(empName)) {
                emp.setDesignation(newDesignation);
            }

        }

    }
}
