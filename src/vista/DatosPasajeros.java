package vista;

//Ask to E about text backward
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Imagenes;
import modelo.ImagesAndTextRenderer;
import modelo.Pasajeros;

import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;


public class DatosPasajeros extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public Pasajeros pasajero=new Pasajeros();
	public JTextPane txtTipoPasajero = new JTextPane();
	public JTextPane txtNombres = new JTextPane();
	public JTextPane txtApellidos = new JTextPane();
	public JComboBox<String> generoDesplegable = new JComboBox<String>();
	public JComboBox<Imagenes> nacionalidadDesplegable = new JComboBox<Imagenes> ();
	public JTextPane txtNacimiento = new JTextPane();
	public JComboBox<String> docDesplegable = new JComboBox<String>();
	public JTextPane txtnDoc = new JTextPane();
	public JButton btnContinuar = new JButton("Continuar");
	public JButton btnRegresar = new JButton("Regresar");
	public JLabel advNroDoc = new JLabel("**Nro de Documento inv\u00E1lido");
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosPasajeros frame = new DatosPasajeros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public DatosPasajeros() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 679);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
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
		nombreQuaria.setBounds(88, 10, 137, 44);
		barraSuperior.add(nombreQuaria);
		
		JLabel logoQ = new JLabel("");
		logoQ.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenes2/SL1 (1).png")));
		logoQ.setBounds(22, 7, 56, 47);
		barraSuperior.add(logoQ);
		
		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setForeground(Color.WHITE);
		lblCompra.setFont(new Font("Dubai", Font.BOLD, 18));
		lblCompra.setBounds(878, 23, 64, 24);
		barraSuperior.add(lblCompra);
		
		JLabel imagenAvion = new JLabel("");
		imagenAvion.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenes2/cochecito.png")));
		imagenAvion.setBounds(952, 14, 30, 40);
		barraSuperior.add(imagenAvion);
		
		JLabel lblPasajeros = new JLabel("Pasajeros");
		lblPasajeros.setForeground(new Color(0, 0, 128));
		lblPasajeros.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblPasajeros.setBounds(444, 85, 112, 43);
		contentPane.add(lblPasajeros);
		
		JLabel chicoSentado1 = new JLabel("");
		chicoSentado1.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto2/chicoSentado.png")));
		chicoSentado1.setBounds(554, 203, 375, 328);
		contentPane.add(chicoSentado1);
		
		JLabel lineaTiempo4 = new JLabel("");
		lineaTiempo4.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto2/lineaT4.png")));
		lineaTiempo4.setBounds(544, 138, 390, 69);
		contentPane.add(lineaTiempo4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(243,243,243));
		panel.setBounds(76, 150, 428, 431);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154,160,230));
		panel_1.setBounds(0, 0, 428, 39);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel personIcon = new JLabel("");
		personIcon.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto2/avatar.png")));
		personIcon.setBounds(10, 0, 40, 41);
		panel_1.add(personIcon);
		
		
		
		txtTipoPasajero.setForeground(new Color(0, 0, 128));
		txtTipoPasajero.setFont(new Font("Dubai", Font.BOLD, 17));
		
		
		txtTipoPasajero.setEditable(false);
		txtTipoPasajero.setBackground(new Color(154,160,230));
		txtTipoPasajero.setBounds(48, 0, 166, 29);
		panel_1.add(txtTipoPasajero);
		
		JLabel lblNombre = new JLabel("Nombres:");
		lblNombre.setForeground(new Color(0, 0, 128));
		lblNombre.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblNombre.setBounds(22, 49, 253, 26);
		panel.add(lblNombre);
		
		
		txtNombres.setForeground(new Color(0, 0, 128));
		txtNombres.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtNombres.setText("");
		txtNombres.setBackground(new Color(225,225,225));
		txtNombres.setBounds(32, 79, 357, 34);
		panel.add(txtNombres);
		
		JLabel campo1 = new JLabel("New label");
		campo1.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto2/campoLlenado.png")));
		campo1.setBounds(22, 64, 378, 69);
		panel.add(campo1);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(new Color(0, 0, 128));
		lblApellidos.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblApellidos.setBounds(22, 123, 253, 26);
		panel.add(lblApellidos);
		
		
		txtApellidos.setText("");
		txtApellidos.setForeground(new Color(0, 0, 128));
		txtApellidos.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtApellidos.setBackground(new Color(225, 225, 225));
		txtApellidos.setBounds(32, 153, 357, 34);
		panel.add(txtApellidos);
		
		JLabel campo2 = new JLabel("");
		campo2.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto2/campoLlenado.png")));
		campo2.setBounds(22, 143, 378, 61);
		panel.add(campo2);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setForeground(new Color(0, 0, 128));
		lblGenero.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblGenero.setBounds(22, 197, 111, 26);
		panel.add(lblGenero);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setForeground(new Color(0, 0, 128));
		lblNacionalidad.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblNacionalidad.setBounds(225, 197, 111, 26);
		panel.add(lblNacionalidad);
		
		
		generoDesplegable.setBounds(22, 225, 180, 34);
		panel.add(generoDesplegable);
		generoDesplegable.addItem("Masculino");
		generoDesplegable.addItem("Femenino");
		
		
		nacionalidadDesplegable.setBounds(220, 225, 180, 34);
		nacionalidadDesplegable.setModel(populate());
		nacionalidadDesplegable.setRenderer(new ImagesAndTextRenderer());
		panel.add(nacionalidadDesplegable);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setForeground(new Color(0, 0, 128));
		lblFechaDeNacimiento.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblFechaDeNacimiento.setBounds(22, 269, 253, 26);
		panel.add(lblFechaDeNacimiento);
		
		
		txtNacimiento.setText("");
		txtNacimiento.setForeground(new Color(0, 0, 128));
		txtNacimiento.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtNacimiento.setBackground(new Color(225, 225, 225));
		txtNacimiento.setBounds(32, 296, 154, 34);
		panel.add(txtNacimiento);
		
		JLabel campo3 = new JLabel("");
		campo3.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto2/campoLlenado.png")));
		campo3.setBounds(22, 285, 378, 61);
		panel.add(campo3);
		
		JLabel lblTipoDeDocumento = new JLabel("Tipo de Documento:");
		lblTipoDeDocumento.setForeground(new Color(0, 0, 128));
		lblTipoDeDocumento.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblTipoDeDocumento.setBounds(22, 340, 144, 26);
		panel.add(lblTipoDeDocumento);
		
		JLabel lblNroDeDocumento = new JLabel("Nro de Documento:");
		lblNroDeDocumento.setForeground(new Color(0, 0, 128));
		lblNroDeDocumento.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblNroDeDocumento.setBounds(225, 340, 144, 26);
		panel.add(lblNroDeDocumento);
		
		
		docDesplegable.setBounds(22, 365, 180, 34);
		panel.add(docDesplegable);
		docDesplegable.addItem("DNI");
		docDesplegable.addItem("Carnet de Extranjeria");
		
		
		txtnDoc.setText("");
		txtnDoc.setForeground(new Color(0, 0, 128));
		txtnDoc.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtnDoc.setBackground(new Color(225, 225, 225));
		txtnDoc.setBounds(235, 367, 154, 26);
		panel.add(txtnDoc);
		
		JLabel campo4 = new JLabel("");
		campo4.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto2/nroDoc.png")));
		campo4.setBounds(225, 365, 175, 34);
		panel.add(campo4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto2/sombraFin.png")));
		lblNewLabel_2.setBounds(63, 125, 456, 491);
		contentPane.add(lblNewLabel_2);
		
		advNroDoc.setForeground(new Color(220, 20, 60));
		advNroDoc.setFont(new Font("Dubai", Font.ITALIC, 17));
		advNroDoc.setBounds(544, 590, 250, 13);
		contentPane.add(advNroDoc);
		advNroDoc.setVisible(false);
		
		
		
		btnContinuar.setForeground(Color.WHITE);
		btnContinuar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnContinuar.setBackground(new Color(0, 0, 128));
		btnContinuar.setBounds(614, 541, 104, 32);
		contentPane.add(btnContinuar);
		

		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnRegresar.setBackground(new Color(154, 160, 230));
		btnRegresar.setBounds(789, 541, 104, 32);
		contentPane.add(btnRegresar);
		
		
	}
	private DefaultComboBoxModel<Imagenes> populate() {

		  DefaultComboBoxModel<Imagenes> boxModel = new DefaultComboBoxModel<Imagenes>();
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Perú.png")), "Peruana"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Ecuador.png")), "Ecuatoriana"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Paraguay.png")), "Paraguaya"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Uruguay.png")), "Uruguaya"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Colombia.png")), "Colombiana"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Brasil.png")), "Brasileña"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Argentina.png")), "Argentina"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Venezuela.png")), "Venezolana"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Bolivia.png")), "Boliviana"));
		  boxModel.addElement(new Imagenes(new ImageIcon(DatosPasajeros.class.getResource("/imagenesProyecto4/Chile.png")), "Chilena"));
		  return boxModel;
	 }
}
