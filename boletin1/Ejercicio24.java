package boletin1;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		
		numeroMayor(10);

	}
	public static void numeroMayor(int cantidad) {
		Scanner scanner = new Scanner(System.in);
		int contador = 1;
		
		System.out.println("Dime un numero");
		int numero = scanner.nextInt();
		int Mayor = numero;
		
		while (contador < cantidad) {
			System.out.println("Dime un numero");
			numero = scanner.nextInt();
			if (numero > Mayor) {
				Mayor = numero;
			}
			contador++;
			
		}
		System.out.println("EL MAYOR NUMERO A SIDO:");
		System.out.println(Mayor);
		
	}

}
