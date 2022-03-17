package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Inicio;
import vista.VentanaDestinos;

public class CtrlInicio {
	Inicio i1;

	public CtrlInicio(Inicio i1) {
		this.i1 = i1;
		
		this.i1.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaDestinos destinos= new VentanaDestinos();
				CtrlVentanaDestinos cDestinos=new CtrlVentanaDestinos(destinos);
				cDestinos.iniciar();
				transicion();
			}
		});
	}
	public void iniciar() {
		this.i1.setVisible(true);
		this.i1.setLocationRelativeTo(null);
	}
	public void transicion() {
		this.i1.setVisible(false);
	}
	
}
