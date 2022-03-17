package modelo;

public class Asiento {
	private int numAsiento;
	private char letra;
	private boolean disponibilidad=true;
	
	
	public Asiento() { 
		
	}
	public Asiento(int numAsiento, char letra) {
		this.numAsiento = numAsiento;
		this.letra = letra;
		
	}

	
	public Asiento(int numAsiento, char letra, boolean disponibilidad) {
		this.numAsiento = numAsiento;
		this.letra = letra;
		this.disponibilidad=disponibilidad;
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	public char getLetra() {
		return letra;
	}

	

	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	public String asientoEnCadena() {
		return  letra +""+ numAsiento;
	}

	@Override
	public String toString() {
		return  letra +""+ numAsiento +"-";
	}
	
	
	
}