package modelo;

public class EquipajeP { //atributos de la clase
    private int numEquipajeDeMano;
    private int numEquipajeDeBodega;
    private int costoTotal;  

    public EquipajeP() { //constructor sin argumentos
    }

    public EquipajeP(int numEquipajeDeMano, int numEquipajeDeBodega) { //constructor con argumentos
        this.numEquipajeDeMano = numEquipajeDeMano;
        this.numEquipajeDeBodega = numEquipajeDeBodega;
    }
    
    public int getNumEquipajeDeMano() { 
        return numEquipajeDeMano;
    }

    public void setNumEquipajeDeMano(int numEquipajeDeMano) {
        this.numEquipajeDeMano = numEquipajeDeMano;
    }

    public int getNumEquipajeDeBodega() {
        return numEquipajeDeBodega;
    }

    public void setNumEquipajeDeBodega(int numEquipajeDeBodega) {
        this.numEquipajeDeBodega = numEquipajeDeBodega;
    }
    
    public int Costoo() {
    	this.costoTotal=this.numEquipajeDeBodega*21+this.numEquipajeDeMano*8;
    	return this.costoTotal;
    }
      
}