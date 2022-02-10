package boletin1;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		numDoWhile(100);
	}
	public static void numDoWhile(int numero) {
		do {
			System.out.println(numero);
			numero--;
		}while(numero >= 1);
	}
}
