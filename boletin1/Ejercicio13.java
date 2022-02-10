package boletin1;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		multiplo5For(5);
	}
	public static void multiplo5For(int numero) {
		for(; numero <= 100; numero++) {
			if (numero % 5 == 0){
				System.out.println(numero);
			}
		}
	}
}
