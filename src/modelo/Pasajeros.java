package modelo;

public class Pasajeros {
	 protected String nombre;
	    protected String apellido;
	    protected String nacionalidad;
	    protected String genero;
	    protected String tipoDeDocumento;
	    protected int numeroDeDocumento;
	    protected String fechaDeNacimiento;

	    public Pasajeros() {
	    }

	    public Pasajeros(String nombre, String apellido, String nacionalidad, String genero) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.nacionalidad = nacionalidad;
	        this.genero = genero;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public String getNacionalidad() {
	        return nacionalidad;
	    }

	    public void setNacionalidad(String nacionalidad) {
	        this.nacionalidad = nacionalidad;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public int getNumeroDeDocumento() {
	        return numeroDeDocumento;
	    }

	    public void setNumeroDeDocumento(int numeroDeDocumento) {
	        this.numeroDeDocumento = numeroDeDocumento;
	    }

	    public String getTipoDeDocumento() {
	        return tipoDeDocumento;
	    }

	    public void setTipoDeDocumento(String tipoDeDocumento) {
	        this.tipoDeDocumento = tipoDeDocumento;
	    }

	    public String getFechaDeNacimiento() {
	        return fechaDeNacimiento;
	    }

	    public void setFechaDeNacimiento(String fechaDeNaciemiento) {
	        this.fechaDeNacimiento = fechaDeNaciemiento;
	    }
	    

}