package Profile;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.JTextArea;


@SuppressWarnings("serial")
public class DesignCareerPath extends JFrame{
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	

	private JTextField jtxtuserid;
	public String AdminUser;
	private JTextField textField_EmployeeID;
	private JTextField textFieldTitle;
	private JTextField textField_StartDate;
	private JTextField textField_EndDate;
	private JTextField textField_Mentor;
	private JTextField textField_Status;
	private JTable table;
	public String cid = "0";
	
	DefaultTableModel model;
	
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnDELETEButton;
	private JButton btnSAVEButton;
	private JTextField textField_careerid;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	
	@SuppressWarnings("deprecation")
	public DesignCareerPath() {
		getContentPane().setForeground(new Color(223, 244, 244));
		

		conn = dbConnection.ConnectDB();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
					String userstr = jtxtuserid.getText().trim();			
					
					if (userstr.equals("admin")) {
						
						adminData();
							
						}
					
					else {
						
						System.out.println(userstr);
						filter();
						
					}
				}

			
		});
		
		
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1438, 869);		
		
		JLabel lblNewLabel = new JLabel("Design your own Career Path");
		lblNewLabel.setBounds(38, 42, 225, 32);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lblNewLabel);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWelcome.setBounds(38, 85, 89, 32);
		getContentPane().add(lblWelcome);
		
		jtxtuserid = new JTextField();
		jtxtuserid.setBounds(116, 90, 129, 22);
		getContentPane().add(jtxtuserid);
		jtxtuserid.setColumns(1);
		
		textField_EmployeeID = new JTextField();
		textField_EmployeeID.setBounds(146, 427, 154, 20);
		getContentPane().add(textField_EmployeeID);
		textField_EmployeeID.setColumns(10);
		textField_EmployeeID.enable(false);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(395, 427, 736, 32);
		getContentPane().add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		textField_StartDate = new JTextField();
		textField_StartDate.setBounds(395, 504, 96, 20);
		getContentPane().add(textField_StartDate);
		textField_StartDate.setColumns(10);
		
		textField_EndDate = new JTextField();
		textField_EndDate.setBounds(537, 504, 96, 20);
		getContentPane().add(textField_EndDate);
		textField_EndDate.setColumns(10);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(38, 520, 309, 74);
		getContentPane().add(scrollPane_2);
		
		JTextArea Requirement = new JTextArea();
		scrollPane_2.setViewportView(Requirement);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(38, 636, 557, 141);
		getContentPane().add(scrollPane_3);
		
		JTextArea Description = new JTextArea();
		scrollPane_3.setViewportView(Description);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(656, 636, 668, 141);
		getContentPane().add(scrollPane_4);
		
		JTextArea Notes = new JTextArea();
		scrollPane_4.setViewportView(Notes);
		
		textField_careerid = new JTextField();
		textField_careerid.setBounds(146, 459, 96, 20);
		getContentPane().add(textField_careerid);
		textField_careerid.setColumns(10);
		textField_careerid.enable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Title:");
		lblNewLabel_1.setBounds(310, 430, 75, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Requirement");
		lblNewLabel_1_1.setBounds(38, 495, 78, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employeeid");
		lblNewLabel_2.setBounds(38, 430, 64, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Careerid");
		lblNewLabel_3.setBounds(38, 462, 49, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_Mentor = new JTextField();
		textField_Mentor.setBounds(126, 804, 295, 20);
		getContentPane().add(textField_Mentor);
		textField_Mentor.setColumns(10);
		
		textField_Status = new JTextField();
		textField_Status.setBounds(688, 504, 171, 20);
		getContentPane().add(textField_Status);
		textField_Status.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Mentors");
		lblNewLabel_4.setBounds(57, 807, 59, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Start Date");
		lblNewLabel_5.setBounds(405, 479, 78, 14);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("End Date");
		lblNewLabel_6.setBounds(551, 479, 82, 14);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Status");
		lblNewLabel_7.setBounds(699, 479, 129, 14);
		getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Description");
		lblNewLabel_8.setBounds(38, 611, 154, 14);
		getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Notes");
		lblNewLabel_9.setBounds(656, 611, 89, 14);
		getContentPane().add(lblNewLabel_9);
		
		JButton btnADDButton = new JButton("ADD a New Record");
		btnADDButton.setBounds(924, 65, 188, 23);
		btnADDButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
				String query = "Insert into CareerPath (employeeID,Title,Requirements,StartDate,EndDate,Mentors,Status,Description ,Notes)values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query);	
				
				pst.setString(1,jtxtuserid.getText());
				pst.setString(2,textFieldTitle.getText());
				pst.setString(3,Requirement.getText());
				pst.setString(4,textField_StartDate.getText());					
				pst.setString(5,textField_EndDate.getText());    					
			    pst.setString(6,textField_Mentor.getText());
			   	pst.setString(7,textField_Status.getText());
		  		pst.setString(8,Description.getText());
		  		pst.setString(9,Notes.getText());
				
				
				pst.execute();
				JOptionPane.showMessageDialog(null, "Your Data has been Saved");
				pst.close();
				filter();
					
				} catch (SQLException ei) {
				
					ei.printStackTrace();
				}	
				
			}
		});
		getContentPane().add(btnADDButton);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(48, 144, 1247, 240);
		getContentPane().add(scrollPane_1);
		
		scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table= new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
				
				int row=table.getSelectedRow();
				
				if (table.getRowSorter()!=null) {
				    row = table.getRowSorter().convertRowIndexToModel(row);
				}
				
				textField_EmployeeID.setText(tmodel.getValueAt(row, 0).toString());
				textField_careerid.setText(tmodel.getValueAt(row, 1).toString());
				textFieldTitle.setText(tmodel.getValueAt(row, 2).toString());
				Requirement.setText(tmodel.getValueAt(row, 3).toString());
				textField_StartDate.setText(tmodel.getValueAt(row, 4).toString());
				textField_EndDate.setText(tmodel.getValueAt(row, 5).toString());
				textField_Mentor.setText(tmodel.getValueAt(row, 6).toString());
				textField_Status.setText(tmodel.getValueAt(row, 7).toString());
				Description.setText(tmodel.getValueAt(row, 8).toString());
				Notes.setText(tmodel.getValueAt(row, 9).toString());
				
			}
		});
		scrollPane.setViewportView(table);	
		model= new DefaultTableModel();
		Object[] column = {"employeeID","CareerID","Title","Requirements","StartDate","EndDate","Mentors","Status","Description" ,"Notes"};
		@SuppressWarnings("unused")
		Object[] row = new Object[0];
		
		model.setColumnIdentifiers(column);
		
		btnDELETEButton = new JButton("DELETE");
		btnDELETEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
		            	
		            	JTextField crid = new JTextField(10);
			            JPanel myPanel = new JPanel();
			            myPanel.add(new JLabel("Enter Careerid to Delete"));
			            myPanel.add(crid);
			            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
			            
			            int result = JOptionPane.showConfirmDialog(null, myPanel, "Enter Careerid DELETED ", JOptionPane.OK_CANCEL_OPTION);
			         
			            if (result == JOptionPane.OK_OPTION) {		            	
			            	cid = crid.getText();
			           // 	JOptionPane.showMessageDialog(null,"User information Deleted");
			            	try {
			            		String query="DELETE from CareerPath where CareerID =? ";
			            		PreparedStatement pstat=conn.prepareStatement(query);
			            		System.out.println("This is the result of data entry"+cid);
			            		pstat.setInt(1, Integer.parseInt(cid));
			            		pstat.execute();
			            		JOptionPane.showMessageDialog(null, "Path Deleted");
			            		pstat.close();
			            		filter();

		        			} catch (Exception ey) {
		        			JOptionPane.showMessageDialog(null, " exception error Path not Deleted");
		        			ey.printStackTrace();}
			            }
		
			}
						
		});
		btnDELETEButton.setBounds(1147, 65, 89, 23);
		getContentPane().add(btnDELETEButton);
		
		btnSAVEButton = new JButton("Update/Save");
			btnSAVEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String qry = "REPLACE into CareerPath (employeeID,CareerID,Title,Requirements,StartDate,EndDate,Mentors,Status,Description ,Notes)values (?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=conn.prepareStatement(qry);
					
				if (jtxtuserid != null){
					String carid = textField_careerid.getText();
					
					pst.setString(1,jtxtuserid.getText());
					pst.setInt(2, Integer.parseInt(carid));
					
					pst.setString(3,textFieldTitle.getText());
					pst.setString(4,Requirement.getText());
					pst.setString(5,textField_StartDate.getText());					
					pst.setString(6,textField_EndDate.getText());    					
				    pst.setString(7,textField_Mentor.getText());
				   	pst.setString(8,textField_Status.getText());
			  		pst.setString(9,Description.getText());
			  		pst.setString(10,Notes.getText());
					
					
					pst.execute();
					JOptionPane.showMessageDialog(null, "Your Data has been Saved");
					pst.close();
					filter();
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Your Data has not been Saved");
				}
					} catch (Exception ex) {
					
					JOptionPane.showMessageDialog(null, " exception error Data not Saved");
					ex.printStackTrace();
				}
			}
		});
		
		btnSAVEButton.setBounds(1261, 65, 129, 23);
		getContentPane().add(btnSAVEButton);
		
	}

public void filter() {
	
	String query ="select * from CareerPath";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		do {
			table.setModel(DbUtils.resultSetToTableModel(rs));
  			
  			DefaultTableModel Model = (DefaultTableModel)table.getModel();
  			TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(Model);
  			table.setRowSorter(tr);
  			tr.setRowFilter(RowFilter.regexFilter(jtxtuserid.getText().trim()));
  			
  			int scount = tr.getViewRowCount();
			 
			if (scount == 0){
				JOptionPane.showMessageDialog(null, "You Need to ADD a Record"); 
				}    
		} while (rs.next());
		}
		
		
		catch (SQLException e) {
		
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, e);
	}	
	
}

public void adminData() {
	
	try {
		String query ="select * from CareerPath";
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rst;
		
		rst = pst.executeQuery();
		
		table.setModel(DbUtils.resultSetToTableModel(rst));
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}	
}
	
	public void my_update(String str) {
		jtxtuserid.setText(str);
		jtxtuserid.setBorder(null);
		jtxtuserid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtxtuserid.setBounds(193, 90, 154, 22);
		jtxtuserid.setBackground(new Color(128, 255, 255));
		getContentPane().add(jtxtuserid);
		jtxtuserid.setColumns(1);
		
		if (str.equals("E101") || str.equals("admin")){
			AdminUser = "Y";
		}else {
			AdminUser = "N";
		}
		
	}
}
