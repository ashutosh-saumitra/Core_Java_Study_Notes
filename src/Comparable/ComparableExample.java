package Comparable;

import java.util.Arrays;

public class ComparableExample {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Sachin Oraon", 28);
        employees[1] = new Employee("Guddu", 24);
        employees[2] = new Employee("Oraon", 26);
        Arrays.sort(employees);
    }
}
