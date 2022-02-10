package boletin1;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		multiplos5DoWhile(5);
	}
	public static void multiplos5DoWhile(int numero) {
		do {
			if(numero % 5 == 0) {
				System.out.println(numero);
			}
			numero++;
		}while(numero <= 100);
	}
}
