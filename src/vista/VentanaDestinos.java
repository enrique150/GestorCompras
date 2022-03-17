package vista;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import modelo.*;
import javax.swing.JTextPane;

public class VentanaDestinos extends JFrame {
	public JPanel des1 = new JPanel();
	public JPanel des2 = new JPanel();
	public JPanel des3 = new JPanel();
	public JPanel des4 = new JPanel();
	public JPanel des5 = new JPanel();
	public JPanel des6 = new JPanel();
	public Vuelo v1=new Vuelo();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDestinos frame = new VentanaDestinos();
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
	public VentanaDestinos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel logoQ = new JLabel("New label");
		logoQ.setBounds(22, 7, 56, 47);
		barraSuperior.add(logoQ);
		logoQ.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes2/SL1 (1).png")));
		
		JLabel superiorVuelos = new JLabel("Vuelos");
		superiorVuelos.setForeground(new Color(255, 255, 255));
		superiorVuelos.setFont(new Font("Dubai", Font.BOLD, 18));
		superiorVuelos.setBounds(878, 23, 64, 24);
		barraSuperior.add(superiorVuelos);
		
		JLabel imagenAvion = new JLabel("");
		imagenAvion.setBounds(952, 14, 30, 40);
		barraSuperior.add(imagenAvion);
		imagenAvion.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/AVION1.png")));
		
		JLabel tituloDestinos = new JLabel("Nuestros Destinos");
		tituloDestinos.setForeground(new Color(0, 0, 128));
		tituloDestinos.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		tituloDestinos.setBounds(409, 72, 204, 44);
		contentPane.add(tituloDestinos);
		
		
		//Place 1
		
		des1.setBackground(new Color(0, 0, 128));
		des1.setBounds(127, 126, 221, 222);
		contentPane.add(des1);
		des1.setLayout(null);
		
		//Des2
		
		des2.setBackground(new Color(255, 255, 255));
		des2.setBounds(392, 126, 221, 222);
		contentPane.add(des2);
		des2.setLayout(null);
		
		//Place 3
		
		des3.setLayout(null);
		des3.setBackground(new Color(0, 0, 128));
		des3.setBounds(662, 126, 221, 222);
		contentPane.add(des3);		
				
		JLabel tituloDes1 = new JLabel("Rio De Janeiro,Brasil");
		tituloDes1.setForeground(new Color(255, 255, 255));
		tituloDes1.setBounds(30, 129, 155, 32);
		des1.add(tituloDes1);
		tituloDes1.setFont(new Font("Dubai", Font.BOLD, 17));
		
		JLabel t1 = new JLabel("No te pierdas el");
		t1.setBounds(25, 155, 104, 32);
		des1.add(t1);
		t1.setForeground(new Color(255, 255, 255));
		t1.setFont(new Font("Dubai", Font.PLAIN, 15));
		
		JLabel t2 = new JLabel("carnaval de Rio");
		t2.setBounds(25, 171, 116, 32);
		des1.add(t2);
		t2.setForeground(Color.WHITE);
		t2.setFont(new Font("Dubai", Font.PLAIN, 15));
		
		JLabel Rio = new JLabel("New label");
		Rio.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/rioDeJaneiroF.png")));
		Rio.setBounds(0, -3, 230, 119);
		des1.add(Rio);
		
		JLabel pin1 = new JLabel("");
		pin1.setBounds(10, 129, 22, 32);
		des1.add(pin1);
		pin1.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/pinBlanco.png")));
		pin1.setForeground(Color.WHITE);
		pin1.setFont(new Font("Dubai", Font.PLAIN, 15));
		
		JLabel f1 = new JLabel("");
		f1.setBounds(186, 129, 25, 32);
		des1.add(f1);
		f1.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/flecha.png")));
		f1.setForeground(Color.WHITE);
		f1.setFont(new Font("Dubai", Font.PLAIN, 15));
		
		JTextPane precio1 = new JTextPane();
		precio1.setEditable(false);
		precio1.setForeground(new Color(255, 255, 255));
		precio1.setBackground(new Color(0, 0, 128));
		precio1.setFont(new Font("Dubai", Font.BOLD, 21));
		precio1.setText("$439.99");
		precio1.setBounds(129, 171, 82, 29);
		des1.add(precio1);
		
		JLabel tituloDes2 = new JLabel("Roma,Italia");
		tituloDes2.setBounds(34, 126, 132, 32);
		tituloDes2.setForeground(new Color(0, 0, 128));
		tituloDes2.setFont(new Font("Dubai", Font.BOLD, 17));
		des2.add(tituloDes2);
		
		JLabel lblVisitaElColiseo = new JLabel("Visita el coliseo");
		lblVisitaElColiseo.setBounds(25, 154, 101, 32);
		lblVisitaElColiseo.setForeground(new Color(0, 0, 128));
		lblVisitaElColiseo.setFont(new Font("Dubai", Font.PLAIN, 15));
		des2.add(lblVisitaElColiseo);
		
		JLabel lblVaticanoYMs = new JLabel("Vaticano y m\u00E1s.");
		lblVaticanoYMs.setBounds(25, 171, 116, 32);
		lblVaticanoYMs.setForeground(new Color(0, 0, 128));
		lblVaticanoYMs.setFont(new Font("Dubai", Font.PLAIN, 15));
		des2.add(lblVaticanoYMs);
		
		JLabel roma = new JLabel("");
		roma.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/RomaF.png")));
		roma.setBounds(0, -3, 230, 119);
		des2.add(roma);
		
		JLabel pin2 = new JLabel("");
		pin2.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/pinMorado.png")));
		pin2.setBounds(10, 126, 22, 32);
		pin2.setForeground(Color.WHITE);
		pin2.setFont(new Font("Dubai", Font.PLAIN, 15));
		des2.add(pin2);
		
		JLabel f2 = new JLabel("");
		f2.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/flechaMorada.png")));
		f2.setBounds(176, 126, 35, 32);
		f2.setForeground(Color.WHITE);
		f2.setFont(new Font("Dubai", Font.PLAIN, 15));
		des2.add(f2);
		
		JTextPane precio2 = new JTextPane();
		precio2.setEditable(false);
		precio2.setText("$689.99");
		precio2.setForeground(new Color(0, 0, 128));
		precio2.setFont(new Font("Dubai", Font.BOLD, 21));
		precio2.setBackground(new Color(255, 255, 255));
		precio2.setBounds(129, 168, 82, 29);
		des2.add(precio2);
		
		JLabel sombra2 = new JLabel("");
		sombra2.setBounds(385, 115, 245, 245);
		contentPane.add(sombra2);
		sombra2.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/SombraDestino6.png")));
		
		JLabel sombra1 = new JLabel("");
		sombra1.setBounds(120, 115, 245, 245);
		contentPane.add(sombra1);
		sombra1.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/SombraDestino6.png")));
		
		
		
		JLabel tituloDes3 = new JLabel("Paris,Francia");
		tituloDes3.setForeground(Color.WHITE);
		tituloDes3.setFont(new Font("Dubai", Font.BOLD, 17));
		tituloDes3.setBounds(30, 129, 155, 32);
		des3.add(tituloDes3);
		
		JLabel lblEnamrateDe = new JLabel("Enam\u00F3rate de la");
		lblEnamrateDe.setForeground(Color.WHITE);
		lblEnamrateDe.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblEnamrateDe.setBounds(25, 155, 104, 32);
		des3.add(lblEnamrateDe);
		
		JLabel lblLaCuidadDe = new JLabel("Cuidad de Luz");
		lblLaCuidadDe.setForeground(Color.WHITE);
		lblLaCuidadDe.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblLaCuidadDe.setBounds(25, 171, 116, 32);
		des3.add(lblLaCuidadDe);
		
		JLabel paris = new JLabel("");
		paris.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/parisF.png")));
		paris.setBounds(0, -3, 230, 119);
		des3.add(paris);
		
		JLabel pin3 = new JLabel("");
		pin3.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/pinBlanco.png")));
		pin3.setForeground(Color.WHITE);
		pin3.setFont(new Font("Dubai", Font.PLAIN, 15));
		pin3.setBounds(10, 129, 22, 32);
		des3.add(pin3);
		
		JLabel f3 = new JLabel("");
		f3.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/flecha.png")));
		f3.setForeground(Color.WHITE);
		f3.setFont(new Font("Dubai", Font.PLAIN, 15));
		f3.setBounds(186, 129, 25, 32);
		des3.add(f3);
		
		JTextPane precio3 = new JTextPane();
		precio3.setEditable(false);
		precio3.setText("$679.99");
		precio3.setForeground(Color.WHITE);
		precio3.setFont(new Font("Dubai", Font.BOLD, 21));
		precio3.setBackground(new Color(0, 0, 128));
		precio3.setBounds(129, 174, 82, 29);
		des3.add(precio3);
		
		JLabel sombra3 = new JLabel("");
		sombra3.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/SombraDestino6.png")));
		sombra3.setBounds(653, 115, 245, 245);
		contentPane.add(sombra3);
		
		//Place 4
		
		des4.setLayout(null);
		des4.setBackground(new Color(0, 0, 128));
		des4.setBounds(127, 378, 221, 222);
		contentPane.add(des4);
		
		JLabel tituloDes4 = new JLabel("Rovaniemi,Finlandia");
		tituloDes4.setForeground(Color.WHITE);
		tituloDes4.setFont(new Font("Dubai", Font.BOLD, 17));
		tituloDes4.setBounds(30, 129, 155, 32);
		des4.add(tituloDes4);
		
		JLabel t1_4 = new JLabel("Conoce el hogar");
		t1_4.setForeground(Color.WHITE);
		t1_4.setFont(new Font("Dubai", Font.PLAIN, 15));
		t1_4.setBounds(25, 155, 104, 32);
		des4.add(t1_4);
		
		JLabel t2_4 = new JLabel("de Papa Noel");
		t2_4.setForeground(Color.WHITE);
		t2_4.setFont(new Font("Dubai", Font.PLAIN, 15));
		t2_4.setBounds(25, 171, 116, 32);
		des4.add(t2_4);
		
		JLabel rova = new JLabel("");
		rova.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/ravaF.png")));
		rova.setBounds(0, -3, 230, 119);
		des4.add(rova);
		
		JLabel pin1_1 = new JLabel("");
		pin1_1.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/pinBlanco.png")));
		pin1_1.setForeground(Color.WHITE);
		pin1_1.setFont(new Font("Dubai", Font.PLAIN, 15));
		pin1_1.setBounds(10, 129, 22, 32);
		des4.add(pin1_1);
		
		JLabel f4 = new JLabel("");
		f4.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/flecha.png")));
		f4.setForeground(Color.WHITE);
		f4.setFont(new Font("Dubai", Font.PLAIN, 15));
		f4.setBounds(186, 129, 25, 32);
		des4.add(f4);
		
		JTextPane precio4 = new JTextPane();
		precio4.setEditable(false);
		precio4.setText("$1159.99");
		precio4.setForeground(Color.WHITE);
		precio4.setFont(new Font("Dubai", Font.BOLD, 21));
		precio4.setBackground(new Color(0, 0, 128));
		precio4.setBounds(118, 171, 93, 29);
		des4.add(precio4);
		
		JLabel sombra4 = new JLabel("");
		sombra4.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/SombraDestino6.png")));
		sombra4.setBounds(120, 370, 245, 245);
		contentPane.add(sombra4);
		
		//Place 5
		
		des5.setLayout(null);
		des5.setBackground(Color.WHITE);
		des5.setBounds(392, 378, 221, 222);
		contentPane.add(des5);
		
		JLabel tituloDes5 = new JLabel("New York, EEUU");
		tituloDes5.setForeground(new Color(0, 0, 128));
		tituloDes5.setFont(new Font("Dubai", Font.BOLD, 17));
		tituloDes5.setBounds(34, 126, 132, 32);
		des5.add(tituloDes5);
		
		JLabel t1_5 = new JLabel("Visita Central");
		t1_5.setForeground(new Color(0, 0, 128));
		t1_5.setFont(new Font("Dubai", Font.PLAIN, 15));
		t1_5.setBounds(25, 154, 101, 32);
		des5.add(t1_5);
		
		JLabel t2_5 = new JLabel("Park y m\u00E1s.");
		t2_5.setForeground(new Color(0, 0, 128));
		t2_5.setFont(new Font("Dubai", Font.PLAIN, 15));
		t2_5.setBounds(25, 171, 116, 32);
		des5.add(t2_5);
		
		JLabel newYork = new JLabel("");
		newYork.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/newYorkF.png")));
		newYork.setBounds(0, -3, 230, 119);
		des5.add(newYork);
		
		JLabel pin5 = new JLabel("");
		pin5.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/pinMorado.png")));
		pin5.setForeground(Color.WHITE);
		pin5.setFont(new Font("Dubai", Font.PLAIN, 15));
		pin5.setBounds(10, 126, 22, 32);
		des5.add(pin5);
		
		JLabel f5 = new JLabel("");
		f5.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/flechaMorada.png")));
		f5.setForeground(Color.WHITE);
		f5.setFont(new Font("Dubai", Font.PLAIN, 15));
		f5.setBounds(176, 126, 35, 32);
		des5.add(f5);
		
		JTextPane precio5 = new JTextPane();
		precio5.setEditable(false);
		precio5.setText("$279.99");
		precio5.setForeground(new Color(0, 0, 128));
		precio5.setFont(new Font("Dubai", Font.BOLD, 21));
		precio5.setBackground(Color.WHITE);
		precio5.setBounds(117, 168, 82, 29);
		des5.add(precio5);
		
		JLabel sombra5 = new JLabel("");
		sombra5.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/SombraDestino6.png")));
		sombra5.setBounds(385, 370, 245, 245);
		contentPane.add(sombra5);
		
		//Place 6
		des6.setLayout(null);
		des6.setBackground(new Color(0, 0, 128));
		des6.setBounds(663, 378, 221, 222);
		contentPane.add(des6);
		
		JLabel tituloDes6 = new JLabel("Punta Cana, RD");
		tituloDes6.setForeground(Color.WHITE);
		tituloDes6.setFont(new Font("Dubai", Font.BOLD, 17));
		tituloDes6.setBounds(30, 129, 155, 32);
		des6.add(tituloDes6);
		
		JLabel t1_6 = new JLabel("Disfruta de la");
		t1_6.setForeground(Color.WHITE);
		t1_6.setFont(new Font("Dubai", Font.PLAIN, 15));
		t1_6.setBounds(25, 155, 116, 32);
		des6.add(t1_6);
		
		JLabel t2_6 = new JLabel("playa.");
		t2_6.setForeground(Color.WHITE);
		t2_6.setFont(new Font("Dubai", Font.PLAIN, 15));
		t2_6.setBounds(25, 171, 116, 32);
		des6.add(t2_6);
		
		JLabel rd = new JLabel("");
		rd.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/rdF.png")));
		rd.setBounds(0, -3, 230, 119);
		des6.add(rd);
		
		JLabel pin6 = new JLabel("");
		pin6.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/pinBlanco.png")));
		pin6.setForeground(Color.WHITE);
		pin6.setFont(new Font("Dubai", Font.PLAIN, 15));
		pin6.setBounds(10, 129, 22, 32);
		des6.add(pin6);
		
		JLabel f6 = new JLabel("");
		f6.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/flecha.png")));
		f6.setForeground(Color.WHITE);
		f6.setFont(new Font("Dubai", Font.PLAIN, 15));
		f6.setBounds(186, 129, 25, 32);
		des6.add(f6);
		
		JTextPane precio6 = new JTextPane();
		precio6.setEditable(false);
		precio6.setText("$379.99");
		precio6.setForeground(Color.WHITE);
		precio6.setFont(new Font("Dubai", Font.BOLD, 21));
		precio6.setBackground(new Color(0, 0, 128));
		precio6.setBounds(118, 171, 82, 29);
		des6.add(precio6);
		
		JLabel sombra6 = new JLabel("");
		sombra6.setIcon(new ImageIcon(VentanaDestinos.class.getResource("/imagenesProyecto/SombraDestino6.png")));
		sombra6.setBounds(653, 370, 245, 245);
		contentPane.add(sombra6);
	}
}