package objetos.ejercicio2;

import java.util.Scanner;

public class RectanguloMain {

	public static void main(String[] args) {
		
		menu();
		
	}

	public static void menu()  {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Introduzca la longitud: ");
	double longitud = sc.nextDouble();
	System.out.println("Introduzca el ancho: ");
	double ancho = sc.nextDouble();
	
	
	
	Rectangulo rectangulo = new Rectangulo(ancho, longitud);
	
	
System.out.println(rectangulo);
	}
	
	
}
