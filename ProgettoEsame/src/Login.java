import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GestoreEmail.GuiGestione;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLogin;
	private JTextField Username;
	private JPasswordField Password;

	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	
	
	
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	
	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.getContentPane().setBackground(SystemColor.activeCaption);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 551, 326);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblLogoPng = new JLabel("Logo png");
		lblLogoPng.setBounds(30, 60, 186, 166);
		frmLogin.getContentPane().add(lblLogoPng);
		
		Username = new JTextField();
		Username.setBounds(347, 65, 145, 20);
		frmLogin.getContentPane().add(Username);
		Username.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Impact", Font.PLAIN, 12));
		lblUsername.setBounds(261, 67, 76, 14);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Impact", Font.PLAIN, 12));
		lblPassword.setBounds(261, 136, 76, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//codice del metodo
				
				String uname=Username.getText();
				String psd=Password.getText();
				
				if(uname.equals("marco99") && psd.equals("pass_marco99")) {
					new AdminPanel().setVisible(true);
				}
					else if(uname.equals("chiara_03") && psd.equals("chiararossi02")) {
						new AdminPanel().setVisible(true);
					}
				
					else if(uname.equals("paolotrattore") && psd.equals("paolotratt")) {
						new AdminPanel().setVisible(true);
					}
				
					else if(uname.equals("dom02_") && psd.equals("123456_*")) {
						new AdminPanel().setVisible(true);
					}
				
					else if(uname.equals("Mario_Verdi") && psd.equals("admin_mario93")) {
						new AdminPanel().setVisible(true);
					}
				
				   //implementazione jdialog
				
					
				
			}//fine metodo del bottone login 
		});
		btnLogin.setFont(new Font("Impact", Font.PLAIN, 12));
		btnLogin.setBounds(360, 192, 132, 34);
		frmLogin.getContentPane().add(btnLogin);
		
		Password = new JPasswordField();
		Password.setBounds(347, 133, 145, 20);
		frmLogin.getContentPane().add(Password);
		
		JLabel lblInserireUsernameE = new JLabel("Inserire username e password per accedere");
		lblInserireUsernameE.setFont(new Font("Impact", Font.PLAIN, 12));
		lblInserireUsernameE.setBounds(30, 11, 264, 20);
		frmLogin.getContentPane().add(lblInserireUsernameE);
	}
}
