package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime una hora");
		int hora = scanner.nextInt();
		
		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos dias");
		}else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		}else if (hora >= 21 && hora <= 5) {
			System.out.println("Buenas noches");
		}
	}

}
