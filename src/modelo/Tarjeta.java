package modelo;

public class Tarjeta {
	private String nroTarjeta;
	private String fechaVencimiento;
	private int cvv;
	private boolean validez=false;
	
	public String getNroTarjeta() {
		return nroTarjeta;
	}
	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public void validarTarjeta(String nroTarjeta, String cvv, String fecha) {
		
		if(nroTarjeta.length()==16 && cvv.length()==3 && fecha.length()==5) {
			this.validez=true;
		}
		else {
			throw new ArithmeticException("E");
		}
	}
	public boolean isValidez() {
		return validez;
	}
	public void setValidez(boolean validez) {
		this.validez = validez;
	}
	
}
