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
		setBounds(100, 100, 861, 492);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Impact", Font.PLAIN, 12));
		lblNome.setBounds(51, 52, 77, 14);
		contentPane.add(lblNome);
		
		JLabel lblColore = new JLabel("Colore");
		lblColore.setFont(new Font("Impact", Font.PLAIN, 12));
		lblColore.setBounds(51, 98, 77, 14);
		contentPane.add(lblColore);
		
		JLabel lblTaglia = new JLabel("Taglia");
		lblTaglia.setFont(new Font("Impact", Font.PLAIN, 12));
		lblTaglia.setBounds(51, 141, 77, 14);
		contentPane.add(lblTaglia);
		
		JLabel lblPrezzo = new JLabel("Prezzo");
		lblPrezzo.setFont(new Font("Impact", Font.PLAIN, 12));
		lblPrezzo.setBounds(51, 180, 77, 14);
		contentPane.add(lblPrezzo);
		
		textField = new JTextField();
		textField.setBounds(148, 50, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 96, 156, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 139, 156, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(148, 178, 156, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(150, 219, 156, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCodprodotto = new JLabel("CodProdotto");
		lblCodprodotto.setFont(new Font("Impact", Font.PLAIN, 12));
		lblCodprodotto.setBounds(51, 221, 92, 14);
		contentPane.add(lblCodprodotto);
		
		JButton btnInserisci = new JButton("INSERISCI");
		btnInserisci.setBackground(new Color(0, 255, 0));
		btnInserisci.setBounds(27, 414, 103, 23);
		contentPane.add(btnInserisci);
		
		JButton btnElimina = new JButton("ELIMINA");
		btnElimina.setBackground(new Color(255, 0, 0));
		btnElimina.setBounds(138, 414, 103, 23);
		contentPane.add(btnElimina);
		
		JButton btnAggiorna = new JButton("AGGIORNA");
		btnAggiorna.setBackground(new Color(30, 144, 255));
		btnAggiorna.setBounds(252, 414, 103, 23);
		contentPane.add(btnAggiorna);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setFont(new Font("Impact", Font.PLAIN, 12));
		lblNote.setBounds(51, 272, 77, 14);
		contentPane.add(lblNote);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 306, 245, 94);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(393, 52, 452, 381);
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
		lblMagazzino.setBounds(394, 11, 77, 14);
		contentPane.add(lblMagazzino);
	}
}
