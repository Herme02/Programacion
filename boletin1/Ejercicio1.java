package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		multiplos();
		
	}
	
public static void multiplos() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Dime un numero");
	int num1 = scanner.nextInt();
	System.out.println("Dime otro numero");
	int num2 = scanner.nextInt();
	
boolean resul = true;

	if (num1 % num2 == 0 || num2 % num1 == 0) {
		System.out.println(resul);
	}
	
	if (num1 % num2 != 0 && num2 % num1 != 0) {
		resul = false;
		System.out.println(resul);
	}
	
	
}
}
