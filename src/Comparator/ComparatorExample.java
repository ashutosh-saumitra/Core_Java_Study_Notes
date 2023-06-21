package Comparator;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ComparatorExample {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Sachin Oraon", 28);
        employees[1] = new Employee("Guddu", 24);
        employees[2] = new Employee("Oraon", 26);
        List<Employee> employeeList = Arrays.asList(employees);
        Collections.sort(employeeList, new EmpCompareByAge());
        employeeList.sort(new EmpCompareByAge());
        Arrays.sort(employees, new EmpCompareByAge());
        for (Employee e : employees){
            System.out.println(e.getName() + ", " + e.getAge());
        }
    }
}
