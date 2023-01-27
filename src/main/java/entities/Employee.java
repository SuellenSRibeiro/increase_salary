package entities;

public class Employee {
    public String name;
    public double salary;
    public double tax;
    public double percentage;

    public double NetSalary(){
        return salary - tax;
    }
    public double IncreaseSalary(){
        return salary + (0.001 * percentage * salary);
    }
}




