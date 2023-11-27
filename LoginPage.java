package Profile;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

@SuppressWarnings({ "serial", "unused" })
public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private JPasswordField txtPassword;
	
	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setForeground(new Color(250, 235, 215));
		setBackground(new Color(250, 235, 215));
		conn = dbConnection.ConnectDB();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setBackground(new Color(250, 235, 215));
		txtUserName.setBounds(87, 63, 130, 23);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 58, 92, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblPassword.setBounds(10, 103, 92, 25);
		contentPane.add(lblPassword);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setBackground(new Color(250, 235, 215));
		btnlogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String str = (String) txtUserName.getText();
				
				String sql = "SELECT * from UserInfo where username=? and password=?";

				try {
					
					pst = conn.prepareStatement(sql);
					pst.setString(1, txtUserName.getText());
					pst.setString(2, txtPassword.getText());
					rs = pst.executeQuery();
					
					if (rs.next()) {
						
						JOptionPane.showMessageDialog(null,"Please select your record at the top of the Form.\nIf this is your first Signin\nPlease enter your values and ADD/UPDATE PROFILE to create  your record");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									IgniteForm frame = new IgniteForm();
									frame.setVisible(true);
									frame.setFocusTraversalKeysEnabled(false);
									frame.my_update(str);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
						
						dispose();
						
					}else {
						
						JOptionPane.showMessageDialog(null,"Login UnSuccessful Username or Password incorrect..");
					}
					
					
					pst.close();
					rs.close();
					
				}catch (Exception u) {
						u.printStackTrace();		
				}
			}
		});
		btnlogin.setBounds(109, 149, 89, 23);
		contentPane.add(btnlogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		btnExit.setBounds(10, 149, 89, 23);
		contentPane.add(btnExit);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(250, 235, 215));
		txtPassword.setBounds(87, 107, 130, 20);
		contentPane.add(txtPassword);
		
		JButton btnRequestHelp = new JButton("Request HELP!!  Email ADMIN");
		btnRequestHelp.setBackground(new Color(250, 235, 215));
		btnRequestHelp.setBounds(221, 149, 188, 23);
		contentPane.add(btnRequestHelp);
		
		JLabel lblNewLabel_1 = new JLabel("Ignite Census");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBackground(new Color(250, 235, 215));
		lblNewLabel_1.setBounds(130, 11, 130, 39);
		contentPane.add(lblNewLabel_1);
	}
	
public void my_update(String str) {
	txtUserName.setText(str);
	txtUserName.setBorder(null);		
	txtUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
	txtUserName.setBounds(259, 0, 360, 20);
	getContentPane().add(txtUserName);
	txtUserName.setColumns(10);
		
	}
}
