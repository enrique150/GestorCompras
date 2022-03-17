package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import modelo.Aerolinea;
import modelo.Conexion;
import modelo.Pasajeros;
import modelo.Vuelo;
import vista.Adicionales;
import vista.AdicionalesVuelta;
import vista.DatosPasajeros;
import vista.RealizarPago;

public class CtrlDatosPasajeros {
	DatosPasajeros ad1=new DatosPasajeros();
	Vuelo v1=new Vuelo();
	Aerolinea a1=new Aerolinea();
	int cont=0;
	PreparedStatement ps;
    ResultSet rs;
    int num;
    boolean ComprobarDocBaseDatos;
    
	public CtrlDatosPasajeros(DatosPasajeros ad1, Vuelo v1, Aerolinea a1, int cont) {
		super();
		this.ad1 = ad1;
		this.v1 = v1;
		this.a1 = a1;
		this.cont = cont;
		
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
    	if((cont+1)<=v1.getnAdultos()) {
    		this.ad1.txtTipoPasajero.setText("ADULTO"+(cont+1));
		}
		else if((cont-v1.getnAdultos()+1)<=v1.getnNinos()&& (cont+1)>v1.getnAdultos()) {
			this.ad1.txtTipoPasajero.setText("NIÑO"+(cont-v1.getnAdultos()+1));
		}
		else if((cont+1-(v1.getnAdultos()+v1.getnNinos()))<=v1.getnBebes()&& (cont+1)>(v1.getnAdultos()+v1.getnNinos())) {
			this.ad1.txtTipoPasajero.setText("BEBE"+(cont+1-(v1.getnAdultos()+v1.getnNinos())));
		}
    }
    public void acumular() {
 
    	this.ad1.pasajero.setNombre(this.ad1.txtNombres.getText());
    	this.ad1.pasajero.setApellido(this.ad1.txtApellidos.getText());
    	this.ad1.pasajero.setGenero((String)this.ad1.generoDesplegable.getSelectedItem());
    	this.ad1.pasajero.setTipoDeDocumento((String)this.ad1.docDesplegable.getSelectedItem());
    	this.ad1.pasajero.setFechaDeNacimiento(this.ad1.txtNacimiento.getText());
    	this.ad1.pasajero.setNacionalidad(this.ad1.nacionalidadDesplegable.getSelectedItem().toString());
    	
    	validacionGeneral();
		
		
    	
    }
    public void validarDatosConAnteriores() {
    	String nDoc=this.ad1.txtnDoc.getText();
		int num=Integer.parseInt(nDoc);
        Connection con = null;
        
        if(v1.getTrayecto()=="Ida y Vuelta") {
	        try{
	        	con = Conexion.getconexion();
	        	ps = con.prepareStatement("SELECT Numero_Documento FROM dbo.Tabla_Agencia_Quaria4 WHERE Numero_Documento = ? ");
	        	ps.setInt(1, num);
	
	        	rs = ps.executeQuery();
	   
	        	if(rs.next()) {
	        		ComprobarDocBaseDatos = false;
	
	        	}
	        	else {
	        		this.ad1.pasajero.setNumeroDeDocumento(num);
	        		ComprobarDocBaseDatos = true;
	        	}
	        } 
	        catch (Exception ex) {
	        	System.err.println(ex);
	        }
        }
        
        
        else {
        	
            try{
                con = Conexion.getconexion();
                
	            ps = con.prepareStatement("SELECT Numero_Documento FROM dbo.Tabla_Agencia_Quaria4 WHERE Numero_Documento = ? ");
	            ps.setInt(1, num);

                rs = ps.executeQuery();
               
	              if(rs.next()) {
	            	ComprobarDocBaseDatos = false;
	              }
	              else {
	            	  this.ad1.pasajero.setNumeroDeDocumento(num);
	            	  ComprobarDocBaseDatos = true;
	              }
              } 
            catch (Exception ex) {
                System.err.println(ex);
            }
        	
        }
    }
    public int ValidarConDatosActuales() {
    	ArrayList <Pasajeros> ArrayPasajeros = new ArrayList<Pasajeros>();
    	ArrayPasajeros.addAll(v1.getAdultos());
    	ArrayPasajeros.addAll(v1.getNinos()); 
    	ArrayPasajeros.addAll(v1.getBebes());
    	
    	int aux=0;
		for(int k=0; k<ArrayPasajeros.size();k++) {
			if(ArrayPasajeros.get(k).getNumeroDeDocumento()==this.ad1.pasajero.getNumeroDeDocumento()) {
				aux=1;
			}
		}
		return aux;
    }
    
    public void validacionGeneral() {
    	validarDatosConAnteriores();
    	String nDoc=this.ad1.txtnDoc.getText();
    	int aux=ValidarConDatosActuales();
    	if((nDoc.length()==8 && this.ad1.pasajero.getTipoDeDocumento()=="DNI" && ComprobarDocBaseDatos==true && aux!=1)||(nDoc.length()==9 && this.ad1.pasajero.getTipoDeDocumento()=="Carnet de Extranjeria" && ComprobarDocBaseDatos==true && aux!=1)) {
    		if((cont+1)<=v1.getnAdultos()) {
    			v1.getAdultos().add(this.ad1.pasajero);
    		}
    		else if((cont+1-v1.getnAdultos())<=v1.getnNinos()&& (cont+1)>v1.getnAdultos()) {
    			v1.getNinos().add(this.ad1.pasajero);
    		}
    		else if((cont+1-(v1.getnAdultos()+v1.getnNinos()))<=v1.getnBebes()&& (cont+1)>(v1.getnAdultos()+v1.getnNinos())) {
    			v1.getBebes().add(this.ad1.pasajero);
    		}
    		
			//PASSING
			if((cont+1)<v1.getNumpasajeros()) {
				int c=cont;
				c=c+1;
				DatosPasajeros pasajeroSiguiente=new DatosPasajeros();
				CtrlDatosPasajeros d= new CtrlDatosPasajeros(pasajeroSiguiente,v1,a1,c);
				d.iniciar();
				this.ad1.setVisible(false);
			}
			else if ((cont+1)==v1.getNumpasajeros()) {
				RealizarPago vent=new RealizarPago();
				CtrlRealizarPago c=new CtrlRealizarPago(vent,v1,a1);
				c.iniciar();
				this.ad1.setVisible(false);
			}
		}
		else {
			this.ad1.advNroDoc.setVisible(true);
		}
		
    }
    public void volver() {
    	
    	if(cont==0) {
			if(v1.getTrayecto()=="Ida") {
				Adicionales vent=new Adicionales();
				CtrlAdicionales c=new CtrlAdicionales(vent, v1,a1);
				c.iniciar();
				this.ad1.setVisible(false);
			}
			else {
				AdicionalesVuelta vent=new AdicionalesVuelta();
				CtrlAdicionalesVuelta c=new CtrlAdicionalesVuelta(vent, v1,a1);
				c.iniciar();
				this.ad1.setVisible(false);
			}
			
		}
		else {
			
			if((cont-1)<v1.getnAdultos()) {
				v1.getAdultos().remove(cont-1);
			}
			else if((cont-1-v1.getnAdultos())<v1.getnNinos()&& (cont -1)>=v1.getnAdultos()) {
				v1.getNinos().remove(cont-1-v1.getnAdultos());
			}
			else if((cont-1-(v1.getnAdultos()+v1.getnNinos()))<v1.getnBebes()&& (cont-1)>=(v1.getnAdultos()+v1.getnNinos())) {
				v1.getBebes().remove(cont-1-(v1.getnAdultos()+v1.getnNinos()));
			}
			DatosPasajeros pasajeroAnterior=new DatosPasajeros();
			CtrlDatosPasajeros c= new CtrlDatosPasajeros(pasajeroAnterior,v1,a1,cont-1);
			c.iniciar();
			this.ad1.setVisible(false);
		}
    }
}
