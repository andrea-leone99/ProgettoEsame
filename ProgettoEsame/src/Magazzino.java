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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class Magazzino extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	
	
	
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
		setResizable(false);
		setTitle("Magazzino");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 649);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Impact", Font.PLAIN, 12));
		lblNome.setBounds(34, 174, 77, 14);
		contentPane.add(lblNome);
		
		JLabel lblColore = new JLabel("Colore");
		lblColore.setFont(new Font("Impact", Font.PLAIN, 12));
		lblColore.setBounds(34, 220, 77, 14);
		contentPane.add(lblColore);
		
		JLabel lblTaglia = new JLabel("Taglia");
		lblTaglia.setFont(new Font("Impact", Font.PLAIN, 12));
		lblTaglia.setBounds(34, 263, 77, 14);
		contentPane.add(lblTaglia);
		
		JLabel lblPrezzo = new JLabel("Prezzo");
		lblPrezzo.setFont(new Font("Impact", Font.PLAIN, 12));
		lblPrezzo.setBounds(34, 302, 77, 14);
		contentPane.add(lblPrezzo);
		
		textField = new JTextField();
		textField.setBounds(131, 172, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 218, 156, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 261, 156, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(131, 300, 156, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(133, 341, 156, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCodprodotto = new JLabel("CodProdotto");
		lblCodprodotto.setFont(new Font("Impact", Font.PLAIN, 12));
		lblCodprodotto.setBounds(34, 343, 92, 14);
		contentPane.add(lblCodprodotto);
		
		JButton btnInserisci = new JButton("INSERISCI");
		btnInserisci.setBackground(new Color(0, 255, 0));
		btnInserisci.setBounds(10, 518, 103, 23);
		contentPane.add(btnInserisci);
		
		JButton btnElimina = new JButton("ELIMINA");
		btnElimina.setBackground(new Color(255, 0, 0));
		btnElimina.setBounds(121, 518, 103, 23);
		contentPane.add(btnElimina);
		
		JButton btnAggiorna = new JButton("AGGIORNA");
		btnAggiorna.setBackground(new Color(30, 144, 255));
		btnAggiorna.setBounds(235, 518, 103, 23);
		contentPane.add(btnAggiorna);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setFont(new Font("Impact", Font.PLAIN, 12));
		lblNote.setBounds(34, 385, 77, 14);
		contentPane.add(lblNote);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 410, 245, 94);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(370, 174, 452, 367);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Nome", "Colore", "Taglia", "Prezzo", "CodProdotto"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JLabel lblMagazzino = new JLabel("Magazzino");
		lblMagazzino.setFont(new Font("Impact", Font.PLAIN, 15));
		lblMagazzino.setBounds(370, 149, 77, 14);
		contentPane.add(lblMagazzino);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 847, 138);
		contentPane.add(panel);
		panel.setLayout(null);
	}
}
