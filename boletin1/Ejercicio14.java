package boletin1;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		multiplo5While(5);
	}
	public static void multiplo5While(int numero) {
		while(numero <= 100) {
			if(numero % 5 == 0) {
				System.out.println(numero);
			}
			numero++;
		}
		
	}
}
