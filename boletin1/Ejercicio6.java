package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dia;
		int mes;
		
		System.out.println("Dia:");
		dia = scanner.nextInt();
		System.out.println("Mes:");
		mes = scanner.nextInt();
		
		if ((dia >= 20 && mes >= 3)&&(dia <= 21 && mes <= 6)) {
			System.out.println("Primavera->20º");
		}else if ((dia >= 21 && mes >= 6)&&(dia < 23 && mes <= 9)) {
			System.out.println("Verano->24º");
		}else if ((dia >= 23 && mes >= 9)&&(dia < 21 && mes <= 12)) {
			System.out.println("Otoño->19º");
		}else if ((dia >= 21 && mes >= 12)&&(dia < 20 && mes <= 3)) {
			System.out.println("Invierno->19º");
		}
		
	}

}
