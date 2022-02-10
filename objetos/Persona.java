package objetos;

public class Persona {

	
	private Integer edad;
	private String apellido1;
	
	private String pellido2;
	private String nombre;
	private String dni;
	private double altura;
	private double peso;
	
	private Persona progenitor1;
	private Persona progenitor2;
	
	
	
	
	public Persona(String nombre, String apellido1, String dni) {
		
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.dni = dni;
	}
	
	
	
	
	
	public boolean esHermano(Persona p) {
		return false;
		
	
	}
	
	
	
	
	private String getPellido2() {
		return pellido2;
	}





	private void setPellido2(String pellido2) {
		this.pellido2 = pellido2;
	}





	private Persona getProgenitor1() {
		return progenitor1;
	}





	private void setProgenitor1(Persona progenitor1) {
		this.progenitor1 = progenitor1;
	}





	private Persona getProgenitor2() {
		return progenitor2;
	}





	private void setProgenitor2(Persona progenitor2) {
		this.progenitor2 = progenitor2;
	}
	
	private Integer getEdad() {
		return edad;
	}
	private void setEdad(Integer edad) {
		this.edad = edad;
	}
	private String getApellido1() {
		return apellido1;
	}
	private void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getDni() {
		return dni;
	}
	private void setDni(String dni) {
		this.dni = dni;
	}
	private double getAltura() {
		return altura;
	}
	private void setAltura(double altura) {
		this.altura = altura;
	}
	private double getPeso() {
		return peso;
	}
	private void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
}
