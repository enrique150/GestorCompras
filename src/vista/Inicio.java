package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Inicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnNewButton = new JButton("Compra aqu\u00ED");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1012, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUARIA");
		lblNewLabel.setBounds(22, 0, 196, 55);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 28));
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes2/SL1 (1).png")));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Inicio.class.getResource("/imagenesProyecto/AVION1.png")));
		lblNewLabel_3.setBounds(961, 10, 30, 45);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Vuelos");
		lblNewLabel_4.setFont(new Font("Dubai", Font.BOLD, 18));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(892, 23, 59, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Inicio.class.getResource("/imagenesProyecto/ESPERA1.png")));
		lblNewLabel_1.setBounds(126, 200, 738, 331);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u00A1Bienvenido a");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Dubai", Font.BOLD, 44));
		lblNewLabel_2.setBounds(344, 96, 347, 62);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("nuestra aerolinea!");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1.setFont(new Font("Dubai", Font.BOLD, 44));
		lblNewLabel_2_1.setBounds(354, 148, 347, 62);
		contentPane.add(lblNewLabel_2_1);
		
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(123, 104, 238));
		btnNewButton.setFont(new Font("Dubai", Font.BOLD, 18));
		btnNewButton.setBounds(451, 550, 137, 49);
		contentPane.add(btnNewButton);
	}
}
