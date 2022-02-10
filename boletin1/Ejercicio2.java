package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		asignaturaSemanas();

	}
public static void asignaturaSemanas() {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("De que dia de la semna quieres conocer la asignatura:");
	String diaSemana = scanner.next();
	
	if (diaSemana == "Lunes" || diaSemana == "Martes") {
		System.out.println("Tienes PROGRAMACION a primera");
	}if (diaSemana == "Miercoles" || diaSemana == "Jueves" || diaSemana == "Viernes") {
		System.out.println("Tienes BBDD a primera");
	}
}




}
