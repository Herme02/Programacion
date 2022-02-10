package boletin1;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int contadorNum = 0;
		int mayor = 0;
		int acumulador = 0;
		int contadorNeg = 0;
		
		while(numero >= 0) {
			System.out.println("Dime un numero positivo");
			numero= scanner.nextInt();
			if (numero >=0) {
				contadorNum++;
				if(numero % 2 == 0) {
					if (numero > mayor) {
						mayor = numero;
					}
					
				}else {
					acumulador += numero;
					contadorNeg ++;
				}
				
			}
		}
		System.out.println("Numeros introducidos:");
		System.out.println(contadorNum);
		System.out.println("La media de los numeros negativos da un total de:");
		double media = acumulador / contadorNeg;
		System.out.println(media);
		System.out.println("El mayor numero de los pares a sido el:");
		System.out.println(mayor);
		

	}

}
