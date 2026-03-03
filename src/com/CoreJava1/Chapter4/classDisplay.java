package com.CoreJava1.Chapter4;

import java.util.Random;

public class classDisplay {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 4000);
        staff[1] = new Employee(6000);
        staff[2] = new Employee();

        for ( var s :  staff) {
            System.out.println("Name: " + s.getName() + ", Salary: " + s.getSalary()
            + ", ID: " + s.getId());
        }
    }
}

class Employee{
    private static int nextId;

    private String name = "";  //instance field initialization
    private final int id;
    private double salary;

    private static final Random generator = new Random();

    //static initialization block
    static{
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    //three overloaded constructors
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary){
        //calls the Employee(String, double) constructor
        this("Employee #" + nextId, salary);
    }

    //the default constructor
    public Employee(){
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }
}
