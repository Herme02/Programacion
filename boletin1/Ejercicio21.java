package boletin1;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		numPositivos(10);

	}
	
	public static void numPositivos(int cantidad) {
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		int acumulador = 0;
		
		while (contador < cantidad) {
			System.out.println("Dime un numero:");
			int numero = scanner.nextInt();
				if(numero >= 0) {
					acumulador += numero;
					contador++;
				}else {
					System.out.println("Numero introducido no valido, por favor repitalo");
				}
				
		}
		System.out.println(acumulador);
	}
}
