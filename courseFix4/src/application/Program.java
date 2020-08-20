package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do dolar: ");
		double real = sc.nextDouble();

		System.out.print("Insira quantos dólares você quer comprar: ");
		double dolar = sc.nextDouble();

		System.out.printf("Custará: R$ %.2f%n", CurrencyConverter.toBRL(dolar, real));

		sc.close();
	}

}
