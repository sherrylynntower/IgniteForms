package Profile;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.JTextComponent;
import javax.swing.RowFilter.Entry;

import net.proteanit.sql.DbUtils;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



@SuppressWarnings({ "serial", "unused" })
public class IgniteForm extends JFrame {

	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	private JPanel contentPane;
	private JTextField jtxtemployeeid;
	private JTextField jtxtfirstname;
	private JTextField jtxtlastname;
	private JTextField jtxtprofilemanager;
	private JTextField jtxtdateofjoin;
	private JTextField jtxtjobroll;
	private JTextField jtxtlastprogression;
	private JTextField jtxtmentorname;
	private JTextField jtxtcoachname;
	private JTextField jtxtassetpatent;
	private JTextField jtxtintellectual;
	private JTextArea  jtxtshorttermgoal;
	private JTextArea jtxtlongtermgoal;
	private JTextArea jtxttrainingplans;
	private JTextArea jtxtcertificationplans;
	private JTextArea jtxtbadgeplans;
	private JTextArea jtxtinovationgoal;
	private JTable table;
	DefaultTableModel model;
	private JTextField jtxtuserid;
	public String oktoupdate;	
	public String strps="";
	public String AdminUser;
	public String listval;
	private JTextField textField;
	private JButton btnRefreshButton;
	private JComboBox<String> jcbhiringtype_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IgniteForm frame = new IgniteForm();
					frame.setVisible(true);
					frame.setFocusTraversalKeysEnabled(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public IgniteForm() {
		
		conn = dbConnection.ConnectDB();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
					String userstr = jtxtuserid.getText().trim();			
					
					if (userstr.equals("admin")) {
							
							adminData();	
							 
							btnRefreshButton.setVisible(true);
							
						}
					
					else {
						btnRefreshButton.setVisible(false);
						filter();
						
					}
				}

			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1438, 869);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(161, 217, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblemployeeID = new JLabel("Employee ID");
		lblemployeeID.setForeground(Color.BLACK);
		lblemployeeID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblemployeeID.setBounds(77, 226, 74, 21);
		contentPane.add(lblemployeeID);
		
		jtxtemployeeid = new JTextField();
		jtxtemployeeid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtemployeeid.setEditable(true);
		jtxtemployeeid.setColumns(10);
		jtxtemployeeid.setBounds(159, 227, 201, 20);
		contentPane.add(jtxtemployeeid);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFirstName.setBounds(91, 249, 61, 21);
		contentPane.add(lblFirstName);
		
		jtxtfirstname = new JTextField();
		jtxtfirstname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtfirstname.setColumns(10);
		jtxtfirstname.setBounds(159, 250, 201, 20);
		contentPane.add(jtxtfirstname);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastName.setBounds(89, 274, 58, 21);
		contentPane.add(lblLastName);
		
		jtxtlastname = new JTextField();
		jtxtlastname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtlastname.setColumns(10);
		jtxtlastname.setBounds(159, 274, 201, 20);
		contentPane.add(jtxtlastname);
		
		JLabel lblProfileManager = new JLabel("Profile Manager Name");
		lblProfileManager.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblProfileManager.setBounds(31, 298, 118, 21);
		contentPane.add(lblProfileManager);
		
		jtxtprofilemanager = new JTextField();
		jtxtprofilemanager.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtprofilemanager.setColumns(10);
		jtxtprofilemanager.setBounds(159, 299, 201, 20);
		contentPane.add(jtxtprofilemanager);
		
		JLabel lblDateOfJoining = new JLabel("Date Of Joining");
		lblDateOfJoining.setToolTipText("mm/dd/yy");
		lblDateOfJoining.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDateOfJoining.setBounds(64, 321, 86, 21);
		contentPane.add(lblDateOfJoining);
		
		jtxtdateofjoin = new JTextField();
		jtxtdateofjoin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtdateofjoin.setColumns(10);
		jtxtdateofjoin.setBounds(159, 325, 201, 20);
		contentPane.add(jtxtdateofjoin);
		
		JLabel lblJobRoll = new JLabel("Job Roll");
		lblJobRoll.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJobRoll.setBounds(464, 224, 46, 21);
		contentPane.add(lblJobRoll);
		
		jtxtjobroll = new JTextField();
		jtxtjobroll.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtjobroll.setColumns(10);
		jtxtjobroll.setBounds(520, 224, 201, 20);
		contentPane.add(jtxtjobroll);
		
		JLabel lblDateoflastprogress = new JLabel("Date Of Last Progression");
		lblDateoflastprogress.setToolTipText("mm/dd/yy");
		lblDateoflastprogress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDateoflastprogress.setBounds(370, 246, 140, 21);
		contentPane.add(lblDateoflastprogress);
		
		jtxtlastprogression = new JTextField();
		jtxtlastprogression.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtlastprogression.setColumns(10);
		jtxtlastprogression.setBounds(520, 247, 201, 20);
		contentPane.add(jtxtlastprogression);
		
		JLabel lblmentorName = new JLabel("Mentor Name");
		lblmentorName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblmentorName.setBounds(434, 269, 76, 21);
		contentPane.add(lblmentorName);
		
		jtxtmentorname = new JTextField();
		jtxtmentorname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtmentorname.setColumns(10);
		jtxtmentorname.setBounds(520, 269, 201, 20);
		contentPane.add(jtxtmentorname);
		
		JLabel lblcoachName = new JLabel("Coach Name");
		lblcoachName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblcoachName.setBounds(444, 294, 68, 21);
		contentPane.add(lblcoachName);
		
		jtxtcoachname = new JTextField();
		jtxtcoachname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtcoachname.setColumns(10);
		jtxtcoachname.setBounds(520, 294, 201, 20);
		contentPane.add(jtxtcoachname);
		
		JLabel lblassetPatent = new JLabel("Asset/Patent");
		lblassetPatent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblassetPatent.setBounds(75, 348, 76, 21);
		contentPane.add(lblassetPatent);
		
		jtxtassetpatent = new JTextField();
		jtxtassetpatent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtassetpatent.setColumns(10);
		jtxtassetpatent.setBounds(159, 349, 201, 20);
		contentPane.add(jtxtassetpatent);
		
		JLabel lblintellectualProperty = new JLabel("Intellectual Property");
		lblintellectualProperty.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblintellectualProperty.setBounds(395, 318, 118, 21);
		contentPane.add(lblintellectualProperty);
		
		jtxtintellectual = new JTextField();
		jtxtintellectual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtintellectual.setColumns(10);
		jtxtintellectual.setBounds(520, 318, 199, 21);
		contentPane.add(jtxtintellectual);
		
		JLabel lblshortTermGoal = new JLabel("Short Term Career Goal");
		lblshortTermGoal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblshortTermGoal.setBounds(31, 392, 141, 21);
		contentPane.add(lblshortTermGoal);
		
		JLabel lbllongTermGoal = new JLabel("Long Term Career Goal");
		lbllongTermGoal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbllongTermGoal.setBounds(31, 503, 137, 21);
		contentPane.add(lbllongTermGoal);
		
		JLabel lbltrainingPlans = new JLabel("Training Plans");
		lbltrainingPlans.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbltrainingPlans.setBounds(434, 393, 74, 21);
		contentPane.add(lbltrainingPlans);
		
		JLabel lblcertificationPlans = new JLabel("Certification Plans");
		lblcertificationPlans.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblcertificationPlans.setBounds(434, 503, 98, 21);
		contentPane.add(lblcertificationPlans);
		
		JLabel lblHiredBandLevel = new JLabel("Hired Band Level");
		lblHiredBandLevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHiredBandLevel.setBounds(1102, 274, 94, 21);
		contentPane.add(lblHiredBandLevel);
		
		JComboBox jcbhiredbandlevel = new JComboBox();
		fillDatajcbhiredbandlevel(jcbhiredbandlevel);
		jcbhiredbandlevel.setMaximumRowCount(12);
		jcbhiredbandlevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jcbhiredbandlevel.setEditable(true);
		jcbhiredbandlevel.setBackground(Color.WHITE);
		jcbhiredbandlevel.setBounds(1206, 274, 201, 21);
		contentPane.add(jcbhiredbandlevel);
		
		JLabel lblCurrentBandLevel = new JLabel("Current  Band Level");
		lblCurrentBandLevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCurrentBandLevel.setBounds(1094, 323, 118, 21);
		contentPane.add(lblCurrentBandLevel);
		
		JComboBox jcbcurrentbandlevel = new JComboBox();
		fillDatajcbcurrentbandlevel(jcbcurrentbandlevel);
		//jcbcurrentbandlevel.setModel(new DefaultComboBoxModel(new String[] {"NA", "Band 5", "Band 6G", "Band 6A", "Band 6B", "Band 6", "Band 7A", "Band 7B", "Band 7", "Band 8", "Band 9"}));
		jcbcurrentbandlevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jcbcurrentbandlevel.setEditable(true);
		jcbcurrentbandlevel.setBackground(Color.WHITE);
		jcbcurrentbandlevel.setBounds(1206, 323, 201, 22);
		contentPane.add(jcbcurrentbandlevel);
		
		JLabel lblOverallYearsExperience = new JLabel("Overall Years Experience");
		lblOverallYearsExperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOverallYearsExperience.setBounds(736, 229, 137, 21);
		contentPane.add(lblOverallYearsExperience);
	
		JComboBox jcboverallyearsexperience = new JComboBox();
		fillDatajcboverallyearsexperience(jcboverallyearsexperience);
		//jcboverallyearsexperience.setModel(new DefaultComboBoxModel(new String[] {"NA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20 plus"}));
		jcboverallyearsexperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jcboverallyearsexperience.setEditable(true);
		jcboverallyearsexperience.setBounds(891, 229, 201, 22);
		contentPane.add(jcboverallyearsexperience);
		
		JLabel lblOverallMnthExperience_1 = new JLabel("Overall Month Experience");
		lblOverallMnthExperience_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOverallMnthExperience_1.setBounds(736, 274, 140, 21);
		contentPane.add(lblOverallMnthExperience_1);
		
		JComboBox jcboverallmonthexperience = new JComboBox();
		fillDatajcboverallmonthexperience(jcboverallmonthexperience);
		//jcboverallmonthexperience.setModel(new DefaultComboBoxModel(new String[] {"NA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		jcboverallmonthexperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jcboverallmonthexperience.setEditable(true);
		jcboverallmonthexperience.setBounds(891, 274, 201, 22);
		contentPane.add(jcboverallmonthexperience);
		
		JLabel lblAddExperience = new JLabel("Additional Experience");
		lblAddExperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAddExperience.setBounds(758, 323, 118, 21);
		contentPane.add(lblAddExperience);
		
		JComboBox jcbadditionalexperience = new JComboBox();
		fillDatajcbadditionalexperience(jcbadditionalexperience);
		jcbadditionalexperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
		//jcbadditionalexperience.setModel(new DefaultComboBoxModel(new String[] {"NA", "Development", "Tech Support", "Peoplesoft", "SAP", "Project Management", "Data Analysis"}));
		jcbadditionalexperience.setEditable(true);
		jcbadditionalexperience.setBounds(891, 323, 201, 22);
		contentPane.add(jcbadditionalexperience);
		
		JLabel lblSecurityLevel = new JLabel("Security Level");
		lblSecurityLevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSecurityLevel.setAlignmentY(1.0f);
		lblSecurityLevel.setBounds(1110, 229, 86, 21);
		contentPane.add(lblSecurityLevel);
		
		JComboBox jcbsecuritylevel = new JComboBox();
		fillDatajcbsecuritylevel(jcbsecuritylevel);
		//jcbsecuritylevel.setModel(new DefaultComboBoxModel(new String[] {"NA", "Reliability", "Reliability In Progress", "Secret", "Secret In Progress", "Top Secret", "Top Secret In Progress", "Not Eligible", "Enhanced Reliability", "Eligible for Realiablity not applied", "Eligible for secret not applied", "Eligible for Top Secret not applied", "Eligible for enhanced reliability not applied"}));
		jcbsecuritylevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jcbsecuritylevel.setEditable(true);
		jcbsecuritylevel.setBounds(1206, 229, 201, 22);
		contentPane.add(jcbsecuritylevel);
		
		JLabel lblHiringType = new JLabel("Hiring Type");
		lblHiringType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHiringType.setBounds(434, 341, 74, 21);
		contentPane.add(lblHiringType);
		
		jcbhiringtype_1 = new JComboBox();
		fillDatajcbhiringtype(jcbhiringtype_1);
		//jcbhiringtype.setModel(new DefaultComboBoxModel(new String[] {"NA", "Tech Re-Entry", "Band 5", "Neurodiversity", "Expro", "New Grad", "Co Op"}));
		jcbhiringtype_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jcbhiringtype_1.setEditable(true);
		jcbhiringtype_1.setBounds(520, 345, 201, 22);
		contentPane.add(jcbhiringtype_1);
		
		JLabel lblbadgePlans = new JLabel("Badge Plans");
		lblbadgePlans.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblbadgePlans.setBounds(434, 613, 94, 21);
		contentPane.add(lblbadgePlans);
		
		JLabel lblinovationGoal = new JLabel("Inovation Goal");
		lblinovationGoal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblinovationGoal.setBounds(31, 613, 94, 21);
		contentPane.add(lblinovationGoal);
		
		JScrollPane scrollPaneTable = new JScrollPane();
		scrollPaneTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTable.setBounds(31, 68, 1376, 147);
		contentPane.add(scrollPaneTable);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
				
				int row=table.getSelectedRow();
				
				if (table.getRowSorter()!=null) {
				    row = table.getRowSorter().convertRowIndexToModel(row);
				}
				
				jtxtemployeeid.setText(tmodel.getValueAt(row, 0).toString());
				jtxtfirstname.setText(tmodel.getValueAt(row, 1).toString());
				jtxtlastname.setText(tmodel.getValueAt(row, 2).toString());
				jtxtprofilemanager.setText(tmodel.getValueAt(row, 3).toString());
				jtxtdateofjoin.setText(tmodel.getValueAt(row, 4).toString());
				jcbhiredbandlevel.setSelectedItem(tmodel.getValueAt(row, 5).toString());
				jcbcurrentbandlevel.setSelectedItem(tmodel.getValueAt(row, 6).toString());
				jcboverallyearsexperience.setSelectedItem(tmodel.getValueAt(row, 7).toString());
				jcboverallmonthexperience.setSelectedItem(tmodel.getValueAt(row, 8).toString());
				jcbadditionalexperience.setSelectedItem(tmodel.getValueAt(row, 9).toString());
				jcbsecuritylevel.setSelectedItem(tmodel.getValueAt(row, 10).toString());				
				jcbhiringtype_1.setSelectedItem(tmodel.getValueAt(row, 11).toString());
				jtxtjobroll.setText(tmodel.getValueAt(row, 12).toString());
				jtxtlastprogression.setText(tmodel.getValueAt(row, 13).toString());
				jtxtmentorname.setText(tmodel.getValueAt(row, 14).toString());
				jtxtcoachname.setText(tmodel.getValueAt(row, 15).toString());
				jtxtassetpatent.setText(tmodel.getValueAt(row, 16).toString());
				jtxtintellectual.setText(tmodel.getValueAt(row, 17).toString());
				jtxtshorttermgoal.setText(tmodel.getValueAt(row, 18).toString());
				jtxtlongtermgoal.setText(tmodel.getValueAt(row, 19).toString());
				jtxttrainingplans.setText(tmodel.getValueAt(row, 20).toString());
				jtxtcertificationplans.setText(tmodel.getValueAt(row, 21).toString());
				jtxtbadgeplans.setText(tmodel.getValueAt(row, 22).toString());
				jtxtinovationgoal.setText(tmodel.getValueAt(row, 23).toString());
				jtxtuserid.setText(tmodel.getValueAt(row, 24).toString());
				
			}
		});
		model= new DefaultTableModel();
		Object[] column = {"employeeID","employeeFirstName","employeeLastName","profileManagerId","dateOfJoin","hiredBandLevel","currentBandLevel","overallYearsExp","overallMthExp","additionalExp","securityLevel",
				"hiringType","jobRoll","dateOfLastProgress","mentorName","coachName","assetPatent","intellectualProperty","shortTermGoal","longTermGoal","trainingPlans","certificationPlans",
				"badgePlans","inovationGoal","username"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		scrollPaneTable.setViewportView(table);
		
		
		JButton btnADDupdate_Profile = new JButton(" ADD/UPDATE PROFILE");
		btnADDupdate_Profile.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnADDupdate_Profile.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String query = "INSERT or REPLACE into profileData (employeeID,employeeFirstName,employeeLastName,profileManagerId,dateOfJoin,hiredBandLevel,currentBandLevel,overallYearsExp,overallMthExp,additionalExp,securityLevel,"
							+ "hiringType,jobRoll,dateOfLastProgress,mentorName,coachName,assetPatent,intellectualProperty,shortTermGoal,longTermGoal,trainingPlans,certificationPlans,badgePlans,inovationGoal,username) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=conn.prepareStatement(query);
					
					String usrtxtfield=jtxtuserid.getText();
					
				if (usrtxtfield != null && !usrtxtfield.trim().isEmpty()){
					
					pst.setString(1,jtxtemployeeid.getText());
					pst.setString(2,jtxtfirstname.getText());
					pst.setString(3,jtxtlastname.getText());
					pst.setString(4,jtxtprofilemanager.getText());
					pst.setString(5, jtxtdateofjoin.getText());					
					pst.setString(6, jcbhiredbandlevel.getSelectedItem().toString());    					
				    pst.setString(7, jcbcurrentbandlevel.getSelectedItem().toString());
				   	pst.setString(8, jcboverallyearsexperience.getSelectedItem().toString());
			  		pst.setString(9, jcboverallmonthexperience.getSelectedItem().toString());
			  		pst.setString(10, jcbadditionalexperience.getSelectedItem().toString());
			  		pst.setString(11, jcbsecuritylevel.getSelectedItem().toString());
			  		pst.setString(12, jcbhiringtype_1.getSelectedItem().toString());
               		pst.setString(13, jtxtjobroll.getText());
               		pst.setString(14, jtxtlastprogression.getText());
               		pst.setString(15, jtxtmentorname.getText());
               		pst.setString(16, jtxtcoachname.getText());
               		pst.setString(17, jtxtassetpatent.getText());
               		pst.setString(18, jtxtintellectual.getText());
					pst.setString(19, jtxtshorttermgoal.getText());
					pst.setString(20, jtxtlongtermgoal.getText());
					pst.setString(21, jtxttrainingplans.getText());
					pst.setString(22, jtxtcertificationplans.getText());
					pst.setString(23, jtxtbadgeplans.getText());
					pst.setString(24, jtxtinovationgoal.getText());
					pst.setString(25, jtxtuserid.getText());
					
					
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
		btnADDupdate_Profile.setEnabled(true);
		btnADDupdate_Profile.setForeground(new Color(0, 0, 255));
		btnADDupdate_Profile.setBackground(new Color(128, 255, 255));
		btnADDupdate_Profile.setBounds(764, 597, 271, 50);
		contentPane.add(btnADDupdate_Profile);
		
		JButton btnDelete = new JButton("DELETE Profile RECORDS - Under Construction");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101")) {
					btnDelete.setEnabled(true);
					try {    
			            JTextField xuser = new JTextField(10);
			            JPanel myPanel = new JPanel();
			            myPanel.add(new JLabel("Enter Profile Userid to Delete:"));
			            myPanel.add(xuser);
			            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
			           
			            int result = JOptionPane.showConfirmDialog(null, myPanel, "Please DELETE User", JOptionPane.OK_CANCEL_OPTION);
			            if (result == JOptionPane.OK_OPTION) {
			            	
			            	String usr = xuser.getText();
			               
			                deleteProfileUser(usr);   	  					               
			            }
			           
			         }
				
				catch(Exception ed) {
					JOptionPane.showMessageDialog(null, ed);
				};	
				}else {
					btnDelete.setEnabled(false);
					}
			
			}	
		});
		btnDelete.setBackground(new Color(128, 255, 255));
		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setBounds(91, 782, 386, 23);
		btnDelete.setFocusable(false);
		contentPane.add(btnDelete);
		
		JButton btnAddDeleteUser = new JButton("ADD/Delete USER");
		btnAddDeleteUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddDeleteUser.setBackground(new Color(128, 255, 255));
		btnAddDeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101")) {
					btnAddDeleteUser.setEnabled(true);
					
						try {    
							 
					            JTextField xuser = new JTextField(5);
					            JTextField ypassword = new JTextField(5);

					            JPanel myPanel = new JPanel();
					            myPanel.add(new JLabel("user name must be unique:"));
					            myPanel.add(xuser);
					            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
					            myPanel.add(new JLabel("password:"));
					            myPanel.add(ypassword);

					            int result = JOptionPane.showConfirmDialog(null, myPanel, 
					                     "Please Enter Username and Password Values", JOptionPane.OK_CANCEL_OPTION);
					            if (result == JOptionPane.OK_OPTION) {
					            	
					            	String usr = xuser.getText();
					            	String pass = ypassword.getText();
					               
					            	check_Userid(usr,pass);  
					            	UpdateUser(oktoupdate,usr,pass);
					            }
					         }
						
						catch(Exception ez) {
						
							JOptionPane.showMessageDialog(null, ez);
						};
	
				}else {
					JOptionPane.showMessageDialog(null, "You need to be a Admin to add a user");
					btnAddDeleteUser.setEnabled(false);
				}
				
			}
		});
		btnAddDeleteUser.setBounds(480, 782, 240, 23);
		btnAddDeleteUser.setFocusable(false);
		contentPane.add(btnAddDeleteUser);
		
		JLabel lbluserid = new JLabel("User ID");
		lbluserid.setBounds(697, 43, 43, 14);
		contentPane.add(lbluserid);
		lbluserid.setVisible(false);
		
		jtxtuserid = new JTextField();
		jtxtuserid.setEditable(false);
		jtxtuserid.setBounds(741, 37, 201, 20);
		contentPane.add(jtxtuserid);
		jtxtuserid.setColumns(10);
		jtxtuserid.setVisible(true);
		
		JLabel lblNewLabel_1 = new JLabel("Profile Management");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 0, 165, 42);
		contentPane.add(lblNewLabel_1);
		
		jtxtshorttermgoal = new JTextArea();
		jtxtshorttermgoal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		jtxtshorttermgoal.setBounds(31, 414, 370, 78);
		contentPane.add(jtxtshorttermgoal);
		
		jtxtlongtermgoal = new JTextArea();
		jtxtlongtermgoal.setBounds(31, 521, 370, 79);
		contentPane.add(jtxtlongtermgoal);
		jtxtlongtermgoal.setColumns(10);
		
		jtxttrainingplans = new JTextArea();
		jtxttrainingplans.setBounds(434, 413, 296, 79);
		contentPane.add(jtxttrainingplans);
		jtxttrainingplans.setColumns(10);
		
		jtxtcertificationplans = new JTextArea();
		jtxtcertificationplans.setBounds(434, 521, 296, 81);
		contentPane.add(jtxtcertificationplans);
		jtxtcertificationplans.setColumns(10);
		
		jtxtbadgeplans = new JTextArea();
		jtxtbadgeplans.setBounds(434, 631, 296, 79);
		contentPane.add(jtxtbadgeplans);
		jtxtbadgeplans.setColumns(10);
		
		jtxtinovationgoal = new JTextArea();
		jtxtinovationgoal.setBounds(31, 631, 370, 79);
		contentPane.add(jtxtinovationgoal);
		jtxtinovationgoal.setColumns(10);
		
		JLabel lblAdminUseOnly = new JLabel("         >>>ADMIN USE ONLY<<<");
		lblAdminUseOnly.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdminUseOnly.setBounds(480, 746, 237, 31);
		contentPane.add(lblAdminUseOnly);
		
		JButton btnADDUpdateSkills = new JButton("ADD/UPDATE SKILLS>>>");
		btnADDUpdateSkills.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnADDUpdateSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					strps = (String) jtxtuserid.getText();
					
					ProfileSkills upf=new ProfileSkills();
		 				upf.setLocationRelativeTo(null);
		 				upf.setVisible(true);
		 				upf.my_update(strps);
			}
		});
		btnADDUpdateSkills.setBackground(new Color(128, 255, 255));
		btnADDUpdateSkills.setForeground(new Color(0, 0, 255));
		btnADDUpdateSkills.setBounds(764, 660, 274, 50);
		contentPane.add(btnADDUpdateSkills);
		
		JLabel lblViewRecord_Infosave = new JLabel("Dont forget to SAVE after your changes are made.");
		lblViewRecord_Infosave.setHorizontalAlignment(SwingConstants.LEFT);
		lblViewRecord_Infosave.setVerticalAlignment(SwingConstants.TOP);
		lblViewRecord_Infosave.setForeground(new Color(138, 0, 69));
		lblViewRecord_Infosave.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblViewRecord_Infosave.setBounds(758, 392, 628, 42);
		contentPane.add(lblViewRecord_Infosave);
		
		JButton btnResetPassword = new JButton("Reset Password");
		btnResetPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnResetPassword.setBackground(new Color(128, 255, 255));
		btnResetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101")) {
					btnResetPassword.setEnabled(true);
					
				}else {
					btnResetPassword.setEnabled(false);
				}
				
			}
		});
		btnResetPassword.setBounds(730, 782, 240, 23);
		contentPane.add(btnResetPassword);
		
		JLabel lblViewRecord_Info = new JLabel("To View you RECORD DETAILS please click on the record below");
		lblViewRecord_Info.setVerticalAlignment(SwingConstants.TOP);
		lblViewRecord_Info.setHorizontalAlignment(SwingConstants.LEFT);
		lblViewRecord_Info.setForeground(new Color(128, 0, 0));
		lblViewRecord_Info.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblViewRecord_Info.setBounds(182, 45, 448, 21);
		contentPane.add(lblViewRecord_Info);
		
		JButton btnaddHiretypetolist = new JButton("+");
		btnaddHiretypetolist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101"))
				{		
					AddValueToList skillProfileHiretyp = new AddValueToList();
						try {
							listval = skillProfileHiretyp.add_ProfileHireType();
							
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbhiringtype_1.getModel();
    	        		model.removeAllElements();				
						fillDatajcbhiringtype(jcbhiringtype_1);
				}	
				else{
						JOptionPane.showMessageDialog(null, "admin use only");
					}
			}
		});
		btnaddHiretypetolist.setToolTipText("Admin only");
		btnaddHiretypetolist.setHorizontalTextPosition(SwingConstants.CENTER);
		btnaddHiretypetolist.setBorder(null);
		btnaddHiretypetolist.setBackground(new Color(161, 217, 213));
		btnaddHiretypetolist.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnaddHiretypetolist.setBounds(632, 368, 43, 14);
		contentPane.add(btnaddHiretypetolist);
		
		JLabel lblStepsForUser_newuser = new JLabel("Steps for New User:");
		lblStepsForUser_newuser.setVerticalAlignment(SwingConstants.TOP);
		lblStepsForUser_newuser.setHorizontalAlignment(SwingConstants.LEFT);
		lblStepsForUser_newuser.setForeground(new Color(0, 0, 255));
		lblStepsForUser_newuser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblStepsForUser_newuser.setBounds(758, 469, 173, 23);
		contentPane.add(lblStepsForUser_newuser);
		
		JLabel lblViewRecord_header = new JLabel("RECORD DETAILS");
		lblViewRecord_header.setVerticalAlignment(SwingConstants.TOP);
		lblViewRecord_header.setHorizontalAlignment(SwingConstants.LEFT);
		lblViewRecord_header.setForeground(new Color(128, 0, 255));
		lblViewRecord_header.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblViewRecord_header.setBounds(31, 45, 148, 21);
		contentPane.add(lblViewRecord_header);
		
		JLabel lblStepsForUser_newuser_1 = new JLabel("1.  Enter your Profile information");
		lblStepsForUser_newuser_1.setVerticalAlignment(SwingConstants.TOP);
		lblStepsForUser_newuser_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblStepsForUser_newuser_1.setForeground(new Color(0, 0, 255));
		lblStepsForUser_newuser_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblStepsForUser_newuser_1.setBounds(787, 490, 296, 21);
		contentPane.add(lblStepsForUser_newuser_1);
		
		JLabel lblStepsForUser_newuser_2 = new JLabel("2.  After saving your profile selected your Record Details above");
		lblStepsForUser_newuser_2.setVerticalAlignment(SwingConstants.TOP);
		lblStepsForUser_newuser_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblStepsForUser_newuser_2.setForeground(new Color(0, 0, 255));
		lblStepsForUser_newuser_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblStepsForUser_newuser_2.setBounds(785, 511, 559, 21);
		contentPane.add(lblStepsForUser_newuser_2);
		
		JLabel lblStepsForUser_newuser_3 = new JLabel("3.  Now you are Ready to add Skills select Add/UPDATE SKILLS");
		lblStepsForUser_newuser_3.setVerticalAlignment(SwingConstants.TOP);
		lblStepsForUser_newuser_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblStepsForUser_newuser_3.setForeground(new Color(0, 0, 255));
		lblStepsForUser_newuser_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblStepsForUser_newuser_3.setBounds(787, 536, 599, 21);
		contentPane.add(lblStepsForUser_newuser_3);
		
		JButton btnremoveHiretypetolist = new JButton("-");
		btnremoveHiretypetolist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (jtxtuserid.getText().trim().contentEquals("E101"))
				{
	    			String listval = (String) jcbhiringtype_1.getSelectedItem();
					
	    			if (listval != null){
	    				String titleProfInfo = "HiringType";
	    				
	    	        		RemoveList RMVProfileData = new RemoveList();
	    	        		try {RMVProfileData.RMVprofiledataHireTyp(listval);
	    	        		
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    	        		JOptionPane.showMessageDialog(null, "Skill removed from profileData DB");
	    			
	    	        		RemoveList RMVProfileInformation = new RemoveList();
	    	        		try {RMVProfileInformation.RMVprofileinfo(listval,titleProfInfo);
	    	        			
	    	        		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbhiringtype_1.getModel();
	    	        		model.removeAllElements();
	    	        		fillDatajcbhiringtype(jcbhiringtype_1);	
					        
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    						
	    	        JOptionPane.showMessageDialog(null, "Skill removed from profileInfoSelections DB");
	    	        
	    	        
	    			}else{
	    				JOptionPane.showMessageDialog(null, "Please select a value from the list.");
	    				}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnremoveHiretypetolist.setToolTipText("Admin only");
		btnremoveHiretypetolist.setBorder(null);
		btnremoveHiretypetolist.setHorizontalTextPosition(SwingConstants.CENTER);
		btnremoveHiretypetolist.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnremoveHiretypetolist.setBackground(new Color(161, 217, 213));
		btnremoveHiretypetolist.setBounds(674, 368, 43, 14);
		contentPane.add(btnremoveHiretypetolist);
		
		JButton btnaddCurBandLvltolist = new JButton("+");
		btnaddCurBandLvltolist.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101")){
					
					AddValueToList skillProfileCurrBanlvl = new AddValueToList();
						try {
							listval = skillProfileCurrBanlvl.add_ProfileCurrBanlvl();
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbcurrentbandlevel.getModel();
    	        		model.removeAllElements();
						fillDatajcbcurrentbandlevel(jcbcurrentbandlevel);
						
					}	
					else{
						JOptionPane.showMessageDialog(null, "admin use only");
					}
				
			}
		});
		btnaddCurBandLvltolist.setToolTipText("Admin only");
		btnaddCurBandLvltolist.setBorder(null);
		btnaddCurBandLvltolist.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnaddCurBandLvltolist.setBackground(new Color(161, 217, 213));
		btnaddCurBandLvltolist.setBounds(1322, 348, 43, 14);
		contentPane.add(btnaddCurBandLvltolist);
		
		JButton btnRemoveCurBandLvltolist = new JButton("-");
		btnRemoveCurBandLvltolist.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101"))
				{
	    			String listval = (String) jcbcurrentbandlevel.getSelectedItem();
					
	    			if (listval != null){
	    				String titleProfInfo = "CurrentBandLevel";
	    				
	    	        		RemoveList RMVProfileData = new RemoveList();
	    	        		try {RMVProfileData.RMVprofiledataCurBandLvl(listval);
	    	        		
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    	        		JOptionPane.showMessageDialog(null, "Skill removed from profileData DB");
	    			
	    	        		RemoveList RMVProfileInformation = new RemoveList();
	    	        		try {RMVProfileInformation.RMVprofileinfo(listval,titleProfInfo);
	    	        			
	    	        		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbcurrentbandlevel.getModel();
	    	        		model.removeAllElements();
	    	        		fillDatajcbhiringtype(jcbcurrentbandlevel);	
					        
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    						
	    	        JOptionPane.showMessageDialog(null, "Skill removed from profileInfoSelections DB");
	    	        
	    	        
	    			}else{
	    				JOptionPane.showMessageDialog(null, "Please select a value from the list.");
	    				}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRemoveCurBandLvltolist.setToolTipText("Admin only");
		btnRemoveCurBandLvltolist.setBorder(null);
		btnRemoveCurBandLvltolist.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRemoveCurBandLvltolist.setBackground(new Color(161, 217, 213));
		btnRemoveCurBandLvltolist.setBounds(1364, 348, 43, 14);
		contentPane.add(btnRemoveCurBandLvltolist);
		
		JButton btnaddHiredBandlvltolist = new JButton("+");
		btnaddHiredBandlvltolist.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101")){
					
					AddValueToList skillProfileHiredBanlvl = new AddValueToList();
						try {
							listval = skillProfileHiredBanlvl.add_ProfileHireBanlvl();
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbhiredbandlevel.getModel();
    	        		model.removeAllElements();	
						fillDatajcbhiredbandlevel(jcbhiredbandlevel);
						
					}	
					else{
						JOptionPane.showMessageDialog(null, "admin use only");
					}
				
			}
		});
		btnaddHiredBandlvltolist.setToolTipText("Admin only");
		btnaddHiredBandlvltolist.setBorder(null);
		btnaddHiredBandlvltolist.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnaddHiredBandlvltolist.setBackground(new Color(161, 217, 213));
		btnaddHiredBandlvltolist.setBounds(1322, 296, 43, 14);
		contentPane.add(btnaddHiredBandlvltolist);
		
		JButton btnRemoveHiredBandlvltolist = new JButton("-");
		btnRemoveHiredBandlvltolist.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101"))
				{
	    			String listval = (String) jcbhiredbandlevel.getSelectedItem();
					
	    			if (listval != null){
	    				String titleProfInfo = "HiredBandLevel";
	    				
	    	        		RemoveList RMVProfileData = new RemoveList();
	    	        		try {RMVProfileData.RMVprofiledataHireBandLvl(listval);
	    	        		
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    	        		JOptionPane.showMessageDialog(null, "Skill removed from profileData DB");
	    			
	    	        		RemoveList RMVProfileInformation = new RemoveList();
	    	        		try {RMVProfileInformation.RMVprofileinfo(listval,titleProfInfo);
	    	        			
							
	    	        		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbhiredbandlevel.getModel();
	    	        		model.removeAllElements();
	    	        		fillDatajcbhiringtype(jcbhiredbandlevel);	
					        
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    						
	    	        JOptionPane.showMessageDialog(null, "Skill removed from profileInfoSelections DB");
	    	        
	    	        
	    			}else{
	    				JOptionPane.showMessageDialog(null, "Please select a value from the list.");
	    				}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRemoveHiredBandlvltolist.setToolTipText("Admin only");
		btnRemoveHiredBandlvltolist.setBorder(null);
		btnRemoveHiredBandlvltolist.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRemoveHiredBandlvltolist.setBackground(new Color(161, 217, 213));
		btnRemoveHiredBandlvltolist.setBounds(1364, 296, 43, 14);
		contentPane.add(btnRemoveHiredBandlvltolist);
		
		JButton btnaddSecurityLvltolist = new JButton("+");
		btnaddSecurityLvltolist.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101")){
					
					AddValueToList skillProfileSeclvl = new AddValueToList();
						try {
							listval = skillProfileSeclvl.add_ProfileSeclvl();
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>)jcbsecuritylevel.getModel();
    	        		model.removeAllElements();	
						fillDatajcbsecuritylevel(jcbsecuritylevel);
						
					}	
					else{
						JOptionPane.showMessageDialog(null, "admin use only");
					}
			}
		});
		btnaddSecurityLvltolist.setToolTipText("Admin only");
		btnaddSecurityLvltolist.setBorder(null);
		btnaddSecurityLvltolist.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnaddSecurityLvltolist.setBackground(new Color(161, 217, 213));
		btnaddSecurityLvltolist.setBounds(1322, 251, 43, 14);
		contentPane.add(btnaddSecurityLvltolist);
		
		JButton btnRemoveSecurityLvltolist = new JButton("-");
		btnRemoveSecurityLvltolist.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101"))
				{
	    			String listval = (String) jcbsecuritylevel.getSelectedItem();
					
	    			if (listval != null){
	    				String titleProfInfo = "SecurityLevel";
	    				
	    	        		RemoveList RMVProfileData = new RemoveList();
	    	        		try {RMVProfileData.RMVprofiledataSecLvl(listval);
	    	        		
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    	        		JOptionPane.showMessageDialog(null, "Skill removed from profileData DB");
	    			
	    	        		RemoveList RMVProfileInformation = new RemoveList();
	    	        		try {RMVProfileInformation.RMVprofileinfo(listval,titleProfInfo);
	    	        			
							
	    	        		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbsecuritylevel.getModel();
	    	        		model.removeAllElements();
	    	        		fillDatajcbhiringtype(jcbsecuritylevel);	
					        
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    						
	    	        JOptionPane.showMessageDialog(null, "Skill removed from profileInfoSelections DB");
	    	        
	    	        
	    			}else{
	    				JOptionPane.showMessageDialog(null, "Please select a value from the list.");
	    				}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRemoveSecurityLvltolist.setToolTipText("Admin only");
		btnRemoveSecurityLvltolist.setBorder(null);
		btnRemoveSecurityLvltolist.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRemoveSecurityLvltolist.setBackground(new Color(161, 217, 213));
		btnRemoveSecurityLvltolist.setBounds(1364, 251, 43, 14);
		contentPane.add(btnRemoveSecurityLvltolist);
		
		JButton btnaddAdditionalExptolist = new JButton("+");
		btnaddAdditionalExptolist.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101")){
					
					AddValueToList skillProfileAddExp = new AddValueToList();
						try {
							listval = skillProfileAddExp.add_ProfileAddExp();
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbadditionalexperience.getModel();
    	        		model.removeAllElements();				
						fillDatajcbadditionalexperience(jcbadditionalexperience);
						
					}	
					else{
						JOptionPane.showMessageDialog(null, "admin use only");
					}
				
			}
		});
		btnaddAdditionalExptolist.setToolTipText("Admin only");
		btnaddAdditionalExptolist.setBorder(null);
		btnaddAdditionalExptolist.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnaddAdditionalExptolist.setBackground(new Color(161, 217, 213));
		btnaddAdditionalExptolist.setBounds(1007, 346, 43, 14);
		contentPane.add(btnaddAdditionalExptolist);
		
		JButton btnRemoveAdditionalExptolist = new JButton("-");
		btnRemoveAdditionalExptolist.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				if (jtxtuserid.getText().trim().contentEquals("E101"))
				{
	    			String listval = (String) jcbadditionalexperience.getSelectedItem();
					
	    			if (listval != null){
	    				String titleProfInfo = "AdditionalExperience";
	    				
	    	        		RemoveList RMVProfileData = new RemoveList();
	    	        		try {RMVProfileData.RMVprofiledataAddExp(listval);
	    	        		
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    	        		JOptionPane.showMessageDialog(null, "Skill removed from profileData DB");
	    			
	    	        		RemoveList RMVProfileInformation = new RemoveList();
	    	        		try {RMVProfileInformation.RMVprofileinfo(listval,titleProfInfo);
	    	        			
	    	        		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcbadditionalexperience.getModel();
	    	        		model.removeAllElements();
	    	        		fillDatajcbhiringtype(jcbadditionalexperience);	
					        
	    	        		} catch (SQLException e2) {
	    	        			e2.printStackTrace();}
	    						
	    	        JOptionPane.showMessageDialog(null, "Skill removed from profileInfoSelections DB");
	    	        
	    	        
	    			}else{
	    				JOptionPane.showMessageDialog(null, "Please select a value from the list.");
	    				}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRemoveAdditionalExptolist.setToolTipText("Admin only");
		btnRemoveAdditionalExptolist.setBorder(null);
		btnRemoveAdditionalExptolist.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRemoveAdditionalExptolist.setBackground(new Color(161, 217, 213));
		btnRemoveAdditionalExptolist.setBounds(1049, 346, 43, 14);
		contentPane.add(btnRemoveAdditionalExptolist);
		
		btnRefreshButton = new JButton("Refresh Record Details");
		btnRefreshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminData();
			}
		});
		btnRefreshButton.setBounds(1259, 34, 148, 23);
		contentPane.add(btnRefreshButton);
		
		JLabel lblViewRecord_Infosave_1 = new JLabel("<click on ADD/UPDATE PROFILE>");
		lblViewRecord_Infosave_1.setVerticalAlignment(SwingConstants.TOP);
		lblViewRecord_Infosave_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblViewRecord_Infosave_1.setForeground(new Color(138, 0, 69));
		lblViewRecord_Infosave_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblViewRecord_Infosave_1.setBounds(758, 432, 628, 21);
		contentPane.add(lblViewRecord_Infosave_1);

	}
	
	public void adminData() {
		
		try {
			String query ="select employeeID,employeeFirstName,employeeLastName,profileManagerId,dateOfJoin,hiredBandLevel,currentBandLevel,overallYearsExp,overallMthExp,additionalExp,securityLevel,"
					+ "hiringType,jobRoll,dateOfLastProgress,mentorName,coachName,assetPatent,intellectualProperty,shortTermGoal,longTermGoal,"
					+ "trainingPlans,certificationPlans,badgePlans,inovationGoal,username from profileData";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rst;
			
			rst = pst.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rst));
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}	
	}
	
	public void filter() {
		
		String query ="select employeeID,employeeFirstName,employeeLastName,profileManagerId,dateOfJoin,hiredBandLevel,currentBandLevel,overallYearsExp,overallMthExp,additionalExp,securityLevel,"
				+ "hiringType,jobRoll,dateOfLastProgress,mentorName,coachName,assetPatent,intellectualProperty,shortTermGoal,longTermGoal,"
				+ "trainingPlans,certificationPlans,badgePlans,inovationGoal,username from profileData";
		
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
					JOptionPane.showMessageDialog(null, "You Need to ADD a Record");    }       
			} while (rs.next());
			}
			
			
			catch (SQLException e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		
	}
	
	public void deleteProfileUser(String delusr) throws SQLException{
		
		String query="DELETE from profileData where username=?";
		PreparedStatement pst=conn.prepareStatement(query);
		try {
			
			pst.setString(1,delusr);
	        pst.execute();
			JOptionPane.showMessageDialog(null, "Profile Deleted");
			pst.close();

			} catch (Exception ex) {
			
			JOptionPane.showMessageDialog(null, " exception error Profile Record not Deleted");
			ex.printStackTrace();
		}
		/*Delete employeeSkills*/
		
		String qry="DELETE from userInfo where username=?";
		PreparedStatement ps=conn.prepareStatement(qry);
		try {
			
			ps.setString(1,delusr);
	        ps.execute();
			JOptionPane.showMessageDialog(null, "User Deleted");
			ps.close();
			
			
		}catch (Exception eu){
			JOptionPane.showMessageDialog(null, " exception error User Record not Deleted");
			eu.printStackTrace();
			
		};
	}
		
	public String check_Userid(String uid,String pass) throws SQLException {
		
	try{String que="SELECT username FROM UserInfo";
	PreparedStatement pst = conn.prepareStatement(que);
	ResultSet rs = pst.executeQuery();   
      oktoupdate=("Y"); 
	while (rs.next()){
        
        	String checkUser = (rs.getString(1));
        	System.out.println("user id"  + uid);
        	System.out.println(" check user"  +  checkUser);
        	
        		if (uid.equals(checkUser)){
        			System.out.println("uid does equal");
        			oktoupdate=("N");
				}else {
				System.out.println("uid does not equal");
				
				}
        	}
        	System.out.println("is it ok to update?   "+oktoupdate);	
	}catch(SQLException e){
		e.printStackTrace();}
	return oktoupdate;
	}

	public String UpdateUser(String oktoupdate,String uid,String pass) throws SQLException{
		System.out.println("is it ok to update?   "+oktoupdate);
		
		if (oktoupdate != null && oktoupdate=="Y"){
			
			String query = "INSERT into UserInfo(username,password)values(?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
					
			try{
			    ps.setString(1,uid);
				ps.setString(2,pass);
				ps.execute();
				JOptionPane.showMessageDialog(null, "User Saved");
				ps.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
				}
			
		}else {JOptionPane.showMessageDialog(null, "User must be Unique");			
				}
		return null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void fillDatajcbhiredbandlevel(JComboBox jcbhiredbandlevel){
		
		String query = "Select selectionName FROM profileInfoSelections WHERE selectionTitle =\"HiredBandLevel\"";
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			ResultSet rs;
			rs = pst.executeQuery();
	   
			while (rs.next()) {
				 jcbhiredbandlevel.addItem(rs.getString("selectionName"));
	            }
	            rs.close();
	            pst.close();
	        }catch(SQLException ei) {
	        	ei.printStackTrace();
	    } 
		return;	
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void fillDatajcboverallyearsexperience(JComboBox jcboverallyearsexperience){
		
		String query = "Select selectionName FROM profileInfoSelections WHERE selectionTitle =\"OverallYearsExperience\"";
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			ResultSet rs;
			rs = pst.executeQuery();
	   
			while (rs.next()) {
	            	
				jcboverallyearsexperience.addItem(rs.getString("selectionName"));
	            
	            }

	            rs.close();
	            pst.close();
	        }catch(SQLException ei) {
	    	
	        	ei.printStackTrace();
	    }
		  
		return;
		
	}
	
@SuppressWarnings({ "rawtypes", "unchecked" })
public void fillDatajcboverallmonthexperience(JComboBox jcboverallmonthexperience){
		
		String query = "Select selectionName FROM profileInfoSelections WHERE selectionTitle =\"OverallMonthExperience\"";
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			ResultSet rs;
			rs = pst.executeQuery();
	   
			while (rs.next()) {
	            	
				jcboverallmonthexperience.addItem(rs.getString("selectionName"));
	            
	            }

	            rs.close();
	            pst.close();
	        }catch(SQLException ei) {
	    	
	        	ei.printStackTrace();
	    }
		  
		return;
		
	}

@SuppressWarnings({ "rawtypes", "unchecked" })
public void fillDatajcbadditionalexperience(JComboBox jcbadditionalexperience){
	
	String query = "Select selectionName FROM profileInfoSelections WHERE selectionTitle =\"AdditionalExperience\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
            	
			jcbadditionalexperience.addItem(rs.getString("selectionName"));
            
            }

            rs.close();
            pst.close();
        }catch(SQLException ei) {
    	
        	ei.printStackTrace();
    }
	  
	return;
	
}

@SuppressWarnings({ "rawtypes", "unchecked" })
public void fillDatajcbsecuritylevel(JComboBox jcbsecuritylevel){
	
	String query = "Select selectionName FROM profileInfoSelections WHERE selectionTitle =\"SecurityLevel\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
            	
			jcbsecuritylevel.addItem(rs.getString("selectionName"));
            
            }

            rs.close();
            pst.close();
        }catch(SQLException ei) {
    	
        	ei.printStackTrace();
    }
	  
	return;
	
}

@SuppressWarnings({ "rawtypes", "unchecked" })
public void fillDatajcbhiringtype(JComboBox jcbhiringtype){
	
	String query = "Select selectionName FROM profileInfoSelections WHERE selectionTitle =\"HiringType\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
            	
			jcbhiringtype.addItem(rs.getString("selectionName"));
            
            }

            rs.close();
            pst.close();
        }catch(SQLException ei) {
    	
        	ei.printStackTrace();
    }
	  
	return;
	
}

@SuppressWarnings({ "rawtypes", "unchecked" })
public void fillDatajcbcurrentbandlevel(JComboBox jcbcurrentbandlevel){
	
	String query = "Select selectionName FROM profileInfoSelections WHERE selectionTitle =\"CurrentBandLevel\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
            	
			jcbcurrentbandlevel.addItem(rs.getString("selectionName"));
            
            }

            rs.close();
            pst.close();
        }catch(SQLException ei) {
    	
        	ei.printStackTrace();
    }
	  
	return;
	
}

	public void my_update(String str) {
		jtxtuserid.setText(str);
		jtxtuserid.setBorder(null);
		jtxtuserid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtxtuserid.setBounds(162, 13, 201, 20);
		jtxtuserid.setBackground(new Color(128, 255, 255));
		getContentPane().add(jtxtuserid);
		jtxtuserid.setColumns(10);
		if (str.equals("E101")){
			AdminUser = "Y";
		}else {
			AdminUser = "N";
		}
		
	}
}
