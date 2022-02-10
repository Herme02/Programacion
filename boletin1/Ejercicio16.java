package boletin1;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		for16(320);
	}
	public static void for16(int numero) {
	for(; numero >= 160; numero--) {
		if(numero % 20 == 0) {
			System.out.println(numero);
		}
	}
	}
}
