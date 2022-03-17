package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pagador {
	private String nombres;
	private String apellidos;
	private Tarjeta tarjetaPagador=new Tarjeta();
	private String correo;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Tarjeta getTarjetaPagador() {
		return tarjetaPagador;
	}
	public void setTarjetaPagador(Tarjeta tarjetaPagador) {
		this.tarjetaPagador = tarjetaPagador;
	} 
	
	public boolean ValidarCorreo(String correo) {
         
        String regx = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(correo);  
        return matcher.matches();
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
}
