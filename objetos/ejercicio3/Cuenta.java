package objetos.ejercicio3;

public class Cuenta {
	
	//Atributos
	
	private Double saldo;
	private int contadorIngresos;
	private int contadorReintegros;
	
	
	public Cuenta(Double saldoInicial) {
		this.saldo = saldoInicial;
		
	}


	private Double getSaldoInicial() {
		return saldo;
	}


	private void setSaldoInicial(Double saldoInicial) {
		this.saldo = saldoInicial;
	}


	private int getContadorIngresos() {
		return contadorIngresos;
	}


	private void setContadorIngresos(int contadorIngresos) {
		this.contadorIngresos = contadorIngresos;
	}


	private int getContadorReintegros() {
		return contadorReintegros;
	}


	private void setContadorReintegros(int contadorReintegros) {
		this.contadorReintegros = contadorReintegros;
	}
	

}
