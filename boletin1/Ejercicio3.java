package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	System.out.println(tipoDeCaracter('('));
	}

	public static String tipoDeCaracter(char caracter) {
		String mensaje = "";
		String signoPuntuacion = ".;:";
		String blanco = " ";
		String llavesParentesis = "(){}";
	
		if (Character.isUpperCase(caracter)) {
			mensaje = "El caracter esta en mayúscula";
			
		}else if (Character.isLowerCase(caracter)) {
			mensaje = "El caracter esta en minúscula";
			
		}else if (Character.isDigit(caracter)) {
			mensaje = "El caracter es un número";
			
		}else if (signoPuntuacion.indexOf(caracter) != -1) {
			mensaje = "El caracter es un signo de puntuación";
			
		}else if (blanco.indexOf(caracter) != -1) {
			mensaje = "El caracter es un espacio en blanco";
			
		}else if (llavesParentesis.indexOf(caracter) != -1) {
			mensaje = "El caracter lleva una llave o un parentesis";
			
		}
		
		return mensaje;
	}
	
	
	
}
