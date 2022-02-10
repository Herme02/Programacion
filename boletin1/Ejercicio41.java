package boletin1;

public class Ejercicio41 {

	public static void main(String[] args) {
		
		
		String cadenaPrincipal = "12345";
		String cadenaFinal = "";
		
		for(int i = cadenaPrincipal.length()-1; i >= 0; i--) {
			cadenaFinal += cadenaPrincipal.charAt(i);
		}
		
		System.out.println(cadenaPrincipal);
		System.out.println(cadenaFinal);
		

	}

}
