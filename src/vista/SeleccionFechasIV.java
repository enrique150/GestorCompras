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
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SeleccionFechasIV extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextPane txtDestino = new JTextPane();
	public JTextPane txtpnLima = new JTextPane();
	public JTextPane mTrayecto = new JTextPane();
	public JTextPane mPasajeros = new JTextPane();
	public JTextPane mTipo = new JTextPane();
	public JComboBox<String> fechasDesplegable1 = new JComboBox<String>();
	public JComboBox<String> horasDesplegable1 = new JComboBox<String>();
	public JComboBox<String> horasDesplegable2 = new JComboBox<String>();
	public JComboBox<String> fechasDesplegable2 = new JComboBox<String>();
	public JButton btnContinuar = new JButton("Continuar");
	public JButton btnRegresar = new JButton("Regresar");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionFechasIV frame = new SeleccionFechasIV();
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
	public SeleccionFechasIV() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelVuelta = new JPanel();
		panelVuelta.setLayout(null);
		panelVuelta.setBackground(new Color(154, 160, 230));
		panelVuelta.setBounds(538, 373, 384, 164);
		contentPane.add(panelVuelta);
		
		
		JLabel lblHoraDePartida_1 = new JLabel("Hora de Partida:");
		lblHoraDePartida_1.setForeground(Color.WHITE);
		lblHoraDePartida_1.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblHoraDePartida_1.setBounds(10, 78, 230, 32);
		panelVuelta.add(lblHoraDePartida_1);
		
		JLabel calendario2 = new JLabel("");
		calendario2.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/calendarIcon.png")));
		calendario2.setBounds(20, 41, 29, 27);
		panelVuelta.add(calendario2);
		
		JLabel reloj2 = new JLabel("");
		reloj2.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/watchIcon.png")));
		reloj2.setBounds(20, 109, 29, 27);
		panelVuelta.add(reloj2);
		
		JPanel panelRecorrido = new JPanel();
		panelRecorrido.setLayout(null);
		panelRecorrido.setBackground(SystemColor.menu);
		panelRecorrido.setBounds(97, 150, 384, 164);
		contentPane.add(panelRecorrido);
		
		
		
		txtDestino.setForeground(new Color(0, 0, 128));
		txtDestino.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtDestino.setEditable(false);
		txtDestino.setBackground(SystemColor.menu);
		txtDestino.setBounds(128, 128, 256, 36);
		panelRecorrido.add(txtDestino);
		
		
		
		txtpnLima.setForeground(new Color(0, 0, 128));
		txtpnLima.setFont(new Font("Dubai", Font.PLAIN, 16));
		txtpnLima.setEditable(false);
		txtpnLima.setBackground(SystemColor.menu);
		txtpnLima.setBounds(23, 10, 132, 26);
		panelRecorrido.add(txtpnLima);
		
		JLabel recorrido = new JLabel("");
		recorrido.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/zigzagF.png")));
		recorrido.setBounds(23, 32, 115, 109);
		panelRecorrido.add(recorrido);
		
		
		
		mTrayecto.setFont(new Font("Dubai", Font.PLAIN, 16));
		mTrayecto.setEditable(false);
		mTrayecto.setBackground(SystemColor.menu);
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
		
		
		
		mPasajeros.setFont(new Font("Dubai", Font.PLAIN, 16));
		mPasajeros.setEditable(false);
		mPasajeros.setBackground(SystemColor.menu);
		mPasajeros.setBounds(246, 69, 115, 26);
		panelRecorrido.add(mPasajeros);
		
		
		
		mTipo.setFont(new Font("Dubai", Font.PLAIN, 16));
		mTipo.setEditable(false);
		mTipo.setBackground(SystemColor.menu);
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
		nombreQuaria.setBounds(88, 10, 131, 44);
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
		imagenAvion.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/cochecito.png")));
		imagenAvion.setBounds(952, 14, 30, 40);
		barraSuperior.add(imagenAvion);
		
		JLabel SeleccionDeFechas = new JLabel("Seleccion de Fechas");
		SeleccionDeFechas.setForeground(new Color(0, 0, 128));
		SeleccionDeFechas.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		SeleccionDeFechas.setBounds(387, 85, 239, 43);
		contentPane.add(SeleccionDeFechas);
		
		JLabel sombRecorrido = new JLabel("");
		sombRecorrido.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/som3.png")));
		sombRecorrido.setBounds(87, 138, 407, 196);
		contentPane.add(sombRecorrido);
		
		JLabel lineaTiempo2 = new JLabel("");
		lineaTiempo2.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/lineaT2.png")));
		lineaTiempo2.setBounds(562, 150, 336, 36);
		contentPane.add(lineaTiempo2);
		
		JLabel lineaVuelo = new JLabel("Vuelo");
		lineaVuelo.setForeground(Color.BLACK);
		lineaVuelo.setFont(new Font("Dubai", Font.BOLD, 17));
		lineaVuelo.setBounds(562, 196, 63, 32);
		contentPane.add(lineaVuelo);
		
		JLabel lineaFecha = new JLabel("Fechas");
		lineaFecha.setForeground(Color.BLACK);
		lineaFecha.setFont(new Font("Dubai", Font.BOLD, 17));
		lineaFecha.setBounds(658, 196, 63, 32);
		contentPane.add(lineaFecha);
		
		JLabel lineaAdicionales = new JLabel("Adicionales");
		lineaAdicionales.setForeground(Color.BLACK);
		lineaAdicionales.setFont(new Font("Dubai", Font.PLAIN, 17));
		lineaAdicionales.setBounds(748, 196, 89, 34);
		contentPane.add(lineaAdicionales);
		
		JLabel lineaPasajeros = new JLabel("Pasajeros");
		lineaPasajeros.setForeground(Color.BLACK);
		lineaPasajeros.setFont(new Font("Dubai", Font.PLAIN, 17));
		lineaPasajeros.setBounds(847, 196, 89, 34);
		contentPane.add(lineaPasajeros);
		
		JPanel panelIda = new JPanel();
		panelIda.setLayout(null);
		panelIda.setBackground(new Color(154, 160, 230));
		panelIda.setBounds(97, 373, 384, 164);
		contentPane.add(panelIda);
		
		JLabel lblFechasDisponibles = new JLabel("Fechas disponibles:");
		lblFechasDisponibles.setForeground(Color.WHITE);
		lblFechasDisponibles.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblFechasDisponibles.setBounds(10, 10, 230, 32);
		panelIda.add(lblFechasDisponibles);
		
		JLabel lblHoraDePartida = new JLabel("Hora de Partida:");
		lblHoraDePartida.setForeground(Color.WHITE);
		lblHoraDePartida.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblHoraDePartida.setBounds(10, 78, 230, 32);
		panelIda.add(lblHoraDePartida);
		
		
		
		fechasDesplegable2.setBackground(Color.WHITE);
		fechasDesplegable2.setBounds(58, 41, 301, 32);
		panelVuelta.add(fechasDesplegable2);
		fechasDesplegable2.setEnabled(false);
		
		

		fechasDesplegable1.setBackground(Color.WHITE);
		fechasDesplegable1.setBounds(58, 41, 301, 32);
		panelIda.add(fechasDesplegable1);
		fechasDesplegable1.getItemAt(0);
		
		
		
		
		horasDesplegable1.setBackground(Color.WHITE);
		horasDesplegable1.setBounds(58, 109, 301, 32);
		panelIda.add(horasDesplegable1);
		horasDesplegable1.addItem(7+" hrs. ");
		horasDesplegable1.addItem(14+" hrs. ");
		horasDesplegable1.addItem(17+" hrs. ");
		
		
		horasDesplegable2.setBackground(Color.WHITE);
		horasDesplegable2.setBounds(58, 109, 301, 32);
		panelVuelta.add(horasDesplegable2);
		horasDesplegable2.addItem(7+" hrs. ");
		horasDesplegable2.addItem(14+" hrs. ");
		horasDesplegable2.addItem(17+" hrs. ");
		
		JLabel calendario1 = new JLabel("");
		calendario1.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/calendarIcon.png")));
		calendario1.setBounds(20, 41, 29, 27);
		panelIda.add(calendario1);
		
		JLabel reloj1 = new JLabel("");
		reloj1.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/watchIcon.png")));
		reloj1.setBounds(20, 109, 29, 27);
		panelIda.add(reloj1);
		
		JLabel lblIda = new JLabel("Elije un vuelo de IDA:");
		lblIda.setForeground(new Color(0, 0, 128));
		lblIda.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblIda.setBounds(97, 331, 230, 32);
		contentPane.add(lblIda);
		
		JLabel lblFechasDisponibles_1 = new JLabel("Fechas disponibles:");
		lblFechasDisponibles_1.setForeground(Color.WHITE);
		lblFechasDisponibles_1.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblFechasDisponibles_1.setBounds(10, 10, 230, 32);
		panelVuelta.add(lblFechasDisponibles_1);
		
		JLabel sombIda = new JLabel("");
		sombIda.setBounds(90, 360, 407, 196);
		contentPane.add(sombIda);
		sombIda.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/som3.png")));
		
		
		
		btnContinuar.setForeground(Color.WHITE);
		btnContinuar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnContinuar.setBackground(new Color(0, 0, 128));
		btnContinuar.setBounds(377, 566, 104, 32);
		contentPane.add(btnContinuar);
		
		
		
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Dubai", Font.BOLD, 14));
		btnRegresar.setBackground(new Color(154, 160, 230));
		btnRegresar.setBounds(521, 566, 104, 32);
		contentPane.add(btnRegresar);
		
		JLabel sombIda_1 = new JLabel("");
		sombIda_1.setIcon(new ImageIcon(SeleccionFechasIV.class.getResource("/imagenesProyecto/som3.png")));
		sombIda_1.setBounds(531, 360, 407, 196);
		contentPane.add(sombIda_1);
		
		JLabel lblVuelta = new JLabel("Elije un vuelo de VUELTA:");
		lblVuelta.setForeground(new Color(0, 0, 128));
		lblVuelta.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblVuelta.setBounds(539, 331, 230, 32);
		contentPane.add(lblVuelta);
	}

}
