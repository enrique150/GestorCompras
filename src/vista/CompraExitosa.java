package vista;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class CompraExitosa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public JPanel contentPane;
	
    
    public JTextPane TrayectoResultado = new JTextPane();
	public JTextPane PasajeroResultado = new JTextPane();
	public JTextPane TipoDeVueloResultado = new JTextPane();
	public JTextPane HoraIdaResultado = new JTextPane();
	public JTextPane AsientosIdaResultado = new JTextPane();
	public JTextPane EquipajeIdaResultado = new JTextPane();
	public JLabel imagenCentro = new JLabel("");
	public JLabel ImagenDerecha = new JLabel("");
	public JLabel LbVueltaEquipaje = new JLabel("Equipaje:");
	public JLabel LbVueltaAsientos = new JLabel("Asientos:");
	public JLabel LbVueltaHora = new JLabel("Hora:");
	public JLabel LbVueltaFecha = new JLabel("Fecha:");
	public JLabel LbVuelosVuelta = new JLabel("Vuelos de Vuelta: ");
	public JTextPane HoraVueltaResultado = new JTextPane();
	public JTextPane AsientosVueltaResultado = new JTextPane();
	public JTextPane EquipajeVueltaResultado = new JTextPane(); 
	public JPanel panelVuelta = new JPanel();
	public JTextPane FechaVueltaResultado = new JTextPane();
	public JTextPane txtOrigen = new JTextPane();
	public JTextPane MontoPagado = new JTextPane();
	public JTextPane txtDestino = new JTextPane();
	public JTextPane FechaIdaResultado = new JTextPane();
	public JTextField txtCorreo = new JTextField();
	public JLabel lblcorreoEnviado = new JLabel("\u00A1Correo Enviado!");
	public JLabel lblAdv = new JLabel("**Correo Inv\u00E1lido");
	public JPanel DetallesVuelo = new JPanel();
	public JButton btnRegresar = new JButton("Cerrar");
	public JButton BtnEnviar = new JButton("Enviar");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraExitosa frame = new CompraExitosa();
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
	public CompraExitosa() {
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1026, 679);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Color moradoOscuroLetra = new Color(17, 0, 108);
		Color panelesGrises = new Color(242,242,242);
		Color entornoGrisOscuro = new Color(225,225,225);
		
		barraSuperior();
		
		
		DetallesVuelo.setBounds(276, 116, 442, 393);
		contentPane.add(DetallesVuelo);
		DetallesVuelo.setBackground(panelesGrises);
		DetallesVuelo.setLayout(null);
		
		JLabel LbTrayecto = new JLabel("Trayecto:");
		LbTrayecto.setBounds(20, 35, 87, 20);
		LbTrayecto.setForeground(moradoOscuroLetra);
		LbTrayecto.setFont(new Font("Dubai", Font.PLAIN, 16));
		DetallesVuelo.add(LbTrayecto);
		
		JLabel LbPasajeros = new JLabel("Pasajeros:");
		LbPasajeros.setBounds(20, 55, 87, 20);
		LbPasajeros.setForeground(moradoOscuroLetra);
		LbPasajeros.setFont(new Font("Dubai", Font.PLAIN, 16));
		DetallesVuelo.add(LbPasajeros);
		
		JLabel LbTipoVuelo = new JLabel("Tipo de vuelo:");
		LbTipoVuelo.setBounds(214, 35, 111, 20);
		LbTipoVuelo.setForeground(moradoOscuroLetra);
		LbTipoVuelo.setFont(new Font("Dubai", Font.PLAIN, 16));
		DetallesVuelo.add(LbTipoVuelo);
		
		JLabel LbVuelosIda = new JLabel("Vuelos de Ida: ");
		LbVuelosIda.setBounds(20, 91, 152, 20);
		LbVuelosIda.setForeground(new Color(0, 0, 128));
		LbVuelosIda.setFont(new Font("Dubai", Font.BOLD, 16));
		DetallesVuelo.add(LbVuelosIda);
		
		JLabel LbIdaFecha = new JLabel("Fecha:");
		LbIdaFecha.setBounds(30, 120, 62, 20);
		LbIdaFecha.setForeground(new Color(0, 0, 128));
		LbIdaFecha.setFont(new Font("Dubai", Font.PLAIN, 16));
		DetallesVuelo.add(LbIdaFecha);
		
		JLabel LbIdaHora = new JLabel("Hora:");
		LbIdaHora.setBounds(30, 145, 45, 20);
		LbIdaHora.setForeground(new Color(0, 0, 128));
		LbIdaHora.setFont(new Font("Dubai", Font.PLAIN, 16));
		DetallesVuelo.add(LbIdaHora);
		
		JLabel LbIdaAsientos = new JLabel("Asientos:");
		LbIdaAsientos.setBounds(30, 170, 77, 20);
		LbIdaAsientos.setForeground(new Color(0, 0, 128));
		LbIdaAsientos.setFont(new Font("Dubai", Font.PLAIN, 16));
		DetallesVuelo.add(LbIdaAsientos);
		
		JLabel LbIdaEquipaje = new JLabel("Equipaje:");
		LbIdaEquipaje.setBounds(30, 195, 77, 20);
		LbIdaEquipaje.setForeground(new Color(0, 0, 128));
		LbIdaEquipaje.setFont(new Font("Dubai", Font.PLAIN, 16));
		DetallesVuelo.add(LbIdaEquipaje);
		
		
		TrayectoResultado.setBounds(117, 25, 124, 30);
		TrayectoResultado.setBackground(panelesGrises);
		DetallesVuelo.add(TrayectoResultado);
		TrayectoResultado.setEditable(false);
		
		TrayectoResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
		
		
		PasajeroResultado.setBounds(117, 45, 124, 30);
		PasajeroResultado.setBackground(panelesGrises);
		
		PasajeroResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
		PasajeroResultado.setEditable(false);
		DetallesVuelo.add(PasajeroResultado);
		
		
		TipoDeVueloResultado.setBounds(335, 25, 87, 30);
		TipoDeVueloResultado.setBackground(panelesGrises);
		
		TipoDeVueloResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
		TipoDeVueloResultado.setEditable(false);
		DetallesVuelo.add(TipoDeVueloResultado);
		
		
		HoraIdaResultado.setBounds(117, 135, 124, 30);
		HoraIdaResultado.setBackground(panelesGrises);
		
		HoraIdaResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
		HoraIdaResultado.setEditable(false);
		DetallesVuelo.add(HoraIdaResultado);
		
		//Seats going
		
		AsientosIdaResultado.setBounds(117, 160, 124, 30);
		AsientosIdaResultado.setBackground(panelesGrises);
		AsientosIdaResultado.setBackground(panelesGrises);	
		
		AsientosIdaResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
		AsientosIdaResultado.setEditable(false);
		DetallesVuelo.add(AsientosIdaResultado);

		//Package going
		
		EquipajeIdaResultado.setBounds(117, 185, 325, 30);
		EquipajeIdaResultado.setBackground(panelesGrises);
		EquipajeIdaResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
		EquipajeIdaResultado.setEditable(false);
		DetallesVuelo.add(EquipajeIdaResultado);
		
	
		imagenCentro.setIcon(new ImageIcon(CompraExitosa.class.getResource("/imagenesProyecto3/saliendoC (1).png")));
		imagenCentro.setBounds(117, 214, 208, 141);
		DetallesVuelo.add(imagenCentro);
		imagenCentro.setVisible(true);
		
		
		ImagenDerecha.setIcon(new ImageIcon(CompraExitosa.class.getResource("/imagenesProyecto3/ChicoConBoletos.png")));
		ImagenDerecha.setBounds(759, 198, 224, 381);
		contentPane.add(ImagenDerecha);
		ImagenDerecha.setVisible(false);
		
		
		
		JPanel panelIda = new JPanel();
		panelIda.setLayout(null);
		panelIda.setBackground(new Color(154,160,230));
		panelIda.setBounds(0, 86, 442, 30);
		DetallesVuelo.add(panelIda);
		
		JLabel LbMontoPagado = new JLabel("Monto Pagado:");
		LbMontoPagado.setBounds(20, 365, 163, 20);
		LbMontoPagado.setForeground(new Color(17, 0, 108));
		LbMontoPagado.setFont(new Font("Dubai", Font.BOLD, 18));
		DetallesVuelo.add(LbMontoPagado);
		
		
		MontoPagado.setFont(new Font("Dubai", Font.PLAIN, 16));
		//float number = BigDecimal.valueOf(d.Monto()).setScale(4, BigDecimal.ROUND_HALF_DOWN).floatValue();
		//MontoPagado.setText("S/."+ number);
		
		MontoPagado.setEditable(false);
		MontoPagado.setBackground(panelesGrises);
		MontoPagado.setBounds(193, 355, 166, 30);
		DetallesVuelo.add(MontoPagado);
		
		
		
		txtDestino.setBackground(new Color(154,160,230));
		txtDestino.setFont(new Font("Dubai", Font.PLAIN, 15));
		txtDestino.setForeground(new Color(0, 0, 128));
		txtDestino.setEditable(false);
		txtDestino.setBounds(163, 0, 220, 25);
		panelIda.add(txtDestino);
		
		
		FechaIdaResultado.setBounds(117, 110, 124, 30);
		
		FechaIdaResultado.setFont(new Font("Dubai", Font.PLAIN, 16));
		FechaIdaResultado.setEditable(false);
		FechaIdaResultado.setBackground(new Color(242, 242, 242));
		DetallesVuelo.add(FechaIdaResultado);
		
		JPanel panelSuperiorBoleto = new JPanel();
		panelSuperiorBoleto.setBackground(new Color(0, 0, 128));
		panelSuperiorBoleto.setBounds(0, 0, 442, 25);
		DetallesVuelo.add(panelSuperiorBoleto);
		panelSuperiorBoleto.setLayout(null);
		
		JLabel LbBoleto = new JLabel("BOLETO N\u00B0");
		LbBoleto.setBounds(164, 0, 106, 24);
		panelSuperiorBoleto.add(LbBoleto);
		LbBoleto.setForeground(new Color(255, 255, 255));
		LbBoleto.setFont(new Font("Dubai", Font.BOLD, 18));
		
		JTextPane numBoleto = new JTextPane();
		numBoleto.setBackground(new Color(0, 0, 128));
		numBoleto.setBounds(263, 5, 37, 19);
		panelSuperiorBoleto.add(numBoleto);
		
		
		
		JLabel lblCompraExitosa = new JLabel("\u00A1Compra Exitosa!");
		lblCompraExitosa.setForeground(new Color(0, 0, 128));
		lblCompraExitosa.setFont(new Font("Dubai Medium", Font.PLAIN, 34));
		lblCompraExitosa.setBounds(381, 59, 242, 58);
		contentPane.add(lblCompraExitosa);
		
		JLabel lblMensaje = new JLabel("Estimado pasajero, recuerde que este boleto debera ser presentado en el aeropuerto. \r\n ");
		lblMensaje.setFont(new Font("Dubai", Font.PLAIN, 12));
		lblMensaje.setBounds(286, 506, 463, 21);
		contentPane.add(lblMensaje);
		
		JLabel lblCelular = new JLabel("M\u00E1s informacion al +51 947 323 945");
		lblCelular.setFont(new Font("Dubai", Font.PLAIN, 12));
		lblCelular.setBounds(413, 519, 184, 21);
		contentPane.add(lblCelular);
		
		JLabel lblEnviar = new JLabel("Enviar Correo:");
		lblEnviar.setForeground(new Color(45, 52, 132));
		lblEnviar.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblEnviar.setBounds(276, 546, 110, 20);
		contentPane.add(lblEnviar);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(entornoGrisOscuro);
		panel_2.setBounds(398, 537, 278, 36);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(moradoOscuroLetra);
		panel_1.setBounds(0, 33, 278, 3);
		panel_2.add(panel_1);
		
		
		JLabel ImgTarjeta = new JLabel("");
		ImgTarjeta.setIcon(new ImageIcon(CompraExitosa.class.getResource("/imagenesProyecto3/mensaje.png")));
		ImgTarjeta.setBounds(4, 2, 39, 30);
		panel_2.add(ImgTarjeta);
		
		
		txtCorreo.setBounds(44, 2, 234, 34);
		panel_2.add(txtCorreo);
		txtCorreo.setColumns(10);

		
		
		lblcorreoEnviado.setForeground(new Color(45, 52, 132));
		lblcorreoEnviado.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblcorreoEnviado.setBounds(701, 546, 143, 20);
		contentPane.add(lblcorreoEnviado);
		lblcorreoEnviado.setVisible(false);
		//ProntTarjeta.setForeground(moradoOscuroLetra);
		//ProntTarjeta.setFont(new Font("Dubai", Font.ITALIC, 12));
		
		lblAdv.setForeground(new Color(220, 20, 60));
		lblAdv.setBounds(701, 576, 224, 13);
		contentPane.add(lblAdv);
		lblAdv.setVisible(false);
		
		//
		
		
		BtnEnviar.setFont(new Font("Dubai", Font.BOLD, 14));
		BtnEnviar.setForeground(new Color(255, 255, 255));
		BtnEnviar.setBackground(new Color(0, 0, 128));
		BtnEnviar.setBounds(363, 583, 110, 34);
		contentPane.add(BtnEnviar);
		
		//
		
		
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnRegresar.setBackground(new Color(154, 160, 230));
		btnRegresar.setBounds(512, 583, 110, 34);
		contentPane.add(btnRegresar);
		
		
		
	}
	public void barraSuperior() {
		JPanel barraSuperior = new JPanel();
		barraSuperior.setBackground(new Color(0, 0, 128));
		barraSuperior.setForeground(new Color(0, 0, 0));
		barraSuperior.setBounds(0, 0, 1012, 58);
		contentPane.add(barraSuperior);
		barraSuperior.setLayout(null);
		
		JLabel nombreQuaria = new JLabel("QUARIA");
		nombreQuaria.setForeground(new Color(255, 255, 255));
		nombreQuaria.setBounds(88, 10, 115, 44);
		barraSuperior.add(nombreQuaria);
		nombreQuaria.setFont(new Font("Dubai", Font.BOLD, 28));
		
		
		JLabel logoQ = new JLabel("New label");
		logoQ.setBounds(22, 4, 56, 50);
		barraSuperior.add(logoQ);
		logoQ.setIcon(new ImageIcon(CompraExitosa.class.getResource("/imagenes2/SL1 (1).png")));
		
		JLabel superiorVuelos = new JLabel("Compra");
		superiorVuelos.setForeground(new Color(255, 255, 255));
		superiorVuelos.setFont(new Font("Dubai", Font.BOLD, 18));
		superiorVuelos.setBounds(865, 23, 64, 24);
		barraSuperior.add(superiorVuelos);
				
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(CompraExitosa.class.getResource("/imagenes2/cochecito.png")));
		lblNewLabel_2.setBounds(941, 10, 45, 44);
		barraSuperior.add(lblNewLabel_2);
		
	}
}
