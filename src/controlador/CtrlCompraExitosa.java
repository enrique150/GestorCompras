package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import modelo.*;
import vista.*;


public class CtrlCompraExitosa {
	CompraExitosa ad1=new CompraExitosa();
	Vuelo v1=new Vuelo();
	Aerolinea a1=new Aerolinea();
	PreparedStatement ps;
    ResultSet rs;
	
	public CtrlCompraExitosa(CompraExitosa ad1, Vuelo v1, Aerolinea a1) {
		this.ad1 = ad1;
		this.v1 = v1;
		this.a1 = a1;
		
		this.ad1.btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		this.ad1.BtnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
	}
	
	public void Iniciar() {
		this.ad1.setVisible(true);
		this.ad1.setLocationRelativeTo(null);
		this.ad1.TrayectoResultado.setText(v1.getTrayecto());
		this.ad1.PasajeroResultado.setText(v1.getNumpasajeros()+" personas");
		this.ad1.TipoDeVueloResultado.setText(v1.getTipoVuelo());
		this.ad1.HoraIdaResultado.setText(v1.getHoraI()+" hrs.");
		String cadena="";
				for(int i=0;i<v1.getNumpasajeros();i++) {
					cadena=cadena+v1.getAsientos().get(i).getLetra()+""+v1.getAsientos().get(i).getNumAsiento()+"-";
				}
				this.ad1.AsientosIdaResultado.setText(cadena.toString());

		this.ad1.EquipajeIdaResultado.setText(v1.getEquipaje().getNumEquipajeDeMano()+" Equip.Mano -"+v1.getEquipaje().getNumEquipajeDeBodega()+" Equip.Bodega");
		this.ad1.MontoPagado.setText("$"+ v1.Monto());
		this.ad1.txtDestino.setText(v1.getDestino().getCapital()+" , "+v1.getDestino().getPais()+" ("+v1.getDestino().getAbrev()+")");
		this.ad1.FechaIdaResultado.setText(v1.getTextoFechaI());
		
		//RETURN TRIP
		if(v1.getTrayecto()=="Ida y Vuelta") {
					
			this.ad1.imagenCentro.setVisible(false);
			this.ad1.ImagenDerecha.setVisible(true);
											//------
			this.ad1.LbVueltaEquipaje.setBounds(30, 335, 93, 20);
			this.ad1.LbVueltaEquipaje.setForeground(new Color(0, 0, 128));
			this.ad1.LbVueltaEquipaje.setFont(new Font("Dubai", Font.PLAIN, 16));
			this.ad1.DetallesVuelo.add(this.ad1.LbVueltaEquipaje);
					
											//------
			this.ad1.LbVueltaAsientos.setBounds(30, 310, 77, 20);
			this.ad1.LbVueltaAsientos.setForeground(new Color(0, 0, 128));
			this.ad1.LbVueltaAsientos.setFont(new Font("Dubai", Font.PLAIN, 16));
			this.ad1.DetallesVuelo.add(this.ad1.LbVueltaAsientos);
					
													//------
			this.ad1.LbVueltaHora.setBounds(30, 285, 45, 20);
			this.ad1.LbVueltaHora.setForeground(new Color(0, 0, 128));
			this.ad1.LbVueltaHora.setFont(new Font("Dubai", Font.PLAIN, 16));
			this.ad1.DetallesVuelo.add(this.ad1.LbVueltaHora);
					
												//------
			this.ad1.LbVueltaFecha.setBounds(30, 260, 62, 20);
			this.ad1.LbVueltaFecha.setForeground(new Color(0, 0, 128));
			this.ad1.LbVueltaFecha.setFont(new Font("Dubai", Font.PLAIN, 16));
			this.ad1.DetallesVuelo.add(this.ad1.LbVueltaFecha);
					
									//------
			this.ad1.LbVuelosVuelta.setBounds(20, 228, 163, 25);
			this.ad1.LbVuelosVuelta.setForeground(new Color(0, 0, 128));
			this.ad1.LbVuelosVuelta.setFont(new Font("Dubai", Font.BOLD, 16));
			this.ad1.DetallesVuelo.add(this.ad1.LbVuelosVuelta);
					
													//------
			this.ad1.HoraVueltaResultado.setBounds(117, 275, 124, 30);
			this.ad1.HoraVueltaResultado.setBackground(new Color(242,242,242));
			this.ad1.HoraVueltaResultado.setText(v1.getHoraV()+" hrs. ");
			this.ad1.HoraVueltaResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
			this.ad1.HoraVueltaResultado.setEditable(false);
			this.ad1.DetallesVuelo.add(this.ad1.HoraVueltaResultado);
					//Airplane seats
												//------
			this.ad1.AsientosVueltaResultado.setBounds(117, 300, 124, 30);
			this.ad1.AsientosVueltaResultado.setBackground(new Color(242,242,242));
			StringBuilder cadenaAsientos2= new StringBuilder();
			for(int i=0;i<v1.getNumpasajeros();i++) {
				cadenaAsientos2.append(v1.getAsientosV().get(i).toString());
			}
			this.ad1.AsientosVueltaResultado.setText(cadenaAsientos2.toString());
			this.ad1.AsientosVueltaResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
			this.ad1.AsientosVueltaResultado.setEditable(false);
			this.ad1.DetallesVuelo.add(this.ad1.AsientosVueltaResultado);
					
					//travel luggage
					 							//------
			this.ad1.EquipajeVueltaResultado.setBounds(117, 325, 305, 30);
			this.ad1.EquipajeVueltaResultado.setBackground(new Color(242,242,242));
			this.ad1.EquipajeVueltaResultado.setText(v1.getEquipajeV().getNumEquipajeDeMano()+" Equip.Mano -"+v1.getEquipajeV().getNumEquipajeDeBodega()+" Equip.Bodega");
			this.ad1.EquipajeVueltaResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
			this.ad1.EquipajeVueltaResultado.setEditable(false);
			this.ad1.DetallesVuelo.add(this.ad1.EquipajeVueltaResultado);
					
					
															//------
			this.ad1.panelVuelta.setBackground(new Color(154,160,230));
			this.ad1.panelVuelta.setBounds(0, 225, 442, 30);
			this.ad1.DetallesVuelo.add(this.ad1.panelVuelta);
			this.ad1.panelVuelta.setLayout(null);
					
														//------
			this.ad1.txtOrigen.setText(v1.ORIGEN);
			this.ad1.txtOrigen.setForeground(new Color(0, 0, 128));
			this.ad1.txtOrigen.setFont(new Font("Dubai", Font.PLAIN, 15));
			this.ad1.txtOrigen.setEditable(false);
			this.ad1.txtOrigen.setBackground(new Color(154, 160, 230));
			this.ad1.txtOrigen.setBounds(163, 0, 220, 25);
			this.ad1.panelVuelta.add(this.ad1.txtOrigen);
					
											//------
			this.ad1.FechaVueltaResultado.setBounds(117, 250, 124, 30);
			this.ad1.FechaVueltaResultado.setBackground(new Color(242,242,242));
			this.ad1.FechaVueltaResultado.setText(v1.getTextoFechaIV());
			this.ad1.FechaVueltaResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
			this.ad1.FechaVueltaResultado.setEditable(false);
			this.ad1.DetallesVuelo.add(this.ad1.FechaVueltaResultado);
		}
	}
	
	public void guardar() {
		ArrayList <Pasajeros> ArrayPasajeros = new ArrayList<Pasajeros>();
		ArrayPasajeros.addAll(v1.getAdultos());
		ArrayPasajeros.addAll(v1.getNinos()); 
		ArrayPasajeros.addAll(v1.getBebes());
		
		if(v1.getPagador().ValidarCorreo(this.ad1.txtCorreo.getText())) {
			v1.getPagador().setCorreo(this.ad1.txtCorreo.getText());
			this.ad1.lblAdv.setVisible(false);
			this.ad1.lblcorreoEnviado.setVisible(true);
		}
		else {
			this.ad1.lblAdv.setVisible(true);
			this.ad1.lblcorreoEnviado.setVisible(false);
		}
		
		//GUARDAR INFO
		
		Connection con = null;
		Connection con2 = null;
		Connection con3 = null;
		
			
		for(int i=0; i<v1.getNumpasajeros(); i++) {
				
			if(v1.getTrayecto()=="Ida y Vuelta") {
				
				try{
		            con = Conexion.getconexion();
		            ps = con.prepareStatement("INSERT INTO dbo.Tabla_Agencia_Quaria4 (Destino, Trayecto, N_Adultos, N_Ninos, N_Bebes, Tipo_Vuelo, Fecha, Hora, Monto_Total, Asiento, Equipaje_Mano, Equipaje_Bodega, Nombre, Apellido, Genero , Nacionalidad, Tipo_Documento, Numero_Documento, Fecha_Nacimiento, Numero_Tarjeta, Tarjeta_FechaVencimiento, Tarjeta_CVV, Tarjeta_Nombre, Tarjeta_Apellido, Correo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		            ps.setString(1,v1.getDestino().DestinoTexto());
		            ps.setString(2,"Ida");
		            ps.setInt(3,v1.getnAdultos());
		            ps.setInt(4,v1.getnNinos());
		            ps.setInt(5,v1.getnBebes());
		            ps.setString(6,v1.getTipoVuelo());
		            ps.setString(7,v1.getTextoFechaI());
		            ps.setInt(8,v1.getHoraI());
		            ps.setDouble(9, v1.Monto());
		            ps.setString(10,v1.getAsientos().get(i).asientoEnCadena());
		            ps.setFloat(11, v1.getEquipaje().getNumEquipajeDeMano());
		            ps.setInt(12,v1.getEquipaje().getNumEquipajeDeBodega());
		            ps.setString(13,ArrayPasajeros.get(i).getNombre());
		            ps.setString(14,ArrayPasajeros.get(i).getApellido());            
		            ps.setString(15,ArrayPasajeros.get(i).getGenero());
		            ps.setString(16,ArrayPasajeros.get(i).getNacionalidad());
		            ps.setString(17,ArrayPasajeros.get(i).getTipoDeDocumento());
		            ps.setInt(18,ArrayPasajeros.get(i).getNumeroDeDocumento());
		            ps.setString(19,ArrayPasajeros.get(i).getFechaDeNacimiento());
		            ps.setString(20,v1.getPagador().getTarjetaPagador().getNroTarjeta());
		            ps.setString(21,v1.getPagador().getTarjetaPagador().getFechaVencimiento());
		            ps.setInt(22,v1.getPagador().getTarjetaPagador().getCvv());
		            ps.setString(23,v1.getPagador().getNombres());
		            ps.setString(24,v1.getPagador().getApellidos());
		            ps.setString(25,v1.getPagador().getCorreo());
		
		            int res = ps.executeUpdate();
		            if(res>0){
		                
		            }else{
		                
		            }
		            con.close();

		        } 
				catch (Exception ex) {
		            System.out.println(ex);
		        }
				
				try {
            
					con2  = Conexion.getconexion();
		            ps = con2.prepareStatement("INSERT INTO dbo.Tabla_Agencia_Quaria4 (Destino, Trayecto, N_Adultos, N_Ninos, N_Bebes, Tipo_Vuelo, Fecha, Hora, Monto_Total, Asiento, Equipaje_Mano, Equipaje_Bodega, Nombre, Apellido, Genero , Nacionalidad, Tipo_Documento, Numero_Documento, Fecha_Nacimiento, Numero_Tarjeta, Tarjeta_FechaVencimiento, Tarjeta_CVV, Tarjeta_Nombre, Tarjeta_Apellido, Correo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		            ps.setString(1,v1.ORIGEN);
		            ps.setString(2,"Vuelta");
		            ps.setInt(3,v1.getnAdultos());
		            ps.setInt(4,v1.getnNinos());
		            ps.setInt(5,v1.getnBebes());
		            ps.setString(6,v1.getTipoVuelo());
		            ps.setString(7,v1.getTextoFechaIV());
		            ps.setInt(8,v1.getHoraV());
		            ps.setDouble(9, v1.Monto());
		            ps.setString(10,v1.getAsientos().get(i).asientoEnCadena());
		            ps.setInt(11,v1.getEquipajeV().getNumEquipajeDeMano());
		            ps.setInt(12,v1.getEquipajeV().getNumEquipajeDeBodega());
		            ps.setString(13,ArrayPasajeros.get(i).getNombre());
		            ps.setString(14,ArrayPasajeros.get(i).getApellido());            
		            ps.setString(15,ArrayPasajeros.get(i).getGenero());
		            ps.setString(16,ArrayPasajeros.get(i).getNacionalidad());
		            ps.setString(17,ArrayPasajeros.get(i).getTipoDeDocumento());
		            ps.setInt(18,ArrayPasajeros.get(i).getNumeroDeDocumento());
		            ps.setString(19,ArrayPasajeros.get(i).getFechaDeNacimiento());
		            ps.setString(20,v1.getPagador().getTarjetaPagador().getNroTarjeta());
		            ps.setString(21,v1.getPagador().getTarjetaPagador().getFechaVencimiento());
		            ps.setInt(22,v1.getPagador().getTarjetaPagador().getCvv());
		            ps.setString(23,v1.getPagador().getNombres());
		            ps.setString(24,v1.getPagador().getApellidos());
		            ps.setString(25,v1.getPagador().getCorreo());
		            int res = ps.executeUpdate();
		            
		            if(res>0){
		                
		            }
		            else{
		                
		            }
		            con2.close();
		
				        
				} 
				catch (Exception ex) {
				            
					System.out.println(ex);
				        
				}	
			}
			else {
			
				try {
	            
	            con3 = Conexion.getconexion();
	            ps = con3.prepareStatement("INSERT INTO dbo.Tabla_Agencia_Quaria4 (Destino, Trayecto, N_Adultos, N_Ninos, N_Bebes, Tipo_Vuelo, Fecha, Hora, Monto_Total, Asiento, Equipaje_Mano, Equipaje_Bodega, Nombre, Apellido, Genero , Nacionalidad, Tipo_Documento, Numero_Documento, Fecha_Nacimiento, Numero_Tarjeta, Tarjeta_FechaVencimiento, Tarjeta_CVV, Tarjeta_Nombre, Tarjeta_Apellido, Correo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	            ps.setString(1,v1.getDestino().DestinoTexto());
	            ps.setString(2,"Ida");
	            ps.setInt(3,v1.getnAdultos());
	            ps.setInt(4,v1.getnNinos());
	            ps.setInt(5,v1.getnBebes());
	            ps.setString(6,v1.getTipoVuelo());
	            ps.setString(7,v1.getTextoFechaI());
	            ps.setInt(8,v1.getHoraI());
	            ps.setDouble(9, v1.Monto());
	            ps.setString(10,v1.getAsientos().get(i).asientoEnCadena());
	            ps.setInt(11,v1.getEquipaje().getNumEquipajeDeMano());
	            ps.setInt(12,v1.getEquipaje().getNumEquipajeDeBodega());
	            ps.setString(13,ArrayPasajeros.get(i).getNombre());
	            ps.setString(14,ArrayPasajeros.get(i).getApellido());            
	            ps.setString(15,ArrayPasajeros.get(i).getGenero());
	            ps.setString(16,ArrayPasajeros.get(i).getNacionalidad());
	            ps.setString(17,ArrayPasajeros.get(i).getTipoDeDocumento());
	            ps.setInt(18,ArrayPasajeros.get(i).getNumeroDeDocumento());
	            ps.setString(19,ArrayPasajeros.get(i).getFechaDeNacimiento());
	            ps.setString(20,v1.getPagador().getTarjetaPagador().getNroTarjeta());
	            ps.setString(21,v1.getPagador().getTarjetaPagador().getFechaVencimiento());
	            ps.setInt(22,v1.getPagador().getTarjetaPagador().getCvv());
	            ps.setString(23,v1.getPagador().getNombres());
	            ps.setString(24,v1.getPagador().getApellidos());
	            ps.setString(25,v1.getPagador().getCorreo());
	            int res = ps.executeUpdate();
	            if(res>0){
	                
	            }else{
	                
	            }
	            con3.close();
	
			        } catch (Exception ex) {
			            System.out.println(ex);
			        }

		
			}
		}
	}
}
