package Comparator;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.Integer;
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
        //lambda form 1
        Arrays.sort(employees, (e1, e2) -> {
            if(e1.getAge() < e2.getAge())
                return -1;
            else if(e1.getAge() > e2.getAge())
                return 1;
            else
                return 0;
        });
        //lambda form 2
        Arrays.sort(employees, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        //using Comparator.comparingInt
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        for (Employee e : employees){
            System.out.println(e.getName() + ", " + e.getAge());
        }
    }
}
