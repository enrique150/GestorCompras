package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class PreInicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JLabel lblNewLabel = new JLabel("");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreInicio frame = new PreInicio();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PreInicio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setIcon(new ImageIcon(PreInicio.class.getResource("/imagenesProyecto/PreInicioL.png")));
		lblNewLabel.setBounds(366, 117, 295, 270);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("QUARIA");
		lblNewLabel_1.setFont(new Font("Dubai", Font.BOLD, 42));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(435, 397, 163, 55);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(". . .");
		lblNewLabel_2.setFont(new Font("Dubai", Font.BOLD, 64));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(479, 425, 75, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cargando");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Dubai", Font.BOLD, 24));
		lblNewLabel_3.setBounds(461, 482, 105, 21);
		contentPane.add(lblNewLabel_3);
	}
}
