package boletin1;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuantos sueldos quieres que te sume");
		int cantidad = scanner.nextInt();
		int contador = 0;
		int contador1000 = 0;
		int suma = 0;
		
		while (contador < cantidad) {
			System.out.println("Dime un numero");
			int numero = scanner.nextInt();
			suma += numero;
			if (numero > 1000) {
				contador1000++;
			}
			contador++;
		}
		System.out.println("Ha habido un total de " +contador1000 +" sueldos superiores a 100 euros");

	}

}
