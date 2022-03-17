package modelo;

public enum Destino {
    BRASIL("Brasil","Rio de Janeiro",439.99,"RIJ"),ITALIA("Italia","Roma",689.99,"ROM"),FRANCIA("Francia","Paris",679.99,"PRS"),
    FINLANDIA("Finlandia","Rovaniemi",1159.99,"ROV"),EEUU("Estados Unidos","Nueva York",279.99,"NY"),RD("Rep. Dominicana","Punta Cana",379.99,"PC");
    protected String Pais;
    protected String capital;
    protected double costo;
    protected String abrev;
    
    private Destino(String Pais,String capital,double costo, String abrev){
        this.capital = capital;
        this.costo = costo;
        this.Pais = Pais;
        this.abrev=abrev;
    }
    public String getPais() {
        return Pais;
    }
    public String getCapital() {
        return capital;
    }
    public double getCosto() {
        return costo;
    }
    public String getAbrev() {
    	return abrev;
    }
    
    public String DestinoTexto() {
    	
    	return this.capital + "," + this.Pais + "(" + this.abrev + ")";
    }
}