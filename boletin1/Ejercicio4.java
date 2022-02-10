package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	
	public static final int NOTA_MINIMA = 0;
	public static final int NOTA_MAXIMA = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
	    double nPrac =-1;
		do {
			System.out.println("Introduzca la nota práctica: ");
			nPrac = Double.valueOf(scanner.next());
			
		}while(nPrac < NOTA_MINIMA || nPrac > NOTA_MAXIMA);
		
		
		double nProb =-1;
		do {
			System.out.println("Introduzca la nota de problemas: ");
			nProb = Double.valueOf(scanner.next());
			
		}while(nProb < NOTA_MINIMA || nProb > NOTA_MAXIMA);
		
		double nTeoria =-1;
		do {
			System.out.println("Introduzca la nota de teoría: ");
			nTeoria = Double.valueOf(scanner.next());
			
		}while(nTeoria < NOTA_MINIMA || nTeoria > NOTA_MAXIMA);
		
		System.out.println(calcularNotaPonderada(nPrac, nProb, nTeoria));
		
		
	}
	
	

	
	/**
	 * Este método calcula la <b>puntuación o nota ponderada </b> de un alumno
	 * Si el valor introducido no es correcto [0,10] aparece un mensaje 
	 * de error
	 * @param nPractico Nota de la parte práctica
	 * @param nProblema Nota de la parte de problemas
	 * @param nTeorica Nota de la parte teórica
	 * @return Devuelve la puntación o nota ponderada, -1 si los datos son incorrectos
	 */
	public static double calcularNotaPonderada(double nPractico, 
			double nProblema, double nTeorica){
		
			double resultado = -1;
		
			if(esNotaValida(nPractico) && esNotaValida(nProblema) &&
					esNotaValida(nTeorica)) {
				
				resultado = 0.1*nPractico + 0.5*nProblema + 0.4*nTeorica;
			}else {
				System.out.println("Las notas introducidas no son correctas. ");
			}
	
		return resultado;
	}

	/**
	 * Comprueba que las notas introducidas se encuentran en un rango válido,
	 *  calcula la media de estas notas y devuelve el tipo de calificación
	 * @param n1 Primera nota
	 * @param n2 Segunda nota
	 * @param n3 Tercera nota
	 * @return Calificación del estudiante: Insuficiente, Suficiente, Notable, Sobresaliente
	 */
	public static String calcularCalificacion(double n1, double n2, double n3) {
		double media = -1;
		
		if(esNotaValida(n1) && esNotaValida(n2) &&	esNotaValida(n3)) {
			media = (n1 + n2 + n3)/3;
		}
		String calificacion = "";
		
		if(media <0) {
			calificacion = "Las notas introducidas no son correctas";
		}else if(media < 5) {
			calificacion = "Insuficiente";
		}else if(media <7) {
			calificacion = "Suficiente";
		}else if(media <9) {
			calificacion = "Notable";
		}else {
			calificacion = "Sobresaliente";
		}
		
		return calificacion;
	}
	
	
	public static boolean esNotaValida(double nota) {
		return NOTA_MINIMA<=nota && nota<=NOTA_MAXIMA;
	}

	}


