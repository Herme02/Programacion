package boletin1;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		while17(320);
	}
	public static void while17(int numero) {
		while(numero >= 160) {
			if(numero % 20 == 0) {
				System.out.println(numero);
			}
			numero--;
		}
	}
}
