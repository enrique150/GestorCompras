package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import modelo.*;
import vista.*;

public class CtrlVentanaDestinos {
	VentanaDestinos vent;
	Vuelo v1=new Vuelo();

	public CtrlVentanaDestinos(VentanaDestinos vent) {
		this.vent = vent;
		
		this.vent.des1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Destino dBrasil= Destino.BRASIL;
				transicion(dBrasil);
			}
		});
		this.vent.des2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Destino dItalia= Destino.ITALIA;
				transicion(dItalia);
			}
		});
		this.vent.des3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Destino dFrancia= Destino.FRANCIA;
				transicion(dFrancia);
			}
		});
		this.vent.des4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Destino dFinlandia= Destino.FINLANDIA;
				transicion(dFinlandia);
			}
		});
		this.vent.des5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Destino dEEUU= Destino.EEUU;
				transicion(dEEUU);
			}
		});
		this.vent.des6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Destino dRD= Destino.RD;
				transicion(dRD);
			}
		});
		
		
	}
	public void iniciar() {
		this.vent.setVisible(true);
		this.vent.setLocationRelativeTo(null);
	}
	public void transicion(Destino d) {
		v1.setDestino(d);
		this.vent.v1.setDestino(d);
		DetallesDelVuelo vent= new DetallesDelVuelo();
		CtrlDetallesDeVuelo cd=new CtrlDetallesDeVuelo(vent,v1);
		cd.iniciar();
		this.vent.setVisible(false);
	}
	

}
