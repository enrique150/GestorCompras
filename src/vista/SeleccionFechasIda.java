package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;


public class SeleccionFechasIda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextPane txtDestino = new JTextPane();
	public JTextPane txtOrigen = new JTextPane();
	public JTextPane mTrayecto = new JTextPane();
	public JTextPane mPasajeros = new JTextPane();
	public JTextPane mTipo = new JTextPane();
	public JComboBox<String> fechasDesplegable = new JComboBox<String>();
	public JComboBox<String> horasDesplegable = new JComboBox<String>();
	public JButton btnContinuar = new JButton("Continuar");
	public JButton btnRegresar = new JButton("Regresar");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionFechasIda frame = new SeleccionFechasIda();
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
	public SeleccionFechasIda() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 679);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelRecorrido = new JPanel();
		panelRecorrido.setBackground(new Color(240, 240, 240));
		panelRecorrido.setBounds(84, 139, 384, 164);
		contentPane.add(panelRecorrido);
		panelRecorrido.setLayout(null);
		
		
		txtDestino.setForeground(new Color(0, 0, 128));
		
		txtDestino.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtDestino.setEditable(false);
		txtDestino.setBackground(SystemColor.menu);
		txtDestino.setBounds(128, 128, 246, 36);
		panelRecorrido.add(txtDestino);
		
		
		txtOrigen.setForeground(new Color(0, 0, 128));
		
		txtOrigen.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtOrigen.setEditable(false);
		txtOrigen.setBackground(SystemColor.menu);
		txtOrigen.setBounds(23, 10, 132, 26);
		panelRecorrido.add(txtOrigen);
		
		JLabel recorrido = new JLabel("");
		recorrido.setIcon(new ImageIcon(SeleccionFechasIda.class.getResource("/imagenesProyecto/zigzagF.png")));
		recorrido.setBounds(23, 32, 115, 109);
		panelRecorrido.add(recorrido);
		
		
		mTrayecto.setEditable(false);
		mTrayecto.setFont(new Font("Dubai", Font.PLAIN, 16));
		
		mTrayecto.setBackground(SystemColor.control);
		mTrayecto.setBounds(246, 43, 115, 26);
		panelRecorrido.add(mTrayecto);
		
		JLabel lblDetalles = new JLabel("Detalles del vuelo:");
		lblDetalles.setFont(new Font("Dubai", Font.BOLD, 16));
		lblDetalles.setBounds(165, 20, 150, 26);
		panelRecorrido.add(lblDetalles);
		
		JLabel lblTrayecto = new JLabel("Trayecto:");
		lblTrayecto.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblTrayecto.setBounds(165, 50, 150, 19);
		panelRecorrido.add(lblTrayecto);
		
		JLabel lblPasajeros = new JLabel("Pasajeros:");
		lblPasajeros.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblPasajeros.setBounds(165, 76, 78, 20);
		panelRecorrido.add(lblPasajeros);
		
		JLabel lblTipo = new JLabel("Tipo de Vuelo:");
		lblTipo.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblTipo.setBounds(165, 102, 99, 19);
		panelRecorrido.add(lblTipo);
		
		
		mPasajeros.setEditable(false);
		
		mPasajeros.setFont(new Font("Dubai", Font.PLAIN, 16));
		mPasajeros.setBackground(SystemColor.control);
		mPasajeros.setBounds(246, 69, 115, 26);
		panelRecorrido.add(mPasajeros);
		
		
		mTipo.setEditable(false);
		
		mTipo.setFont(new Font("Dubai", Font.PLAIN, 16));
		mTipo.setBackground(SystemColor.control);
		mTipo.setBounds(267, 95, 94, 26);
		panelRecorrido.add(mTipo);
		
		JPanel barraSuperior = new JPanel();
		barraSuperior.setLayout(null);
		barraSuperior.setForeground(Color.BLACK);
		barraSuperior.setBackground(new Color(0, 0, 128));
		barraSuperior.setBounds(0, 0, 1012, 62);
		contentPane.add(barraSuperior);
		
		JLabel nombreQuaria = new JLabel("QUARIA");
		nombreQuaria.setForeground(Color.WHITE);
		nombreQuaria.setFont(new Font("Dubai", Font.BOLD, 28));
		nombreQuaria.setBounds(88, 10, 130, 44);
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
		imagenAvion.setIcon(new ImageIcon(SeleccionFechasIda.class.getResource("/imagenesProyecto/cochecito.png")));
		imagenAvion.setBounds(952, 14, 30, 40);
		barraSuperior.add(imagenAvion);
		
		JLabel SeleccionDeFechas = new JLabel("Seleccion de Fechas");
		SeleccionDeFechas.setForeground(new Color(0, 0, 128));
		SeleccionDeFechas.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		SeleccionDeFechas.setBounds(376, 86, 239, 43);
		contentPane.add(SeleccionDeFechas);
		
		JLabel lineaTiempo2 = new JLabel("");
		lineaTiempo2.setIcon(new ImageIcon(SeleccionFechasIda.class.getResource("/imagenesProyecto/lineaT2.png")));
		lineaTiempo2.setBounds(574, 159, 336, 36);
		contentPane.add(lineaTiempo2);
		
		JLabel lineaVuelo = new JLabel("Vuelo");
		lineaVuelo.setForeground(Color.BLACK);
		lineaVuelo.setFont(new Font("Dubai", Font.BOLD, 17));
		lineaVuelo.setBounds(574, 205, 63, 32);
		contentPane.add(lineaVuelo);
		
		JLabel lineaFecha = new JLabel("Fechas");
		lineaFecha.setForeground(Color.BLACK);
		lineaFecha.setFont(new Font("Dubai", Font.BOLD, 17));
		lineaFecha.setBounds(665, 205, 63, 32);
		contentPane.add(lineaFecha);
		
		JLabel lineaAdicionales = new JLabel("Adicionales");
		lineaAdicionales.setForeground(Color.BLACK);
		lineaAdicionales.setFont(new Font("Dubai", Font.PLAIN, 17));
		lineaAdicionales.setBounds(751, 205, 89, 34);
		contentPane.add(lineaAdicionales);
		
		JLabel lineaPasajeros = new JLabel("Pasajeros");
		lineaPasajeros.setForeground(Color.BLACK);
		lineaPasajeros.setFont(new Font("Dubai", Font.PLAIN, 17));
		lineaPasajeros.setBounds(864, 205, 89, 34);
		contentPane.add(lineaPasajeros);
		
		JPanel panelIda = new JPanel();
		panelIda.setLayout(null);
		panelIda.setBackground(new Color(154, 160, 230));
		panelIda.setBounds(84, 373, 384, 164);
		contentPane.add(panelIda);
		
		JLabel lblFechasDisponibles = new JLabel("Fechas disponibles:");
		lblFechasDisponibles.setForeground(new Color(255, 255, 255));
		lblFechasDisponibles.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblFechasDisponibles.setBounds(10, 10, 230, 32);
		panelIda.add(lblFechasDisponibles);
		
		JLabel lblHoraDePartida = new JLabel("Hora de Partida:");
		lblHoraDePartida.setForeground(Color.WHITE);
		lblHoraDePartida.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblHoraDePartida.setBounds(10, 78, 230, 32);
		panelIda.add(lblHoraDePartida);
		
		
		fechasDesplegable.setBackground(new Color(255, 255, 255));
		fechasDesplegable.setBounds(58, 41, 301, 32);
		panelIda.add(fechasDesplegable);
		
		
		
		horasDesplegable.setBackground(Color.WHITE);
		horasDesplegable.setBounds(58, 109, 301, 32);
		panelIda.add(horasDesplegable);
		horasDesplegable.addItem(7+" hrs. ");
		horasDesplegable.addItem(14+" hrs. ");
		horasDesplegable.addItem(17+" hrs. ");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SeleccionFechasIda.class.getResource("/imagenesProyecto/calendarIcon.png")));
		lblNewLabel_1.setBounds(20, 41, 29, 27);
		panelIda.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(SeleccionFechasIda.class.getResource("/imagenesProyecto/watchIcon.png")));
		lblNewLabel_1_1.setBounds(20, 109, 29, 27);
		panelIda.add(lblNewLabel_1_1);
		
		JLabel sombRecorrido = new JLabel("");
		sombRecorrido.setBounds(77, 126, 407, 196);
		contentPane.add(sombRecorrido);
		sombRecorrido.setIcon(new ImageIcon(SeleccionFechasIda.class.getResource("/imagenesProyecto/som3.png")));
		
		JLabel sombRecorrido_1 = new JLabel("");
		sombRecorrido_1.setIcon(new ImageIcon(SeleccionFechasIda.class.getResource("/imagenesProyecto/som3.png")));
		sombRecorrido_1.setBounds(77, 360, 407, 196);
		contentPane.add(sombRecorrido_1);
		
		JLabel lblElijeUnVuelo = new JLabel("Elije un vuelo de IDA:");
		lblElijeUnVuelo.setForeground(new Color(0, 0, 128));
		lblElijeUnVuelo.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblElijeUnVuelo.setBounds(84, 332, 230, 32);
		contentPane.add(lblElijeUnVuelo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SeleccionFechasIda.class.getResource("/imagenesProyecto/aeropuertoCeleste.png")));
		lblNewLabel.setBounds(536, 278, 417, 269);
		contentPane.add(lblNewLabel);
		
		
		
		btnContinuar.setForeground(Color.WHITE);
		btnContinuar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnContinuar.setBackground(new Color(0, 0, 128));
		btnContinuar.setBounds(364, 577, 104, 32);
		contentPane.add(btnContinuar);
		
		
		
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnRegresar.setBackground(new Color(154, 160, 230));
		btnRegresar.setBounds(522, 577, 104, 32);
		contentPane.add(btnRegresar);
	}
}
