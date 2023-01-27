package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter name, gross salary and tax of the employee: ");
        employee.name = sc.nextLine();
        employee.salary = sc.nextDouble();
        employee.tax = sc.nextDouble();

        System.out.println(employee.name + ",");
        System.out.printf("$ %.2f%n", employee.NetSalary());
        System.out.println("Which percentage to increase salary");
        employee.percentage = sc.nextDouble();

        System.out.printf("Update data: %s, $ %.2f",employee.name, employee.IncreaseSalary());
    }
}
