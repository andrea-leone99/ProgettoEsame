import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class AdminPanel extends JFrame {

	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
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
	public AdminPanel() {
		getContentPane().setBackground(SystemColor.activeCaption);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(490, 0, 147, 357);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("ALTRO");
		btnNewButton.setBounds(10, 11, 131, 108);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MAGAZZINO");
		btnNewButton_1.setBounds(10, 125, 131, 108);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ASSISTENZA");
		btnNewButton_2.setBounds(10, 244, 131, 102);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(0, 0, 491, 51);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblScegliUnaVoce = new JLabel("Scegli una voce dal menu a destra per continuare");
		lblScegliUnaVoce.setFont(new Font("Impact", Font.PLAIN, 14));
		lblScegliUnaVoce.setBounds(27, 11, 372, 29);
		panel_1.add(lblScegliUnaVoce);
		
		JLabel lblLogopng = new JLabel("Logo_png");
		lblLogopng.setBounds(57, 122, 180, 145);
		getContentPane().add(lblLogopng);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 396);
	}
}
