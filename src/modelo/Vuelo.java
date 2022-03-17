package modelo;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Vuelo {
    public final String ORIGEN="Lima, Perú (LIM)";
    protected Destino destino;
    protected String trayecto;
    protected String tipoVuelo;
    protected int numpasajeros;
    protected ArrayList<Pasajeros> bebes=new ArrayList<Pasajeros>();
    protected ArrayList<Pasajeros> ninos=new ArrayList<Pasajeros>();
    protected ArrayList<Pasajeros> adultos=new ArrayList<Pasajeros>();
    protected int nBebes;
    protected int nNinos;
    protected int nAdultos;
    protected EquipajeP equipaje =new EquipajeP();
    protected EquipajeP equipajeV =new EquipajeP();
    protected GregorianCalendar fechaI=new GregorianCalendar();
    protected GregorianCalendar fechaV=new GregorianCalendar();
    protected int horaI;
    protected int horaV;
    protected double Montototal;
    protected ArrayList<Asiento> asientos=new ArrayList<Asiento>();
    protected ArrayList<Asiento> asientosV=new ArrayList<Asiento>();
    protected String textoFechaI;
    protected String textoFechaIV;
    protected Pagador pagador=new Pagador();
    
    public Vuelo() {
        
    	
    }

    public Vuelo(Destino destino, String trayecto, String tipoVuelo, GregorianCalendar fechaI, GregorianCalendar fechaV) {
        this.destino = destino;
        this.trayecto = trayecto;
        this.tipoVuelo = tipoVuelo;
        this.fechaI = fechaI;
        this.fechaV = fechaV;
    }
    
    public double Monto() {
    	
    	double montoPagarU=this.destino.costo;
    	double porc=1;
    	switch(this.tipoVuelo) {
    		case "Economico": porc=1;break;
    		case "Business":porc=1.2;break;
    		case "Premium":porc=1.4;break;
    	}
    	montoPagarU=porc*montoPagarU;
    	
    	if(this.trayecto=="Ida y Vuelta") {
    		montoPagarU=2*montoPagarU;
    	}
    	double montoPagarG=montoPagarU*this.nAdultos+montoPagarU*this.nNinos*0.8;
    	
    	//Extra
    	double extraI=this.equipaje.Costoo();
    	double extraV=0;
    	if(this.trayecto=="Ida y Vuelta") {
    		extraV=this.equipajeV.Costoo();
    	}
    	double montoTotal= Math.round((montoPagarG+extraI+extraV)*100.0)/100.0;
    	return montoTotal;    	
    	
    	
    }
    
    //Set and gets

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public String getTrayecto() {
		return trayecto;
	}

	public void setTrayecto(String trayecto) {
		this.trayecto = trayecto;
	}


	public String getTipoVuelo() {
		return tipoVuelo;
	}

	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	public int getNumpasajeros() {
		return numpasajeros;
	}

	public void setNumpasajeros() {
		this.numpasajeros = this.nAdultos+ this.nNinos+this.nBebes;
	}

	public EquipajeP getEquipaje() {
		return equipaje;
	}

	public void setEquipaje(EquipajeP cantidad) {
		equipaje = cantidad;
	}

	public GregorianCalendar getFechaI() {
		return fechaI;
	}

	public void setFechaI(GregorianCalendar fechaI) {
		this.fechaI = fechaI;
	}

	public GregorianCalendar getFechaV() {
		return fechaV;
	}

	public void setFechaV(GregorianCalendar fechaV) {
		this.fechaV = fechaV;
	}

	public double getMontototal() {
		return Montototal;
	}

	public void setMontototal(double montototal) {
		Montototal = montototal;
	}

	public ArrayList<Pasajeros> getBebes() {
		return bebes;
	}

	public void setBebes(ArrayList<Pasajeros> bebes) {
		this.bebes = bebes;
	}

	public ArrayList<Pasajeros> getNinos() {
		return ninos;
	}

	public void setNinos(ArrayList<Pasajeros> ninos) {
		this.ninos = ninos;
	}

	public ArrayList<Pasajeros> getAdultos() {
		return adultos;
	}

	public void setAdultos(ArrayList<Pasajeros> adultos) {
		this.adultos = adultos;
	}

	public int getnBebes() {
		return nBebes;
	}

	public void setnBebes(int nBebes) {
		this.nBebes = nBebes;
	}

	public int getnNinos() {
		return nNinos;
	}

	public void setnNinos(int nNinos) {
		this.nNinos = nNinos;
	}

	public int getnAdultos() {
		return nAdultos;
	}

	public void setnAdultos(int nAdultos) {
		this.nAdultos = nAdultos;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	//Text in dates
	public String getTextoFechaI() {
		return textoFechaI;
	}

	public void setTextoFechaI(String textoFechaI) {
		this.textoFechaI = textoFechaI;
	}

	public String getTextoFechaIV() {
		return textoFechaIV;
	}

	public void setTextoFechaIV(String textoFechaIV) {
		this.textoFechaIV = textoFechaIV;
	}
	
	
	//Get dates in not text
	public void transformarFechaI() {
		
		String[] partesI = this.textoFechaI.split(" de ");
		int dia=Integer.parseInt(partesI[0]);
		int mes = 0;
		int ano=Integer.parseInt(partesI[2]);
		this.fechaI.set(Calendar.DAY_OF_MONTH,dia);
		mes=meses(partesI[1]);
		this.fechaI.set(Calendar.MONTH,mes);
		this.fechaI.set(Calendar.YEAR,ano);
		this.fechaI.set(Calendar.HOUR,getHoraI());
		
        
	}
	//Get dates in not text
	public void transformarFechaV() {
			String[] partesIV = this.textoFechaIV.split(" de ");
			int dia2=Integer.parseInt(partesIV[0]);
			int mes2 = 0;
			int ano2=Integer.parseInt(partesIV[2]);
			this.fechaV.set(Calendar.DAY_OF_MONTH,dia2);
			mes2=meses(partesIV[1]);
			this.fechaV.set(Calendar.MONTH,mes2);
			this.fechaV.set(Calendar.YEAR,ano2);
			this.fechaV.set(Calendar.HOUR,getHoraV());
	        
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
	
	public int transformarHora(String horaTexto) {
		String[] h = horaTexto.split(" hrs. ");
		int hora=Integer.parseInt(h[0]);
		return hora;
		
	}
	//Hours

	public int getHoraI() {
		return horaI;
	}

	public void setHoraI(String horaI) {
		int h=transformarHora(horaI);
		this.horaI = h;
	}

	public int getHoraV() {
		return horaV;
	}

	public void setHoraV(String horaV) {
		int h=transformarHora(horaV);
		this.horaV =h;
	}

	public EquipajeP getEquipajeV() {
		return equipajeV;
	}

	public void setEquipajeV(EquipajeP equipajeV) {
		this.equipajeV = equipajeV;
	}

	public ArrayList<Asiento> getAsientosV() {
		return asientosV;
	}

	public void setAsientosV(ArrayList<Asiento> asientosV) {
		this.asientosV = asientosV;
	}

	public Pagador getPagador() {
		return pagador;
	}

	public void setPagador(Pagador pagador) {
		this.pagador = pagador;
	}
	
	
	
    
 
}
