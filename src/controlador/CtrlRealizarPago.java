package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Aerolinea;
import modelo.Vuelo;
import vista.CompraExitosa;
import vista.DatosPasajeros;
import vista.RealizarPago;

public class CtrlRealizarPago {
	RealizarPago ad1=new RealizarPago();
	Vuelo v1=new Vuelo();
	Aerolinea a1=new Aerolinea();
	
	public CtrlRealizarPago(RealizarPago ad1, Vuelo v1, Aerolinea a1) {
		this.ad1 = ad1;
		this.v1 = v1;
		this.a1 = a1;
		
		this.ad1.BtnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagar();
				transicion();
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
		this.ad1.TrayectoResultado.setText(v1.getTrayecto());
		this.ad1.PasajeroResultado.setText(v1.getNumpasajeros()+" personas");
		this.ad1.TipoDeVueloResultado.setText(v1.getTipoVuelo());
		this.ad1.FechaIdaResultado.setText(v1.getTextoFechaI());
		this.ad1.HoraIdaResultado.setText(v1.getHoraI()+" hrs.");
		String cadena="";
		for(int i=0;i<v1.getNumpasajeros();i++) {
			cadena=cadena+v1.getAsientos().get(i).getLetra()+""+v1.getAsientos().get(i).getNumAsiento()+"-";
		}
		
		this.ad1.EquipajeIdaResultado.setText(v1.getEquipaje().getNumEquipajeDeMano()+" Equipajes de Mano");
		this.ad1.AsientosIdaResultado.setText(cadena.toString());
		this.ad1.EquipajeIdaResultado_1.setText(v1.getEquipaje().getNumEquipajeDeBodega()+" Equipaje de Bodega");
		this.ad1.ViajeIda.setText(v1.ORIGEN);
		this.ad1.ViajeVuelta.setText(v1.getDestino().getCapital()+" , "+v1.getDestino().getPais()+" ("+v1.getDestino().getAbrev()+")");
		this.ad1.txtDestino_4.setText(String.valueOf(v1.Monto()));
		
		//COMING
		if(v1.getTrayecto()=="Ida y Vuelta") {
					
			this.ad1.FechaVueltaResultado.setBackground(new Color(242,242,242));
			this.ad1.FechaVueltaResultado.setText(v1.getTextoFechaIV());
			this.ad1.FechaVueltaResultado.setFont(new Font("Dubai", Font.BOLD, 12));
			this.ad1.FechaVueltaResultado.setEditable(false);
			this.ad1.FechaVueltaResultado.setBounds(277, 144, 124, 21);
			this.ad1.DetallesVuelo.add(this.ad1.FechaVueltaResultado);
					
					
			this.ad1.HoraVueltaResultado.setBackground(new Color(242,242,242));
			this.ad1.HoraVueltaResultado.setText(v1.getHoraV()+" hrs.");
			this.ad1.HoraVueltaResultado.setFont(new Font("Dubai", Font.BOLD, 12));
			this.ad1.HoraVueltaResultado.setEditable(false);
			this.ad1.HoraVueltaResultado.setBounds(277, 175, 124, 21);
			this.ad1.DetallesVuelo.add(this.ad1.HoraVueltaResultado);
					
					
			this.ad1.AsientosVueltaResultado.setBackground(new Color(242,242,242));
					StringBuilder cadenaAsientos2= new StringBuilder();
					for(int i=0;i<v1.getNumpasajeros();i++) {
						cadenaAsientos2.append(v1.getAsientosV().get(i).toString());
					}
			this.ad1.AsientosVueltaResultado.setText(cadenaAsientos2.toString());
			this.ad1.AsientosVueltaResultado.setFont(new Font("Dubai", Font.BOLD, 12));
			this.ad1.AsientosVueltaResultado.setEditable(false);
			this.ad1.AsientosVueltaResultado.setBounds(236, 272, 368, 21);
			this.ad1.DetallesVuelo.add(this.ad1.AsientosVueltaResultado);
					
					
			this.ad1.EquipajeVueltaResultado.setBackground(new Color(242,242,242));
			this.ad1.EquipajeVueltaResultado.setText(v1.getEquipajeV().getNumEquipajeDeMano()+" Equipajes de mano");
			this.ad1.EquipajeVueltaResultado.setFont(new Font("Dubai", Font.BOLD, 12));
			this.ad1.EquipajeVueltaResultado.setEditable(false);
			this.ad1.EquipajeVueltaResultado.setBounds(290, 226, 124, 21);
			this.ad1.DetallesVuelo.add(this.ad1.EquipajeVueltaResultado);
					
					
			this.ad1.EquipajeVueltaResultado_1.setText(v1.getEquipajeV().getNumEquipajeDeBodega()+" Equipaje de bodega");
			this.ad1.EquipajeVueltaResultado_1.setFont(new Font("Dubai", Font.BOLD, 12));
			this.ad1.EquipajeVueltaResultado_1.setEditable(false);
			this.ad1.EquipajeVueltaResultado_1.setBackground(new Color(242, 242, 242));
			this.ad1.EquipajeVueltaResultado_1.setBounds(290, 206, 124, 21);
			this.ad1.DetallesVuelo.add(this.ad1.EquipajeVueltaResultado_1);
					
					
			this.ad1.LbVueloVuelta.setBounds(232, 2, 136, 21);
			this.ad1.panel_4_1.add(this.ad1.LbVueloVuelta);
			this.ad1.LbVueloVuelta.setForeground(new Color(255, 255, 255));
			this.ad1.LbVueloVuelta.setFont(new Font("Dubai Medium", Font.BOLD, 15));
	
					
			this.ad1.LbEquipajeVuelta.setForeground( new Color(45, 52, 132));
			this.ad1.LbEquipajeVuelta.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			this.ad1.LbEquipajeVuelta.setBounds(236, 206, 80, 21);
			this.ad1.DetallesVuelo.add(this.ad1.LbEquipajeVuelta);
					
			this.ad1.LbAsientosVuelta.setForeground( new Color(45, 52, 132));
			this.ad1.LbAsientosVuelta.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			this.ad1.LbAsientosVuelta.setBounds(236, 254, 80, 21);
			this.ad1.DetallesVuelo.add(this.ad1.LbAsientosVuelta);
					
			this.ad1.LbHoraVuelta.setForeground( new Color(45, 52, 132));
			this.ad1.LbHoraVuelta.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			this.ad1.LbHoraVuelta.setBounds(236, 175, 45, 21);
			this.ad1.add(this.ad1.LbHoraVuelta);
								
			this.ad1.LbFechaVuelta.setForeground( new Color(45, 52, 132));
			this.ad1.LbFechaVuelta.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			this.ad1.LbFechaVuelta.setBounds(236, 144, 80, 21);
			this.ad1.DetallesVuelo.add(this.ad1.LbFechaVuelta);
		}
		
	}
	
	public void pagar() {
		//validation
		try {
			
			v1.getPagador().getTarjetaPagador().validarTarjeta(this.ad1.txtNDeTarjeta.getText(), 
					this.ad1.txtCvv.getText(), this.ad1.txtMmAa.getText());
			//Saving
			this.ad1.advTarjeta.setVisible(false);
			v1.getPagador().setNombres(this.ad1.txtNombre.getText());
			v1.getPagador().setApellidos(this.ad1.txtApellido.getText());
			v1.getPagador().getTarjetaPagador().setNroTarjeta(this.ad1.txtNDeTarjeta.getText());
			v1.getPagador().getTarjetaPagador().setCvv(Integer.parseInt(this.ad1.txtCvv.getText()));
			v1.getPagador().getTarjetaPagador().setFechaVencimiento(this.ad1.txtMmAa.getText());
			v1.setMontototal(v1.Monto());
			
		}
		catch(ArithmeticException r){
			
			this.ad1.advTarjeta.setVisible(true);
		}
	}
	public void transicion() {
		//Passing
		CompraExitosa vent=new CompraExitosa();
		CtrlCompraExitosa c= new CtrlCompraExitosa(vent, v1,a1);
		c.Iniciar();
		this.ad1.setVisible(false);
	}
	
	public void volver() {
		DatosPasajeros vent=new DatosPasajeros();
		CtrlDatosPasajeros c=new CtrlDatosPasajeros(vent,v1,a1,v1.getNumpasajeros());
		c.iniciar();
		this.ad1.setVisible(false);
	}
}
