package cadenas;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println(cifradoCesar(2,"abcdefghijklmnñopqrstuvwyz","locomotora"));

	}
	public static String cifradoCesar(int desplazamiento, String abecedario, String cadena) {
		
		StringBuilder sb = new StringBuilder();
		
		String cadenaCesar= "";
		
		for(int i = 0; i < cadena.length(); i++) {
			for(int j = 0; j < abecedario.length();j++) {
				if (cadena.charAt(i)==abecedario.charAt(j)) {
					cadenaCesar += abecedario.charAt(j+desplazamiento);
				}
			}
		}
		
		return cadenaCesar;
	}


}
