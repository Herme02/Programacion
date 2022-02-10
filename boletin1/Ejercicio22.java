package boletin1;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		while (numero >= 0) {
			System.out.println("Dime un numero y te dire su raiz:");
			numero = scanner.nextInt();
			if(numero>= 0) {
			int raizCuadrada = numero * numero;
			System.out.println(raizCuadrada);
			}
		}

	}

}
