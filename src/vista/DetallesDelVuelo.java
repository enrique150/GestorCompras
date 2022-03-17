package vista;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

public class DetallesDelVuelo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JButton btnNewButton = new JButton("Consultar");
	public JRadioButton opIda = new JRadioButton("Ida");
	public JRadioButton opIV = new JRadioButton("Ida y vuelta");
	public JSpinner spinNinos = new JSpinner();
	public JSpinner spinAdultos = new JSpinner();
	public JSpinner spinBebe = new JSpinner();
	public JRadioButton opEconomico = new JRadioButton("Economico");
	public JRadioButton opBusiness = new JRadioButton("Business");
	public JRadioButton opPremium = new JRadioButton("Premium");
	public JTextPane txtDestino = new JTextPane();
	public JButton btnRegresar = new JButton("Regresar");
	public JLabel valAdult = new JLabel("**Se requiere m\u00EDnimo un adulto");
	public JLabel advDefecto  = new JLabel("** Seleccione solo una opcion");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					DetallesDelVuelo frame = new DetallesDelVuelo();
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
	
	public DetallesDelVuelo() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Declaration of variables
		
		
		//Structure
		JPanel barraSuperior = new JPanel();
		barraSuperior.setLayout(null);
		barraSuperior.setForeground(Color.BLACK);
		barraSuperior.setBackground(new Color(0, 0, 128));
		barraSuperior.setBounds(0, 0, 1012, 62);
		contentPane.add(barraSuperior);
		
		JLabel nombreQuaria = new JLabel("QUARIA");
		nombreQuaria.setForeground(Color.WHITE);
		nombreQuaria.setFont(new Font("Dubai", Font.BOLD, 28));
		nombreQuaria.setBounds(88, 10, 137, 44);
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
		imagenAvion.setIcon(new ImageIcon(DetallesDelVuelo.class.getResource("/imagenesProyecto/cochecito.png")));
		imagenAvion.setBounds(952, 14, 30, 40);
		barraSuperior.add(imagenAvion);
		
		JPanel panel = new JPanel();
		panel.setBounds(79, 131, 443, 442);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setForeground(new Color(0, 0, 128));
		lblOrigen.setFont(new Font("Dubai", Font.BOLD, 17));
		lblOrigen.setBounds(38, 28, 155, 32);
		panel.add(lblOrigen);
		
		
		
		JTextPane txtOrigen = new JTextPane();
		txtOrigen.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtOrigen.setEditable(false);
		txtOrigen.setText("Lima, Per\u00FA (LIM)");
		txtOrigen.setBounds(38, 58, 367, 32);
		panel.add(txtOrigen);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setForeground(new Color(0, 0, 128));
		lblDestino.setFont(new Font("Dubai", Font.BOLD, 17));
		lblDestino.setBounds(38, 93, 155, 32);
		panel.add(lblDestino);
		
		//Show place
		
		txtDestino.setEditable(false);
		
		txtDestino.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtDestino.setBounds(38, 122, 367, 32);
		panel.add(txtDestino);
		
		JLabel lblTrayecto = new JLabel("Trayecto:");
		lblTrayecto.setForeground(new Color(0, 0, 128));
		lblTrayecto.setFont(new Font("Dubai", Font.BOLD, 17));
		lblTrayecto.setBounds(38, 157, 155, 32);
		panel.add(lblTrayecto);
		
		
		opIda.setFont(new Font("Dubai", Font.PLAIN, 17));
		opIda.setBounds(90, 195, 103, 21);
		panel.add(opIda);
		
		
		opIV.setFont(new Font("Dubai", Font.PLAIN, 17));
		opIV.setBounds(226, 195, 143, 21);
		panel.add(opIV);
		
		JLabel lblPasajeros = new JLabel("Pasajeros:");
		lblPasajeros.setForeground(new Color(0, 0, 128));
		lblPasajeros.setFont(new Font("Dubai", Font.BOLD, 17));
		lblPasajeros.setBounds(38, 222, 155, 32);
		panel.add(lblPasajeros);
		
		JLabel lblAdultos = new JLabel("Adultos");
		lblAdultos.setForeground(new Color(0, 0, 0));
		lblAdultos.setFont(new Font("Dubai", Font.PLAIN, 17));
		lblAdultos.setBounds(38, 264, 63, 32);
		panel.add(lblAdultos);
		
		JLabel lblNios = new JLabel("Ni\u00F1os");
		lblNios.setForeground(Color.BLACK);
		lblNios.setFont(new Font("Dubai", Font.PLAIN, 17));
		lblNios.setBounds(176, 264, 63, 32);
		panel.add(lblNios);
		
		
		spinAdultos.setBackground(new Color(123, 104, 238));
		spinAdultos.setForeground(new Color(0, 0, 0));
		spinAdultos.setFont(new Font("Dubai", Font.PLAIN, 17));
		spinAdultos.setBounds(100, 264, 54, 32);
		panel.add(spinAdultos);
		
        SpinnerNumberModel AdultoSpin = new SpinnerNumberModel();
        AdultoSpin.setMaximum(10);
        AdultoSpin.setMinimum(0); 
        spinAdultos.setModel(AdultoSpin);
		

		spinNinos.setForeground(Color.BLACK);
		spinNinos.setFont(new Font("Dubai", Font.PLAIN, 17));
		spinNinos.setBackground(new Color(123, 104, 238));
		spinNinos.setBounds(226, 264, 54, 32);
		panel.add(spinNinos);
		
        SpinnerNumberModel NinoSpin = new SpinnerNumberModel();
        NinoSpin.setMaximum(10);
        NinoSpin.setMinimum(0);
        spinNinos.setModel(NinoSpin);
		
		
		spinBebe.setForeground(Color.BLACK);
		spinBebe.setFont(new Font("Dubai", Font.PLAIN, 17));
		spinBebe.setBackground(new Color(123, 104, 238));
		spinBebe.setBounds(351, 265, 54, 32);
		panel.add(spinBebe);
		
        SpinnerNumberModel BebeSpin = new SpinnerNumberModel();
        BebeSpin.setMaximum(10);
        BebeSpin.setMinimum(0);
        spinBebe.setModel(BebeSpin);
        
		JLabel lblBebes = new JLabel("Bebes");
		lblBebes.setForeground(Color.BLACK);
		lblBebes.setFont(new Font("Dubai", Font.PLAIN, 17));
		lblBebes.setBounds(306, 265, 63, 32);
		panel.add(lblBebes);
		
		JLabel lblTipoDeVuelo = new JLabel("Tipo de Vuelo:");
		lblTipoDeVuelo.setForeground(new Color(0, 0, 128));
		lblTipoDeVuelo.setFont(new Font("Dubai", Font.BOLD, 17));
		lblTipoDeVuelo.setBounds(38, 306, 155, 32);
		panel.add(lblTipoDeVuelo);
		
		
		opEconomico.setFont(new Font("Dubai", Font.PLAIN, 17));
		opEconomico.setBounds(51, 335, 103, 21);
		panel.add(opEconomico);
		
		
		opBusiness.setFont(new Font("Dubai", Font.PLAIN, 17));
		opBusiness.setBounds(187, 335, 103, 21);
		panel.add(opBusiness);
		
		
		opPremium.setFont(new Font("Dubai", Font.PLAIN, 17));
		opPremium.setBounds(302, 336, 103, 21);
		panel.add(opPremium);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DetallesDelVuelo.class.getResource("/imagenesProyecto/som2.png")));
		lblNewLabel.setBounds(61, 117, 510, 469);
		contentPane.add(lblNewLabel);
		
		JLabel lblDetallesDelVuelo = new JLabel("Detalles del Vuelo");
		lblDetallesDelVuelo.setForeground(new Color(0, 0, 128));
		lblDetallesDelVuelo.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblDetallesDelVuelo.setBounds(394, 77, 218, 43);
		contentPane.add(lblDetallesDelVuelo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DetallesDelVuelo.class.getResource("/imagenesProyecto/lineaT1.png")));
		lblNewLabel_1.setBounds(581, 146, 350, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DetallesDelVuelo.class.getResource("/imagenesProyecto/VueloF.png")));
		lblNewLabel_2.setBounds(599, 226, 312, 360);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblVuelo = new JLabel("Vuelo");
		lblVuelo.setForeground(Color.BLACK);
		lblVuelo.setFont(new Font("Dubai", Font.BOLD, 17));
		lblVuelo.setBounds(581, 190, 63, 32);
		contentPane.add(lblVuelo);
		
		JLabel lblFecha = new JLabel("Fechas");
		lblFecha.setForeground(Color.BLACK);
		lblFecha.setFont(new Font("Dubai", Font.PLAIN, 17));
		lblFecha.setBounds(678, 190, 63, 32);
		contentPane.add(lblFecha);
		
		JLabel lblAdicionales = new JLabel("Adicionales");
		lblAdicionales.setForeground(Color.BLACK);
		lblAdicionales.setFont(new Font("Dubai", Font.PLAIN, 17));
		lblAdicionales.setBounds(766, 190, 89, 34);
		contentPane.add(lblAdicionales);
		
		JLabel lblPasajeros_1 = new JLabel("Pasajeros");
		lblPasajeros_1.setForeground(Color.BLACK);
		lblPasajeros_1.setFont(new Font("Dubai", Font.PLAIN, 17));
		lblPasajeros_1.setBounds(877, 190, 89, 34);
		contentPane.add(lblPasajeros_1);
		
		
		valAdult.setBounds(100, 417, 236, 13);
		valAdult.setForeground(new Color(220, 20, 60));
		valAdult.setFont(new Font("Dubai", Font.PLAIN, 16));
		panel.add(valAdult);
		valAdult.setVisible(false);
		
		
		btnNewButton.setFont(new Font("Dubai", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(89, 375, 104, 32);
		panel.add(btnNewButton);
		
		
		
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnRegresar.setBackground(new Color(154, 160, 230));
		btnRegresar.setBounds(226, 375, 104, 32);
		panel.add(btnRegresar);
		
		advDefecto.setForeground(new Color(220, 20, 60));
		advDefecto.setFont(new Font("Dubai", Font.ITALIC, 16));
		advDefecto.setBounds(89, 405, 214, 42);
		panel.add(advDefecto);
		advDefecto.setVisible(false);
		
		
	}
}