package boletin1;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		doWhile18(320);
	}
	public static void doWhile18(int numero) {
		do {
			if(numero % 20 == 0) {
			System.out.println(numero);
			}
			numero--;
		}while(numero >= 160);
			
		}
	}

