package boletin1;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int acumulador = 0;
		
		while (numero >= 0) {
			System.out.println("Dime un numero:");
			numero = scanner.nextInt();
			if(numero>= 0) {
			acumulador++;
			}
		}
		System.out.println("Se han introducido un total de");
		System.out.println(acumulador);
		

	}

}
