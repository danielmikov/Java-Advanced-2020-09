package Exercises.Ex12_DefiningClasses.Ex02CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Department> departmentsMap = new HashMap<>();

        int nEntries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nEntries; i++) {
            String[] employeeInfo = scanner.nextLine().split("\\s+");
            //mandatory
            String currentName = employeeInfo[0];
            double currentSalery= Double.parseDouble(employeeInfo[1]);
            String currentPosition= employeeInfo[2];
            String currentDepartment= employeeInfo[3];
            //optional
            String currentEmail= "";
            int currentAge= 0;

            Employee currentEmployee;

            if (employeeInfo.length==6){
                currentEmail = employeeInfo[4];
                currentAge = Integer.parseInt(employeeInfo[5]);

                currentEmployee = new Employee(
                        currentName
                        ,currentSalery
                        ,currentPosition
                        ,currentDepartment
                        ,currentEmail
                        ,currentAge);

            } else if (employeeInfo.length==4){
                currentEmployee = new Employee(
                        currentName
                        ,currentSalery
                        ,currentPosition
                        ,currentDepartment);

            }else{
                try {
                    currentAge = Integer.parseInt(employeeInfo[4]);
                    currentEmployee = new Employee(
                            currentName
                            ,currentSalery
                            ,currentPosition
                            ,currentDepartment
                            ,currentAge);
                } catch (NumberFormatException e){
                    currentEmail = employeeInfo[4];
                    currentEmployee = new Employee(
                            currentName
                            ,currentSalery
                            ,currentPosition
                            ,currentDepartment
                            ,currentEmail);
                }
            }

            departmentsMap.putIfAbsent(currentDepartment, new Department(currentDepartment));
            departmentsMap.get(currentDepartment).getDepartmentEmployees().add(currentEmployee);

        }

        Department departmentMostPaid = departmentsMap
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + departmentMostPaid.getDepartmentName());
        departmentMostPaid
                .getDepartmentEmployees()
                .stream()
                .sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(employee -> System.out.println(employee.getEmployeeInfo()));

    }
}
