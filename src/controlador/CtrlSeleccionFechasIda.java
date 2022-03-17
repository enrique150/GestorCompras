package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Aerolinea;
import modelo.Vuelo;
import vista.*;

public class CtrlSeleccionFechasIda {
	SeleccionFechasIda f1=new SeleccionFechasIda();
	Vuelo v1=new Vuelo();
	Aerolinea a1=new Aerolinea();
	
	public CtrlSeleccionFechasIda(SeleccionFechasIda f1, Vuelo v1, Aerolinea a1) {
		this.f1 = f1;
		this.v1 = v1;
		this.a1 = a1;
		this.f1.btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acumular();
				transicion();
			}
		});
		this.f1.btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();
			}
		});
		
		
		
	}
	public void iniciar() {
		this.f1.setVisible(true);
		this.f1.setLocationRelativeTo(null);
		this.f1.txtDestino.setText(v1.getDestino().getCapital()+" , "+v1.getDestino().getPais()+" ("+v1.getDestino().getAbrev()+")");
		this.f1.txtOrigen.setText(v1.ORIGEN);
		this.f1.mTrayecto.setText(v1.getTrayecto());
		this.f1.mPasajeros.setText(v1.getNumpasajeros()+" personas");
		this.f1.mTipo.setText(v1.getTipoVuelo());
		this.f1.fechasDesplegable.addItem(a1.getFechas().get(0).get(5)+" de "+a1.getFechas().get(0).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(0).get(1));
		this.f1.fechasDesplegable.addItem(a1.getFechas().get(3).get(5)+" de "+a1.getFechas().get(3).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(3).get(1));
		this.f1.fechasDesplegable.addItem(a1.getFechas().get(6).get(5)+" de "+a1.getFechas().get(6).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(6).get(1));
		this.f1.fechasDesplegable.addItem(a1.getFechas().get(9).get(5)+" de "+a1.getFechas().get(9).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(9).get(1));
		this.f1.fechasDesplegable.addItem(a1.getFechas().get(12).get(5)+" de "+a1.getFechas().get(12).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(12).get(1));
		
	}
	public void acumular() {
		//Saving Dates
		String fechaTexto= (String) this.f1.fechasDesplegable.getSelectedItem();
		String horaTexto=(String) this.f1.horasDesplegable.getSelectedItem();
		v1.setTextoFechaI(fechaTexto);
		v1.transformarFechaI();
		v1.setHoraI(horaTexto);
	}
	
	public void transicion() {
		//Next
		Adicionales vent=new Adicionales();
		CtrlAdicionales c=new CtrlAdicionales(vent, v1, a1);
		c.iniciar();
		f1.setVisible(false);
	}
	public void volver() {
		DetallesDelVuelo vent= new DetallesDelVuelo();
		CtrlDetallesDeVuelo cd=new CtrlDetallesDeVuelo(vent,v1,a1);
		cd.iniciar();
		this.f1.setVisible(false);
	}
	
	
	
}
