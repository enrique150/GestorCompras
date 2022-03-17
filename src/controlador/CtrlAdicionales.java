package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Aerolinea;
import modelo.Asiento;
import modelo.Conexion;
import modelo.Vuelo;
import vista.*;

public class CtrlAdicionales {
	Adicionales ad1=new Adicionales();
	Vuelo v1=new Vuelo();
	Aerolinea a1=new Aerolinea();
	PreparedStatement ps;
    ResultSet rs;
	
	public CtrlAdicionales(Adicionales ad1, Vuelo v1, Aerolinea a1) {

		this.ad1 = ad1;
		this.v1 = v1;
		this.a1 = a1;
		this.ad1.btnContinuar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			acumular();
		}
		});
		this.ad1.btnRegresar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			volver();
		}
		
	});
		
	}
	public void iniciar() {
		
		this.ad1.setVisible(true);
		this.ad1.setLocationRelativeTo(null);
		validarDisponibilidadAsientos();
		
	
	}
	public void validarDisponibilidadAsientos(){
		//Here it would be necessary to compare with the database to see if the seat is occupied
		// USAR INFO
		
		ArrayList<String> AsientosOcupados = new ArrayList<String>();
		
        Connection con = null;
        try{
            con = Conexion.getconexion();
            
            ps = con.prepareStatement("SELECT Asiento FROM dbo.Tabla_Agencia_Quaria4 WHERE Destino = ? and Fecha = ? and Hora = ? ");
            ps.setString(1, v1.getDestino().DestinoTexto());
            ps.setString(2, v1.getTextoFechaI());
            ps.setInt(3, v1.getHoraI());
            rs = ps.executeQuery();
           
            while (rs.next()) {
                  AsientosOcupados.add(rs.getString("Asiento"));  
        

            } 
        } catch (Exception ex) {
            System.err.println(ex);
        }
              
         for(int i=0;i<AsientosOcupados.size();i++) {
        	 int indi= a1.getAvioncito().buscarAsiento(AsientosOcupados.get(i));
        	 if(indi!=-1)
        		 a1.getAvioncito().getAsientos().get(indi).setDisponibilidad(false);
         }
                
		//Validation of seats
		for(int i=0; i<this.ad1.asientos.size();i++) {
			if(a1.getAvioncito().getAsientos().get(i).isDisponibilidad()) {
				this.ad1.asientos.get(i).setEnabled(true);
			}
			else {
				this.ad1.asientos.get(i).setBackground(new Color(166,166,166));
				this.ad1.asientos.get(i).setEnabled(false);
			}
		}
		
	}
	
	public void acumular() {
		this.ad1.advDefecto.setVisible(false);
		this.ad1.advExceso.setVisible(false);
		
		int cont=0;
		for(int i=0; i<this.ad1.asientos.size();i++) {
			if(this.ad1.asientos.get(i).isSelected()) {	
				cont=cont+1;
			}
		}
		
		if(cont==v1.getNumpasajeros()) {
			//Saving information
			
			String[] seleccion=new String[v1.getNumpasajeros()];
			int j=0;
			for(int i=0; i<this.ad1.asientos.size();i++) {
				if(this.ad1.asientos.get(i).isSelected()) {
					Asiento aux=new Asiento();
					seleccion[j] = this.ad1.asientos.get(i).getText();
					char letraAsiento=seleccion[j].charAt(0);
					char num=seleccion[j].charAt(1);
					String num2 = String.valueOf(num);
					int numAsiento=Integer.parseInt(num2);
					aux.setLetra(letraAsiento);
					aux.setNumAsiento(numAsiento);
					v1.getAsientos().add(aux);
					j=j+1;
				}
			}
	
			v1.getEquipaje().setNumEquipajeDeMano((int)this.ad1.spinEM.getValue());
			v1.getEquipaje().setNumEquipajeDeBodega((int)this.ad1.spinEB.getValue());
			
			transicion();
			
		}
		else if(cont<v1.getNumpasajeros()) {
			this.ad1.advDefecto.setVisible(true);
		}	
		else {
			this.ad1.advExceso.setVisible(true);
		}
	}

	public void volver() {
		if(v1.getTrayecto()=="Ida") {
			SeleccionFechasIda vent= new SeleccionFechasIda();
			CtrlSeleccionFechasIda c=new CtrlSeleccionFechasIda(vent,v1,a1);
			c.iniciar();
			this.ad1.setVisible(false);
		}
		else {
			SeleccionFechasIV vent= new SeleccionFechasIV();
			CtrlSeleccionFechasIV c=new CtrlSeleccionFechasIV(vent,v1);
			c.iniciar();
			this.ad1.setVisible(false);
		}
	}
	public void transicion() {
		//Passing
		if(v1.getTrayecto()=="Ida") {
			int contarPasajeros=0;
			DatosPasajeros vent=new DatosPasajeros();
			CtrlDatosPasajeros d= new CtrlDatosPasajeros(vent,v1,a1,contarPasajeros);
			d.iniciar();
			this.ad1.setVisible(false);
		}
		else {
			AdicionalesVuelta vent= new AdicionalesVuelta();
			CtrlAdicionalesVuelta c= new CtrlAdicionalesVuelta(vent, v1,a1);
			c.iniciar();
			this.ad1.setVisible(false);
		}
	}
}