package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Room[] vect = new Room[9];

		System.out.println("How many rooms will be rented?");
		int rooms = sc.nextInt();
		int number;
		for (int i = 0; i < rooms; i++) {
			sc.nextLine();
			System.out.println("Rent: #"+(i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			number = sc.nextInt();
			vect[number-1] = new Room(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vect.length; i++) {		
			if(vect[i] != null) {
			System.out.print((i+1) +": ");
			System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
