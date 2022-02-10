package cadenas;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println(cifradoCesar(3,"abcdefghijklmnñopqrstuvwyz","z"));

	}
	public static String cifradoCesar(int desplazamiento, String abecedario, String caracter) {
		
		StringBuilder sb = new StringBuilder();
		
		String caracterPosicion= "";
		
		
		for(int i = 0; i < caracter.length(); i++) {
			for(int j = 0; j < abecedario.length();j++) {
				if (caracter.charAt(i)==abecedario.charAt(j)) {
					if(j+desplazamiento > abecedario.length()) {
					caracterPosicion += abecedario.charAt((j+desplazamiento)%27);
				}else {
					caracterPosicion += abecedario.charAt(j+desplazamiento);

				}
			}
		}
		}
		
		return caracterPosicion;
	}

}
