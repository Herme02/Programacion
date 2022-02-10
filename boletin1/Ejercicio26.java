package boletin1;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int suma = 0;
		String seguirFinal;
		System.out.println("Para terminar con la suma de los numeros escriba 'final'");
		seguirFinal = scanner.next();
		String finac = "fin";
		
		while (!seguirFinal.equals(finac)) {
			System.out.println("Dime un numero");
			numero = scanner.nextInt();
			suma += numero;
			System.out.println("Para terminar con la suma de los numeros escriba 'final'");
			seguirFinal = scanner.next();
		}
		System.out.println("La suma total de todos los numeros a dado:");
		System.out.println(suma);
		
	}

}
