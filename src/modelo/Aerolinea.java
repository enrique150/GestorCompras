package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aerolinea {
	private ArrayList<Calendar> fechas= new ArrayList<Calendar>();
	private ArrayList<Calendar> fechasV= new ArrayList<Calendar>();
	private Avion avioncito=new Avion();
	
	//Constructors
	public Aerolinea() {
		
		CrearHorariosI();
	}
	
	//Set and gets
	public void CrearHorariosI() {
		Calendar hoy= new GregorianCalendar();
		for(int i=1; i<=5;i++) {
			Calendar f=new GregorianCalendar(hoy.get(1),hoy.get(2),hoy.get(5)+i);
			f.set(Calendar.HOUR_OF_DAY, 7);
			fechas.add(f);
			Calendar g=new GregorianCalendar(hoy.get(1),hoy.get(2),hoy.get(5)+i);
			f.set(Calendar.HOUR_OF_DAY, 12);
			fechas.add(g);
			Calendar h=new GregorianCalendar(hoy.get(1),hoy.get(2),hoy.get(5)+i);
			f.set(Calendar.HOUR_OF_DAY, 17);
			fechas.add(h);
		}
	}
	public void CrearHorariosV(String textoFecha) {
		this.fechasV.clear();
		Calendar ida= transformarFecha(textoFecha);
		for(int i=1; i<=5;i++) {
			Calendar f=new GregorianCalendar(ida.get(1),ida.get(2),ida.get(5)+i+5);
			f.set(Calendar.HOUR_OF_DAY, 7);
			this.fechasV.add(f);
			Calendar g=new GregorianCalendar(ida.get(1),ida.get(2),ida.get(5)+i+5);
			f.set(Calendar.HOUR_OF_DAY, 12);
			this.fechasV.add(g);
			Calendar h=new GregorianCalendar(ida.get(1),ida.get(2),ida.get(5)+i+5);
			f.set(Calendar.HOUR_OF_DAY, 17);
			this.fechasV.add(h);
		}
	}
	//Get dates in not text
		public GregorianCalendar transformarFecha(String text) {
				GregorianCalendar fec=new GregorianCalendar();
				String[] partes = text.split(" de ");
				int dia2=Integer.parseInt(partes[0]);
				int mes2 = 0;
				int ano2=Integer.parseInt(partes[2]);
				fec.set(Calendar.DAY_OF_MONTH,dia2);
				mes2=meses(partes[1]);
				fec.set(Calendar.MONTH,mes2);
				fec.set(Calendar.YEAR,ano2);
				
		        return fec;
		}
		
		public int meses(String partesIV) {
			int mes2=0;
			switch(partesIV) {
				case "enero":mes2=0;break;
				case "febrero":mes2=1;break;
				case "marzo":mes2=2;break;
				case "abril":mes2=3;break;
				case "mayo":mes2=4;break;
				case "junio":mes2=5;break;
				case "julio":mes2=6;break;
				case "agosto":mes2=7;break;
				case "septiembre":mes2=8;break;
				case "octubre":mes2=9;break;
				case "noviembre":mes2=10;break;
				case "diciembre":mes2=11;break;
			}
			return mes2;
		}


	public ArrayList<Calendar> getFechas() {
		return fechas;
	}


	public void setFechas(ArrayList<Calendar> fechas) {
		this.fechas = fechas;
	}


	public ArrayList<Calendar> getFechasV() {
		return fechasV;
	}


	public void setFechasV(ArrayList<Calendar> fechasV) {
		this.fechasV = fechasV;
	}

	public Avion getAvioncito() {
		return avioncito;
	}

	public void setAvioncito(Avion avioncito) {
		this.avioncito = avioncito;
	}
	
	
	
	
}