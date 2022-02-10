package cadenas;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println(cadenasUno("locomotora",false));
		
	}
	public static String cadenasUno(String cadena, boolean bandera) {
		
		String cadenaParImpar="";
		
		
		
			if (bandera == true) {
				for(int i=0;i<cadena.length();i+=2) {
				cadenaParImpar+= cadena.charAt(i);
				}
			}else if(bandera == false){
				for(int i=1;i<cadena.length();i+=2) {
				cadenaParImpar+= cadena.charAt(i);
				}
			}

			
				

			
			
			
			
		return cadenaParImpar;
	}
}
