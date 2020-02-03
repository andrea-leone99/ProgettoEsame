import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	
	
	
	
	
	
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
		
		textField = new JTextField();
		textField.setBounds(347, 65, 145, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Impact", Font.PLAIN, 12));
		lblUsername.setBounds(261, 67, 76, 14);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Impact", Font.PLAIN, 12));
		lblPassword.setBounds(261, 136, 76, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Impact", Font.PLAIN, 12));
		btnLogin.setBounds(360, 192, 132, 34);
		frmLogin.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(347, 133, 145, 20);
		frmLogin.getContentPane().add(passwordField);
		
		JLabel lblInserireUsernameE = new JLabel("Inserire username e password per accedere");
		lblInserireUsernameE.setFont(new Font("Impact", Font.PLAIN, 12));
		lblInserireUsernameE.setBounds(30, 11, 264, 20);
		frmLogin.getContentPane().add(lblInserireUsernameE);
	}
}
