package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.*;
import vista.*;

public class CtrlSeleccionFechasIV {
	SeleccionFechasIV f1=new SeleccionFechasIV();
	Vuelo v1=new Vuelo();
	Aerolinea a1=new Aerolinea();
	
	public CtrlSeleccionFechasIV(SeleccionFechasIV f1, Vuelo v1) {
		this.f1 = f1;
		this.v1 = v1;
		this.f1.horasDesplegable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarDesplegable();
			}
		});
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
		this.f1.txtpnLima.setText(v1.ORIGEN);
		this.f1.mTrayecto.setText(v1.getTrayecto());
		this.f1.mPasajeros.setText(v1.getNumpasajeros()+" personas");
		this.f1.mTipo.setText(v1.getTipoVuelo());
		this.f1.fechasDesplegable1.addItem(a1.getFechas().get(0).get(5)+" de "+a1.getFechas().get(0).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(0).get(1));
		this.f1.fechasDesplegable1.addItem(a1.getFechas().get(3).get(5)+" de "+a1.getFechas().get(3).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(3).get(1));
		this.f1.fechasDesplegable1.addItem(a1.getFechas().get(6).get(5)+" de "+a1.getFechas().get(6).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(6).get(1));
		this.f1.fechasDesplegable1.addItem(a1.getFechas().get(9).get(5)+" de "+a1.getFechas().get(9).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(9).get(1));
		this.f1.fechasDesplegable1.addItem(a1.getFechas().get(12).get(5)+" de "+a1.getFechas().get(12).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechas().get(12).get(1));
		
	}
	
	public void activarDesplegable() {
		String s = (String) this.f1.fechasDesplegable1.getSelectedItem();
		this.f1.fechasDesplegable2.removeAllItems();
		a1.CrearHorariosV(s);
		this.f1.fechasDesplegable2.addItem(a1.getFechasV().get(0).get(5)+" de "+a1.getFechasV().get(0).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechasV().get(0).get(1));
		this.f1.fechasDesplegable2.addItem(a1.getFechasV().get(3).get(5)+" de "+a1.getFechasV().get(3).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechasV().get(3).get(1));
		this.f1.fechasDesplegable2.addItem(a1.getFechasV().get(6).get(5)+" de "+a1.getFechasV().get(6).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechasV().get(6).get(1));
		this.f1.fechasDesplegable2.addItem(a1.getFechasV().get(9).get(5)+" de "+a1.getFechasV().get(9).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechasV().get(9).get(1));
		this.f1.fechasDesplegable2.addItem(a1.getFechasV().get(12).get(5)+" de "+a1.getFechasV().get(12).getDisplayName(2, 2, this.f1.getLocale())+" de "+a1.getFechasV().get(12).get(1));
		
		this.f1.fechasDesplegable2.setEnabled(true);
	}
	public void acumular() {
		//GOING
		String fechaTexto= (String) this.f1.fechasDesplegable1.getSelectedItem();
		String horaTexto=(String) this.f1.horasDesplegable1.getSelectedItem();
		v1.setTextoFechaI(fechaTexto);
		v1.transformarFechaI();
		v1.setHoraI(horaTexto);
		
		//RETURNING
		String fechaTexto2= (String) this.f1.fechasDesplegable2.getSelectedItem();
		String horaTexto2=(String) this.f1.horasDesplegable2.getSelectedItem();
		v1.setTextoFechaIV(fechaTexto2);
		v1.transformarFechaV();
		v1.setHoraV(horaTexto2);
		
		
	}
	public void transicion() {
		//Next
		Adicionales vent=new Adicionales();
		CtrlAdicionales c=new CtrlAdicionales(vent, v1, a1);
		c.iniciar();
		this.f1.setVisible(false);
	}
	public void volver() {
		DetallesDelVuelo vent=new DetallesDelVuelo();
		CtrlDetallesDeVuelo c=new CtrlDetallesDeVuelo(vent,v1,a1);
		c.iniciar();
		this.f1.setVisible(false);
	}
}
