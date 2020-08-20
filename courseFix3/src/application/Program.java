package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student x;
		x = new Student();

		System.out.print("Student name: ");
		x.name = sc.nextLine();
		System.out.println("Insert the three grades: ");
		x.n1 = sc.nextDouble();
		x.n2 = sc.nextDouble();
		x.n3 = sc.nextDouble();

		System.out.printf("Final grade: %.2f%n", x.finalGrade());
		sc.close();

		System.out.println(x.passedOn());
	}

}
