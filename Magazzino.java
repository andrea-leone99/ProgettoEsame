import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;

public class Magazzino extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Magazzino frame = new Magazzino();
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
	public Magazzino() {
		setTitle("Magazzino");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 492);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(51, 52, 77, 14);
		contentPane.add(lblNome);
		
		JLabel lblColore = new JLabel("Colore");
		lblColore.setBounds(51, 98, 77, 14);
		contentPane.add(lblColore);
		
		JLabel lblTaglia = new JLabel("Taglia");
		lblTaglia.setBounds(51, 141, 77, 14);
		contentPane.add(lblTaglia);
		
		JLabel lblPrezzo = new JLabel("Prezzo");
		lblPrezzo.setBounds(51, 180, 77, 14);
		contentPane.add(lblPrezzo);
		
		textField = new JTextField();
		textField.setBounds(138, 49, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 95, 156, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 138, 156, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 177, 156, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(138, 218, 156, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCodprodotto = new JLabel("CodProdotto");
		lblCodprodotto.setBounds(51, 221, 77, 14);
		contentPane.add(lblCodprodotto);
		
		JButton btnInserisci = new JButton("INSERISCI");
		btnInserisci.setBackground(new Color(0, 255, 0));
		btnInserisci.setBounds(25, 402, 103, 23);
		contentPane.add(btnInserisci);
		
		JButton btnElimina = new JButton("ELIMINA");
		btnElimina.setBackground(new Color(255, 0, 0));
		btnElimina.setBounds(138, 402, 103, 23);
		contentPane.add(btnElimina);
		
		JButton btnAggiorna = new JButton("AGGIORNA");
		btnAggiorna.setBackground(new Color(30, 144, 255));
		btnAggiorna.setBounds(250, 402, 103, 23);
		contentPane.add(btnAggiorna);
	}
}
