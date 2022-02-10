package objetos.ejercicio1;

import java.util.Scanner;

public class AvionMain {
	
	public static void main(String[] args) {


		Avion jumbo = crearAvionConMenu();

		//capacidad 120
		
		jumbo.asignarVuelo(100, 10000); 	// nvuelos = 1, kmTotales = 10000
		jumbo.asignarVuelo(10, 5000);		// nvuelos = 2, kmTotales = 15000
		jumbo.asignarVuelo(150, 6000);		// nvuelos = 2, kmTotales = 15000
		jumbo.asignarVuelo(110, 6000);		// nvuelos = 3, kmTotales = 21000
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona opción:");
		System.out.println("a. Asignar vuelo");
		System.out.println("b. Obtener el número de vuelos");
		System.out.println("c. Obtener el total de kilómetros volados");
		System.out.println("d. Obtener la media de kilómetros por vuelo");
		System.out.println("e. Cambio de compañia");
		System.out.println("f. Mostrar informacion del avion");




		
		String opcion = sc.nextLine();
		if(opcion.equalsIgnoreCase("a")) {
			//asignar vuelo
			System.out.println("Cuantos pasajeros viajan en este vuelo?");
			int pasajeros = sc.nextInt();
			System.out.println("Cuantos kilometros recorre en este vuelo?");
			int kms = sc.nextInt();
			
			
			if(jumbo.asignarVuelo(pasajeros, kms)) {
				System.out.println("Vuelo asignado correctamente");
			}else {
				System.out.println("El numero de pasajeros excede la capacidad del avion");
			}
			
			
		}else if(opcion.equalsIgnoreCase("b")) {
			System.out.println(jumbo.getNumVuelos());
			
		}else if(opcion.equalsIgnoreCase("c")) {
			System.out.println(jumbo.getKmVolados());
			
		}else if(opcion.equalsIgnoreCase("d")) {
			System.out.println(jumbo.getMediaKms());
		}
		
		
		System.out.println(jumbo);
		
		
	}
	
	public static Avion crearAvionConMenu() {
		System.out.println("MENÚ CREACIÓN DE AVIÓN: \n"
					+ "1. Crear avión sólo con el identificador.\n"
					+ "2. Crear avión con el identificador y la compañía.\n"
				+ "###############################");
		
		int capacidad=0;
		Avion avionCreado = null;
				
		Scanner sc = new Scanner(System.in);
		int op = Integer.valueOf(sc.nextLine());
		
		if(op==1) {
			System.out.println("Introduzca el identificador del avión: ");
			String identificador = sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(identificador, capacidad);
			
		}else if(op==2) {
			System.out.println("Introduzca el identificador del avión: ");
			String identificador = sc.nextLine();
			System.out.println("Introduzca el nombre de la compañía: ");
			String compania = sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(identificador, compania, capacidad);
			

			
		}else {
			System.out.println("La opción seleccionada no es correcta");
		}
		capacidad = 3;
		
		return avionCreado;
	}
	

	
	
}
