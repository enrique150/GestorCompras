package principal;

import controlador.CtrlPreInicio;
import vista.*;

public class PruebaAgencia {
	public static void main(String[] args) {
		PreInicio ini= new PreInicio();
		CtrlPreInicio controlador=new CtrlPreInicio(ini);
		controlador.iniciar();
	}
}
