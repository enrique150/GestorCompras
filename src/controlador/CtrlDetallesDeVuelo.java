package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.*;
import vista.DetallesDelVuelo;
import vista.SeleccionFechasIV;
import vista.SeleccionFechasIda;
import vista.VentanaDestinos;

public class CtrlDetallesDeVuelo {
	DetallesDelVuelo d1;
	Vuelo v1=new Vuelo();
	Aerolinea a1=new Aerolinea();

	public CtrlDetallesDeVuelo(DetallesDelVuelo d1, Vuelo v1, Aerolinea a1) {
		this(d1,v1);
		this.a1 = a1;
		
	}
	public CtrlDetallesDeVuelo(DetallesDelVuelo d1, Vuelo v1) {
		this.d1 = d1;
		this.v1=v1;
		
		this.d1.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acumular();
				transicion();
			}
		});
		this.d1.btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaDestinos destinos= new VentanaDestinos();
				CtrlVentanaDestinos c=new CtrlVentanaDestinos(destinos);
				c.iniciar();
				cerrarActual();
			}
		});
		
	}
	public void iniciar() {
		this.d1.txtDestino.setText(v1.getDestino().getCapital()+" , "+v1.getDestino().getPais()+" ("+v1.getDestino().getAbrev()+")");
		this.d1.setVisible(true);
		this.d1.setLocationRelativeTo(null);
	}
	
	public void acumular() {
		//setting the path
		if(this.d1.opIda.isSelected())
			v1.setTrayecto("Ida");
		else if(this.d1.opIV.isSelected())
			v1.setTrayecto("Ida y Vuelta");
		
		//Passengers
		
		v1.setnNinos((int)this.d1.spinNinos.getValue());
		v1.setnAdultos((int)this.d1.spinAdultos.getValue());
		v1.setnBebes((int)this.d1.spinBebe.getValue());
		v1.setNumpasajeros();
		
		//Type of flight
		if(this.d1.opEconomico.isSelected())
			v1.setTipoVuelo("Economico");
		else if(this.d1.opBusiness.isSelected())
			v1.setTipoVuelo("Business");
		else if (this.d1.opPremium.isSelected())
			v1.setTipoVuelo("Premium");
		
		
	}
	public void transicion() {
		if ((this.d1.opEconomico.isSelected() && this.d1.opBusiness.isSelected() == false
				&& this.d1.opPremium.isSelected() == false)
				|| (this.d1.opEconomico.isSelected() == false && this.d1.opBusiness.isSelected()
						&& this.d1.opPremium.isSelected() == false)
				|| (this.d1.opEconomico.isSelected() == false && this.d1.opBusiness.isSelected() == false
						&& this.d1.opPremium.isSelected())) {
		if (v1.getnAdultos() > 0) {
			// Next
			
				if (this.d1.opIda.isSelected() && this.d1.opIV.isSelected() == false) {
					SeleccionFechasIda vent = new SeleccionFechasIda();
					CtrlSeleccionFechasIda c = new CtrlSeleccionFechasIda(vent, v1, a1);
					c.iniciar();
					cerrarActual();
				} else if (this.d1.opIV.isSelected() && this.d1.opIda.isSelected() == false) {
					SeleccionFechasIV vent = new SeleccionFechasIV();
					CtrlSeleccionFechasIV c = new CtrlSeleccionFechasIV(vent, v1);
					c.iniciar();
					cerrarActual();
				}
			} else
				this.d1.valAdult.setVisible(true);
		

		} else {
			this.d1.advDefecto.setVisible(true);
		}

	}
	public void cerrarActual() {
		this.d1.setVisible(false);
	}
	
}
