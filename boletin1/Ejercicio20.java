package boletin1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		
		System.out.println("Cuantos numeros quieres:");
		int cantidad = scanner.nextInt();
		
		while (contador < cantidad) {
			System.out.println("Dime un numero");
			int numero = scanner.nextInt();
			if (numero % 3 == 0) {
				System.out.println("Es multiplo de 3");
				contador++;
			}else {
				System.out.println("No es multiplo de 3");
				contador++;
			}
		}

	}

}
