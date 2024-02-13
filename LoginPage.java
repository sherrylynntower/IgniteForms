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
import javax.swing.SwingConstants;

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
		setBounds(100, 100, 688, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(142, 194, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setSelectedTextColor(new Color(0, 0, 255));
		txtUserName.setForeground(new Color(235, 248, 248));
		txtUserName.setBackground(new Color(142, 194, 255));
		txtUserName.setBounds(211, 132, 283, 23);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBackground(new Color(142, 194, 247));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel.setBounds(115, 127, 92, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 255));
		lblPassword.setBackground(new Color(142, 194, 247));
		lblPassword.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblPassword.setBounds(115, 195, 92, 25);
		contentPane.add(lblPassword);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setForeground(new Color(0, 0, 255));
		btnlogin.setBackground(new Color(142, 194, 255));
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
		btnlogin.setBounds(405, 286, 89, 23);
		contentPane.add(btnlogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(0, 0, 255));
		btnExit.setBackground(new Color(142, 194, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		btnExit.setBounds(211, 286, 89, 23);
		contentPane.add(btnExit);
		
		txtPassword = new JPasswordField();
		txtPassword.setDisabledTextColor(new Color(0, 0, 0));
		txtPassword.setEchoChar('*');
		txtPassword.setSelectedTextColor(new Color(0, 0, 255));
		txtPassword.setForeground(new Color(235, 248, 248));
		txtPassword.setBackground(new Color(142, 194, 255));
		txtPassword.setBounds(211, 195, 283, 20);
		contentPane.add(txtPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Ignite Census");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBackground(new Color(250, 235, 215));
		lblNewLabel_1.setBounds(115, 11, 424, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(211, 61, 222, 49);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Admin Contacts:  stower@ca.ibm.com; Sushila.Devi@ibm.com");
		lblNewLabel_3.setBounds(21, 379, 602, 39);
		contentPane.add(lblNewLabel_3);
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
