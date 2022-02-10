package boletin1;

public class Ejercicio28 {

	public static void main(String[] args) {
		
		fibonacci(5);
		
	}
	
	public static void fibonacci(int numero) {
		
		int fiboPrevio = 0;
		int fiboActual = 1;
		int tmp;
		
		for(int i = 1; i <= numero; i++) {
			if (i == 1) {
				System.out.println(fiboPrevio);
			}else{
				tmp = fiboActual;
				fiboActual += fiboPrevio;
				System.out.println(fiboActual);
				fiboPrevio = tmp;
			}
		}
	}

}
