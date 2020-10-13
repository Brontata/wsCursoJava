package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle x;
		x = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		System.out.printf("Area: %.2f%n", x.area());
		System.out.printf("Perimeter: %.2f%n", x.perimeter());
		System.out.printf("Diagonal: %.2f%n", x.diagonal());
		System.out.println("Hello World!");
		sc.close();
	}

}
