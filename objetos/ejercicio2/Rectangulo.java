package objetos.ejercicio2;

public class Rectangulo {

	
	//Atributos
		private Double longitud = 1.0;
		private Double ancho = 1.0;
		
		
	//Constructores
		
		public Rectangulo(double longitud, double ancho) {
			setAncho(ancho);
			setLongitud(longitud);

		}
		
		
	//Metodos
		
		public Double calcularPerimetro() {
		Double resultado = 0.0;
		resultado =	2*(this.ancho + this.longitud);
		return resultado;
		}
		
		
		public Double calcularArea() {
			Double resultado2 = 0.0;
			resultado2 =this.ancho * this.longitud;
			return resultado2;
			}
		
		
		
		
	//Setters , Getters
		
		public Double setAncho(Double ancho) {
			if(ancho > 0 && ancho < 20) {
				this.ancho = ancho;
			}else {
				System.out.println("El valor introducido no es valido");
			}
			
			return ancho;
		}
		
		public Double setLongitud(Double longitud) {
			if(longitud > 0 && longitud < 20) {
				this.longitud = longitud;
			}else {
				System.out.println("El valor introducido no es valido");

			}
			return longitud;
		}
		public Double getLongitud() {
			return longitud;
		}
		public Double getAncho() {
			return ancho;
		}
		
		
		
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("El ancho del rectangulo es: ");
			sb.append(getAncho());
			sb.append(" y su longitud es: ");
			sb.append(getLongitud());
			sb.append("\n");
			sb.append(". Su perimetro es: ");
			sb.append(calcularPerimetro());
			sb.append(" y su area es: ");
			sb.append(calcularArea());


			return sb.toString();
		}
		
		
		
		
		
}
