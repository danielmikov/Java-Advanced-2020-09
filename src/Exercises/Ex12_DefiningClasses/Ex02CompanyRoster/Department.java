package Exercises.Ex12_DefiningClasses.Ex02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> departmentEmployees;

    public Department(String departmentName){
        this.departmentName = departmentName;
        this.departmentEmployees = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Employee> getDepartmentEmployees() {
        return this.departmentEmployees;
    }

    public double getAverageSalary(){
        return this.departmentEmployees
                .stream().mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }
}
