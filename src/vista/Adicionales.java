package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.JLayeredPane;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.util.ArrayList;

public class Adicionales extends JFrame  {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public ArrayList<JToggleButton> asientos=new ArrayList<JToggleButton>();
	public JButton btnContinuar = new JButton("Continuar");
	public JButton btnRegresar = new JButton("Regresar");
	public JLabel advDefecto = new JLabel("** Faltan seleccionar asientos");
	public JLabel advExceso = new JLabel("** La cantidad de asientos excede el numero de pasajeros.");
	
    public JSpinner spinEM = new JSpinner();
    public JSpinner spinEB = new JSpinner();
	// Array de Boletos
		private JPanel BoletoN[] = new JPanel[28];
		private JLabel AsientoN[] = new JLabel[28];
		private JTextPane NBoletoN[] = new JTextPane[28];
		private JTextPane NAsientoFCN[] = new JTextPane[28];
	// Paleta de colores
		private Color verdeClarito = new Color(119, 229, 183);
	//Boletos
		private int indice= 0;
		private int posYBoleto = 20;
		private JScrollPane corredizo;
		private int tamPanelBoletos = 440;
	//Numero de Boletos
		int  [][] boleto = new int [7][4];
			int A1,A2,A3,A4,A5,A6,A7;
			int B1,B2,B3,B4,B5,B6,B7;
			int C1,C2,C3,C4,C5,C6,C7;
			int D1,D2,D3,D4,D5,D6,D7;
		//=======================================================
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adicionales frame = new Adicionales();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Adicionales() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel barraSuperior = new JPanel();
		barraSuperior.setLayout(null);
		barraSuperior.setForeground(Color.BLACK);
		barraSuperior.setBackground(new Color(0, 0, 128));
		barraSuperior.setBounds(0, 0, 1012, 62);
		contentPane.add(barraSuperior);
		
		JLabel nombreQuaria = new JLabel("QUARIA");
		nombreQuaria.setForeground(Color.WHITE);
		nombreQuaria.setFont(new Font("Dubai", Font.BOLD, 28));
		nombreQuaria.setBounds(88, 10, 129, 44);
		barraSuperior.add(nombreQuaria);
		
		JLabel logoQ = new JLabel("");
		logoQ.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes2/SL1 (1).png")));
		logoQ.setBounds(22, 7, 56, 47);
		barraSuperior.add(logoQ);
		
		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setForeground(Color.WHITE);
		lblCompra.setFont(new Font("Dubai", Font.BOLD, 18));
		lblCompra.setBounds(878, 23, 64, 24);
		barraSuperior.add(lblCompra);
		
		JLabel imagenAvion = new JLabel("");
		imagenAvion.setIcon(new ImageIcon(Adicionales.class.getResource("/imagenesProyecto/cochecito.png")));
		imagenAvion.setBounds(952, 14, 30, 40);
		barraSuperior.add(imagenAvion);
		
		
		JLabel Linea = new JLabel("");
		Linea.setIcon(new ImageIcon(Adicionales.class.getResource("/imagenes2/linea.png")));
		Linea.setBounds(512, 128, 40, 504);
		contentPane.add(Linea);
		
		JLabel lineaTiempo = new JLabel("New label");
		lineaTiempo.setIcon(new ImageIcon(Adicionales.class.getResource("/imagenes2/lineaT3.png")));
		lineaTiempo.setBounds(584, 127, 383, 106);
		contentPane.add(lineaTiempo);
		
		JPanel selecEquipaje = new JPanel();
		selecEquipaje.setBounds(584, 264, 371, 260);
		contentPane.add(selecEquipaje);
		selecEquipaje.setLayout(null);
		
		JTextPane textEMano = new JTextPane();
		textEMano.setText("Equipaje de mano");
		textEMano.setForeground(new Color(0, 0, 128));
		textEMano.setFont(new Font("Dubai", Font.PLAIN, 22));
		textEMano.setEditable(false);
		textEMano.setBackground(SystemColor.menu);
		textEMano.setBounds(91, 35, 169, 34);
		selecEquipaje.add(textEMano);
		
		JTextPane textPrecioEM = new JTextPane();
		textPrecioEM.setText("Costo por c/u: S/.8");
		textPrecioEM.setForeground(new Color(106, 90, 205));
		textPrecioEM.setFont(new Font("Dubai", Font.PLAIN, 20));
		textPrecioEM.setEditable(false);
		textPrecioEM.setBackground(SystemColor.menu);
		textPrecioEM.setBounds(91, 64, 169, 30);
		selecEquipaje.add(textPrecioEM);
		
		JTextPane textEBodega = new JTextPane();
		textEBodega.setText("Equipaje de bodega");
		textEBodega.setForeground(new Color(0, 0, 128));
		textEBodega.setFont(new Font("Dubai", Font.PLAIN, 22));
		textEBodega.setEditable(false);
		textEBodega.setBackground(SystemColor.menu);
		textEBodega.setBounds(91, 141, 188, 34);
		selecEquipaje.add(textEBodega);
		
		JTextPane textPrecioEB = new JTextPane();
		textPrecioEB.setText("Costo por c/u: S/.21");
		textPrecioEB.setForeground(new Color(106, 90, 205));
		textPrecioEB.setFont(new Font("Dubai", Font.PLAIN, 20));
		textPrecioEB.setEditable(false);
		textPrecioEB.setBackground(SystemColor.menu);
		textPrecioEB.setBounds(91, 177, 188, 32);
		selecEquipaje.add(textPrecioEB);
		
		
		spinEM.setBounds(283, 52, 52, 34);
		selecEquipaje.add(spinEM);
		
		SpinnerNumberModel EMspin = new SpinnerNumberModel();
		EMspin.setMaximum(10);
		EMspin.setMinimum(0); 
		spinEM.setModel(EMspin);
		
		
		spinEB.setBounds(283, 158, 52, 34);
		selecEquipaje.add(spinEB);
		
		SpinnerNumberModel EBspin = new SpinnerNumberModel();
		EBspin.setMaximum(7);
		EBspin.setMinimum(0); 
		spinEB.setModel(EBspin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Adicionales.class.getResource("/imagenes2/imagenEqMano.png")));
		lblNewLabel.setBounds(20, 50, 71, 44);
		selecEquipaje.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Adicionales.class.getResource("/imagenes2/imagenEqBodega.png")));
		lblNewLabel_1.setBounds(29, 147, 52, 62);
		selecEquipaje.add(lblNewLabel_1);
		
		JLabel lblSeleccionaEq = new JLabel("Selecciona tu equipaje:");
		lblSeleccionaEq.setForeground(new Color(0, 0, 128));
		lblSeleccionaEq.setFont(new Font("Dubai", Font.PLAIN, 21));
		lblSeleccionaEq.setBounds(584, 228, 253, 26);
		contentPane.add(lblSeleccionaEq);
		
		JLabel lblSeleccionaTuAsiento = new JLabel("Selecciona tu asiento:");
		lblSeleccionaTuAsiento.setForeground(new Color(0, 0, 128));
		lblSeleccionaTuAsiento.setFont(new Font("Dubai", Font.PLAIN, 21));
		lblSeleccionaTuAsiento.setBounds(49, 121, 198, 26);
		contentPane.add(lblSeleccionaTuAsiento);
		
		JLabel lblAsientosSeleccionados = new JLabel(" Asientos seleccionados");
		lblAsientosSeleccionados.setForeground(Color.BLACK);
		lblAsientosSeleccionados.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblAsientosSeleccionados.setBounds(314, 138, 185, 26);
		contentPane.add(lblAsientosSeleccionados);
		
		//Panel de Boletos
		//=======================================================
		corredizo = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 245, 245));
		panel.setBounds(314, 174, 188, 385);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(72, 209, 204));
		layeredPane.setBounds(10, 10, 168, 365);
		panel.add(layeredPane);
		
		corredizo.setBounds(314, 174, 188, 385);
		contentPane.add(corredizo);
		corredizo.setViewportView(panel);
		//=======================================================
		
		
		
		JToggleButton asientoA1 = new JToggleButton("A1");
		asientoA1.setBackground(new Color(0, 0, 128));
		asientoA1.setBounds(85, 244, 25, 21);
		contentPane.add(asientoA1);
		EstaSeleccionado(asientoA1, panel,0,0);
		
		JToggleButton asientoA2 = new JToggleButton("A2");
		asientoA2.setBackground(new Color(0, 0, 128));
		asientoA2.setBounds(85, 285, 25, 21);
		contentPane.add(asientoA2);
		EstaSeleccionado(asientoA2, panel,1,0);
		
		JToggleButton asientoA3 = new JToggleButton("A3");
		asientoA3.setBackground(new Color(0, 0, 128));
		asientoA3.setBounds(85, 329, 25, 21);
		contentPane.add(asientoA3);
		EstaSeleccionado(asientoA3, panel,2,0);
		
		JToggleButton asientoA4 = new JToggleButton("A4");
		asientoA4.setBackground(new Color(0, 0, 128));
		asientoA4.setBounds(85, 398, 25, 21);
		contentPane.add(asientoA4);
		EstaSeleccionado(asientoA4, panel,3,0);
		
		JToggleButton asientoA5 = new JToggleButton("A5");
		asientoA5.setBackground(new Color(0, 0, 128));
		asientoA5.setBounds(85, 434, 25, 21);
		contentPane.add(asientoA5);
		EstaSeleccionado(asientoA5, panel,4,0);
		
		JToggleButton asientoA6 = new JToggleButton("A6");
		asientoA6.setBackground(new Color(0, 0, 128));
		asientoA6.setBounds(85, 476, 25, 21);
		contentPane.add(asientoA6);
		EstaSeleccionado(asientoA6, panel,5,0);
		
		JToggleButton asientoA7 = new JToggleButton("A7");
		asientoA7.setBackground(new Color(0, 0, 128));
		asientoA7.setBounds(85, 515, 25, 21);
		contentPane.add(asientoA7);
		EstaSeleccionado(asientoA7, panel,6,0);
		
		JToggleButton asientoB1 = new JToggleButton("B1");
		asientoB1.setBackground(new Color(0, 0, 128));
		asientoB1.setBounds(120, 244, 25, 21);
		contentPane.add(asientoB1);
		EstaSeleccionado(asientoB1, panel,0,1);
		
		JToggleButton asientoB2 = new JToggleButton("B2");
		asientoB2.setBackground(new Color(0, 0, 128));
		asientoB2.setBounds(120, 285, 25, 21);
		contentPane.add(asientoB2);
		EstaSeleccionado(asientoB2, panel,1,1);
		
		
		JToggleButton asientoB3 = new JToggleButton("B3");
		asientoB3.setBackground(new Color(0, 0, 128));
		asientoB3.setBounds(120, 329, 25, 21);
		contentPane.add(asientoB3);
		EstaSeleccionado(asientoB3, panel,2,1);
		

		
		JToggleButton asientoB4 = new JToggleButton("B4");
		asientoB4.setBackground(new Color(0, 0, 128));
		asientoB4.setBounds(120, 398, 25, 21);
		contentPane.add(asientoB4);
		EstaSeleccionado(asientoB4, panel,3,1);
		
		JToggleButton asientoB5 = new JToggleButton("B5");
		asientoB5.setBackground(new Color(0, 0, 128));
		asientoB5.setBounds(120, 434, 25, 21);
		contentPane.add(asientoB5);
		EstaSeleccionado(asientoB5, panel,4,1);
		
		
		JToggleButton asientoB6 = new JToggleButton("B6");
		asientoB6.setBackground(new Color(0, 0, 128));
		asientoB6.setBounds(120, 476, 25, 21);
		contentPane.add(asientoB6);
		EstaSeleccionado(asientoB6, panel,5,1);
		
		JToggleButton asientoB7 = new JToggleButton("B7");
		asientoB7.setBackground(new Color(0, 0, 128));
		asientoB7.setBounds(120, 515, 25, 21);
		contentPane.add(asientoB7);
		EstaSeleccionado(asientoB7, panel,6,1);
		
		JToggleButton asientoC1 = new JToggleButton("C1");
		asientoC1.setBackground(new Color(0, 0, 128));
		asientoC1.setBounds(176, 244, 25, 21);
		contentPane.add(asientoC1);
		EstaSeleccionado(asientoC1, panel,0,2);
		
		JToggleButton asientoC2 = new JToggleButton("C2");
		asientoC2.setBackground(new Color(0, 0, 128));
		asientoC2.setBounds(176, 285, 25, 21);
		contentPane.add(asientoC2);
		EstaSeleccionado(asientoC2, panel,1,2);
		
		JToggleButton asientoC3 = new JToggleButton("C3");
		asientoC3.setBackground(new Color(0, 0, 128));
		asientoC3.setBounds(176, 329, 25, 21);
		contentPane.add(asientoC3);
		EstaSeleccionado(asientoC3, panel,2,2);
		
		
		
		JToggleButton asientoC4 = new JToggleButton("C4");
		asientoC4.setBackground(new Color(0, 0, 128));
		asientoC4.setBounds(176, 398, 25, 21);
		contentPane.add(asientoC4);
		EstaSeleccionado(asientoC4, panel,3,2);
		
		JToggleButton asientoC5 = new JToggleButton("C5");
		asientoC5.setBackground(new Color(0, 0, 128));
		asientoC5.setBounds(176, 434, 25, 21);
		contentPane.add(asientoC5);
		EstaSeleccionado(asientoC5, panel,4,2);
		
		JToggleButton asientoC6 = new JToggleButton("C6");
		asientoC6.setBackground(new Color(0, 0, 128));
		asientoC6.setBounds(176, 476, 25, 21);
		contentPane.add(asientoC6);
		EstaSeleccionado(asientoC6, panel,5,2);
		
		JToggleButton asientoC7 = new JToggleButton("C7");
		asientoC7.setBackground(new Color(0, 0, 128));
		asientoC7.setBounds(176, 515, 25, 21);
		contentPane.add(asientoC7);
		EstaSeleccionado(asientoC7, panel,6,2);
		
		JToggleButton asientoD1 = new JToggleButton("D1");
		asientoD1.setBackground(new Color(0, 0, 128));
		asientoD1.setBounds(218, 244, 25, 21);
		contentPane.add(asientoD1);
		EstaSeleccionado(asientoD1, panel,0,3);
		
		JToggleButton asientoD2 = new JToggleButton("D2");
		asientoD2.setBackground(new Color(0, 0, 128));
		asientoD2.setBounds(218, 285, 25, 21);
		contentPane.add(asientoD2);
		EstaSeleccionado(asientoD2, panel,1,3);
		
		JToggleButton asientoD3 = new JToggleButton("D3");
		asientoD3.setBackground(new Color(0, 0, 128));
		asientoD3.setBounds(218, 329, 25, 21);
		contentPane.add(asientoD3);
		EstaSeleccionado(asientoD3, panel,2,3);
		
		JToggleButton asientoD4 = new JToggleButton("D4");
		asientoD4.setBackground(new Color(0, 0, 128));
		asientoD4.setBounds(218, 398, 25, 21);
		contentPane.add(asientoD4);
		EstaSeleccionado(asientoD4, panel,3,3);
		
		JToggleButton asientoD5 = new JToggleButton("D5");
		asientoD5.setBackground(new Color(0, 0, 128));
		asientoD5.setBounds(218, 434, 25, 21);
		contentPane.add(asientoD5);
		EstaSeleccionado(asientoD5, panel,4,3);
		
		JToggleButton asientoD6 = new JToggleButton("D6");
		asientoD6.setBackground(new Color(0, 0, 128));
		asientoD6.setBounds(218, 476, 25, 21);
		contentPane.add(asientoD6);
		EstaSeleccionado(asientoD6, panel,5,3);
		
		JToggleButton asientoD7 = new JToggleButton("D7");
		asientoD7.setBackground(new Color(0, 0, 128));
		asientoD7.setBounds(218, 515, 25, 21);
		contentPane.add(asientoD7);
		EstaSeleccionado(asientoD7, panel,6,3);
		
		
		
		
		
		
		
		
		JLabel lblsalidaDeEmergencia = new JLabel("...........Salida de emergencia............");
		lblsalidaDeEmergencia.setForeground(new Color(0, 0, 128));
		lblsalidaDeEmergencia.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblsalidaDeEmergencia.setBounds(64, 357, 198, 31);
		contentPane.add(lblsalidaDeEmergencia);
		
		JLabel lblABC = new JLabel("A      B            C     D");
		lblABC.setForeground(new Color(0, 0, 128));
		lblABC.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblABC.setBounds(85, 202, 177, 31);
		contentPane.add(lblABC);
		
		JLabel f1 = new JLabel("1\r\n");
		f1.setForeground(new Color(0, 0, 128));
		f1.setFont(new Font("Dubai", Font.PLAIN, 18));
		f1.setBounds(155, 237, 16, 42);
		contentPane.add(f1);
		
		JLabel f2 = new JLabel("2");
		f2.setForeground(new Color(0, 0, 128));
		f2.setFont(new Font("Dubai", Font.PLAIN, 18));
		f2.setBounds(155, 274, 16, 42);
		contentPane.add(f2);
		
		JLabel f3 = new JLabel("3");
		f3.setForeground(new Color(0, 0, 128));
		f3.setFont(new Font("Dubai", Font.PLAIN, 18));
		f3.setBounds(155, 321, 16, 42);
		contentPane.add(f3);
		
		JLabel f4 = new JLabel("4");
		f4.setForeground(new Color(0, 0, 128));
		f4.setFont(new Font("Dubai", Font.PLAIN, 18));
		f4.setBounds(155, 382, 16, 42);
		contentPane.add(f4);
		
		JLabel f5 = new JLabel("5");
		f5.setForeground(new Color(0, 0, 128));
		f5.setFont(new Font("Dubai", Font.PLAIN, 18));
		f5.setBounds(155, 424, 16, 42);
		contentPane.add(f5);
		
		JLabel f6 = new JLabel("6");
		f6.setForeground(new Color(0, 0, 128));
		f6.setFont(new Font("Dubai", Font.PLAIN, 18));
		f6.setBounds(155, 469, 16, 42);
		contentPane.add(f6);
		
		JLabel f7 = new JLabel("7");
		f7.setForeground(new Color(0, 0, 128));
		f7.setFont(new Font("Dubai", Font.PLAIN, 18));
		f7.setBounds(155, 503, 16, 42);
		contentPane.add(f7);
		
		JLabel fondoDelAvion = new JLabel("");
		fondoDelAvion.setBounds(49, 157, 236, 419);
		contentPane.add(fondoDelAvion);
		fondoDelAvion.setIcon(new ImageIcon(Adicionales.class.getResource("/imagenes2/fondo-avion-blanco.png")));
		
		
		advExceso.setForeground(new Color(220, 20, 60));
		advExceso.setFont(new Font("Dubai", Font.ITALIC, 16));
		advExceso.setBounds(59, 569, 417, 26);
		contentPane.add(advExceso);
		advExceso.setVisible(false);
		
		
		advDefecto.setForeground(new Color(220, 20, 60));
		advDefecto.setFont(new Font("Dubai", Font.ITALIC, 16));
		advDefecto.setBounds(59, 594, 417, 26);
		contentPane.add(advDefecto);
		advDefecto.setVisible(false);
		
		//ArrayList if JtoggleButton
		
		asientos.add(asientoA1);
		asientos.add(asientoA2);
		asientos.add(asientoA3);
		asientos.add(asientoA4);
		asientos.add(asientoA5);
		asientos.add(asientoA6);
		asientos.add(asientoA7);
		asientos.add(asientoB1);
		asientos.add(asientoB2);
		asientos.add(asientoB3);
		asientos.add(asientoB4);
		asientos.add(asientoB5);
		asientos.add(asientoB6);
		asientos.add(asientoB7);
		asientos.add(asientoC1);
		asientos.add(asientoC2);
		asientos.add(asientoC3);
		asientos.add(asientoC4);
		asientos.add(asientoC5);
		asientos.add(asientoC6);
		asientos.add(asientoC7);
		asientos.add(asientoD1);
		asientos.add(asientoD2);
		asientos.add(asientoD3);
		asientos.add(asientoD4);
		asientos.add(asientoD5);
		asientos.add(asientoD6);
		asientos.add(asientoD7);
		 
		//Selection
	
		
		btnContinuar.setForeground(Color.WHITE);
		btnContinuar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnContinuar.setBackground(new Color(0, 0, 128));
		btnContinuar.setBounds(632, 556, 104, 32);
		contentPane.add(btnContinuar);
		
		
		
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnRegresar.setBackground(new Color(154, 160, 230));
		btnRegresar.setBounds(800, 556, 104, 32);
		contentPane.add(btnRegresar);
		
		JLabel lblSeleccinDeAdicionales = new JLabel("Selecci\u00F3n de Adicionales -Ida");
		lblSeleccinDeAdicionales.setForeground(new Color(0, 0, 128));
		lblSeleccinDeAdicionales.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblSeleccinDeAdicionales.setBounds(361, 75, 337, 43);
		contentPane.add(lblSeleccinDeAdicionales);
		
		
	}
	public void CrearBoleto(JPanel panel,JToggleButton boton) {

		BoletoN[indice] = new JPanel();
		AsientoN[indice] = new JLabel("Asiento");
		NBoletoN[indice] = new JTextPane();
		NAsientoFCN[indice] = new JTextPane();
		
		BoletoN[indice].setBounds(8, posYBoleto, 169, 94);
		panel.add(BoletoN[indice]);
		BoletoN[indice].setBackground(verdeClarito);
		BoletoN[indice].setLayout(null);
		
		AsientoN[indice].setBounds(42, 20, 68, 30);
		AsientoN[indice].setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		BoletoN[indice].add(AsientoN[indice]);

		
		NBoletoN[indice].setEditable(false);
		NBoletoN[indice].setBounds(108, 16, 29, 30);
		NBoletoN[indice].setFont(new Font("Dubai Medium", Font.PLAIN, 19));
		NBoletoN[indice].setBackground(verdeClarito);
		NBoletoN[indice].setText(String.valueOf(indice+1));
		BoletoN[indice].add(NBoletoN[indice]);
		
		// Aca agregaremos el numero del boleto
		NAsientoFCN[indice].setEditable(false);
		NAsientoFCN[indice].setBounds(74, 45, 29, 30);
		NAsientoFCN[indice].setFont(new Font("Dubai Medium", Font.PLAIN, 18));
		NAsientoFCN[indice].setBackground(verdeClarito);
		NAsientoFCN[indice].setText(boton.getText());
		
		BoletoN[indice].add(NAsientoFCN[indice]);
		posYBoleto = posYBoleto + 100;
		indice++;
		
	
	}
	public void EstaSeleccionado(JToggleButton boton,JPanel panel,int f,int c) {
		boton.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				int estado = itemEvent.getStateChange();
				if (estado == ItemEvent.SELECTED) {
					setTitle(boton.getText());
					setTitle("Crear "+String.valueOf(indice));
					boleto[f][c] = indice;
					
					CrearBoleto( panel, boton);
					
					if(indice>2) {
						panel.setPreferredSize(new Dimension(100, tamPanelBoletos));
						corredizo.setBounds(314, 174, 198, 385);
						tamPanelBoletos += 100; 
					}
					
					
				} else {
					//setTitle("Boleto " + String.valueOf(boleto[f][c]) );
					//panel.setPreferredSize(new Dimension(100, tamPanelBoletos));
					//tamPanelBoletos += 100; 
					
					
					//boleto[f][c] = Integer.parseInt(NBoletoN[indice].getText());
					BorrarBoleto(boleto[f][c],panel);
	
					setTitle("Boleto "+boton.getText() +" "+ String.valueOf(boleto[f][c]));
					
				}
			}
			
		});
	}
	public void BorrarBoleto(int Nboleto,JPanel panel) {
		
		//setTitle("Borrar "+String.valueOf(indice));
		
		indice--;
			int b = indice ;
			for(int i = Nboleto; i < b;i++) {
				AsientoN[i].setText(AsientoN[i+1].getText());  
				NBoletoN[i].setText(String.valueOf(i+1));  
				NAsientoFCN[i].setText(NAsientoFCN[i+1].getText());
			}
			
		@SuppressWarnings("unused")
		int a = indice - 1;
		BoletoN[indice].setVisible(false);
		posYBoleto = posYBoleto - 100;
		
	}

	
}