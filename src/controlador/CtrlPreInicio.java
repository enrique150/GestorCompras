package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import vista.Inicio;
import vista.PreInicio;

public class CtrlPreInicio {
	PreInicio p1;

	public CtrlPreInicio(PreInicio p1) {
		this.p1 = p1;
		this.p1.lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Inicio ini= new Inicio();
				CtrlInicio cInicio=new CtrlInicio(ini);
				cInicio.iniciar();
				transicion();
				
			}
		});
	}
	public void iniciar() {
		this.p1.setVisible(true);
		this.p1.setLocationRelativeTo(null);
	}
	public void transicion() {
		this.p1.setVisible(false);
	}
	
		
}
