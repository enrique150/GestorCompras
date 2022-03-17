package modelo;

import java.util.ArrayList;

public class Avion {
	ArrayList<Asiento> asientos=new ArrayList<Asiento>();
	
	public Avion() {
		crearAsientos();
	}
	
	public Avion(ArrayList<Asiento> asientos) {
		this();
		this.asientos = asientos;
		
	}
	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}
	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	
	public void crearAsientos() {
		asientos.clear();
		for(int i=0; i<28;i++) {
			Asiento asiento=new Asiento();
			
			if(i<7) {
				asiento.setLetra('A');
				asiento.setNumAsiento(i+1);
			}
			else if(i>=7&& i<14) {
				asiento.setLetra('B');
				asiento.setNumAsiento((i+1)-7);
			}
			else if(i>=14 && i<21) {
				asiento.setLetra('C');
				asiento.setNumAsiento((i+1)-14);
			}
			else if(i>=21 && i<28) {
				asiento.setLetra('D');
				asiento.setNumAsiento((i+1)-21);
			}
			asientos.add(asiento);
		}
		
	}
	public int buscarAsiento(String textoAsiento) {
		int ind=-1;
		for(int i=0;i<28;i++) {
			if(this.asientos.get(i).asientoEnCadena().equals(textoAsiento))
				ind=i;
		}
		
		return ind;
	}
	


}