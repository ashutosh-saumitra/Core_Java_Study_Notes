package Comparable;

import java.lang.Comparable;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee other) {
        if(this.getAge() < other.getAge())
            return -1;
        else if(this.getAge() > other.getAge())
            return 1;
        else return 0;
    }
}
