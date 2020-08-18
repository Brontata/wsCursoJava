package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Employee x;
		x = new Employee();
		
		System.out.print("Employee name: " );
		x.name = sc.nextLine();
		System.out.print("Gross salary: " );
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " + x.name + ", $ %.2f%n", x.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.println();
		System.out.printf("Updated data: " + x.name + ", $ %.2f%n", x.netSalary());
		
		sc.close();
	}

}
