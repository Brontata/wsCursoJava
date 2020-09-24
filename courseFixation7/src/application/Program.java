package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employees> list = new ArrayList<>();

		System.out.println("How many employees will be registred?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1));
			System.out.print("Insert employee id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {		//VALIDA SE O ID É REPETIDO
				System.out.println("Id already taken! Try again:");
				id = sc.nextInt();
			}
			System.out.print("Insert name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employees emp = new Employees(id, name, salary);
			list.add(emp);

		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("\nEnter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employees emp : list) {
			System.out.println(emp);
		}
		
		//System.out.println(list.get(0).getId());         //PEGA SOMENTE A ID DO ITEM 0 
		sc.close();
	}

	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
