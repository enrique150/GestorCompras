package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import modelo.TextPrompt;
import javax.swing.JButton;
import javax.swing.JTextField;


public class RealizarPago extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField txtMmAa= new JTextField();
	public JTextField txtCvv= new JTextField();
	public JTextField txtNombre= new JTextField();
	public JTextField txtApellido = new JTextField();
	public JTextField txtNDeTarjeta= new JTextField();
	public JLabel LbEquipajeVuelta = new JLabel("Equipaje:");
	public JLabel LbAsientosVuelta = new JLabel("Asientos");
	public JLabel LbHoraVuelta = new JLabel("Hora");
	public JLabel LbFechaVuelta = new JLabel("Fecha:");
	public JTextPane PasajeroResultado = new JTextPane();
	public JTextPane FechaIdaResultado = new JTextPane();
	public JTextPane TrayectoResultado = new JTextPane();
	public JTextPane TipoDeVueloResultado = new JTextPane();
	public JTextPane HoraIdaResultado = new JTextPane();
	public JTextPane AsientosIdaResultado = new JTextPane();
	public JTextPane EquipajeIdaResultado = new JTextPane();
	public JTextPane EquipajeIdaResultado_1 = new JTextPane();
	public JTextPane FechaVueltaResultado = new JTextPane();
	public JTextPane HoraVueltaResultado = new JTextPane();
	public JTextPane AsientosVueltaResultado = new JTextPane();
	public JTextPane EquipajeVueltaResultado = new JTextPane();
	public JTextPane EquipajeVueltaResultado_1 = new JTextPane();
	public JLabel LbVueloVuelta = new JLabel("Vuelos de Vuelta: ");
	public JTextPane ViajeIda = new JTextPane();
	public JTextPane ViajeVuelta = new JTextPane();
	public JTextPane txtDestino_4 = new JTextPane();
	public JPanel DetallesVuelo = new JPanel();
	public JPanel panel_4_1 = new JPanel();
	public JButton BtnEnviar = new JButton("Pagar");
	public JButton btnRegresar = new JButton("Regresar");
	public JLabel advTarjeta = new JLabel("**Complete todos los datos");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarPago frame = new RealizarPago();
					
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
	public RealizarPago() {
		setResizable(false);
		setTitle("Reserva de vuelos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 679);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Colors 
		Color moradoOscuroLetra = new Color(17, 0, 108);
		Color moradoClaroLetra = new Color(45, 52, 132);
		Color panelesGrises = new Color(242,242,242);
		Color entornoGrisOscuro = new Color(225,225,225);
		
		JPanel ResumenViaje = new JPanel();
		ResumenViaje.setBackground(new Color(240, 240, 240));
		ResumenViaje.setBounds(74, 124, 436, 449);
		contentPane.add(ResumenViaje);
		ResumenViaje.setLayout(null);
		
		
		DetallesVuelo.setBackground(SystemColor.control);
		DetallesVuelo.setBounds(0, 133, 436, 316);
		ResumenViaje.add(DetallesVuelo);
		DetallesVuelo.setLayout(null);
		
		JLabel LbTrayecto = new JLabel("Trayecto");
		LbTrayecto.setForeground(moradoOscuroLetra);
		LbTrayecto.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		LbTrayecto.setBounds(30, 35, 80, 21);
		DetallesVuelo.add(LbTrayecto);
		
		JLabel LbPasajeros = new JLabel("Pasajeros:");
		LbPasajeros.setForeground(moradoOscuroLetra);
		LbPasajeros.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		LbPasajeros.setBounds(30, 55, 80, 21);
		DetallesVuelo.add(LbPasajeros);
		
		JLabel LbTipoVuelo = new JLabel("Tipo de vuelo:");
		LbTipoVuelo.setForeground(moradoOscuroLetra);
		LbTipoVuelo.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		LbTipoVuelo.setBounds(30, 75, 90, 21);
		DetallesVuelo.add(LbTipoVuelo);
		
		JLabel LbFechaIda = new JLabel("Fecha:");
		LbFechaIda.setForeground(moradoClaroLetra);
		LbFechaIda.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		LbFechaIda.setBounds(30, 144, 80, 21);
		DetallesVuelo.add(LbFechaIda);
		
		JLabel LbHoraIda = new JLabel("Hora:");
		LbHoraIda.setForeground(moradoClaroLetra);
		LbHoraIda.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		LbHoraIda.setBounds(30, 175, 80, 21);
		DetallesVuelo.add(LbHoraIda);
		
		JLabel LbAsientosIda = new JLabel("Asientos");
		LbAsientosIda.setForeground(moradoClaroLetra);
		LbAsientosIda.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		LbAsientosIda.setBounds(30, 254, 80, 21);
		DetallesVuelo.add(LbAsientosIda);
		
		JLabel LbEquipajeIda = new JLabel("Equipaje:");
		LbEquipajeIda.setForeground(moradoClaroLetra);
		LbEquipajeIda.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		LbEquipajeIda.setBounds(30, 206, 80, 21);
		DetallesVuelo.add(LbEquipajeIda);
		
		
		
		//END TEXT COMING
		
		
		TrayectoResultado.setBackground(panelesGrises);
		TrayectoResultado.setBounds(120, 32, 124, 21);
		DetallesVuelo.add(TrayectoResultado);
		TrayectoResultado.setEditable(false);
		
		TrayectoResultado.setFont(new Font("Dubai", Font.BOLD, 12));
		
		
		PasajeroResultado.setBackground(panelesGrises);
		
		PasajeroResultado.setFont(new Font("Dubai", Font.BOLD, 12));
		PasajeroResultado.setEditable(false);
		PasajeroResultado.setBounds(120, 52, 124, 21);
		DetallesVuelo.add(PasajeroResultado);
		
		
		TipoDeVueloResultado.setBackground(panelesGrises);
		
		TipoDeVueloResultado.setFont(new Font("Dubai", Font.BOLD, 12));
		TipoDeVueloResultado.setEditable(false);
		TipoDeVueloResultado.setBounds(120, 72, 124, 21);
		DetallesVuelo.add(TipoDeVueloResultado);
		
		
		FechaIdaResultado.setBackground(panelesGrises);
		
		FechaIdaResultado.setFont(new Font("Dubai", Font.BOLD, 12));
		FechaIdaResultado.setEditable(false);
		FechaIdaResultado.setBounds(79, 144, 124, 21);
		DetallesVuelo.add(FechaIdaResultado);
		
		
		HoraIdaResultado.setBackground(panelesGrises);
		
		HoraIdaResultado.setFont(new Font("Dubai", Font.BOLD, 12));
		HoraIdaResultado.setEditable(false);
		HoraIdaResultado.setBounds(79, 175, 124, 21);
		DetallesVuelo.add(HoraIdaResultado);
		
		//Array of seats-GOING
		
		AsientosIdaResultado.setBackground(panelesGrises);	
		
		AsientosIdaResultado.setFont(new Font("Dubai", Font.BOLD, 12));
		AsientosIdaResultado.setEditable(false);
		AsientosIdaResultado.setBounds(30, 272, 183, 21);
		DetallesVuelo.add(AsientosIdaResultado);
		
		
		EquipajeIdaResultado.setBackground(panelesGrises);
		
		EquipajeIdaResultado.setFont(new Font("Dubai", Font.BOLD, 12));
		EquipajeIdaResultado.setEditable(false);
		EquipajeIdaResultado.setBounds(89, 226, 124, 21);
		DetallesVuelo.add(EquipajeIdaResultado);
		
		
		
		EquipajeIdaResultado_1.setFont(new Font("Dubai", Font.BOLD, 12));
		EquipajeIdaResultado_1.setEditable(false);
		EquipajeIdaResultado_1.setBackground(new Color(242, 242, 242));
		EquipajeIdaResultado_1.setBounds(89, 206, 124, 21);
		DetallesVuelo.add(EquipajeIdaResultado_1);
		
		
		panel_4_1.setForeground(new Color(255, 255, 255));
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(0, 0, 128));
		panel_4_1.setBounds(0, 106, 436, 25);
		DetallesVuelo.add(panel_4_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 128));
		panel_4.setBounds(0, 0, 436, 25);
		DetallesVuelo.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel LbVueloIda = new JLabel("Detalles del vuelo:");
		LbVueloIda.setBounds(23, 0, 178, 25);
		panel_4.add(LbVueloIda);
		LbVueloIda.setForeground(new Color(255, 255, 255));
		LbVueloIda.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		
		
		
		JLabel LbVueloIda_1 = new JLabel("Vuelos de Ida: ");
		LbVueloIda_1.setForeground(new Color(255, 255, 255));
		LbVueloIda_1.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		LbVueloIda_1.setBounds(23, 0, 109, 25);
		panel_4_1.add(LbVueloIda_1);
		
		JPanel IdaDestino = new JPanel();
		IdaDestino.setBackground(panelesGrises);
		IdaDestino.setBounds(0, 0, 436, 135);
		ResumenViaje.add(IdaDestino);
		IdaDestino.setLayout(null);
		
		JLabel LbRutaImg = new JLabel("");
		LbRutaImg.setBounds(147, 0, 132, 125);
		IdaDestino.add(LbRutaImg);
		LbRutaImg.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto/zigzagF.png")));
		
		
		ViajeIda.setBounds(10, 51, 168, 50);
		IdaDestino.add(ViajeIda);
		
		ViajeIda.setFont(new Font("Dubai", Font.BOLD, 15));
		ViajeIda.setEditable(false);
		ViajeIda.setBackground(new Color(242, 242, 242));
		
		ViajeVuelta.setBounds(264, 74, 162, 58);
		IdaDestino.add(ViajeVuelta);
		
		ViajeVuelta.setFont(new Font("Dubai", Font.BOLD, 15));
		ViajeVuelta.setEditable(false);
		ViajeVuelta.setBackground(new Color(242, 242, 242));
		
		JPanel MontoPagar = new JPanel();
		MontoPagar.setBackground(new Color(255, 255, 255));
		MontoPagar.setBounds(581, 124, 325, 101);
		contentPane.add(MontoPagar);
		MontoPagar.setLayout(null);
		
		JPanel MontoMostrado = new JPanel();
		MontoMostrado.setBackground(new Color(0, 0, 128));
		MontoMostrado.setBounds(56, 44, 215, 46);
		MontoPagar.add(MontoMostrado);
		MontoMostrado.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("$");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(37, 0, 30, 46);
		MontoMostrado.add(lblNewLabel_1_1);
		
		//COST
		
		txtDestino_4.setForeground(new Color(255, 255, 255));
		
		txtDestino_4.setFont(new Font("Dubai", Font.BOLD, 27));
		txtDestino_4.setEditable(false);
		txtDestino_4.setBackground(new Color(0, 0, 128));
		txtDestino_4.setBounds(75, 0, 130, 46);
		MontoMostrado.add(txtDestino_4);
		
		JLabel lblNewLabel = new JLabel("Monto a Pagar:");
		lblNewLabel.setForeground(moradoOscuroLetra);
		lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 16));
		lblNewLabel.setBounds(112, 11, 159, 22);
		MontoPagar.add(lblNewLabel);
		
		JTextPane txtDestino_3 = new JTextPane();
		txtDestino_3.setText("Holis");
		txtDestino_3.setFont(new Font("Dubai", Font.BOLD, 12));
		txtDestino_3.setEditable(false);
		txtDestino_3.setBackground(new Color(242, 242, 242));
		txtDestino_3.setBounds(124, 69, 124, 21);
		MontoPagar.add(txtDestino_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto3/cocheChiquito.png")));
		lblNewLabel_3.setBounds(57, 11, 34, 23);
		MontoPagar.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 0, 128));
		panel_3.setBackground(new Color(154,160,230));
		panel_3.setBounds(565, 256, 353, 260);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 10, 309, 240);
		panel_3.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(entornoGrisOscuro);
		panel_2.setBounds(12, 11, 278, 36);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(moradoOscuroLetra);
		panel_1.setBounds(0, 33, 278, 3);
		panel_2.add(panel_1);
		
		
		txtNDeTarjeta.setBackground(entornoGrisOscuro);
		
		txtNDeTarjeta.setColumns(10);
		txtNDeTarjeta.setBounds(35, 0, 243, 36);
		panel_2.add(txtNDeTarjeta);
		TextPrompt ProntTarjeta = new TextPrompt("N° de tarjeta", txtNDeTarjeta);
		
		JLabel ImgTarjeta = new JLabel("");
		ImgTarjeta.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto3/tarjetaMorada.png")));
		ImgTarjeta.setBounds(4, 2, 30, 30);
		panel_2.add(ImgTarjeta);
		ProntTarjeta.setForeground(moradoOscuroLetra);
		ProntTarjeta.setFont(new Font("Dubai", Font.ITALIC, 12));
		
		
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(entornoGrisOscuro);
		panel_2_2.setBounds(12, 69, 135, 36);
		panel.add(panel_2_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(moradoOscuroLetra);
		panel_1_1.setBounds(0, 33, 150, 3);
		panel_2_2.add(panel_1_1);
		
		txtMmAa.setBackground(entornoGrisOscuro);
		txtMmAa.setBounds(37, -1, 98, 36);
		panel_2_2.add(txtMmAa);
		TextPrompt ProntMmAa = new TextPrompt("MM / AA", txtMmAa);
		ProntMmAa.setForeground(moradoOscuroLetra);
		ProntMmAa.setFont(new Font("Dubai", Font.ITALIC, 12));
		
		txtMmAa.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto3/calendarioChiquito.png")));
		lblNewLabel_1_2.setBounds(4, 2, 30, 30);
		panel_2_2.add(lblNewLabel_1_2);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBackground(entornoGrisOscuro);
		panel_2_2_1.setBounds(155, 69, 135, 36);
		panel.add(panel_2_2_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(moradoOscuroLetra);
		panel_1_1_1.setBounds(0, 33, 150, 3);
		panel_2_2_1.add(panel_1_1_1);
		
		txtCvv.setBackground(entornoGrisOscuro);
		txtCvv.setColumns(10);
		txtCvv.setBounds(37, -1, 98, 36);
		TextPrompt ProntCvv = new TextPrompt("CVV", txtCvv);
		ProntCvv.setForeground(moradoOscuroLetra);
		ProntCvv.setFont(new Font("Dubai", Font.ITALIC, 12));
		panel_2_2_1.add(txtCvv);
		
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto3/tarjetaSilueta.png")));
		lblNewLabel_1_4.setBounds(4, 2, 30 , 30);
		panel_2_2_1.add(lblNewLabel_1_4);
		
		JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setLayout(null);
		panel_2_2_2.setBackground(entornoGrisOscuro);
		panel_2_2_2.setBounds(12, 129, 135, 36);
		panel.add(panel_2_2_2);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(moradoOscuroLetra);
		panel_1_1_2.setBounds(0, 33, 150, 3);
		panel_2_2_2.add(panel_1_1_2);
		
		txtNombre.setBackground(entornoGrisOscuro);
		txtNombre.setColumns(10);
		txtNombre.setBounds(37, -1, 98, 36);
		panel_2_2_2.add(txtNombre);
		TextPrompt ProntNombre = new TextPrompt("Nombre", txtNombre);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto3/personaChiquita.png")));
		lblNewLabel_1_3.setBounds(4, 2, 30 , 30);
		panel_2_2_2.add(lblNewLabel_1_3);
		ProntNombre.setForeground(moradoOscuroLetra);
		ProntNombre.setFont(new Font("Dubai", Font.ITALIC, 12));
		
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setBackground(entornoGrisOscuro);
		panel_2_2_1_1.setBounds(155, 129, 135, 36);
		panel.add(panel_2_2_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(moradoOscuroLetra);
		panel_1_1_1_1.setBounds(0, 33, 150, 3);
		panel_2_2_1_1.add(panel_1_1_1_1);
		
		txtApellido.setBackground(entornoGrisOscuro);
		txtApellido.setColumns(10);
		txtApellido.setBounds(37, -1, 98, 36);
		TextPrompt ProntApellido = new TextPrompt("Apellido", txtApellido);
		ProntApellido.setForeground(moradoOscuroLetra);
		ProntApellido.setFont(new Font("Dubai", Font.ITALIC, 12));
		panel_2_2_1_1.add(txtApellido);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto3/personaChiquita.png")));
		lblNewLabel_1_5.setBounds(4, 2, 30 , 30);
		panel_2_2_1_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto3/tarjetasVisa.png")));
		lblNewLabel_4.setBounds(84, 175, 147, 55);
		panel.add(lblNewLabel_4);
		
		JLabel lblRealziacionDelApgo = new JLabel("Realizacion del pago");
		lblRealziacionDelApgo.setForeground(new Color(0, 0, 128));
		lblRealziacionDelApgo.setFont(new Font("Dubai", Font.BOLD, 25));
		lblRealziacionDelApgo.setBounds(404, 85, 256, 29);
		contentPane.add(lblRealziacionDelApgo);
		
		JLabel lblResumenDelViaje = new JLabel("Resumen del viaje");
		lblResumenDelViaje.setForeground(new Color(0, 0, 128));
		lblResumenDelViaje.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblResumenDelViaje.setBounds(74, 99, 215, 22);
		contentPane.add(lblResumenDelViaje);
		
		
		JPanel barraSuperior = new JPanel();
		barraSuperior.setBackground(new Color(0, 0, 128));
		barraSuperior.setForeground(new Color(0, 0, 0));
		barraSuperior.setBounds(0, 0, 1012, 62);
		contentPane.add(barraSuperior);
		barraSuperior.setLayout(null);
		
		JLabel nombreQuaria = new JLabel("QUARIA");
		nombreQuaria.setForeground(new Color(255, 255, 255));
		nombreQuaria.setBounds(88, 10, 115, 44);
		barraSuperior.add(nombreQuaria);
		nombreQuaria.setFont(new Font("Dubai", Font.BOLD, 28));
		
		
		JLabel logoQ = new JLabel("");
		logoQ.setBounds(25, 0, 56, 61);
		barraSuperior.add(logoQ);
		logoQ.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenes2/SL1 (1).png")));
		
		JLabel superiorVuelos = new JLabel("Compra");
		superiorVuelos.setForeground(new Color(255, 255, 255));
		superiorVuelos.setFont(new Font("Dubai", Font.BOLD, 18));
		superiorVuelos.setBounds(891, 23, 73, 24);
		barraSuperior.add(superiorVuelos);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto/cochecito.png")));
				lblNewLabel_1.setBounds(957, 5, 45, 56);
				barraSuperior.add(lblNewLabel_1);
				
				JLabel lblTarjetaDeCredito = new JLabel("Tarjeta de Debito/ Credito ");
				lblTarjetaDeCredito.setBounds(555, 235, 229, 22);
				contentPane.add(lblTarjetaDeCredito);
				lblTarjetaDeCredito.setForeground(new Color(0, 0, 128));
				lblTarjetaDeCredito.setFont(new Font("Dubai", Font.BOLD, 16));
				
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto2/sombraFin.png")));
				lblNewLabel_2.setBounds(70, 120, 465, 483);
				contentPane.add(lblNewLabel_2);
				
				
				advTarjeta.setForeground(new Color(220, 20, 60));
				advTarjeta.setFont(new Font("Dubai", Font.PLAIN, 16));
				advTarjeta.setBounds(645, 526, 209, 13);
				contentPane.add(advTarjeta);
				advTarjeta.setVisible(false);
				
				JLabel sombraP = new JLabel("");
				sombraP.setIcon(new ImageIcon(RealizarPago.class.getResource("/imagenesProyecto3/sombraEndP.png")));
				sombraP.setBounds(559, 223, 420, 322);
				contentPane.add(sombraP);
		
				//
				
				
				BtnEnviar.setFont(new Font("Dubai", Font.BOLD, 14));
				BtnEnviar.setForeground(new Color(255, 255, 255));
				BtnEnviar.setBackground(new Color(0, 0, 128));
				BtnEnviar.setBounds(620, 555, 110, 34);
				contentPane.add(BtnEnviar);
				
				//
				
			
				btnRegresar.setForeground(Color.WHITE);
				btnRegresar.setFont(new Font("Dubai", Font.BOLD, 14));
				btnRegresar.setBackground(new Color(154, 160, 230));
				btnRegresar.setBounds(762, 555, 110, 34);
				contentPane.add(btnRegresar);
				//
	}
}
