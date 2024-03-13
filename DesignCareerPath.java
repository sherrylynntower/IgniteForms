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
import java.lang.module.ModuleDescriptor.Requires;
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
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;
import java.awt.Component;


@SuppressWarnings({ "serial", "unused" })
public class DesignCareerPath extends JFrame{
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	

	private JTextField jtxtuserid;
	private JTextField textField_Requirement ;
	private JTextField textField_Mentors;
	private JTextField textField_Description;
	private JTextField textField_Notes;
	
	
	public String AdminUser;
	private JTextField textField_EmployeeID;
	private JTextField textFieldTitle;
	private JTextField textField_StartDate;
	private JTextField textField_EndDate;
	private JTextField textField_Status;
	private JTable table;
	public String cid = "0";
	
	DefaultTableModel model;
	
	private JScrollPane scrollPaneTable;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnDELETEButton;
	private JButton btnSAVEButton;
	private JTextField textField_careerid;
	private JScrollPane scrollPane_Requirement;
	private JScrollPane scrollPane_Description;
	private JScrollPane scrollPane_Mentors;
	private JScrollPane scrollPane_Notes;
	
	@SuppressWarnings("deprecation")
	public DesignCareerPath() {
		getContentPane().setBackground(new Color(208, 252, 255));
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
						
						//System.out.println(userstr);
						filter();
						
					}
				}

			
		});
		
		
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1438, 869);		
		
		JLabel lblNewLabel = new JLabel("Design your own Career Path");
		lblNewLabel.setBounds(38, 42, 409, 32);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		getContentPane().add(lblNewLabel);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWelcome.setBounds(45, 99, 84, 22);
		getContentPane().add(lblWelcome);
		
		jtxtuserid = new JTextField();
		jtxtuserid.setBackground(new Color(208, 252, 255));
		jtxtuserid.setBounds(126, 101, 129, 22);
		getContentPane().add(jtxtuserid);
		jtxtuserid.setColumns(1);
		
		textField_EmployeeID = new JTextField();
		textField_EmployeeID.setBounds(361, 116, 154, 20);
		getContentPane().add(textField_EmployeeID);
		textField_EmployeeID.setColumns(10);
		textField_EmployeeID.enable(false);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(69, 399, 736, 32);
		getContentPane().add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		textField_StartDate = new JTextField();
		textField_StartDate.setBounds(879, 405, 96, 20);
		getContentPane().add(textField_StartDate);
		textField_StartDate.setColumns(10);
		
		textField_EndDate = new JTextField();
		textField_EndDate.setBounds(1033, 405, 96, 20);
		getContentPane().add(textField_EndDate);
		textField_EndDate.setColumns(10);
		
		textField_careerid = new JTextField();
		textField_careerid.setBounds(583, 116, 96, 20);
		getContentPane().add(textField_careerid);
		textField_careerid.setColumns(10);
		textField_careerid.enable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Title:");
		lblNewLabel_1.setBounds(38, 408, 40, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Requirement");
		lblNewLabel_1_1.setBounds(38, 442, 78, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employeeid");
		lblNewLabel_2.setBounds(298, 119, 78, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Careerid");
		lblNewLabel_3.setBounds(525, 119, 84, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_Status = new JTextField();
		textField_Status.setBounds(1186, 405, 171, 20);
		getContentPane().add(textField_Status);
		textField_Status.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Mentors");
		lblNewLabel_4.setBounds(38, 627, 59, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Start Date");
		lblNewLabel_5.setBounds(815, 408, 78, 14);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("End Date");
		lblNewLabel_6.setBounds(985, 408, 82, 14);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Status");
		lblNewLabel_7.setBounds(1139, 408, 129, 14);
		getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Description");
		lblNewLabel_8.setBounds(701, 442, 143, 14);
		getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Notes");
		lblNewLabel_9.setBounds(701, 627, 49, 14);
		getContentPane().add(lblNewLabel_9);
		
		scrollPane_Requirement = new JScrollPane();
		scrollPane_Requirement.setBounds(38, 467, 627, 138);
		getContentPane().add(scrollPane_Requirement);
		
		JTextArea textField_Requirement = new JTextArea();
		scrollPane_Requirement.setViewportView(textField_Requirement);
		textField_Requirement.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		scrollPane_Description = new JScrollPane();
		scrollPane_Description.setBounds(701, 464, 614, 141);
		getContentPane().add(scrollPane_Description);
		
		JTextArea textField_Description = new JTextArea();
		scrollPane_Description.setViewportView(textField_Description);
		textField_Description.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		scrollPane_Mentors = new JScrollPane();
		scrollPane_Mentors.setBounds(38, 641, 627, 105);
		getContentPane().add(scrollPane_Mentors);
		
		JTextArea textField_Mentors = new JTextArea();
		scrollPane_Mentors.setViewportView(textField_Mentors);
		textField_Mentors.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		scrollPane_Notes = new JScrollPane();
		scrollPane_Notes.setBounds(701, 645, 627, 101);
		getContentPane().add(scrollPane_Notes);
		
		JTextArea textField_Notes = new JTextArea();
		scrollPane_Notes.setViewportView(textField_Notes);
		textField_Notes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnADDButton = new JButton("ADD a New Record");
		btnADDButton.setBounds(911, 115, 188, 23);
		btnADDButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
				String query = "Insert into CareerPath (employeeID,Title,Requirements,StartDate,EndDate,Mentors,Status,Description ,Notes)values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query);	
				
				pst.setString(1,jtxtuserid.getText());
				pst.setString(2,textFieldTitle.getText());
				
				pst.setString(3,textField_Requirement.getText());
				pst.setString(4,textField_StartDate.getText());					
				pst.setString(5,textField_EndDate.getText());    					
			    pst.setString(6,textField_Mentors.getText());
			   	pst.setString(7,textField_Status.getText());
		  		pst.setString(8,textField_Description.getText());
		  		pst.setString(9,textField_Notes.getText());
				
				
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
		btnDELETEButton.setBounds(1251, 115, 89, 23);
		getContentPane().add(btnDELETEButton);
		
		btnSAVEButton = new JButton("Update/Save");
			btnSAVEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String qry = "REPLACE into CareerPath (employeeID,CareerID,Title,Requirements,StartDate,EndDate,Mentors,Status,Description ,Notes)values (?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=conn.prepareStatement(qry);
					
				if (jtxtuserid != null){
					String carid = textField_careerid.getText();
					//Requirement = new JTextArea(10, 10);
					
					//JTextArea text=new JTextArea();
					//String contents = textArea.getText();
					
					pst.setString(1,jtxtuserid.getText());
					pst.setInt(2, Integer.parseInt(carid));
					
					pst.setString(3,textFieldTitle.getText());
					pst.setString(4,textField_Requirement.getText());
					pst.setString(5,textField_StartDate.getText());					
					pst.setString(6,textField_EndDate.getText());    					
				    pst.setString(7,textField_Mentors.getText());
				   	pst.setString(8,textField_Status.getText());
			  		pst.setString(9,textField_Description.getText());
			  		pst.setString(10,textField_Notes.getText());

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
		
		btnSAVEButton.setBounds(1112, 115, 129, 23);
		getContentPane().add(btnSAVEButton);
		
		scrollPaneTable = new JScrollPane();
		getContentPane().add(scrollPaneTable);
		scrollPaneTable.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollPaneTable.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPaneTable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTable.setMaximumSize(new Dimension(1000, 1000));
		scrollPaneTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTable.setBounds(new Rectangle(58, 146, 1281, 171));
		
		table= new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
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
				textField_Requirement.setText(tmodel.getValueAt(row, 3).toString());
				textField_StartDate.setText(tmodel.getValueAt(row, 4).toString());
				textField_EndDate.setText(tmodel.getValueAt(row, 5).toString());
				textField_Mentors.setText(tmodel.getValueAt(row, 6).toString());
				textField_Status.setText(tmodel.getValueAt(row, 7).toString());
				textField_Description.setText(tmodel.getValueAt(row, 8).toString());
				textField_Notes.setText(tmodel.getValueAt(row, 9).toString());
	
			}
		});
		scrollPaneTable.setViewportView(table);	
		
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
		jtxtuserid.setBounds(126, 101, 129, 22);
		jtxtuserid.setBackground(new Color(208, 252, 255));
		getContentPane().add(jtxtuserid);
		jtxtuserid.setColumns(1);
		
		if (str.equals("E101") || str.equals("admin")){
			AdminUser = "Y";
		}else {
			AdminUser = "N";
		}
		
	}
}
