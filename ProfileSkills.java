package Profile;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.Window;
import java.awt.desktop.SystemSleepEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import net.proteanit.sql.DbUtils;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.RowFilter;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.PanelUI;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.Position;
import javax.swing.text.TableView.TableRow;
import net.proteanit.sql.DbUtils;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import javax.swing.Box;
import javax.swing.ComboBoxModel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.SystemColor;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;

@SuppressWarnings({ "serial", "unused" })

public class ProfileSkills extends JFrame {
	

	DefaultTableModel dm;
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public String listval;
	public String sk;
	public String AdminUser;
	public String userstr;
	public String usrname;
	public int col = 0;
	public int b = 0;
	public String bayear;
	public String rmvrow = "";
	public String rmvrowgiveback = "";
	@SuppressWarnings("rawtypes")
	private JList listIgniteSkillProflvl;
	private JTable industrySelectTable;
	private JTable givebackTable;
	private JTable givebackSelectTable;
	private JComboBox<String> cbindustry = new JComboBox<>();
	private JComboBox<String> cbindustrylvl = new JComboBox<>();
	private JTable tableTechToolExp;
	private JTable tableMyTechToolExp;
	private JTable tableManagementExp;
	private JTextField textFieldBAMyYears;
	private JTextField textFieldBAMyMonths;
	private JTable industryTable;
	private JTable tableMyManagementExp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldTechMyYears;
	private JTextField textFieldTechMyMonth;
	private JTextField textFieldFunMyYears;
	private JTextField textFieldFunMyMonths;
	private JTextField textFieldManMyYears;
	private JTextField textFieldManMyMonth;
	private JButton btnaddskillstoProfLvl;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox cbBAYearsExp = new JComboBox();
	@SuppressWarnings("rawtypes")
	public JComboBox cbBAMonthExp = new JComboBox();
	
	@SuppressWarnings("rawtypes")
	DefaultListModel lmodel;
	DefaultTableModel model;
	
	DefaultListModel<String> myIgniteSkillProfList = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYIgniteSkillProflvl1 = new JList();
	
	DefaultListModel<String> myCloudCertBadgeList = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYCloudCertBadges = new JList();
	
	DefaultListModel<String> mySDLCModExpList = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYSDLCModelExperience = new JList();
	
	DefaultListModel<String> myMandatoryList = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYMandatoryBadges = new JList();
	
	DefaultListModel<String> myIndustryList = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYindustryBadges = new JList();
	
	DefaultListModel<String> MYBARolls = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYBARoles = new JList();
	
	DefaultListModel<String> MYBAToolSoft = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYBAToolsSoftware_1 = new JList();
	
	DefaultListModel<String> MYBASkillBad = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYBASkillBadge = new JList();
	
	DefaultListModel<String> MyBaIndDom = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYBAIndustryDomain = new JList(); 
	
	DefaultListModel<String> MYBACert = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYBACertAcheived = new JList();
	
	DefaultListModel<String> MYTechIndDom = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYTechIndustryDomain = new JList();
	
	DefaultListModel<String> MYTechBadCert = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYTechBadgeCert = new JList();
	
	DefaultListModel<String> MYTechOthExp = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYTechOtherAreas = new JList();
	
	DefaultListModel<String> MYTechTestManTool = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYTechTestManTools = new JList();
	
	DefaultListModel<String> MYTechCodeConTool = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYTechCodeControlTools = new JList();
	
	DefaultListModel<String> MYTechDevOpsTool = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYTechDevOpsTools = new JList();
	
	DefaultListModel<String> MYFunIndDom = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYFunIndustryDomain = new JList();
	
	DefaultListModel<String> MYFunCert = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYFunCertifications = new JList();
	
	DefaultListModel<String> MYFunTestExp = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYFunTestingExp = new JList();
		
	DefaultListModel<String> MYFunBadge = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYFunBadges = new JList();
	
	DefaultListModel<String> MYFunTestManDefect = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList listMYFunTestMangement = new JList();
	
	DefaultListModel<String> MYManLeadership = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList MylistManLeadership = new JList();
	
	DefaultListModel<String> MYMANTraining = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList MYlistManTraining = new JList();
	
	DefaultListModel<String> MYMANLeadSoftPrj = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList MYlistManLeadSoftPrj = new JList();
	
	DefaultListModel<String> MYMANSDLC = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList MYlistManSDLC = new JList();
	
	DefaultListModel<String> MYMANIndDom = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList MYlistManIndDom = new JList();
	
	DefaultListModel<String> MYMANBadgeCert = new DefaultListModel<>();
	@SuppressWarnings("rawtypes")
	JList MYlistManBadgeCert = new JList();
	
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileSkills frame = new ProfileSkills();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ProfileSkills() {
		
		conn = dbConnection.ConnectDB();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
							
				String userstr = textField_1.getText();		
								
						filterProficiencyLevel();
						filterCertBadge();
						filterSDLC();
						filterManBadge();
						filterIndustryBadge();
						filterGiveBack();
						filterbayear();
						filterbamonth();
						filtertechyear();
						filtertechmonth();
						filterfunyear();
						filterfunmonth();
						filtermanyear();
						filtermanmonth();
						filterBARoll();
						filterBAIndustryDomain();
						filterBAToolsSoftWorked();
						filterBACertifications();
						filterBASkillsBadge();
						filterMYTechIndustryDomain();
						filterMYTechBadgeCert();
						filterMYTechOtherAreas();
						filterMyTechTestManTools();
						filterMYTechCodeControlTools();
						filterMYTechDevOpsTools();
						filterTechToolExp();
						filterMYFunIndustryDom();
						filterMYFunCertifications();
						filterMYFunTestExp();
						filterMYFunBadges();
						filterMYFunTestManagement();
						filterMYManLeadershipDem();
						filterMYManManagementTrain();
						filterMYManLeadershipSoftProj();
						filterMYManSDLCTool();
						filterMYManIndustryDom();
						filterMYManBadgeCert();
						filterMYManExperience();
						
			}
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});
		
		this.setTitle("SKILLS");
		this.setSize(1109, 880);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedpane = new JTabbedPane();
		tabbedpane.setBounds(20, 20, 1063, 810);
		this.getContentPane().add(tabbedpane);
	
		/********************************/
		/**      Profile Pane         **/
		/******************************/
		
		JPanel panelProf = new JPanel();
		panelProf.setBackground(new Color(204, 204, 255));
		
		tabbedpane.add("ProfileSkill",panelProf);
		panelProf.setLayout(null);
		
		JLabel lblIgniteSkillProf = new JLabel("Ignite Skill Proficiency Level");
		lblIgniteSkillProf.setToolTipText("SkillLevel");
		lblIgniteSkillProf.setBackground(UIManager.getColor("Menu.selectionBackground"));
		lblIgniteSkillProf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIgniteSkillProf.setBounds(21, 28, 220, 14);
		panelProf.add(lblIgniteSkillProf);
		
		JLabel lblSDLCmodel = new JLabel("SDLC Model Experience");
		lblSDLCmodel.setToolTipText("SkillTool");
		lblSDLCmodel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSDLCmodel.setBounds(21, 184, 194, 14);
		panelProf.add(lblSDLCmodel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("SkillIndustry");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(21, 347, 169, 14);
		panelProf.add(lblNewLabel_1);
		
		JLabel lblExpertiseLevel= new JLabel("");
		lblExpertiseLevel.setToolTipText("SkillLevel");
		lblExpertiseLevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblExpertiseLevel.setBounds(247, 347, 169, 14);
		panelProf.add(lblExpertiseLevel);
		
		JScrollPane scrollPane_19 = new JScrollPane();
		scrollPane_19.setBounds(600, 360, 413, 74);
		panelProf.add(scrollPane_19);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_19.setViewportView(scrollPane);
		
		industrySelectTable = new JTable();
		scrollPane.setViewportView(industrySelectTable);
		industrySelectTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Industry", "Industry Level"
			}
		));
		
		JButton btnIndustryDelete= new JButton("<<");
		btnIndustryDelete.setBorder(null);
		btnIndustryDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(industrySelectTable.getSelectedRow()>=0) {
	                
					int selrow = (industrySelectTable.getSelectedRow());
					String ibstr1 = ((DefaultTableModel)industrySelectTable.getModel()).getValueAt(selrow, 0).toString();
					String ibstr2 = ((DefaultTableModel)industrySelectTable.getModel()).getValueAt(selrow, 1).toString();
					
					// Remove from the LIST
					((DefaultTableModel)industrySelectTable.getModel()).removeRow(selrow);
				
					//Remove from DB
					
					String tempusrname = textField_1.getText();
					
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVEindustrySelectTable(ibstr1,ibstr2, tempusrname);
					
			}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}
		});
		btnIndustryDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIndustryDelete.setForeground(new Color(0, 0, 255));
		btnIndustryDelete.setBounds(532, 384, 54, 22);
		btnIndustryDelete.setBackground(new Color(204, 204, 255));
		btnIndustryDelete.setForeground(Color.BLUE);
		panelProf.add(btnIndustryDelete);
		
		JScrollPane scrollPane_givebackTable = new JScrollPane();
		scrollPane_givebackTable.setBounds(21, 494, 496, 42);
		panelProf.add(scrollPane_givebackTable);
		
		givebackTable = new JTable(1, 2);
		scrollPane_givebackTable.setViewportView(givebackTable);
		givebackTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Practice Zone", "Focus Group"
			}
		));
		givebackTable.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		TableColumn PracticeZoneColumn1 = givebackTable.getColumnModel().getColumn(0);
		
	    TableColumn FocusGroupColumn2 = givebackTable.getColumnModel().getColumn(1); 
	      
	      JComboBox<String> cbpraticezone = new JComboBox<>();
	      fillDatacbpraticezone(cbpraticezone);
	      PracticeZoneColumn1.setCellEditor(new DefaultCellEditor(cbpraticezone));		
	      
	      JComboBox<String> cbfocusgroup = new JComboBox<>();
	      fillDatacbfocusgroup(cbfocusgroup);
	      FocusGroupColumn2.setCellEditor(new DefaultCellEditor(cbfocusgroup));   
	    
	    JLabel lblPracticeGiveBack = new JLabel("Practice Giveback");
	    lblPracticeGiveBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblPracticeGiveBack.setBounds(21, 463, 143, 14);
	    panelProf.add(lblPracticeGiveBack);
	    
	    JScrollPane scrollPane_20 = new JScrollPane();
	    scrollPane_20.setBounds(600, 494, 413, 74);
	    panelProf.add(scrollPane_20);
	    
	    
	    //Practice Giveback Selection Table
	    
	    JScrollPane scrollPane_1 = new JScrollPane();
	    scrollPane_20.setViewportView(scrollPane_1);
	    
	    
	    givebackSelectTable = new JTable();
	    scrollPane_1.setViewportView(givebackSelectTable);
	    givebackSelectTable.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		"Practice Zone", "Focus Group"
	    	}
	    ));
	    
	    JButton btnGiveBackAdd = new JButton(">>");
	    btnGiveBackAdd.setBorder(null);
	    btnGiveBackAdd.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnGiveBackAdd.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			int rowIndex = 0;
	    			int vColIndex = 0;
	    			// This is the <GiveBack> row 0 col 0
	    			Object objgiveback = givebackTable.getValueAt(rowIndex, vColIndex);
	    			
	    			// This is the <Level> row 0 col 1 
	    			vColIndex = (vColIndex +1);
	    			Object objgivebacklvl = givebackTable.getValueAt(rowIndex, vColIndex);	
					
						if ((objgiveback != null)&&(objgivebacklvl !=  null)) {
							String gbstr1 = objgiveback.toString();						
							String gbstr2 = objgivebacklvl.toString();
						 
							//This is add a row	
							AddRowGiveBack(gbstr1,gbstr2);	
						}else {
						
							JOptionPane.showMessageDialog(null, "please enter a value for GiveBack and its corresponding level!");
						}
	    			 
	    		}
	    		catch (Exception ez) {
	    			ez.printStackTrace();	
	    		}	
	    		
	    	}
	    });
	    btnGiveBackAdd.setBounds(532, 494, 54, 22);
	    btnGiveBackAdd.setBackground(new Color(204, 204, 255));
	    btnGiveBackAdd.setForeground(new Color(0, 0, 255));
	    panelProf.add(btnGiveBackAdd);
	    
	    JButton btnGiveBackDelete = new JButton("<<");
	    btnGiveBackDelete.setBorder(null);
	    btnGiveBackDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnGiveBackDelete.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	
	    		
	    		if(givebackSelectTable.getSelectedRow()>=0) {
	                
	    			int selrow = (givebackSelectTable.getSelectedRow());
	    			String gbstr1 = ((DefaultTableModel)givebackSelectTable.getModel()).getValueAt(selrow, 0).toString();
	    			String gbstr2 = ((DefaultTableModel)givebackSelectTable.getModel()).getValueAt(selrow, 1).toString();
	    			
	    			//Remove from List
	    			((DefaultTableModel)givebackSelectTable.getModel()).removeRow(selrow);
	    			
	    			//Remove from DB
	    			
	    			String tempusrname = textField_1.getText();
					
	    			RemoveList myremovelist = new RemoveList();
	    			myremovelist.REMOVEgivebackSelectTable(gbstr1,gbstr2, tempusrname);
	    			
	    	     }else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
	        }
	    });
	    btnGiveBackDelete.setBounds(533, 517, 54, 22);
	    btnGiveBackDelete.setBackground(new Color(204, 204, 255));
	    btnGiveBackDelete.setForeground(new Color(0, 0, 255));
	    panelProf.add(btnGiveBackDelete);
	    
	    JLabel lblCloudCertificationBadges = new JLabel("Cloud Certification Badges");
	    lblCloudCertificationBadges.setToolTipText("CertBadge");
	    lblCloudCertificationBadges.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblCloudCertificationBadges.setBounds(542, 28, 210, 14);
	    panelProf.add(lblCloudCertificationBadges);
	    
	    JLabel lblMandatoryBadges = new JLabel("Mandatory Badges");
	    lblMandatoryBadges.setToolTipText("CertBadge");
	    lblMandatoryBadges.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblMandatoryBadges.setBounds(542, 184, 195, 14);
	    panelProf.add(lblMandatoryBadges);
	    
	    JScrollPane scrollPaneIgniteSkill = new JScrollPane();
	    scrollPaneIgniteSkill.setBounds(20, 53, 210, 106);
	    panelProf.add(scrollPaneIgniteSkill);
	    
	    JList listIgniteSkillProflvl_1 = new JList();
	    scrollPaneIgniteSkill.setViewportView(listIgniteSkillProflvl_1);
	    fillDataProflvlJlist(listIgniteSkillProflvl_1);
	    
	    JScrollPane scrollPaneskill = new JScrollPane();
	    scrollPaneskill.setBounds(298, 54, 180, 104);
	    panelProf.add(scrollPaneskill);
	    
	    JList listMYIgniteSkillProflvl1_1 = new JList(myIgniteSkillProfList);
	    scrollPaneskill.setViewportView(listMYIgniteSkillProflvl1_1);
	    
	    JScrollPane scrollPaneSDLCModel = new JScrollPane();
	    scrollPaneSDLCModel.setBounds(21, 205, 210, 106);
	    panelProf.add(scrollPaneSDLCModel);
	    
	    JList listSDLCModelExperience = new JList();
	    scrollPaneSDLCModel.setViewportView(listSDLCModelExperience);
	    fillDataSDLC(listSDLCModelExperience);
	    
	    JScrollPane scrollPaneMYSDLCModel = new JScrollPane();
	    scrollPaneMYSDLCModel.setBounds(298, 205, 182, 106);
	    panelProf.add(scrollPaneMYSDLCModel);
	    
	    JList listMYSDLCModelExperience_1 = new JList(mySDLCModExpList);
	    scrollPaneMYSDLCModel.setViewportView(listMYSDLCModelExperience_1);
	    
	    JScrollPane scrollPaneCloudCertBadg = new JScrollPane();
	    scrollPaneCloudCertBadg.setBounds(542, 53, 195, 101);
	    panelProf.add(scrollPaneCloudCertBadg);
	    
	    JList listCloudCertBadges = new JList();
	    scrollPaneCloudCertBadg.setViewportView(listCloudCertBadges);
	    fillDataCloudCert(listCloudCertBadges);
	    
	    JScrollPane scrollPaneMYCloudCertBadg = new JScrollPane();
	    scrollPaneMYCloudCertBadg.setBounds(795, 53, 218, 101);
	    panelProf.add(scrollPaneMYCloudCertBadg);
	    
	    JList listMYCloudCertBadges_1 = new JList(myCloudCertBadgeList);
	    scrollPaneMYCloudCertBadg.setViewportView(listMYCloudCertBadges_1);
	    
	    JScrollPane scrollPaneManBadges = new JScrollPane();
	    scrollPaneManBadges.setBounds(542, 205, 195, 106);
	    panelProf.add(scrollPaneManBadges);
	    
	    JList listMandatoryBadges = new JList();
	    scrollPaneManBadges.setViewportView(listMandatoryBadges);
	    fillDataManBadge(listMandatoryBadges);
	    
	    JScrollPane scrollPaneMYManBadges = new JScrollPane();
	    scrollPaneMYManBadges.setBounds(795, 205, 218, 101);
	    panelProf.add(scrollPaneMYManBadges);
	    
	    JList listMYMandatoryBadges_1 = new JList(myMandatoryList);
	    scrollPaneMYManBadges.setViewportView(listMYMandatoryBadges_1);
	    
	    JButton btnAddSkillProfLvl = new JButton(">>");
	    btnAddSkillProfLvl.setBorder(null);
	    btnAddSkillProfLvl.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String Proflvlstr1 = (String) listIgniteSkillProflvl_1.getSelectedValue();
	    		if (Proflvlstr1 != null) {
	    			
	    			if (myIgniteSkillProfList.contains(Proflvlstr1)) {
	    			JOptionPane.showMessageDialog(null, "Already in List");
	    			}
	    			else {
	    			myIgniteSkillProfList.addElement(Proflvlstr1);
	    			
	    			String tempusrname = textField_1.getText();
					SaveList mysavelist = new SaveList();
					mysavelist.SAVEmyIgniteSkillProfList(Proflvlstr1, tempusrname);
	    			}
	    					
	    	}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
	    		
	    	}
	    });
	    btnAddSkillProfLvl.setVerticalAlignment(SwingConstants.TOP);
	    btnAddSkillProfLvl.setVerticalTextPosition(SwingConstants.TOP);
	    btnAddSkillProfLvl.setForeground(new Color(0, 0, 255));
	    btnAddSkillProfLvl.setBackground(new Color(204, 204, 255));
	    btnAddSkillProfLvl.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnAddSkillProfLvl.setBounds(247, 55, 27, 22);
	    panelProf.add(btnAddSkillProfLvl);
	    
	    JLabel lblNewLabel = new JLabel("MY Ignite Skill Proficiency");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblNewLabel.setBounds(298, 28, 169, 14);
	    panelProf.add(lblNewLabel);
	    
	    JButton btnRemoveSkillProfLvl = new JButton("<<");
	    btnRemoveSkillProfLvl.setBorder(null);
	    btnRemoveSkillProfLvl.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String Proflvlstr1 = (String) listMYIgniteSkillProflvl1_1.getSelectedValue();				
	    		if (Proflvlstr1 != null) {
	    			if(listMYIgniteSkillProflvl1_1.getSelectedIndex()>=0);
	                
	    			myIgniteSkillProfList.remove(listMYIgniteSkillProflvl1_1.getSelectedIndex());
	    		
	    			String tempusrname = textField_1.getText();
				
	    			RemoveList myremovelist = new RemoveList();
	    			myremovelist.REMOVEmyIgniteSkillProfList(Proflvlstr1, tempusrname);
	    			
	    		}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
	    	}
	    });
	    btnRemoveSkillProfLvl.setVerticalTextPosition(SwingConstants.TOP);
	    btnRemoveSkillProfLvl.setVerticalAlignment(SwingConstants.TOP);
	    btnRemoveSkillProfLvl.setForeground(new Color(0, 0, 255));
	    btnRemoveSkillProfLvl.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnRemoveSkillProfLvl.setBackground(new Color(204, 204, 255));
	    btnRemoveSkillProfLvl.setBounds(247, 88, 27, 22);
	    panelProf.add(btnRemoveSkillProfLvl);
	    
	    JButton btnAddCloudCertBadg = new JButton(">>");
	    btnAddCloudCertBadg.setBorder(null);
	    btnAddCloudCertBadg.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String Certbadgstr1 = (String) listCloudCertBadges.getSelectedValue();
	    		if (Certbadgstr1 != null) {
	    		
	    			if (myCloudCertBadgeList.contains(Certbadgstr1)) {
	    				JOptionPane.showMessageDialog(null, "Already in List");
	    			}else {
	    				myCloudCertBadgeList.addElement(Certbadgstr1);
	    				
	    				String tempusrname = textField_1.getText();
	    				SaveList mysavelist = new SaveList();
	    				mysavelist.SAVEmyIgniteSkillCertBadge(Certbadgstr1, tempusrname);
	    			
	    			}
	    		}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
	    	}
	    });
	    btnAddCloudCertBadg.setVerticalTextPosition(SwingConstants.TOP);
	    btnAddCloudCertBadg.setVerticalAlignment(SwingConstants.TOP);
	    btnAddCloudCertBadg.setForeground(new Color(0, 0, 255));
	    btnAddCloudCertBadg.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnAddCloudCertBadg.setBackground(new Color(204, 204, 255));
	    btnAddCloudCertBadg.setBounds(736, 61, 54, 22);
	    panelProf.add(btnAddCloudCertBadg);
	    
	    JButton btnRemoveCloudCertBadg = new JButton("<<");
	    btnRemoveCloudCertBadg.setBorder(null);
	    btnRemoveCloudCertBadg.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String Cbadstr1 = (String) listMYCloudCertBadges_1.getSelectedValue();
	    		if (Cbadstr1 != null) {
	    			if(listMYCloudCertBadges_1.getSelectedIndex()>=0)
	                
	    			myCloudCertBadgeList.remove(listMYCloudCertBadges_1.getSelectedIndex());
	    		
	    			String tempusrname = textField_1.getText();
				
	    			RemoveList myremovelist = new RemoveList();
	    			myremovelist.REMOVEmyIgniteSkillCertBadge(Cbadstr1, tempusrname);
	    			
	    		}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
	    	}
	    });
	    btnRemoveCloudCertBadg.setVerticalTextPosition(SwingConstants.TOP);
	    btnRemoveCloudCertBadg.setVerticalAlignment(SwingConstants.TOP);
	    btnRemoveCloudCertBadg.setForeground(new Color(0, 0, 255));
	    btnRemoveCloudCertBadg.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnRemoveCloudCertBadg.setBackground(new Color(204, 204, 255));
	    btnRemoveCloudCertBadg.setBounds(736, 92, 54, 22);
	    panelProf.add(btnRemoveCloudCertBadg);
	    
	    JLabel lblMySdlcModel = new JLabel("MY SDLC Model Experience");
	    lblMySdlcModel.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblMySdlcModel.setBounds(298, 184, 169, 14);
	    panelProf.add(lblMySdlcModel);
	    
	    JButton btnAddSDLCExp = new JButton(">>");
	    btnAddSDLCExp.setBorder(null);
	    btnAddSDLCExp.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String sdlcexpstr1 = (String) listSDLCModelExperience.getSelectedValue();
	    		if (sdlcexpstr1 != null) {
	    			if (mySDLCModExpList.contains(sdlcexpstr1)) {
	    				JOptionPane.showMessageDialog(null, "Allready in List");
	    			}else {
	    				mySDLCModExpList.addElement(sdlcexpstr1);
	    			
	    				String tempusrname = textField_1.getText();
	    				SaveList mysavelist = new SaveList();
	    				mysavelist.SAVEmySDLCModExpList(sdlcexpstr1, tempusrname);
	    			}
	    		}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
	    	}
	    });
	    btnAddSDLCExp.setVerticalTextPosition(SwingConstants.TOP);
	    btnAddSDLCExp.setVerticalAlignment(SwingConstants.TOP);
	    btnAddSDLCExp.setForeground(new Color(0, 0, 255));
	    btnAddSDLCExp.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnAddSDLCExp.setBackground(new Color(204, 204, 255));
	    btnAddSDLCExp.setBounds(247, 207, 27, 22);
	    panelProf.add(btnAddSDLCExp);
	    
	    JButton btnRemoveSDLCExp = new JButton("<<");
	    btnRemoveSDLCExp.setBorder(null);
	    btnRemoveSDLCExp.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String SDLCstr1 = (String) listMYSDLCModelExperience_1.getSelectedValue();
	    		if (SDLCstr1 != null) {
	    			if(listMYSDLCModelExperience_1.getSelectedIndex()>=0)
	                
	    				mySDLCModExpList.remove(listMYSDLCModelExperience_1.getSelectedIndex());
	    		
	    			String tempusrname = textField_1.getText();
				
	    			RemoveList myremovelist = new RemoveList();
	    			myremovelist.REMOVEmySDLCModExpList(SDLCstr1, tempusrname);
	    		}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
	    	}
	    });
	    btnRemoveSDLCExp.setVerticalTextPosition(SwingConstants.TOP);
	    btnRemoveSDLCExp.setVerticalAlignment(SwingConstants.TOP);
	    btnRemoveSDLCExp.setForeground(new Color(0, 0, 255));
	    btnRemoveSDLCExp.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnRemoveSDLCExp.setBackground(new Color(204, 204, 255));
	    btnRemoveSDLCExp.setBounds(247, 240, 27, 22);
	    panelProf.add(btnRemoveSDLCExp);
	    
	    JButton btnAddMandBadge = new JButton(">>");
	    btnAddMandBadge.setBorder(null);
	    btnAddMandBadge.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	
	    		
	    		String ManBadgestr1 = (String) listMandatoryBadges.getSelectedValue();
	    		if (ManBadgestr1 != null) {
	    			if (myMandatoryList.contains(ManBadgestr1)) {
	    				JOptionPane.showMessageDialog(null, "Already in List");
	    			}else {
	    				myMandatoryList.addElement(ManBadgestr1);
	    			
	    				String tempusrname = textField_1.getText();
	    				SaveList mysavelist = new SaveList();
	    				mysavelist.SAVEMYMandatoryBadges(ManBadgestr1, tempusrname);
	    			}
	    		}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
	    	}
	    });
	    btnAddMandBadge.setVerticalTextPosition(SwingConstants.TOP);
	    btnAddMandBadge.setVerticalAlignment(SwingConstants.TOP);
	    btnAddMandBadge.setForeground(new Color(0, 0, 255));
	    btnAddMandBadge.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnAddMandBadge.setBackground(new Color(204, 204, 255));
	    btnAddMandBadge.setBounds(736, 209, 54, 22);
	    panelProf.add(btnAddMandBadge);
	    
	    JButton btnRemoveMandBadge = new JButton("<<");
	    btnRemoveMandBadge.setBorder(null);
	    btnRemoveMandBadge.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String manbadgestr1 = (String) listMYMandatoryBadges_1.getSelectedValue();
	    		if (manbadgestr1 != null) {
	    			if(listMYMandatoryBadges_1.getSelectedIndex()>=0)
	                
	    			myMandatoryList.remove(listMYMandatoryBadges_1.getSelectedIndex());
	    		
	    			String tempusrname = textField_1.getText();
				
	    			RemoveList myremovelist = new RemoveList();
	    			myremovelist.REMOVEMYMandatoryBadges(manbadgestr1, tempusrname);
	    		}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");	
	    	}
	    });
	    btnRemoveMandBadge.setVerticalTextPosition(SwingConstants.TOP);
	    btnRemoveMandBadge.setVerticalAlignment(SwingConstants.TOP);
	    btnRemoveMandBadge.setForeground(new Color(0, 0, 255));
	    btnRemoveMandBadge.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnRemoveMandBadge.setBackground(new Color(204, 204, 255));
	    btnRemoveMandBadge.setBounds(736, 240, 54, 22);
	    panelProf.add(btnRemoveMandBadge);
	    
	    JLabel lblMyCertBadges = new JLabel("MY Cloud Certification Badges");
	    lblMyCertBadges.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblMyCertBadges.setBounds(794, 29, 169, 14);
	    panelProf.add(lblMyCertBadges);
	    
	    JLabel lblMyMandatoryBadges = new JLabel("MY Mandatory Badges");
	    lblMyMandatoryBadges.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblMyMandatoryBadges.setBounds(794, 185, 169, 14);
	    panelProf.add(lblMyMandatoryBadges);
	    
	    JLabel lblNewLabel_2 = new JLabel("Industry Badges and Expertise Level");
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblNewLabel_2.setBounds(21, 335, 264, 14);
	    panelProf.add(lblNewLabel_2);
	    
	    JScrollPane scrollPane_industrytable = new JScrollPane();
	    scrollPane_industrytable.setBounds(21, 360, 496, 42);
	    panelProf.add(scrollPane_industrytable);
	    
	    industryTable = new JTable(1, 2);
	    scrollPane_industrytable.setViewportView(industryTable);
	    industryTable.setModel(new DefaultTableModel(
	    	new Object[][] {
	    		{null, null},
	    	},
	    	new String[] {
	    		"Industry Badges", "Expertise Level"
	    	}
	    ));
	    industryTable.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    
	    TableColumn IndustryColumn1 = industryTable.getColumnModel().getColumn(0);
		
	    TableColumn IndLevelColumn2 = industryTable.getColumnModel().getColumn(1); 
	    
	    JComboBox<String> cbindustry = new JComboBox<>();
	    fillDatacbSkillIndustry(cbindustry);
	    IndustryColumn1.setCellEditor(new DefaultCellEditor(cbindustry));	
	    
	    JComboBox<String> cbindustrylvl = new JComboBox<>();
	    fillDatacbSkilllvl(cbindustrylvl);
	    IndLevelColumn2.setCellEditor(new DefaultCellEditor(cbindustrylvl));
	    
	    JButton btnindustryadd = new JButton(">>");
	    btnindustryadd.setBorder(null);
	    btnindustryadd.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		try {
	    			int rowIndex = 0;
	    			int vColIndex = 0;
	    			// This is the <industry> row 0 col 0
	    			Object o = industryTable.getValueAt(rowIndex, vColIndex);
	    			
	    			// This is the <Level> row 0 col 1 
	    			vColIndex = (vColIndex +1);
	    			Object ob = industryTable.getValueAt(rowIndex, vColIndex);
						
						if ((o != null)&&(ob !=  null)) {
							String Str1 = o.toString();						
							String Str2 = ob.toString();
							 
							//This is add a row	
							AddRowIndustry(Str1,Str2);	
						}else {
							
							JOptionPane.showMessageDialog(null, "please enter a value for TechTool and its corresponding Rate and SME/Trainer!");
						}
	    		}
	    		catch (Exception ez) {
	    			ez.printStackTrace();
	    			JOptionPane.showMessageDialog(null, "please enter a value for industry and its corresponding level!");
	    			
	    		}	
	    	}
	    });
	    btnindustryadd.setVerticalTextPosition(SwingConstants.TOP);
	    btnindustryadd.setVerticalAlignment(SwingConstants.TOP);
	    btnindustryadd.setForeground(new Color(0, 0, 255));
	    btnindustryadd.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnindustryadd.setBackground(new Color(204, 204, 255));
	    btnindustryadd.setBounds(532, 360, 54, 22);
	    panelProf.add(btnindustryadd);  
	    
	    JButton btnaddskillstoSDLC = new JButton("+");
	    btnaddskillstoSDLC.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (AdminUser.equals("Y")){
					
					AddValueToList skillSDLC = new AddValueToList();
					try {
						listval = skillSDLC.add_SkillSDLCModelExperience();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					//JList listSDLCModelExperience = new JList();
					//scrollPaneSDLCModel.setViewportView(listSDLCModelExperience);
					DefaultListModel listModel = (DefaultListModel) listSDLCModelExperience.getModel();
			        listModel.removeAllElements();
				    fillDataSDLC(listSDLCModelExperience);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
	    	}
	    });
	    btnaddskillstoSDLC.setBackground(new Color(204, 204, 255));
	    btnaddskillstoSDLC.setBorder(null);
	    btnaddskillstoSDLC.setVerticalTextPosition(SwingConstants.BOTTOM);
	    btnaddskillstoSDLC.setFont(new Font("Tahoma", Font.BOLD, 10));
	    btnaddskillstoSDLC.setBounds(128, 311, 46, 14);
	    panelProf.add(btnaddskillstoSDLC);
	    
	    JButton btnaddskillstoCertBadge = new JButton("+");
	    btnaddskillstoCertBadge.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (AdminUser.equals("Y")){
					
					AddValueToList skillCertBadge = new AddValueToList();
					try {
						listval = skillCertBadge.add_SkillCloudCertBadges();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					//JList listCloudCertBadges = new JList();
				    //scrollPaneCloudCertBadg.setViewportView(listCloudCertBadges);
					DefaultListModel listModel = (DefaultListModel) listCloudCertBadges.getModel();
			        listModel.removeAllElements();
				    fillDataCloudCert(listCloudCertBadges);
				}
	    		
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
	    	}
	    });
	    btnaddskillstoCertBadge.setVerticalTextPosition(SwingConstants.BOTTOM);
	    btnaddskillstoCertBadge.setFont(new Font("Tahoma", Font.BOLD, 10));
	    btnaddskillstoCertBadge.setBorder(null);
	    btnaddskillstoCertBadge.setBackground(new Color(204, 204, 255));
	    btnaddskillstoCertBadge.setBounds(652, 159, 46, 14);
	    panelProf.add(btnaddskillstoCertBadge);
	    
	    JButton btnaddskillstoManBadge = new JButton("+");
	    btnaddskillstoManBadge.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (AdminUser.equals("Y")){
					
					AddValueToList skillManBadge = new AddValueToList();
					try {
						listval = skillManBadge.add_SkillMandatoryBadges();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listMandatoryBadges = new JList();
				    //scrollPaneManBadges.setViewportView(listMandatoryBadges);
					DefaultListModel listModel = (DefaultListModel) listMandatoryBadges.getModel();
			        listModel.removeAllElements();
				    fillDataManBadge(listMandatoryBadges);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
	    	}
	    });
	    btnaddskillstoManBadge.setVerticalTextPosition(SwingConstants.BOTTOM);
	    btnaddskillstoManBadge.setFont(new Font("Tahoma", Font.BOLD, 10));
	    btnaddskillstoManBadge.setBorder(null);
	    btnaddskillstoManBadge.setBackground(new Color(204, 204, 255));
	    btnaddskillstoManBadge.setBounds(652, 311, 46, 14);
	    panelProf.add(btnaddskillstoManBadge);
	    
	    JButton btnaddskillstoBadge = new JButton("+");
	    btnaddskillstoBadge.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if (AdminUser.equals("Y")){
					
					AddValueToList skillIndBadge = new AddValueToList();
					try {
						listval = skillIndBadge.add_SkillIndustryBadges();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JComboBox<String> cbindustry = new JComboBox<>();
				    //fillDatacbSkillIndustry(cbindustry); 
					DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbindustry.getModel();
	        		model.removeAllElements();	
				    IndustryColumn1.setCellEditor(new DefaultCellEditor(cbindustry));
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
	    	}
	    });
	    btnaddskillstoBadge.setVerticalTextPosition(SwingConstants.BOTTOM);
	    btnaddskillstoBadge.setVerticalAlignment(SwingConstants.BOTTOM);
	    btnaddskillstoBadge.setFont(new Font("Tahoma", Font.BOLD, 10));
	    btnaddskillstoBadge.setBorder(null);
	    btnaddskillstoBadge.setBackground(new Color(204, 204, 255));
	    btnaddskillstoBadge.setBounds(184, 402, 46, 14);
	    panelProf.add(btnaddskillstoBadge);
	    
	    JButton btnaddskillstoIndBadExpLvl = new JButton("+");
	    btnaddskillstoIndBadExpLvl.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (AdminUser.equals("Y")){
					
					AddValueToList skillIndBadgeExplvl = new AddValueToList();
					try {
						listval = skillIndBadgeExplvl.add_SkillIndustryBad();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JComboBox<String> cbindustrylvl = new JComboBox<>();
					//IndLevelColumn2.setCellEditor(new DefaultCellEditor(cbindustrylvl));
					DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbindustrylvl.getModel();
	        		model.removeAllElements();
				    fillDatacbSkilllvl(cbindustrylvl);
				    
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
	    		
	    	}
	    });
	    btnaddskillstoIndBadExpLvl.setVerticalTextPosition(SwingConstants.BOTTOM);
	    btnaddskillstoIndBadExpLvl.setVerticalAlignment(SwingConstants.BOTTOM);
	    btnaddskillstoIndBadExpLvl.setFont(new Font("Tahoma", Font.BOLD, 10));
	    btnaddskillstoIndBadExpLvl.setBorder(null);
	    btnaddskillstoIndBadExpLvl.setBackground(new Color(204, 204, 255));
	    btnaddskillstoIndBadExpLvl.setBounds(437, 402, 46, 14);
	    panelProf.add(btnaddskillstoIndBadExpLvl);
	    
	    JButton btnaddskillstoPracticeGB = new JButton("+");
	    btnaddskillstoPracticeGB.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (AdminUser.equals("Y")){
					
					AddValueToList skillPracticeGBZone = new AddValueToList();
					try {
						listval = skillPracticeGBZone.add_SkillPracticeGBZone();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JComboBox<String> cbpraticezone = new JComboBox<>();
				    //PracticeZoneColumn1.setCellEditor(new DefaultCellEditor(cbpraticezone));
				    DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbpraticezone.getModel();
	        		model.removeAllElements();
	        		fillDatacbpraticezone(cbpraticezone);
					
				}else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
	    	}
	    });
	    btnaddskillstoPracticeGB.setVerticalTextPosition(SwingConstants.BOTTOM);
	    btnaddskillstoPracticeGB.setFont(new Font("Tahoma", Font.BOLD, 10));
	    btnaddskillstoPracticeGB.setBorder(null);
	    btnaddskillstoPracticeGB.setBackground(new Color(204, 204, 255));
	    btnaddskillstoPracticeGB.setBounds(184, 536, 46, 14);
	    panelProf.add(btnaddskillstoPracticeGB);
	    
	    JButton btnaddskillstoGBFocusGrp = new JButton("+");
	    btnaddskillstoGBFocusGrp.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (AdminUser.equals("Y")){
					
					AddValueToList skillPracticeGBFocus = new AddValueToList();
					try {
						listval = skillPracticeGBFocus.add_SkillIGBFocus();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JComboBox<String> cbfocusgroup = new JComboBox<>();
				    //FocusGroupColumn2.setCellEditor(new DefaultCellEditor(cbfocusgroup));
				    DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbfocusgroup.getModel();
	        		model.removeAllElements();
	        		fillDatacbfocusgroup(cbfocusgroup);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
	    	}
	    });
	    btnaddskillstoGBFocusGrp.setVerticalTextPosition(SwingConstants.BOTTOM);
	    btnaddskillstoGBFocusGrp.setFont(new Font("Tahoma", Font.BOLD, 10));
	    btnaddskillstoGBFocusGrp.setBorder(null);
	    btnaddskillstoGBFocusGrp.setBackground(new Color(204, 204, 255));
	    btnaddskillstoGBFocusGrp.setBounds(437, 536, 46, 14);
	    panelProf.add(btnaddskillstoGBFocusGrp);
	    
	    JButton btnrmvskillstoProfLvl = new JButton("-");
	    btnrmvskillstoProfLvl.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	  int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
	    	  
	    		if (AdminUser.equals("Y")){
	    			String selval = (String) listIgniteSkillProflvl_1.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mySkillProfList = new LookupSkill();
	    				int skillid = (int) mySkillProfList.lookupSkillIdSkilllvl(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(skillid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}	
	    			DefaultListModel listModel = (DefaultListModel) listIgniteSkillProflvl_1.getModel();
			        listModel.removeAllElements();
	    			fillDataProflvlJlist(listIgniteSkillProflvl_1); 
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}	
	    	  
	    	}
	    });
	    btnrmvskillstoProfLvl.setVerticalAlignment(SwingConstants.BOTTOM);
	    btnrmvskillstoProfLvl.setFont(new Font("Tahoma", Font.BOLD, 14));
	    btnrmvskillstoProfLvl.setBorder(null);
	    btnrmvskillstoProfLvl.setBackground(new Color(204, 204, 255));
	    btnrmvskillstoProfLvl.setBounds(184, 159, 46, 14);
	    panelProf.add(btnrmvskillstoProfLvl);
	    
	    btnaddskillstoProfLvl = new JButton("+");
		btnaddskillstoProfLvl.setBorder(null);
		btnaddskillstoProfLvl.setBackground(new Color(204, 204, 255));
		btnaddskillstoProfLvl.setAlignmentY(0.0f);
		btnaddskillstoProfLvl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				if (AdminUser.equals("Y")){
					
					AddValueToList skillproflvl = new AddValueToList();
					try {
						listval = skillproflvl.add_SkillProfLvltoList();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listIgniteSkillProflvl_1 = new JList();
					//scrollPaneIgniteSkill.setViewportView(listIgniteSkillProflvl_1);
					DefaultListModel listModel = (DefaultListModel) listIgniteSkillProflvl_1.getModel();
			        listModel.removeAllElements();
				    fillDataProflvlJlist(listIgniteSkillProflvl_1);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
				
			}
		});
		btnaddskillstoProfLvl.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnaddskillstoProfLvl.setBounds(139, 159, 46, 14);
		btnaddskillstoProfLvl.setVisible(true);
		panelProf.add(btnaddskillstoProfLvl);
		
		JButton btnrmvskillstoSDLC_1 = new JButton("-");
		btnrmvskillstoSDLC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
			  
				if (AdminUser.equals("Y")){
	    			String selval = (String) listSDLCModelExperience.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mySkillIdSDLC = new LookupSkill();
	    				int skillid = (int) mySkillIdSDLC.lookupSkillIdSDLC(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(skillid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			DefaultListModel listModel = (DefaultListModel) listSDLCModelExperience.getModel();
			        listModel.removeAllElements();
	    		    fillDataSDLC(listSDLCModelExperience);
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnrmvskillstoSDLC_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnrmvskillstoSDLC_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrmvskillstoSDLC_1.setBorder(null);
		btnrmvskillstoSDLC_1.setBackground(new Color(204, 204, 255));
		btnrmvskillstoSDLC_1.setBounds(172, 310, 46, 14);
		panelProf.add(btnrmvskillstoSDLC_1);
		
		JButton btnrmvskillstoCertBad_1 = new JButton("-");
		btnrmvskillstoCertBad_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
	
				if (AdminUser.equals("Y")){
					
					String selval = (String) listCloudCertBadges.getSelectedValue();
				  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mySkillIdCertBadge = new LookupSkill();
	    				int CertBadgskid =  (int) mySkillIdCertBadge.lookupSkillIdCertBadge(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(CertBadgskid);
			    		    
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			DefaultListModel listModel = (DefaultListModel) listCloudCertBadges.getModel();
			        listModel.removeAllElements();
	    		    fillDataCloudCert(listCloudCertBadges);
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}	
			}
		});
		btnrmvskillstoCertBad_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnrmvskillstoCertBad_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrmvskillstoCertBad_1.setBorder(null);
		btnrmvskillstoCertBad_1.setBackground(new Color(204, 204, 255));
		btnrmvskillstoCertBad_1.setBounds(691, 159, 46, 14);
		panelProf.add(btnrmvskillstoCertBad_1);
		
		JButton btnrmvskillstoManBadge_1 = new JButton("-");
		btnrmvskillstoManBadge_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
					String selval = (String) listMandatoryBadges.getSelectedValue();
				  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill myMandatoryBadge = new LookupSkill();
	    				int MandCertskid = (int) myMandatoryBadge.lookupSkillIdMandatoryCert(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(MandCertskid);
			    		    
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			DefaultListModel listModel = (DefaultListModel) listMandatoryBadges.getModel();
			        listModel.removeAllElements();
	    		    fillDataManBadge(listMandatoryBadges);
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}		
			}
		});
		btnrmvskillstoManBadge_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnrmvskillstoManBadge_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrmvskillstoManBadge_1.setBorder(null);
		btnrmvskillstoManBadge_1.setBackground(new Color(204, 204, 255));
		btnrmvskillstoManBadge_1.setBounds(679, 311, 46, 14);
		panelProf.add(btnrmvskillstoManBadge_1);
		
		JButton btnrmvskillstoBadge_1 = new JButton("-");
		btnrmvskillstoBadge_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);

				if (AdminUser.equals("Y")){
					String listval = (String) cbindustry.getSelectedItem();
				  if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
						
						RemoveList RMVfromEmplySkillIndBadge = new RemoveList();
						try {
							RMVfromEmplySkillIndBadge.RMVSkidIndustryEmplyTable(listval);	
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						RemoveList RMVfromSkillTableIndBadge = new RemoveList();
						try {
							RMVfromSkillTableIndBadge.RMVSkidIndustrySkillsTable(listval);
						}catch (SQLException e2) {
							{e2.printStackTrace();}
								
							DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbindustry.getModel();
			        		model.removeAllElements();
			        		IndustryColumn1.setCellEditor(new DefaultCellEditor(cbindustry));}	
					}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}	
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
				}else{JOptionPane.showMessageDialog(null, "admin use only");} 
			}
		});
		btnrmvskillstoBadge_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnrmvskillstoBadge_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrmvskillstoBadge_1.setBorder(null);
		btnrmvskillstoBadge_1.setBackground(new Color(204, 204, 255));
		btnrmvskillstoBadge_1.setBounds(212, 402, 46, 14);
		panelProf.add(btnrmvskillstoBadge_1);
		
		JButton btnrmvskillstoIndBadExpLvl_1 = new JButton("-");
		btnrmvskillstoIndBadExpLvl_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
			
				if (AdminUser.equals("Y")){
					String listval = (String) cbindustrylvl.getSelectedItem();
				  if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
						
						RemoveList RMVfromEmplySkillIndlvl = new RemoveList();
						try {
							RMVfromEmplySkillIndlvl.RMVSkidIndlvlEmplyTable(listval);
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						RemoveList RMVfromSkillTableIndlvl = new RemoveList();
						try {
							RMVfromSkillTableIndlvl.RMVSkidIndlvlSkillsTable(listval);
						}catch (SQLException e2) {
							{e2.printStackTrace();}}
						
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbindustrylvl.getModel();
		        		model.removeAllElements();
					    fillDatacbSkilllvl(cbindustrylvl);
					    
					}else{JOptionPane.showMessageDialog(null, "Please Select a value in the list");}
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
				}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnrmvskillstoIndBadExpLvl_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnrmvskillstoIndBadExpLvl_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrmvskillstoIndBadExpLvl_1.setBorder(null);
		btnrmvskillstoIndBadExpLvl_1.setBackground(new Color(204, 204, 255));
		btnrmvskillstoIndBadExpLvl_1.setBounds(471, 402, 46, 14);
		panelProf.add(btnrmvskillstoIndBadExpLvl_1);
		
		
		JButton btnrmvskillstoPracticeGB_1 = new JButton("-");
		btnrmvskillstoPracticeGB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
			  
			if (AdminUser.equals("Y")){
			String listval = (String) cbpraticezone.getSelectedItem();
				if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
					
					RemoveList RMVfromEmplySkillPracticeZone = new RemoveList();
					try {
						RMVfromEmplySkillPracticeZone.RMVSkidPracZoneEmplyTable(listval);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					RemoveList RMVfromSkillTablePracZone = new RemoveList();
					try {
						RMVfromSkillTablePracZone.RMVSkidPracZoneSkillsTable(listval);
					}catch (SQLException e2) {
						e2.printStackTrace();
					}
					DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbpraticezone.getModel();
	        		model.removeAllElements();
	        		fillDatacbpraticezone(cbpraticezone);
	        		
					}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
				}else{JOptionPane.showMessageDialog(null, "CANCELLED");}
			}else{JOptionPane.showMessageDialog(null, "admin use only");}
			  
			}
		});
		btnrmvskillstoPracticeGB_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnrmvskillstoPracticeGB_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrmvskillstoPracticeGB_1.setBorder(null);
		btnrmvskillstoPracticeGB_1.setBackground(new Color(204, 204, 255));
		btnrmvskillstoPracticeGB_1.setBounds(212, 536, 46, 14);
		panelProf.add(btnrmvskillstoPracticeGB_1);
		
		JButton btnrmvskillstoGBFocusGrp_1 = new JButton("-");
		btnrmvskillstoGBFocusGrp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
					String listval = (String) cbfocusgroup.getSelectedItem();
				  if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
						
						RemoveList RMVfromEmplySkillFocusGrp = new RemoveList();
						try {
							RMVfromEmplySkillFocusGrp.RMVSkidFocusGrpEmplyTable(listval);
						} catch (SQLException e1) {
							e1.printStackTrace();
							}
						
						RemoveList RMVfromSkillTableFocusGrp = new RemoveList();
						try {
							RMVfromSkillTableFocusGrp.RMVSkidFocusGrpSkillsTable(listval);
						}catch (SQLException e2) {
							{e2.printStackTrace();}
							}
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbfocusgroup.getModel();
		        		model.removeAllElements();
		        		fillDatacbfocusgroup(cbfocusgroup);
		        		
					}else{JOptionPane.showMessageDialog(null, "Please Select a value in the list");}	
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
				}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnrmvskillstoGBFocusGrp_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnrmvskillstoGBFocusGrp_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrmvskillstoGBFocusGrp_1.setBorder(null);
		btnrmvskillstoGBFocusGrp_1.setBackground(new Color(204, 204, 255));
		btnrmvskillstoGBFocusGrp_1.setBounds(471, 536, 46, 14);
		panelProf.add(btnrmvskillstoGBFocusGrp_1);
		

		/********************************/
		/**      Business Pane         **/
		/********************************/
		
		String[] BUSYrsitems = new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12","13", "14", "15","16", "17", "18","19", "20", "+20", "+30", "+40"};
		
		
		String[] BUSMnthitems = new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12"};
		
		/*********************************/
		/**      Technical Pane         **/
		/*********************************/
		
		JPanel panelTech = new JPanel();
		panelTech.setBackground(new Color(217, 212, 161));
		
		tabbedpane.add("TechnicalSkill",panelTech);
		panelTech.setLayout(null);
		
		JLabel lblTechYearsExp = new JLabel("I have");
		lblTechYearsExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechYearsExp.setBounds(10, 11, 33, 14);
		panelTech.add(lblTechYearsExp);
		
		String[] TechYrsitems = new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12","13", "14", "15","16", "17", "18","19", "20", "+20", "+30", "+40"};
		JComboBox cbTechYearsExp = new JComboBox(TechYrsitems);
		cbTechYearsExp.setSelectedIndex(-1);
		cbTechYearsExp.setBackground(new Color(255, 255, 255));
		cbTechYearsExp.addItemListener(new ItemListener() {
			String selval;
			
			public void itemStateChanged(ItemEvent e) {
			  	
				selval = String.valueOf(cbTechYearsExp.getSelectedItem());
				
				String usrtxtfield=textField_1.getText();
				textFieldTechMyYears.setText(selval);
				
				try {
				
					String query = "UPDATE profiledata SET TECHYearExp =? WHERE profiledata.username =?";
					
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, selval);
					pst.setString(2, usrtxtfield);
					pst.execute();
				
				} catch (Exception ex) {
					
					JOptionPane.showMessageDialog(null, " exception error Data not Saved");
					ex.printStackTrace();
					}
			}
		});
		cbTechYearsExp.setBounds(115, 8, 40, 22);
		panelTech.add(cbTechYearsExp);
		
		JLabel lblTechMnthExp = new JLabel("Years and");
		lblTechMnthExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechMnthExp.setBounds(157, 11, 64, 14);
		panelTech.add(lblTechMnthExp);
		
		String[] TechMnthitems = new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12"};
		JComboBox cbTechMonthExp = new JComboBox(TechMnthitems);
		cbTechMonthExp.setSelectedIndex(-1);
		cbTechMonthExp.setBackground(new Color(255, 255, 255));
		cbTechMonthExp.addItemListener(new ItemListener() {
			String selval;
			public void itemStateChanged(ItemEvent e) {
				
				selval = String.valueOf(cbTechMonthExp.getSelectedItem());
				String usrtxtfield=textField_1.getText();
				textFieldTechMyMonth.setText(selval);
				
				
				try {
				
					String query = "UPDATE profiledata SET TECHMnthExp =? WHERE profiledata.username =?";
					
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, selval);
					pst.setString(2, usrtxtfield);
					pst.execute();
				
				} catch (Exception ex) {
					
					JOptionPane.showMessageDialog(null, " exception error Data not Saved");
					ex.printStackTrace();
					}
				
			}
		});
		cbTechMonthExp.setBounds(263, 8, 40, 22);
		panelTech.add(cbTechMonthExp);
		
		JLabel lblTechCodeVersion = new JLabel("Technical Code Version Control Tools");
		lblTechCodeVersion.setToolTipText("SkillTools");
		lblTechCodeVersion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechCodeVersion.setBounds(10, 432, 211, 14);
		panelTech.add(lblTechCodeVersion);
		
		JLabel lblTechIndDom = new JLabel("Tech Industry and Domain");
		lblTechIndDom.setToolTipText("SkillIndustry");
		lblTechIndDom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechIndDom.setBounds(10, 74, 145, 14);
		panelTech.add(lblTechIndDom);
		
		JLabel lblTechDevOps = new JLabel("Tech DEVOps CI / CD Tools");
		lblTechDevOps.setToolTipText("SkillTool");
		lblTechDevOps.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechDevOps.setBounds(536, 432, 166, 14);
		panelTech.add(lblTechDevOps);
		
		JLabel lblTechTestMangTools = new JLabel("Tech Test Management Tools");
		lblTechTestMangTools.setToolTipText("SkillTool");
		lblTechTestMangTools.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechTestMangTools.setBounds(536, 253, 172, 14);
		panelTech.add(lblTechTestMangTools);
		
		JLabel lblTechBadges = new JLabel("Technical Badges");
		lblTechBadges.setToolTipText("CertBadge");
		lblTechBadges.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechBadges.setBounds(536, 74, 101, 14);
		panelTech.add(lblTechBadges);
		
		JLabel lblTechToolExp = new JLabel("Technical Tools Experience");
		lblTechToolExp.setToolTipText("SkillTitle");
		lblTechToolExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechToolExp.setBounds(10, 614, 166, 14);
		panelTech.add(lblTechToolExp);
		
		JLabel lblTechOtherAreas = new JLabel("Technical Other Areas of Expertise");
		lblTechOtherAreas.setToolTipText("SkillFocus");
		lblTechOtherAreas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTechOtherAreas.setBounds(10, 253, 190, 14);
		panelTech.add(lblTechOtherAreas);
		
		JLabel lblTechToolExpLang = new JLabel("");
		lblTechToolExpLang.setToolTipText("SkillTool");
		lblTechToolExpLang.setBounds(10, 632, 152, 6);
		panelTech.add(lblTechToolExpLang);
		
		JLabel lblTechToolExpSME = new JLabel("");
		lblTechToolExpSME.setToolTipText("SkillFocus");
		lblTechToolExpSME.setBounds(344, 632, 81, 6);
		panelTech.add(lblTechToolExpSME);
		
		JLabel lblTechToolExpRate = new JLabel("");
		lblTechToolExpRate.setToolTipText("SkillLevel");
		lblTechToolExpRate.setBounds(172, 632, 152, 6);
		panelTech.add(lblTechToolExpRate);
		
		JLabel lblMYTechIndDom = new JLabel("MY Tech Industry and Domain");
		lblMYTechIndDom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMYTechIndDom.setBounds(253, 75, 172, 14);
		panelTech.add(lblMYTechIndDom);
		
		JLabel lblMyTechnicalBadges = new JLabel("MY Technical Badges");
		lblMyTechnicalBadges.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyTechnicalBadges.setBounds(772, 75, 152, 14);
		panelTech.add(lblMyTechnicalBadges);
		
		JLabel lblMyTechnicalOther = new JLabel("MY Technical Other Areas of Expertise");
		lblMyTechnicalOther.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyTechnicalOther.setBounds(253, 254, 226, 14);
		panelTech.add(lblMyTechnicalOther);
		
		JLabel lblMyTechTest = new JLabel("MY Tech Test Management Tools");
		lblMyTechTest.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyTechTest.setBounds(772, 254, 197, 14);
		panelTech.add(lblMyTechTest);
		
		JLabel lblMyTechnicalTools = new JLabel("MY Technical Tools Experience");
		lblMyTechnicalTools.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyTechnicalTools.setBounds(637, 614, 190, 14);
		panelTech.add(lblMyTechnicalTools);
		
		JLabel lblMYTechDevOps = new JLabel("MY Tech DEVOps CI / CD Tools");
		lblMYTechDevOps.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMYTechDevOps.setBounds(772, 433, 197, 14);
		panelTech.add(lblMYTechDevOps);
		
		JLabel lblMyTechnicalCodeVersion = new JLabel("MY Technical Code Version Control Tools");
		lblMyTechnicalCodeVersion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyTechnicalCodeVersion.setBounds(253, 433, 240, 14);
		panelTech.add(lblMyTechnicalCodeVersion);
		
		JScrollPane scrollPane_TechIndDom = new JScrollPane();
		scrollPane_TechIndDom.setBounds(10, 99, 177, 126);
		panelTech.add(scrollPane_TechIndDom);
		
		JList listTechIndustryDomain = new JList();
		scrollPane_TechIndDom.setViewportView(listTechIndustryDomain);
		filllistTechIndustryDomain(listTechIndustryDomain);
		
		JScrollPane scrollPane_MYTechIndDom = new JScrollPane();
		scrollPane_MYTechIndDom.setBounds(246, 99, 233, 126);
		panelTech.add(scrollPane_MYTechIndDom);
		
		JList listMYTechIndustryDomain = new JList(MYTechIndDom);
		scrollPane_MYTechIndDom.setViewportView(listMYTechIndustryDomain);
		
		JScrollPane scrollPane_TechBadge = new JScrollPane();
		scrollPane_TechBadge.setBounds(536, 99, 177, 126);
		panelTech.add(scrollPane_TechBadge);
		
		JList listTechBadgeCert = new JList();
		scrollPane_TechBadge.setViewportView(listTechBadgeCert);
		filllistTechBadgeCert(listTechBadgeCert);
		
		JScrollPane scrollPane_MYTechBadge = new JScrollPane();
		scrollPane_MYTechBadge.setBounds(772, 99, 226, 126);
		panelTech.add(scrollPane_MYTechBadge);
		
		JList listMYTechBadgeCert = new JList(MYTechBadCert);
		scrollPane_MYTechBadge.setViewportView(listMYTechBadgeCert);
		
		JScrollPane scrollPane_TechOthAreaExp = new JScrollPane();
		scrollPane_TechOthAreaExp.setBounds(10, 278, 177, 126);
		panelTech.add(scrollPane_TechOthAreaExp);
		
		JList listTechOtherAreas = new JList();
		scrollPane_TechOthAreaExp.setViewportView(listTechOtherAreas);
		filllistTechOtherAreas(listTechOtherAreas);
		
		JScrollPane scrollPane_TechCodeConTools = new JScrollPane();
		scrollPane_TechCodeConTools.setBounds(10, 460, 177, 130);
		panelTech.add(scrollPane_TechCodeConTools);
		
		JList listTechCodeControlTools = new JList();
		scrollPane_TechCodeConTools.setViewportView(listTechCodeControlTools);
		filllistTechCodeControlTools(listTechCodeControlTools);
		
		JScrollPane scrollPane_TechTestMangTools = new JScrollPane();
		scrollPane_TechTestMangTools.setBounds(536, 278, 177, 126);
		panelTech.add(scrollPane_TechTestMangTools);
		
		JList listTechTestManTools = new JList();
		scrollPane_TechTestMangTools.setViewportView(listTechTestManTools);
		filllistTechTestManTools(listTechTestManTools);
		
		JScrollPane scrollPane_TechDevOpsCDTool = new JScrollPane();
		scrollPane_TechDevOpsCDTool.setBounds(536, 460, 177, 130);
		panelTech.add(scrollPane_TechDevOpsCDTool);
		
		JList listTechDevOpsTools = new JList();
		scrollPane_TechDevOpsCDTool.setViewportView(listTechDevOpsTools);
		filllistTechDevOpsTools(listTechDevOpsTools);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		panelTech.add(layeredPane);
		
		JScrollPane scrollPane_TechToolExp1 = new JScrollPane();
		scrollPane_TechToolExp1.setBounds(10, 639, 548, 41);
		panelTech.add(scrollPane_TechToolExp1);
		
		JScrollPane scrollPane_MYTechOthAreaExp = new JScrollPane();
		scrollPane_MYTechOthAreaExp.setBounds(253, 278, 226, 126);
		panelTech.add(scrollPane_MYTechOthAreaExp);
		
		
		JList listMYTechOtherAreas = new JList(MYTechOthExp);
		scrollPane_MYTechOthAreaExp.setViewportView(listMYTechOtherAreas);
		
		JScrollPane scrollPane_MYTechTestMangTools = new JScrollPane();
		scrollPane_MYTechTestMangTools.setBounds(772, 278, 226, 126);
		panelTech.add(scrollPane_MYTechTestMangTools);
		
		JList listMYTechTestManTools = new JList(MYTechTestManTool);
		scrollPane_MYTechTestMangTools.setViewportView(listMYTechTestManTools);
		
		JScrollPane scrollPane_MYTechCodeConTools = new JScrollPane();
		scrollPane_MYTechCodeConTools.setBounds(253, 460, 226, 130);
		panelTech.add(scrollPane_MYTechCodeConTools);
		
		JList listMYTechCodeControlTools = new JList(MYTechCodeConTool);
		scrollPane_MYTechCodeConTools.setViewportView(listMYTechCodeControlTools);
		
		JScrollPane scrollPane_MYTechDevOpsCDTool = new JScrollPane();
		scrollPane_MYTechDevOpsCDTool.setBounds(772, 457, 226, 133);
		panelTech.add(scrollPane_MYTechDevOpsCDTool);
		
		JList listMYTechDevOpsTools = new JList(MYTechDevOpsTool);
		scrollPane_MYTechDevOpsCDTool.setViewportView(listMYTechDevOpsTools);
		
		tableTechToolExp = new JTable(1, 3);
		scrollPane_TechToolExp1.setViewportView(tableTechToolExp);
		tableTechToolExp.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Technical Tools", "Rate Skill Level", "SME or Trainer"
			}
		));
		
		TableColumn TechToolColumn1 = tableTechToolExp.getColumnModel().getColumn(0);
		
	    TableColumn TechToolColumn2 = tableTechToolExp.getColumnModel().getColumn(1); 
	    
	    TableColumn TechToolColumn3 = tableTechToolExp.getColumnModel().getColumn(2);
	    
	    JComboBox<String> cbtechtool = new JComboBox<>();
	    fillcbtechtool(cbtechtool);
	    TechToolColumn1.setCellEditor(new DefaultCellEditor(cbtechtool));	
	    
	    JComboBox<String> cbrateskill = new JComboBox<>();	    
	    fillcbrateskill(cbrateskill);
	    TechToolColumn2.setCellEditor(new DefaultCellEditor(cbrateskill));
	    
	    JComboBox<String> cbsmetrainer = new JComboBox<>();
	    fillcbsmetrainer(cbsmetrainer);
	    TechToolColumn3.setCellEditor(new DefaultCellEditor(cbsmetrainer));
		
		JScrollPane scrollPane_MYTechToolExp = new JScrollPane();
		scrollPane_MYTechToolExp.setBounds(637, 639, 411, 126);
		panelTech.add(scrollPane_MYTechToolExp);

		JScrollPane scrollPane_MYTechToolExp2 = new JScrollPane();
		scrollPane_MYTechToolExp.setViewportView(scrollPane_MYTechToolExp2);
		
		tableMyTechToolExp = new JTable();
		tableMyTechToolExp.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Technical Tools", "Rate Skill Level", "SME or Trainer"
			}
		));
		scrollPane_MYTechToolExp2.setViewportView(tableMyTechToolExp);
		
		textFieldTechMyYears = new JTextField();
		textFieldTechMyYears.setEditable(false);
		textFieldTechMyYears.setBackground(new Color(217, 212, 161));
		textFieldTechMyYears.setBounds(81, 8, 33, 22);
		panelTech.add(textFieldTechMyYears);
		textFieldTechMyYears.setColumns(10);
		
		textFieldTechMyMonth = new JTextField();
		textFieldTechMyMonth.setEditable(false);
		textFieldTechMyMonth.setBackground(new Color(217, 212, 161));
		textFieldTechMyMonth.setColumns(10);
		textFieldTechMyMonth.setBounds(231, 8, 33, 22);
		panelTech.add(textFieldTechMyMonth);
		
		JButton btnAddTechIndDom = new JButton(">>");
		btnAddTechIndDom.setBorder(null);
		btnAddTechIndDom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String TechIndDomstr1 = (String) listTechIndustryDomain.getSelectedValue();
				if (TechIndDomstr1 != null) {
					if (MYTechIndDom.contains(TechIndDomstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYTechIndDom.addElement(TechIndDomstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVElistMYTechIndDom(TechIndDomstr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");	
			}
		});
		btnAddTechIndDom.setForeground(new Color(128, 0, 0));
		btnAddTechIndDom.setBackground(new Color(217, 212, 161));
		btnAddTechIndDom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddTechIndDom.setBounds(196, 108, 33, 23);
		panelTech.add(btnAddTechIndDom);
		
		JButton btnRemoveTechIndDom = new JButton("<<");
		btnRemoveTechIndDom.setBorder(null);
		btnRemoveTechIndDom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYTechIndDomstr1 = (String) listMYTechIndustryDomain.getSelectedValue();
			int myselectedindex = listMYTechIndustryDomain.getSelectedIndex();
				if (MYTechIndDomstr1 != null) {
					if(listMYTechIndustryDomain.getSelectedIndex()>=0)
					
						MYTechIndDom.remove(listMYTechIndustryDomain.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYTechIndustryDomain(MYTechIndDomstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");	
			}
		});
		btnRemoveTechIndDom.setForeground(new Color(139, 0, 0));
		btnRemoveTechIndDom.setBackground(new Color(217, 212, 161));
		btnRemoveTechIndDom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveTechIndDom.setBounds(197, 133, 24, 23);
		panelTech.add(btnRemoveTechIndDom);
		
		JButton btnAddTechBadgeCert = new JButton(">>");
		btnAddTechBadgeCert.setBorder(null);
		btnAddTechBadgeCert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String TechBadgeCertstr1 = (String) listTechBadgeCert.getSelectedValue();
				if (TechBadgeCertstr1 != null) {
					if (MYTechBadCert.contains(TechBadgeCertstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYTechBadCert.addElement(TechBadgeCertstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVElistMYTechBadgeCert(TechBadgeCertstr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");	
			}
		});
		btnAddTechBadgeCert.setForeground(new Color(139, 0, 0));
		btnAddTechBadgeCert.setBackground(new Color(217, 212, 161));
		btnAddTechBadgeCert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddTechBadgeCert.setBounds(723, 108, 33, 23);
		panelTech.add(btnAddTechBadgeCert);
		
		JButton btnRemoveTechBadgeCert = new JButton("<<");
		btnRemoveTechBadgeCert.setBorder(null);
		btnRemoveTechBadgeCert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYTechBadgeCertstr1 = (String) listMYTechBadgeCert.getSelectedValue();
			int myselectedindex = listMYTechBadgeCert.getSelectedIndex();
				if (MYTechBadgeCertstr1 != null) {
					if(listMYTechBadgeCert.getSelectedIndex()>=0)
					
						MYTechBadCert.remove(listMYTechBadgeCert.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYTechBadgeCert(MYTechBadgeCertstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}
		});
		btnRemoveTechBadgeCert.setForeground(new Color(139, 0, 0));
		btnRemoveTechBadgeCert.setBackground(new Color(217, 212, 161));
		btnRemoveTechBadgeCert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveTechBadgeCert.setBounds(723, 133, 29, 23);
		panelTech.add(btnRemoveTechBadgeCert);
		
		JButton btnAddTechToolExp = new JButton(">>");
		btnAddTechToolExp.setBorder(null);
		btnAddTechToolExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {						
					int rowIndex = 0;						
					int vColIndex = 0;
					int vColIndex2 = 0;
					
					// This is the <tool> row 0 col 0						
					Object o = tableTechToolExp.getValueAt(rowIndex, vColIndex);						
					// This is the <Rate> row 0 col 1 						
					vColIndex = (vColIndex +1);						
					Object ob = tableTechToolExp.getValueAt(rowIndex, vColIndex);						
					// This is the <SME or Trainer> row 0 col 2 
					vColIndex2 = (vColIndex +1);
					Object ob1 = tableTechToolExp.getValueAt(rowIndex, vColIndex2);
	    			 
					
					if ((o != null)&&(ob !=  null)&&(ob1 != null)) {
						String Str1 = o.toString();						
						String Str2 = ob.toString();
						String Str3 = ob1.toString();
						//This is add a row	
						AddRowTechTool(Str1,Str2,Str3);		
					}else {
						
						JOptionPane.showMessageDialog(null, "please enter a value for TechTool and its corresponding Rate and SME/Trainer!");
					}
						
					}catch (Exception ez) {							
					ez.printStackTrace();
					
					} 		
			}
		});
		btnAddTechToolExp.setForeground(new Color(139, 0, 0));
		btnAddTechToolExp.setBackground(new Color(217, 212, 161));
		btnAddTechToolExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddTechToolExp.setBounds(568, 648, 64, 23);
		panelTech.add(btnAddTechToolExp);
		
		JButton btnRemoveTechToolExp = new JButton("<<");
		btnRemoveTechToolExp.setBorder(null);
		btnRemoveTechToolExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				if(tableMyTechToolExp.getSelectedRow()>=0) {
	                
					int selrow = (tableMyTechToolExp.getSelectedRow());
					String str1 = ((DefaultTableModel)tableMyTechToolExp.getModel()).getValueAt(selrow, 0).toString();
					String str2 = ((DefaultTableModel)tableMyTechToolExp.getModel()).getValueAt(selrow, 1).toString();
					String str3 = ((DefaultTableModel)tableMyTechToolExp.getModel()).getValueAt(selrow, 2).toString();
					
					// Remove from the LIST
					((DefaultTableModel)tableMyTechToolExp.getModel()).removeRow(selrow);
				
					//Remove from DB
					
					String tempusrname = textField_1.getText();
					
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVEMyTechToolExpTable(str1,str2,str3, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		
		btnRemoveTechToolExp.setForeground(new Color(139, 0, 0));
		btnRemoveTechToolExp.setBackground(new Color(217, 212, 161));
		btnRemoveTechToolExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveTechToolExp.setBounds(568, 674, 64, 23);
		panelTech.add(btnRemoveTechToolExp);
		
		JButton btnAddTechOtherExp = new JButton(">>");
		btnAddTechOtherExp.setBorder(null);
		btnAddTechOtherExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String TechOthExpstr1 = (String) listTechOtherAreas.getSelectedValue();
				if (TechOthExpstr1 != null) {
					if (MYTechOthExp.contains(TechOthExpstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYTechOthExp.addElement(TechOthExpstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVElistMYTechOthExp(TechOthExpstr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		btnAddTechOtherExp.setForeground(new Color(139, 0, 0));
		btnAddTechOtherExp.setBackground(new Color(217, 212, 161));
		btnAddTechOtherExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddTechOtherExp.setBounds(197, 297, 24, 23);
		panelTech.add(btnAddTechOtherExp);
		
		JButton btnRemoveTechOtherExp = new JButton("<<");
		btnRemoveTechOtherExp.setBorder(null);
		btnRemoveTechOtherExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYTechOtherExpstr1 = (String) listMYTechOtherAreas.getSelectedValue();
			int myselectedindex = listMYTechOtherAreas.getSelectedIndex();
				if (MYTechOtherExpstr1 != null) {
					if(listMYTechOtherAreas.getSelectedIndex()>=0)
					
						MYTechOthExp.remove(listMYTechOtherAreas.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYTechOtherExp(MYTechOtherExpstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");	
			}
		});
		btnRemoveTechOtherExp.setForeground(new Color(139, 0, 0));
		btnRemoveTechOtherExp.setBackground(new Color(217, 212, 161));
		btnRemoveTechOtherExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveTechOtherExp.setBounds(197, 320, 23, 23);
		panelTech.add(btnRemoveTechOtherExp);
		
		JButton btnAddTechMgmtTool = new JButton(">>");
		btnAddTechMgmtTool.setBorder(null);
		btnAddTechMgmtTool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String TechTestManToolstr1 = (String) listTechTestManTools.getSelectedValue();
				if (TechTestManToolstr1 != null) {
					if (MYTechTestManTool.contains(TechTestManToolstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYTechTestManTool.addElement(TechTestManToolstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVElistMYTechMgmtTool(TechTestManToolstr1, tempusrname);
						}	
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		btnAddTechMgmtTool.setForeground(new Color(139, 0, 0));
		btnAddTechMgmtTool.setBackground(new Color(217, 212, 161));
		btnAddTechMgmtTool.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddTechMgmtTool.setBounds(723, 297, 33, 23);
		panelTech.add(btnAddTechMgmtTool);
		
		JButton btnRemoveTechMgmtTool = new JButton("<<");
		btnRemoveTechMgmtTool.setBorder(null);
		btnRemoveTechMgmtTool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYTechMgmtToolstr1 = (String) listMYTechTestManTools.getSelectedValue();
			int myselectedindex = listMYTechTestManTools.getSelectedIndex();
			if (MYTechMgmtToolstr1 != null) {
					if(listMYTechTestManTools.getSelectedIndex()>=0)
					
						MYTechTestManTool.remove(listMYTechTestManTools.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYTechMgmtTool(MYTechMgmtToolstr1, tempusrname);
			}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}
		});
		btnRemoveTechMgmtTool.setForeground(new Color(139, 0, 0));
		btnRemoveTechMgmtTool.setBackground(new Color(217, 212, 161));
		btnRemoveTechMgmtTool.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveTechMgmtTool.setBounds(723, 320, 29, 23);
		panelTech.add(btnRemoveTechMgmtTool);
		
		JButton btnAddTechCodeVerControl = new JButton(">>");
		btnAddTechCodeVerControl.setBorder(null);
		btnAddTechCodeVerControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String TechCodeVConstr1 = (String) listTechCodeControlTools.getSelectedValue();
				if (TechCodeVConstr1 != null) {
					if (MYTechCodeConTool.contains(TechCodeVConstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYTechCodeConTool.addElement(TechCodeVConstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVEmylistMYTechCodeConTool(TechCodeVConstr1, tempusrname);
						}	
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");	
			}
		});
		btnAddTechCodeVerControl.setForeground(new Color(139, 0, 0));
		btnAddTechCodeVerControl.setBackground(new Color(217, 212, 161));
		btnAddTechCodeVerControl.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddTechCodeVerControl.setBounds(197, 471, 24, 23);
		panelTech.add(btnAddTechCodeVerControl);
		
		JButton btnRemoveTechCodeVerControl = new JButton("<<");
		btnRemoveTechCodeVerControl.setBorder(null);
		btnRemoveTechCodeVerControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYTechCodeConstr1 = (String) listMYTechCodeControlTools.getSelectedValue();
			int myselectedindex = listMYTechCodeControlTools.getSelectedIndex();
				if (MYTechCodeConstr1 != null) {
					if(listMYTechCodeControlTools.getSelectedIndex()>=0)
					
						MYTechCodeConTool.remove(listMYTechCodeControlTools.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYTechCodeVerControl(MYTechCodeConstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}
		});
		btnRemoveTechCodeVerControl.setForeground(new Color(139, 0, 0));
		btnRemoveTechCodeVerControl.setBackground(new Color(217, 212, 161));
		btnRemoveTechCodeVerControl.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveTechCodeVerControl.setBounds(197, 496, 24, 23);
		panelTech.add(btnRemoveTechCodeVerControl);
		
		JButton btnAddTechDevOpsTool = new JButton(">>");
		btnAddTechDevOpsTool.setBorder(null);
		btnAddTechDevOpsTool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String TechDevOpsToolstr1 = (String) listTechDevOpsTools.getSelectedValue();
				if (TechDevOpsToolstr1 != null) {
					if (MYTechDevOpsTool.contains(TechDevOpsToolstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYTechDevOpsTool.addElement(TechDevOpsToolstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVEmylistTechDevOps(TechDevOpsToolstr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");	
			}
		});
		btnAddTechDevOpsTool.setForeground(new Color(139, 0, 0));
		btnAddTechDevOpsTool.setBackground(new Color(217, 212, 161));
		btnAddTechDevOpsTool.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddTechDevOpsTool.setBounds(723, 471, 24, 23);
		panelTech.add(btnAddTechDevOpsTool);
		
		JButton btnRemoveTechDevOpsTool = new JButton("<<");
		btnRemoveTechDevOpsTool.setBorder(null);
		btnRemoveTechDevOpsTool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYTechDevOpsstr1 = (String) listMYTechDevOpsTools.getSelectedValue();
			int myselectedindex = listMYTechDevOpsTools.getSelectedIndex();
			if (MYTechDevOpsstr1 != null) {
					if(listMYTechDevOpsTools.getSelectedIndex()>=0)
					
						MYTechDevOpsTool.remove(listMYTechDevOpsTools.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYTechDevOpsTool(MYTechDevOpsstr1, tempusrname);
			}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}
		});
		btnRemoveTechDevOpsTool.setForeground(new Color(139, 0, 0));
		btnRemoveTechDevOpsTool.setBackground(new Color(217, 212, 161));
		btnRemoveTechDevOpsTool.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveTechDevOpsTool.setBounds(723, 496, 24, 23);
		panelTech.add(btnRemoveTechDevOpsTool);
		
		JButton btnADDSkillsTechIndDom = new JButton("+");
		btnADDSkillsTechIndDom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillTechIndDom = new AddValueToList();
					try {
						listval = skillTechIndDom.add_SkillTechIndDom();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					DefaultListModel listModel = (DefaultListModel) listTechIndustryDomain.getModel();
			        listModel.removeAllElements();
			        filllistTechIndustryDomain(listTechIndustryDomain);
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
			}
		});
		btnADDSkillsTechIndDom.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillsTechIndDom.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillsTechIndDom.setBorder(null);
		btnADDSkillsTechIndDom.setBackground(new Color(217, 212, 161));
		btnADDSkillsTechIndDom.setBounds(63, 228, 46, 14);
		panelTech.add(btnADDSkillsTechIndDom);
		
		JButton btnADDSkillsTechBadge = new JButton("+");
		btnADDSkillsTechBadge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillTechBadge = new AddValueToList();
					try {
						listval = skillTechBadge.add_SkillTechBadge();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					DefaultListModel listModel = (DefaultListModel) listTechBadgeCert.getModel();
			        listModel.removeAllElements();
			        filllistTechBadgeCert(listTechBadgeCert);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
				
			}
		});
		btnADDSkillsTechBadge.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillsTechBadge.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillsTechBadge.setBorder(null);
		btnADDSkillsTechBadge.setBackground(new Color(217, 212, 161));
		btnADDSkillsTechBadge.setBounds(605, 229, 46, 14);
		panelTech.add(btnADDSkillsTechBadge);
		
		JButton btnADDSkillsTechOthAreaExpertise = new JButton("+");
		btnADDSkillsTechOthAreaExpertise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (AdminUser.equals("Y")){
					
					AddValueToList skillTechOthAreaExp = new AddValueToList();
					try {
						listval = skillTechOthAreaExp.add_SkillTechOthAreaExpertise();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listTechOtherAreas = new JList();
					//scrollPane_TechOthAreaExp.setViewportView(listTechOtherAreas);
					
					DefaultListModel listModel = (DefaultListModel) listTechOtherAreas.getModel();
			        listModel.removeAllElements();
			        filllistTechOtherAreas(listTechOtherAreas);	
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
			}
		});
		btnADDSkillsTechOthAreaExpertise.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillsTechOthAreaExpertise.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillsTechOthAreaExpertise.setBorder(null);
		btnADDSkillsTechOthAreaExpertise.setBackground(new Color(217, 212, 161));
		btnADDSkillsTechOthAreaExpertise.setBounds(63, 407, 46, 14);
		panelTech.add(btnADDSkillsTechOthAreaExpertise);
		
		JButton btnADDSkillsTechTestMangTools = new JButton("+");
		btnADDSkillsTechTestMangTools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillTechTestManTools = new AddValueToList();
					try {
						listval = skillTechTestManTools.add_SkillTechTestManTools();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listTechTestManTools = new JList();
					//scrollPane_TechTestMangTools.setViewportView(listTechTestManTools);
					
					DefaultListModel listModel = (DefaultListModel) listTechTestManTools.getModel();
			        listModel.removeAllElements();
			        filllistTechTestManTools(listTechTestManTools);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}			
			}
		});
		btnADDSkillsTechTestMangTools.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillsTechTestMangTools.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillsTechTestMangTools.setBorder(null);
		btnADDSkillsTechTestMangTools.setBackground(new Color(217, 212, 161));
		btnADDSkillsTechTestMangTools.setBounds(605, 408, 46, 14);
		panelTech.add(btnADDSkillsTechTestMangTools);
		
		JButton btnADDSkillsTechCodeVConTool = new JButton("+");
		btnADDSkillsTechCodeVConTool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillTechCodeVConTool = new AddValueToList();
					try {
						listval = skillTechCodeVConTool.add_SkillTechCodeConTools();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listTechCodeControlTools = new JList();
					//scrollPane_TechCodeConTools.setViewportView(listTechCodeControlTools);
					
					DefaultListModel listModel = (DefaultListModel) listTechCodeControlTools.getModel();
			        listModel.removeAllElements();
			        filllistTechCodeControlTools(listTechCodeControlTools);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}		
			}
		});
		btnADDSkillsTechCodeVConTool.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillsTechCodeVConTool.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillsTechCodeVConTool.setBorder(null);
		btnADDSkillsTechCodeVConTool.setBackground(new Color(217, 212, 161));
		btnADDSkillsTechCodeVConTool.setBounds(63, 589, 46, 14);
		panelTech.add(btnADDSkillsTechCodeVConTool);
		
		JButton btnADDSkillsTechDevOpsCDTool = new JButton("+");
		btnADDSkillsTechDevOpsCDTool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillTechDevOpsCDTool = new AddValueToList();
					try {
						listval = skillTechDevOpsCDTool.add_SkillTechDevOpsCDTool();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listTechDevOpsTools = new JList();
					//scrollPane_TechDevOpsCDTool.setViewportView(listTechDevOpsTools);
					
					DefaultListModel listModel = (DefaultListModel) listTechDevOpsTools.getModel();
			        listModel.removeAllElements();
			        filllistTechDevOpsTools(listTechDevOpsTools);
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}		
				
			}
		});
		btnADDSkillsTechDevOpsCDTool.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillsTechDevOpsCDTool.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillsTechDevOpsCDTool.setBorder(null);
		btnADDSkillsTechDevOpsCDTool.setBackground(new Color(217, 212, 161));
		btnADDSkillsTechDevOpsCDTool.setBounds(591, 590, 46, 14);
		panelTech.add(btnADDSkillsTechDevOpsCDTool);
		
		JButton btnADDSkillsTableTechExpTools = new JButton("+");
		btnADDSkillsTableTechExpTools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skilltechtool = new AddValueToList();
					try {
						listval = skilltechtool.add_SkillTableTechExpTools();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbtechtool.getModel();
	        		model.removeAllElements();	
	        		fillcbtechtool(cbtechtool);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
				
			}
		});
		btnADDSkillsTableTechExpTools.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillsTableTechExpTools.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillsTableTechExpTools.setBorder(null);
		btnADDSkillsTableTechExpTools.setBackground(new Color(217, 212, 161));
		btnADDSkillsTableTechExpTools.setBounds(100, 683, 46, 14);
		panelTech.add(btnADDSkillsTableTechExpTools);
		
		JButton btnADDTSkillsableRateSkillLvl = new JButton("+");
		btnADDTSkillsableRateSkillLvl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList TableTechSkillLevel = new AddValueToList();
					try {
						listval = TableTechSkillLevel.add_SkillTableTechRateLvl();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbrateskill.getModel();
	        		model.removeAllElements();	
				    fillcbrateskill(cbrateskill);
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
				
			}
		});
		btnADDTSkillsableRateSkillLvl.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDTSkillsableRateSkillLvl.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDTSkillsableRateSkillLvl.setBorder(null);
		btnADDTSkillsableRateSkillLvl.setBackground(new Color(217, 212, 161));
		btnADDTSkillsableRateSkillLvl.setBounds(275, 683, 46, 14);
		panelTech.add(btnADDTSkillsableRateSkillLvl);
		
		JButton btnSkillsADDTableSMETrainer = new JButton("+");
		btnSkillsADDTableSMETrainer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList TableTechSkillFocus = new AddValueToList();
					try {
						listval = TableTechSkillFocus.add_SkillTableTechSMETrain();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbsmetrainer.getModel();
	        		model.removeAllElements();
				    fillcbsmetrainer(cbsmetrainer);

				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}
				
			}
		});
		btnSkillsADDTableSMETrainer.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSkillsADDTableSMETrainer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSkillsADDTableSMETrainer.setBorder(null);
		btnSkillsADDTableSMETrainer.setBackground(new Color(217, 212, 161));
		btnSkillsADDTableSMETrainer.setBounds(471, 683, 46, 14);
		panelTech.add(btnSkillsADDTableSMETrainer);
		
		JButton btnRMVSkillsTechIndDom_1 = new JButton("-");
		btnRMVSkillsTechIndDom_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listTechIndustryDomain.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mytechIndDom = new LookupSkill();
	    				int TechIndDomid =  (int) mytechIndDom.lookuplistMYTechIndDom(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(TechIndDomid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			
	    			DefaultListModel listModel = (DefaultListModel) listTechIndustryDomain.getModel();
			        listModel.removeAllElements();
			        filllistTechIndustryDomain(listTechIndustryDomain);
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRMVSkillsTechIndDom_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillsTechIndDom_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTechIndDom_1.setBorder(null);
		btnRMVSkillsTechIndDom_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTechIndDom_1.setBounds(100, 228, 46, 14);
		panelTech.add(btnRMVSkillsTechIndDom_1);
		
		JButton btnRMVSkillsTechOthAreaExpertise_1 = new JButton("-");
		btnRMVSkillsTechOthAreaExpertise_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
	
				if (AdminUser.equals("Y")){
	    			String selval = (String) listTechOtherAreas.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mytechOthExp = new LookupSkill();
	    				int TechOthExpid = (int) mytechOthExp.lookuplistMYTechOthExp(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(TechOthExpid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			DefaultListModel listModel = (DefaultListModel) listTechOtherAreas.getModel();
			        listModel.removeAllElements();
			        filllistTechOtherAreas(listTechOtherAreas); 
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRMVSkillsTechOthAreaExpertise_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillsTechOthAreaExpertise_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTechOthAreaExpertise_1.setBorder(null);
		btnRMVSkillsTechOthAreaExpertise_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTechOthAreaExpertise_1.setBounds(109, 407, 46, 14);
		panelTech.add(btnRMVSkillsTechOthAreaExpertise_1);
		
		JButton btnRMVSkillsTechCodeVConTool_1 = new JButton("-");
		btnRMVSkillsTechCodeVConTool_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
	    			String selval = (String) listTechCodeControlTools.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mytechCodeConTool = new LookupSkill();
	    				int TechConToolid = (int) mytechCodeConTool.lookuplistMYTechCodeConTool(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(TechConToolid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			DefaultListModel listModel = (DefaultListModel) listTechCodeControlTools.getModel();
			        listModel.removeAllElements();
			        filllistTechCodeControlTools(listTechCodeControlTools);
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRMVSkillsTechCodeVConTool_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillsTechCodeVConTool_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTechCodeVConTool_1.setBorder(null);
		btnRMVSkillsTechCodeVConTool_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTechCodeVConTool_1.setBounds(100, 589, 46, 14);
		panelTech.add(btnRMVSkillsTechCodeVConTool_1);
		
		JButton btnRMVSkillsTechBadge_1 = new JButton("-");
		btnRMVSkillsTechBadge_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
	    			String selval = (String) listTechBadgeCert.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mytechBadgeCert = new LookupSkill();
	    				int TechBadCertid = (int) mytechBadgeCert.lookuplistMYTechBadgeCert(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(TechBadCertid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			DefaultListModel listModel = (DefaultListModel) listTechBadgeCert.getModel();
			        listModel.removeAllElements();
			        filllistTechBadgeCert(listTechBadgeCert);
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRMVSkillsTechBadge_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillsTechBadge_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTechBadge_1.setBorder(null);
		btnRMVSkillsTechBadge_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTechBadge_1.setBounds(648, 228, 46, 14);
		panelTech.add(btnRMVSkillsTechBadge_1);
		
		JButton btnRMVSkillsTechTestMangTools_1 = new JButton("-");
		btnRMVSkillsTechTestMangTools_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
	
				if (AdminUser.equals("Y")){
	    			String selval = (String) listTechTestManTools.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mytechMgmtTool = new LookupSkill();
	    				int TechMgmtToolid = (int) mytechMgmtTool.lookuplistMYTechTestManTool(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(TechMgmtToolid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			DefaultListModel listModel = (DefaultListModel) listTechTestManTools.getModel();
			        listModel.removeAllElements();
			        filllistTechTestManTools(listTechTestManTools); 
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillsTechTestMangTools_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillsTechTestMangTools_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTechTestMangTools_1.setBorder(null);
		btnRMVSkillsTechTestMangTools_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTechTestMangTools_1.setBounds(648, 407, 46, 14);
		panelTech.add(btnRMVSkillsTechTestMangTools_1);
		
		JButton btnRMVSkillsTechDevOpsCDTool_1 = new JButton("-");
		btnRMVSkillsTechDevOpsCDTool_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listTechDevOpsTools.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mytechDevOps = new LookupSkill();
	    				int TechDevOpsid = (int) mytechDevOps.lookuplistMYTechDevOps(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(TechDevOpsid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    			DefaultListModel listModel = (DefaultListModel) listTechDevOpsTools.getModel();
			        listModel.removeAllElements();
	    			filllistTechDevOpsTools(listTechDevOpsTools); 
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRMVSkillsTechDevOpsCDTool_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillsTechDevOpsCDTool_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTechDevOpsCDTool_1.setBorder(null);
		btnRMVSkillsTechDevOpsCDTool_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTechDevOpsCDTool_1.setBounds(637, 589, 46, 14);
		panelTech.add(btnRMVSkillsTechDevOpsCDTool_1);
		
		JButton btnRMVSkillsTableTechExpTools_1 = new JButton("-");
		btnRMVSkillsTableTechExpTools_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
					String listval = (String) cbtechtool.getSelectedItem();
				  if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
						
						RemoveList RMVfromEmplySkillTechExpTool = new RemoveList();
						try {
							RMVfromEmplySkillTechExpTool.RMVTechExpToolEmplyTable(listval);	
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						RemoveList RMVfromSkillTableIndBadge = new RemoveList();
						try {
							RMVfromSkillTableIndBadge.RMVTechExpToolSkillsTable(listval);
						}catch (SQLException e2) {
							{e2.printStackTrace();}
			        			
							DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbtechtool.getModel();
			        		model.removeAllElements();
			        		fillcbtechtool(cbtechtool);
					}	
					}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
				}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRMVSkillsTableTechExpTools_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillsTableTechExpTools_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTableTechExpTools_1.setBorder(null);
		btnRMVSkillsTableTechExpTools_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTableTechExpTools_1.setBounds(142, 683, 46, 14);
		panelTech.add(btnRMVSkillsTableTechExpTools_1);
		
		JButton btnRMVSkillsTableRateSkillLvl_1 = new JButton("-");
		btnRMVSkillsTableRateSkillLvl_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
					String listval = (String) cbrateskill.getSelectedItem();
				  if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
						
						RemoveList RMVfromEmplySkillRateSkill = new RemoveList();
						try {
							RMVfromEmplySkillRateSkill.RMVTechRatelvlEmplyTable(listval);	
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						RemoveList RMVfromSkillTableRateSkill = new RemoveList();
						try {
							RMVfromSkillTableRateSkill.RMVTechRatelvlSkillsTable(listval);
						}catch (SQLException e2) {
							{e2.printStackTrace();}
								
							DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbrateskill.getModel();
			        		model.removeAllElements();
			        		fillcbrateskill(cbrateskill);
					}	
					}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
				}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillsTableRateSkillLvl_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillsTableRateSkillLvl_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTableRateSkillLvl_1.setBorder(null);
		btnRMVSkillsTableRateSkillLvl_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTableRateSkillLvl_1.setBounds(318, 683, 46, 14);
		panelTech.add(btnRMVSkillsTableRateSkillLvl_1);
		
		JButton btnRMVSkillsTableSMETrainer_1 = new JButton("-");
		btnRMVSkillsTableSMETrainer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
					String listval = (String) cbsmetrainer.getSelectedItem();
				  if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
						
						RemoveList RMVfromEmplySkillSMETrain = new RemoveList();
						try {
							RMVfromEmplySkillSMETrain.RMVTechSMETrainEmplyTable(listval);	
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						RemoveList RMVfromSkillTableSMETrain = new RemoveList();
						try {
							RMVfromSkillTableSMETrain.RMVTechSMETrainSkillsTable(listval);
						}catch (SQLException e2) {
							{e2.printStackTrace();}
								
							DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbsmetrainer.getModel();
			        		model.removeAllElements();
			        		fillcbsmetrainer(cbsmetrainer);
					}	
					}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
				}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillsTableSMETrainer_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillsTableSMETrainer_1.setBorder(null);
		btnRMVSkillsTableSMETrainer_1.setBackground(new Color(217, 212, 161));
		btnRMVSkillsTableSMETrainer_1.setBounds(512, 683, 46, 14);
		panelTech.add(btnRMVSkillsTableSMETrainer_1);
		
		JLabel lblNewLabel_4 = new JLabel("Months of Experience with  Technical Skills");
		lblNewLabel_4.setBounds(303, 12, 233, 14);
		panelTech.add(lblNewLabel_4);
	
		/**********************************/
		/**      Functional Pane         **/
		/**********************************/
				String[] FUNYrsitems = new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12","13", "14", "15","16", "17", "18","19", "20", "+20", "+30", "+40"};
				String[] FUNMnthitems = new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12"};
		
	/**********************************/
	/**      Management Pane         **/
	/**********************************/
				
						JPanel panelBus = new JPanel();
						panelBus.setBackground(new Color(189, 205, 139));
						tabbedpane.add("BusinessSkill",panelBus);
						panelBus.setLayout(null);
						
						JComboBox cbBAYearsExp_1 = new JComboBox(BUSYrsitems);
						cbBAYearsExp_1.setSelectedIndex(-1);
						cbBAYearsExp_1.setBackground(new Color(255, 255, 255));
						cbBAYearsExp_1.addActionListener(new ActionListener() {
							String selval;
							public void actionPerformed(ActionEvent e) {
								
								String selval = String.valueOf(cbBAYearsExp_1.getSelectedItem());
								String yrs = (String) cbBAYearsExp_1.getSelectedItem();
								String usrtxtfield=textField_1.getText();
								
								textFieldBAMyYears.setText(selval);
								
								try {
									
									String query = "UPDATE profiledata SET BAYearExp=? WHERE profiledata.username =?";
									
									PreparedStatement pst=conn.prepareStatement(query);
									pst.setString(1, selval);
									pst.setString(2, usrtxtfield);
									pst.execute();
								
								} catch (Exception ex) {
									
									JOptionPane.showMessageDialog(null, " exception error Data not Saved");
									ex.printStackTrace();
									}
							
							}
						});
						cbBAYearsExp_1.setBounds(113, 11, 38, 22);
						panelBus.add(cbBAYearsExp_1);
						
						JComboBox cbBAMonthExp_1 = new JComboBox(BUSMnthitems);
						cbBAMonthExp_1.setSelectedIndex(-1);
						cbBAMonthExp_1.setBackground(new Color(255, 255, 255));
						cbBAMonthExp_1.addItemListener(new ItemListener() {
							String selval;
								public void itemStateChanged(ItemEvent e) {
									
									selval = String.valueOf(cbBAMonthExp_1.getSelectedItem());
									String yrs = (String) cbBAMonthExp_1.getSelectedItem();
									String usrtxtfield=textField_1.getText();
									textFieldBAMyMonths.setText(selval);
									
									try {
									
										String query = "UPDATE profiledata SET BAMnthExp=? WHERE profiledata.username =?";
										
										PreparedStatement pst=conn.prepareStatement(query);
										pst.setString(1, selval);
										pst.setString(2, usrtxtfield);
										pst.execute();
									
									} catch (Exception ex) {
										
										JOptionPane.showMessageDialog(null, " exception error Data not Saved");
										ex.printStackTrace();
										}
							}
						});
						cbBAMonthExp_1.setBounds(248, 11, 38, 22);
						cbBAMonthExp_1.setSelectedIndex(-1);
						panelBus.add(cbBAMonthExp_1);
						
						JLabel lblBASkillsBadge = new JLabel("BA Skills Badge");
						lblBASkillsBadge.setToolTipText("CertBadge");
						lblBASkillsBadge.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblBASkillsBadge.setBounds(10, 477, 87, 14);
						panelBus.add(lblBASkillsBadge);
						
						JLabel lblBAYearsExperience = new JLabel("I have");
						lblBAYearsExperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblBAYearsExperience.setBounds(28, 14, 46, 14);
						panelBus.add(lblBAYearsExperience);
						
						JLabel lblBACertAcheived = new JLabel("Certifications Acheived");
						lblBACertAcheived.setToolTipText("CertBadge");
						lblBACertAcheived.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblBACertAcheived.setBounds(487, 277, 130, 14);
						panelBus.add(lblBACertAcheived);
						
						JLabel lblBAToolSoftware = new JLabel("Tools/Software Worked On");
						lblBAToolSoftware.setToolTipText("SkillTool");
						lblBAToolSoftware.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblBAToolSoftware.setBounds(10, 278, 182, 14);
						panelBus.add(lblBAToolSoftware);
						
						JLabel lblBAIndustryDomain = new JLabel("BA Industry and Domain");
						lblBAIndustryDomain.setToolTipText("SkillIndustry");
						lblBAIndustryDomain.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblBAIndustryDomain.setBounds(490, 74, 138, 14);
						panelBus.add(lblBAIndustryDomain);
						
						JLabel lblBARoles = new JLabel("BA Roles");
						lblBARoles.setToolTipText("SkillFocus");
						lblBARoles.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblBARoles.setBounds(10, 73, 64, 14);
						panelBus.add(lblBARoles);
						
						JLabel lblMyBaRoles = new JLabel("MY BA Roles");
						lblMyBaRoles.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblMyBaRoles.setBounds(278, 73, 138, 14);
						panelBus.add(lblMyBaRoles);
						
						JLabel lblMyBaIndustry = new JLabel("MY BA Industry and Domain");
						lblMyBaIndustry.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblMyBaIndustry.setBounds(766, 74, 257, 14);
						panelBus.add(lblMyBaIndustry);
						
						JLabel lblMYBAToolSoftware = new JLabel("MY Tools/Software Worked On");
						lblMYBAToolSoftware.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblMYBAToolSoftware.setBounds(273, 277, 182, 14);
						panelBus.add(lblMYBAToolSoftware);
						
						JLabel lblMyBACertificationsAcheived = new JLabel("MY Certifications Acheived");
						lblMyBACertificationsAcheived.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblMyBACertificationsAcheived.setBounds(767, 277, 154, 14);
						panelBus.add(lblMyBACertificationsAcheived);
						
						JLabel lblMYBASkillsBadge_1 = new JLabel("MY BA Skills Badge");
						lblMYBASkillsBadge_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblMYBASkillsBadge_1.setBounds(278, 477, 116, 14);
						panelBus.add(lblMYBASkillsBadge_1);
						
						JLabel lblBAMnthExperience_1 = new JLabel("Years and");
						lblBAMnthExperience_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblBAMnthExperience_1.setBounds(151, 14, 64, 14);
						panelBus.add(lblBAMnthExperience_1);
						
						JScrollPane scrollPaneBARoles = new JScrollPane();
						scrollPaneBARoles.setBounds(10, 98, 205, 145);
						panelBus.add(scrollPaneBARoles);
						
						JList listBARoles = new JList();
						scrollPaneBARoles.setViewportView(listBARoles);
						filllistBARoles(listBARoles);
						
						JScrollPane scrollPaneMYBARoles = new JScrollPane();
						scrollPaneMYBARoles.setBounds(273, 98, 173, 145);
						panelBus.add(scrollPaneMYBARoles);
						
						JList listMYBARoles_1 = new JList(MYBARolls);
						scrollPaneMYBARoles.setViewportView(listMYBARoles_1);
						
						JScrollPane scrollPaneBAToolsSoftware = new JScrollPane();
						scrollPaneBAToolsSoftware.setBounds(10, 304, 205, 145);
						panelBus.add(scrollPaneBAToolsSoftware);
						
						JList listBAToolsSoftware = new JList();
						scrollPaneBAToolsSoftware.setViewportView(listBAToolsSoftware);
						filllistBAToolsSoftware(listBAToolsSoftware);
						
						JScrollPane scrollPaneMYBAToolsSoftware = new JScrollPane();
						scrollPaneMYBAToolsSoftware.setBounds(273, 304, 173, 145);
						panelBus.add(scrollPaneMYBAToolsSoftware);
						
		JList listMYBAToolsSoftware_1_1 = new JList(MYBAToolSoft);
		scrollPaneMYBAToolsSoftware.setViewportView(listMYBAToolsSoftware_1_1);
		
		JScrollPane scrollPaneBAIndustryDomain = new JScrollPane();
		scrollPaneBAIndustryDomain.setBounds(490, 99, 219, 145);
		panelBus.add(scrollPaneBAIndustryDomain);
		
		JList listBAIndustryDomain = new JList();
		scrollPaneBAIndustryDomain.setViewportView(listBAIndustryDomain);
		filllistBAIndustryDomain(listBAIndustryDomain);
		
		JScrollPane scrollPaneMYBAIndustryDomain = new JScrollPane();
		scrollPaneMYBAIndustryDomain.setBounds(762, 99, 261, 145);
		panelBus.add(scrollPaneMYBAIndustryDomain);
		
		JList listMYBAIndustryDomain_1 = new JList(MyBaIndDom);
		scrollPaneMYBAIndustryDomain.setViewportView(listMYBAIndustryDomain_1);
		
		JScrollPane scrollPaneBACertAcheived = new JScrollPane();
		scrollPaneBACertAcheived.setBounds(487, 302, 213, 145);
		panelBus.add(scrollPaneBACertAcheived);
		
		JList listBACertAcheived = new JList();
		scrollPaneBACertAcheived.setViewportView(listBACertAcheived);
		filllistBACertAcheived(listBACertAcheived);
		
		JScrollPane scrollPaneMYBACertAcheived = new JScrollPane();
		scrollPaneMYBACertAcheived.setBounds(767, 303, 253, 145);
		panelBus.add(scrollPaneMYBACertAcheived);
		
		JList listMYBACertAcheived_1 = new JList(MYBACert);
		scrollPaneMYBACertAcheived.setViewportView(listMYBACertAcheived_1);
		
		JScrollPane scrollPaneBASkillBadge = new JScrollPane();
		scrollPaneBASkillBadge.setBounds(10, 502, 205, 92);
		panelBus.add(scrollPaneBASkillBadge);
		
		JList listBASkillBadge = new JList();
		scrollPaneBASkillBadge.setViewportView(listBASkillBadge);
		filllistBASkillBadge(listBASkillBadge);
		
		JScrollPane scrollPaneMYBASkillBadge = new JScrollPane();
		scrollPaneMYBASkillBadge.setBounds(278, 502, 199, 92);
		panelBus.add(scrollPaneMYBASkillBadge);
		
		JList listMYBASkillBadge_1 = new JList(MYBASkillBad);
		scrollPaneMYBASkillBadge.setViewportView(listMYBASkillBadge_1);
		
		JButton btnAddBARoll = new JButton(">>");
		btnAddBARoll.setBorder(null);
		btnAddBARoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String BARolesstr1 = (String) listBARoles.getSelectedValue();
				if (BARolesstr1 != null) {
					if (MYBARolls.contains(BARolesstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYBARolls.addElement(BARolesstr1);
						String tempusrname = textField_1.getText();
											
						SaveList mysavelist = new SaveList();
						mysavelist.SAVElistMYBARoles(BARolesstr1, tempusrname);
					}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		btnAddBARoll.setForeground(new Color(0, 128, 0));
		btnAddBARoll.setBackground(new Color(189, 205, 139));
		btnAddBARoll.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddBARoll.setBounds(225, 108, 21, 23);
		panelBus.add(btnAddBARoll);
		
		JButton btnRemoveBARoll_1 = new JButton("<<");
		btnRemoveBARoll_1.setBorder(null);
		btnRemoveBARoll_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
										
				String BARolesstr1 = (String) listMYBARoles_1.getSelectedValue();
				if (BARolesstr1 != null) {
					int myselectedindex = listMYBARoles_1.getSelectedIndex();
										
					if(listMYBARoles_1.getSelectedIndex()>=0)
											
						MYBARolls.remove(listMYBARoles_1.getSelectedIndex());
										
					String tempusrname = textField_1.getText();
										
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYBARoles(BARolesstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}

		});
		btnRemoveBARoll_1.setForeground(new Color(0, 128, 0));
		btnRemoveBARoll_1.setBackground(new Color(189, 205, 139));
		btnRemoveBARoll_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveBARoll_1.setBounds(225, 142, 21, 23);
		panelBus.add(btnRemoveBARoll_1);					
		
		JButton btnAddBAToolsSoft = new JButton(">>");
		btnAddBAToolsSoft.setBorder(null);
		btnAddBAToolsSoft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String BAToolSoftstr1 = (String) listBAToolsSoftware.getSelectedValue();
				if (BAToolSoftstr1 != null) {
					if (MYBAToolSoft.contains(BAToolSoftstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
							}else {
						MYBAToolSoft.addElement(BAToolSoftstr1);
											
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVElistMYBAToolSoft(BAToolSoftstr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		btnAddBAToolsSoft.setForeground(new Color(0, 128, 0));
		btnAddBAToolsSoft.setBackground(new Color(189, 205, 139));
		btnAddBAToolsSoft.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddBAToolsSoft.setBounds(225, 314, 21, 23);
		panelBus.add(btnAddBAToolsSoft);
		
		JButton btnRemoveBAToolsSoft = new JButton("<<");
		btnRemoveBAToolsSoft.setBorder(null);
		btnRemoveBAToolsSoft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
										
			String BAToolSoftstr1 = (String) listMYBAToolsSoftware_1_1.getSelectedValue();
			int myselectedindex = listMYBAToolsSoftware_1_1.getSelectedIndex();
									
				if (BAToolSoftstr1 != null) {
					if(listMYBAToolsSoftware_1_1.getSelectedIndex()>=0)
											
						MYBAToolSoft.remove(listMYBAToolsSoftware_1_1.getSelectedIndex());
										
					String tempusrname = textField_1.getText();
										
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistRemoveBAToolsSoft(BAToolSoftstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}
		});
		btnRemoveBAToolsSoft.setForeground(new Color(0, 128, 0));
		btnRemoveBAToolsSoft.setBackground(new Color(189, 205, 139));
		btnRemoveBAToolsSoft.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveBAToolsSoft.setBounds(225, 348, 21, 23);
		panelBus.add(btnRemoveBAToolsSoft);
		
		
		JButton btnAddBAIndustryDomain = new JButton(">>");
		btnAddBAIndustryDomain.setBorder(null);
		btnAddBAIndustryDomain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				String BAIndDomstr1 = (String) listBAIndustryDomain.getSelectedValue();
				if (BAIndDomstr1 != null) {
					if (MyBaIndDom.contains(BAIndDomstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MyBaIndDom.addElement(BAIndDomstr1);
											
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVElistMYBAIndustry(BAIndDomstr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		btnAddBAIndustryDomain.setBackground(new Color(189, 205, 139));
		btnAddBAIndustryDomain.setForeground(new Color(0, 128, 0));
		btnAddBAIndustryDomain.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddBAIndustryDomain.setBounds(720, 109, 26, 23);
		panelBus.add(btnAddBAIndustryDomain);
		
		JButton btnRemoveBAIndustryDomain = new JButton("<<");
		btnRemoveBAIndustryDomain.setBorder(null);
		btnRemoveBAIndustryDomain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
										
			String BAIndDomstr1 = (String) listMYBAIndustryDomain_1.getSelectedValue();
			int myselectedindex = listMYBAIndustryDomain_1.getSelectedIndex();
									
				if (BAIndDomstr1 != null) {
					if(listMYBAIndustryDomain_1.getSelectedIndex()>=0)
											
						MyBaIndDom.remove(listMYBAIndustryDomain_1.getSelectedIndex());
										
					String tempusrname = textField_1.getText();
										
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYBAIndustry(BAIndDomstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}
		});
		btnRemoveBAIndustryDomain.setBackground(new Color(189, 205, 139));
		btnRemoveBAIndustryDomain.setForeground(new Color(0, 128, 0));
		btnRemoveBAIndustryDomain.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveBAIndustryDomain.setBounds(719, 142, 22, 23);
		panelBus.add(btnRemoveBAIndustryDomain);
		
		
		JButton btnAddBACert = new JButton(">>");
		btnAddBACert.setBorder(null);
		btnAddBACert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String MYBACertliststr1 = (String) listBACertAcheived.getSelectedValue();
				if (MYBACertliststr1 != null) {
					if (MYBACert.contains(MYBACertliststr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYBACert.addElement(MYBACertliststr1);
											
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVElistMYBACert(MYBACertliststr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");	
			}
		});
		btnAddBACert.setForeground(new Color(0, 128, 0));
		btnAddBACert.setBackground(new Color(189, 205, 139));
		btnAddBACert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddBACert.setBounds(711, 313, 26, 23);
		panelBus.add(btnAddBACert);
		
		JButton btnRemoveBACert = new JButton("<<");
		btnRemoveBACert.setBorder(null);
		btnRemoveBACert.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
										
			String MYBACertliststr1 = (String) listMYBACertAcheived_1.getSelectedValue();
			int myselectedindex = listMYBACertAcheived_1.getSelectedIndex();
									
					if (MYBACertliststr1 != null) {
						if(listMYBACertAcheived_1.getSelectedIndex()>=0)
											
							MYBACert.remove(listMYBACertAcheived_1.getSelectedIndex());
										
						String tempusrname = textField_1.getText();
										
						RemoveList myremovelist = new RemoveList();
						myremovelist.REMOVElistMYBACert(MYBACertliststr1, tempusrname);
					}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");								
			}
		});
		btnRemoveBACert.setForeground(new Color(0, 128, 0));
		btnRemoveBACert.setBackground(new Color(189, 205, 139));
		btnRemoveBACert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveBACert.setBounds(710, 348, 28, 23);
		panelBus.add(btnRemoveBACert);
		
		JButton btnAddBASkillsBadge = new JButton(">>");
		btnAddBASkillsBadge.setBorder(null);
		btnAddBASkillsBadge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			String MYBASkillBadgestr1 = (String) listBASkillBadge.getSelectedValue();
				if (MYBASkillBadgestr1 != null) {				
					if (MYBASkillBad.contains(MYBASkillBadgestr1)) {
					JOptionPane.showMessageDialog(null, "Already in List");
					}else {
					MYBASkillBad.addElement(MYBASkillBadgestr1);
											
					String tempusrname = textField_1.getText();
					SaveList mysavelist = new SaveList();
					mysavelist.SAVElistMYBASkillBadge(MYBASkillBadgestr1, tempusrname);
					}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		btnAddBASkillsBadge.setForeground(new Color(0, 128, 0));
		btnAddBASkillsBadge.setBackground(new Color(189, 205, 139));
		btnAddBASkillsBadge.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddBASkillsBadge.setBounds(225, 512, 26, 23);
		panelBus.add(btnAddBASkillsBadge);
		
		JButton btnRemoveBASkillsBadge = new JButton("<<");
		btnRemoveBASkillsBadge.setBorder(null);
		btnRemoveBASkillsBadge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
										
			String MYBASkillBadgestr1 = (String) listMYBASkillBadge_1.getSelectedValue();
			int myselectedindex = listMYBASkillBadge_1.getSelectedIndex();
				if (MYBASkillBadgestr1 != null) {
					if(listMYBASkillBadge_1.getSelectedIndex()>=0)
											
						MYBASkillBad.remove(listMYBASkillBadge_1.getSelectedIndex());
										
					String tempusrname = textField_1.getText();
										
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYBASkillBadge(MYBASkillBadgestr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
			}
		});
		btnRemoveBASkillsBadge.setForeground(new Color(0, 128, 0));
		btnRemoveBASkillsBadge.setBackground(new Color(189, 205, 139));
		btnRemoveBASkillsBadge.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveBASkillsBadge.setBounds(225, 548, 28, 23);
		panelBus.add(btnRemoveBASkillsBadge);
		
		textFieldBAMyYears = new JTextField();		
		textFieldBAMyYears.setDisabledTextColor(new Color(0, 255, 64));
		textFieldBAMyYears.setSelectionColor(new Color(255, 0, 0));
		textFieldBAMyYears.setSelectedTextColor(new Color(0, 0, 0));
		textFieldBAMyYears.setEditable(false);
		textFieldBAMyYears.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBAMyYears.setBackground(new Color(189, 205, 139));
		textFieldBAMyYears.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldBAMyYears.setBounds(70, 12, 38, 20);
		panelBus.add(textFieldBAMyYears);
		textFieldBAMyYears.setColumns(10);
		
		textFieldBAMyMonths = new JTextField();
		textFieldBAMyMonths.setEditable(false);
		textFieldBAMyMonths.setBackground(new Color(189, 205, 139));
		textFieldBAMyMonths.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBAMyMonths.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldBAMyMonths.setBounds(214, 12, 32, 20);
		panelBus.add(textFieldBAMyMonths);
		textFieldBAMyMonths.setColumns(10);
		
		JButton btnADDSkillBARoles = new JButton("+");
		btnADDSkillBARoles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillbarolls = new AddValueToList();
					try {
						listval = skillbarolls.add_SkillBARolls();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					DefaultListModel listModel = (DefaultListModel) listBARoles.getModel();
			        listModel.removeAllElements();
			        filllistBARoles(listBARoles);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
				
			}
		});
		btnADDSkillBARoles.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillBARoles.setVerticalAlignment(SwingConstants.BOTTOM);
		btnADDSkillBARoles.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillBARoles.setBorder(null);
		btnADDSkillBARoles.setBackground(new Color(189, 205, 139));
		btnADDSkillBARoles.setBounds(94, 243, 46, 14);
		panelBus.add(btnADDSkillBARoles);
		
		JButton btnRMVSkillBARoles_1 = new JButton("-");
		btnRMVSkillBARoles_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);

				if (AdminUser.equals("Y")){
	    			String selval = (String) listBARoles.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mybaroll = new LookupSkill();
	    				int BARollsid = (int) mybaroll.lookuplistMYBARoles(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
	    					RMVSkills.RMVSkillIDemployeeSkills(BARollsid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    				DefaultListModel listModel = (DefaultListModel) listBARoles.getModel();
				        listModel.removeAllElements();
				        filllistBARoles(listBARoles);
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}	
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRMVSkillBARoles_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillBARoles_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRMVSkillBARoles_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillBARoles_1.setBorder(null);
		btnRMVSkillBARoles_1.setBackground(new Color(189, 205, 139));
		btnRMVSkillBARoles_1.setBounds(136, 243, 46, 14);
		panelBus.add(btnRMVSkillBARoles_1);
		
		JButton btnADDSkillBASoftware = new JButton("+");
		btnADDSkillBASoftware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillbamantoolsoft = new AddValueToList();
					try {
						listval = skillbamantoolsoft.add_SkillBAManToolSoft();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					DefaultListModel listModel = (DefaultListModel) listBAToolsSoftware.getModel();
			        listModel.removeAllElements();
			        filllistBAToolsSoftware(listBAToolsSoftware);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
				
			}
		});
		btnADDSkillBASoftware.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillBASoftware.setVerticalAlignment(SwingConstants.BOTTOM);
		btnADDSkillBASoftware.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillBASoftware.setBorder(null);
		btnADDSkillBASoftware.setBackground(new Color(189, 205, 139));
		btnADDSkillBASoftware.setBounds(76, 452, 46, 14);
		panelBus.add(btnADDSkillBASoftware);
		
		JButton btnRMVSkillBASoftware_1 = new JButton("-");
		btnRMVSkillBASoftware_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
	    			String selval = (String) listBAToolsSoftware.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mybaTool = new LookupSkill();
	    				int BAToolid = (int) mybaTool.lookuplistMYBAToolSoft(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(BAToolid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    				DefaultListModel listModel = (DefaultListModel) listBAToolsSoftware.getModel();
				        listModel.removeAllElements();
				        filllistBAToolsSoftware(listBAToolsSoftware);
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillBASoftware_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillBASoftware_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRMVSkillBASoftware_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillBASoftware_1.setBorder(null);
		btnRMVSkillBASoftware_1.setBackground(new Color(189, 205, 139));
		btnRMVSkillBASoftware_1.setBounds(118, 452, 46, 14);
		panelBus.add(btnRMVSkillBASoftware_1);
		
		JButton btnADDSkillBABadge = new JButton("+");
		btnADDSkillBABadge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillbaskillbadge = new AddValueToList();
					try {
						listval = skillbaskillbadge.add_SkillBASkillBadge();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					DefaultListModel listModel = (DefaultListModel) listBASkillBadge.getModel();
			        listModel.removeAllElements();
			        filllistBASkillBadge(listBASkillBadge);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
			}
		});
		btnADDSkillBABadge.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillBABadge.setVerticalAlignment(SwingConstants.BOTTOM);
		btnADDSkillBABadge.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillBABadge.setBorder(null);
		btnADDSkillBABadge.setBackground(new Color(189, 205, 139));
		btnADDSkillBABadge.setBounds(76, 596, 46, 14);
		panelBus.add(btnADDSkillBABadge);
		
		JButton btnRMVSkillBABadge_1 = new JButton("-");
		btnRMVSkillBABadge_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
	    			String selval = (String) listBASkillBadge.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mybaSkillBadge = new LookupSkill();
	    				int BASkillBadgeid = (int) mybaSkillBadge.lookuplistMYBASkillBadge(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(BASkillBadgeid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    				DefaultListModel listModel = (DefaultListModel) listBASkillBadge.getModel();
				        listModel.removeAllElements();
				        filllistBASkillBadge(listBASkillBadge);
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
			}
		});
		btnRMVSkillBABadge_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillBABadge_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRMVSkillBABadge_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillBABadge_1.setBorder(null);
		btnRMVSkillBABadge_1.setBackground(new Color(189, 205, 139));
		btnRMVSkillBABadge_1.setBounds(118, 596, 46, 14);
		panelBus.add(btnRMVSkillBABadge_1);
		
		JButton btnADDSkillBAIndDom = new JButton("+");
		btnADDSkillBAIndDom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillbainddom = new AddValueToList();
					try {
						listval = skillbainddom.add_SkillBAIndDom();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					
					DefaultListModel listModel = (DefaultListModel) listBAIndustryDomain.getModel();
			        listModel.removeAllElements();
			        filllistBAIndustryDomain(listBAIndustryDomain);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}		
			}
		});
		btnADDSkillBAIndDom.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillBAIndDom.setVerticalAlignment(SwingConstants.BOTTOM);
		btnADDSkillBAIndDom.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillBAIndDom.setBorder(null);
		btnADDSkillBAIndDom.setBackground(new Color(189, 205, 139));
		btnADDSkillBAIndDom.setBounds(597, 243, 46, 14);
		panelBus.add(btnADDSkillBAIndDom);
		
		JButton btnRMVSkillBAIndDom_1 = new JButton("-");
		btnRMVSkillBAIndDom_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
				if (AdminUser.equals("Y")){
	    			String selval = (String) listBAIndustryDomain.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mybaind = new LookupSkill();
	    				int BAIndustryid = (int) mybaind.lookuplistMYBAIndustry(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
	    					RMVSkills.RMVSkillIDemployeeSkills(BAIndustryid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    				DefaultListModel listModel = (DefaultListModel) listBAIndustryDomain.getModel();
				        listModel.removeAllElements();
				        filllistBAIndustryDomain(listBAIndustryDomain);
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}	
			}
		});
		btnRMVSkillBAIndDom_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillBAIndDom_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRMVSkillBAIndDom_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillBAIndDom_1.setBorder(null);
		btnRMVSkillBAIndDom_1.setBackground(new Color(189, 205, 139));
		btnRMVSkillBAIndDom_1.setBounds(639, 243, 46, 14);
		panelBus.add(btnRMVSkillBAIndDom_1);
		
		JButton btnADDSkillBACert = new JButton("+");
		btnADDSkillBACert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillbaCert = new AddValueToList();
					try {
						listval = skillbaCert.add_SkillBACert();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listBACertAcheived = new JList();
					//scrollPaneBACertAcheived.setViewportView(listBACertAcheived);
					DefaultListModel listModel = (DefaultListModel) listBACertAcheived.getModel();
			        listModel.removeAllElements();
			        filllistBACertAcheived(listBACertAcheived);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
				
			}
		});
		btnADDSkillBACert.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillBACert.setVerticalAlignment(SwingConstants.BOTTOM);
		btnADDSkillBACert.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillBACert.setBorder(null);
		btnADDSkillBACert.setBackground(new Color(189, 205, 139));
		btnADDSkillBACert.setBounds(597, 452, 46, 14);
		panelBus.add(btnADDSkillBACert);
		
		JButton btnRMVSkillBACert_1 = new JButton("-");
		btnRMVSkillBACert_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listBACertAcheived.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mybaCert = new LookupSkill();
	    				int BACertid = (int) mybaCert.lookuplistMYBACert(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(BACertid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    				DefaultListModel listModel = (DefaultListModel) listBACertAcheived.getModel();
				        listModel.removeAllElements();
				        filllistBACertAcheived(listBACertAcheived);
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillBACert_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillBACert_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRMVSkillBACert_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillBACert_1.setBorder(null);
		btnRMVSkillBACert_1.setBackground(new Color(189, 205, 139));
		btnRMVSkillBACert_1.setBounds(639, 452, 46, 14);
		panelBus.add(btnRMVSkillBACert_1);
		
		JLabel lblBAMnthExperience_1_1 = new JLabel("Months of Experience with  Business Skills");
		lblBAMnthExperience_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBAMnthExperience_1_1.setBounds(296, 14, 262, 14);
		panelBus.add(lblBAMnthExperience_1_1);
		
				JPanel panelFun = new JPanel();
				panelFun.setForeground(new Color(255, 255, 255));
				panelFun.setBackground(new Color(174, 174, 215));
				
				tabbedpane.add("FunctionalSkill",panelFun);
				panelFun.setLayout(null);
				
				JComboBox cbFunYearsExp = new JComboBox(FUNYrsitems);
				cbFunYearsExp.setEditable(true);
				cbFunYearsExp.setSelectedIndex(-1);
				cbFunYearsExp.setBackground(new Color(255, 255, 255));
				cbFunYearsExp.addItemListener(new ItemListener() {
					String selval;
					public void itemStateChanged(ItemEvent e) {
						
						selval = String.valueOf(cbFunYearsExp.getSelectedItem());
						
						String usrtxtfield=textField_1.getText();
						textFieldFunMyYears.setText(selval);
						
						try {
						
							String query = "UPDATE profiledata SET FUNYearExp=? WHERE profiledata.username =?";
							
							PreparedStatement pst=conn.prepareStatement(query);
							pst.setString(1, selval);
							pst.setString(2, usrtxtfield);
							pst.execute();
						
						} catch (Exception ex) {
							
							JOptionPane.showMessageDialog(null, " exception error Data not Saved");
							ex.printStackTrace();
							}
					}
				});
				cbFunYearsExp.setBounds(143, 11, 38, 22);
				panelFun.add(cbFunYearsExp);
				JComboBox cbFunMonthExp = new JComboBox(FUNMnthitems);
				cbFunMonthExp.setEditable(true);
				cbFunMonthExp.setSelectedIndex(-1);
				cbFunMonthExp.setBackground(new Color(255, 255, 255));
				cbFunMonthExp.addItemListener(new ItemListener() {
					String selval;
					public void itemStateChanged(ItemEvent e) {
						
						selval = String.valueOf(cbFunMonthExp.getSelectedItem());
						String usrtxtfield=textField_1.getText();
						textFieldFunMyMonths.setText(selval);
						
						try {
						
							String query = "UPDATE profiledata SET FUNMnthExp=? WHERE profiledata.username =?";
							
							PreparedStatement pst=conn.prepareStatement(query);
							pst.setString(1, selval);
							pst.setString(2, usrtxtfield);
							pst.execute();
						
						
						} catch (Exception ex) {
							
							JOptionPane.showMessageDialog(null, " exception error Data not Saved");
							ex.printStackTrace();
							}	
						
					}
				});
				cbFunMonthExp.setBounds(298, 11, 38, 22);
				panelFun.add(cbFunMonthExp);
				
				JLabel lblFunIndDomain = new JLabel("Functional industry / domain");
				lblFunIndDomain.setToolTipText("SkillIndustry");
				lblFunIndDomain.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblFunIndDomain.setBounds(10, 82, 171, 14);
				panelFun.add(lblFunIndDomain);
				
				JLabel lblFunCertISTQB = new JLabel("Certifications (ISTQB or Any Equivalent)");
				lblFunCertISTQB.setToolTipText("CERTBadge");
				lblFunCertISTQB.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblFunCertISTQB.setBounds(510, 83, 218, 14);
				panelFun.add(lblFunCertISTQB);
				
				JLabel lblFunBadges = new JLabel("Functional Badges");
				lblFunBadges.setToolTipText("CertBadge");
				lblFunBadges.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblFunBadges.setBounds(510, 264, 119, 14);
				panelFun.add(lblFunBadges);
				
				JLabel lblFunTestExp = new JLabel("Functional Testing Experience");
				lblFunTestExp.setToolTipText("SkillFocus");
				lblFunTestExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblFunTestExp.setBounds(10, 264, 171, 14);
				panelFun.add(lblFunTestExp);
				
				JLabel lblFunTestManag = new JLabel("Test Management and Defect Tracking Tools");
				lblFunTestManag.setToolTipText("SkillTool");
				lblFunTestManag.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblFunTestManag.setBounds(10, 447, 257, 14);
				panelFun.add(lblFunTestManag);
				
				JLabel lblMyFunctionalIndustry = new JLabel("MY Functional industry / domain");
				lblMyFunctionalIndustry.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblMyFunctionalIndustry.setBounds(255, 83, 181, 14);
				panelFun.add(lblMyFunctionalIndustry);
				
				JLabel lblMycertificationsistqbOr = new JLabel("MY Certifications (ISTQB or Any Equivalent)");
				lblMycertificationsistqbOr.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblMycertificationsistqbOr.setBounds(766, 82, 239, 14);
				panelFun.add(lblMycertificationsistqbOr);
				
				JLabel lblMYFunTestExp = new JLabel("MY Functional Testing Experience");
				lblMYFunTestExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblMYFunTestExp.setBounds(258, 265, 198, 14);
				panelFun.add(lblMYFunTestExp);
				
				JLabel lblTestManagementAnd = new JLabel("MY Test Management and Defect Tracking Tools");
				lblTestManagementAnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblTestManagementAnd.setBounds(298, 447, 320, 14);
				panelFun.add(lblTestManagementAnd);
				
				JLabel lblMYFunBadges = new JLabel("MY Functional Badges");
				lblMYFunBadges.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblMYFunBadges.setBounds(766, 264, 127, 14);
				panelFun.add(lblMYFunBadges);
				
				textFieldFunMyYears = new JTextField();
				textFieldFunMyYears.setEditable(false);
				textFieldFunMyYears.setFont(new Font("Tahoma", Font.BOLD, 11));
				textFieldFunMyYears.setDisabledTextColor(new Color(64, 0, 64));
				textFieldFunMyYears.setSelectedTextColor(new Color(0, 0, 0));
				textFieldFunMyYears.setHorizontalAlignment(SwingConstants.CENTER);
				textFieldFunMyYears.setEnabled(false);
				textFieldFunMyYears.setBackground(new Color(174, 174, 215));
				textFieldFunMyYears.setBounds(95, 11, 38, 22);
				panelFun.add(textFieldFunMyYears);
				textFieldFunMyYears.setColumns(10);
				
				textFieldFunMyMonths = new JTextField();
				textFieldFunMyMonths.setSelectionColor(new Color(0, 0, 0));
				textFieldFunMyMonths.setEditable(false);
				textFieldFunMyMonths.setDisabledTextColor(new Color(64, 0, 64));
				textFieldFunMyMonths.setSelectedTextColor(new Color(0, 0, 0));
				textFieldFunMyMonths.setFont(new Font("Tahoma", Font.BOLD, 11));
				textFieldFunMyMonths.setHorizontalAlignment(SwingConstants.CENTER);
				textFieldFunMyMonths.setForeground(new Color(0, 0, 0));
				textFieldFunMyMonths.setBackground(new Color(174, 174, 215));
				textFieldFunMyMonths.setColumns(10);
				textFieldFunMyMonths.setBounds(255, 11, 38, 22);
				panelFun.add(textFieldFunMyMonths);
				
				JLabel lblFunMyYearsExp = new JLabel("I have ");
				lblFunMyYearsExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblFunMyYearsExp.setBounds(47, 14, 46, 14);
				panelFun.add(lblFunMyYearsExp);
				
				JScrollPane scrollPane_FunIndustryDom = new JScrollPane();
				scrollPane_FunIndustryDom.setBounds(10, 107, 181, 130);
				panelFun.add(scrollPane_FunIndustryDom);
				
				JList listFunIndustryDomain = new JList();
				scrollPane_FunIndustryDom.setViewportView(listFunIndustryDomain);
				filllistFunIndustryDomain(listFunIndustryDomain);
				
				JScrollPane scrollPane_FunTestingExp = new JScrollPane();
				scrollPane_FunTestingExp.setBounds(10, 289, 181, 124);
				panelFun.add(scrollPane_FunTestingExp);
				
				JList listFunTestingExp = new JList();
				scrollPane_FunTestingExp.setViewportView(listFunTestingExp);
				filllistFunTestingExp(listFunTestingExp);
				
				JScrollPane scrollPane_FunDefectTrack = new JScrollPane();
				scrollPane_FunDefectTrack.setBounds(10, 472, 218, 124);
				panelFun.add(scrollPane_FunDefectTrack);
				
				JList listFunTestMangement = new JList();
				scrollPane_FunDefectTrack.setViewportView(listFunTestMangement);
				filllistFunTestMangement(listFunTestMangement);
				
				JScrollPane scrollPane_FunCertification = new JScrollPane();
				scrollPane_FunCertification.setBounds(510, 107, 188, 130);
				panelFun.add(scrollPane_FunCertification);
				
				JList listFunCertifications = new JList();
				scrollPane_FunCertification.setViewportView(listFunCertifications);
				filllistFunCertifications(listFunCertifications);
				
				JScrollPane scrollPane_FunBadges = new JScrollPane();
				scrollPane_FunBadges.setBounds(510, 289, 188, 130);
				panelFun.add(scrollPane_FunBadges);
				
				JList listFunBadges = new JList();
				scrollPane_FunBadges.setViewportView(listFunBadges);
				filllistFunBadges(listFunBadges);
				
				JScrollPane scrollPane_MYFunIndustryDom = new JScrollPane();
				scrollPane_MYFunIndustryDom.setBounds(255, 107, 201, 130);
				panelFun.add(scrollPane_MYFunIndustryDom);
				
				JList listMYFunIndustryDomain_1 = new JList(MYFunIndDom);
				scrollPane_MYFunIndustryDom.setViewportView(listMYFunIndustryDomain_1);
				
				JScrollPane scrollPane_MYFunTestingFun = new JScrollPane();
				scrollPane_MYFunTestingFun.setBounds(258, 289, 198, 130);
				panelFun.add(scrollPane_MYFunTestingFun);
				
				JList listMYFunTestingExp_1 = new JList(MYFunTestExp);
				scrollPane_MYFunTestingFun.setViewportView(listMYFunTestingExp_1);
				
				JScrollPane scrollPane_FunMYBadges = new JScrollPane();
				scrollPane_FunMYBadges.setBounds(766, 289, 239, 130);
				panelFun.add(scrollPane_FunMYBadges);
				
				JList listMYFunBadges_1 = new JList(MYFunBadge);
				scrollPane_FunMYBadges.setViewportView(listMYFunBadges_1);
				
				JScrollPane scrollPane_FunMYDefectTrack = new JScrollPane();
				scrollPane_FunMYDefectTrack.setBounds(298, 472, 273, 130);
				panelFun.add(scrollPane_FunMYDefectTrack);
				
				JList listMYFunTestMangement_1 = new JList(MYFunTestManDefect);
				scrollPane_FunMYDefectTrack.setViewportView(listMYFunTestMangement_1);
				
				JScrollPane scrollPane_MYFunCertifications = new JScrollPane();
				scrollPane_MYFunCertifications.setBounds(766, 100, 239, 137);
				panelFun.add(scrollPane_MYFunCertifications);
				
				JList listMYFunCertifications_1 = new JList(MYFunCert);
				scrollPane_MYFunCertifications.setViewportView(listMYFunCertifications_1);
				
				JButton btnAddFunInd = new JButton(">>");
				btnAddFunInd.setBorder(null);
				btnAddFunInd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					String FunIndDomstr1 = (String) listFunIndustryDomain.getSelectedValue();
						if (FunIndDomstr1 != null) {
							if (MYFunIndDom.contains(FunIndDomstr1)) {
								JOptionPane.showMessageDialog(null, "Already in List");
							}else {
								MYFunIndDom.addElement(FunIndDomstr1);
							
								String tempusrname = textField_1.getText();
								SaveList mysavelist = new SaveList();
								mysavelist.SAVEmylistFUNIndDom(FunIndDomstr1, tempusrname);
								}			
						}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
					}
				});
				btnAddFunInd.setForeground(new Color(83, 83, 168));
				btnAddFunInd.setBackground(new Color(174, 174, 215));
				btnAddFunInd.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAddFunInd.setBounds(201, 110, 27, 23);
				panelFun.add(btnAddFunInd);
				
				JButton btnRemoveFunind = new JButton("<<");
				btnRemoveFunind.setBorder(null);
				btnRemoveFunind.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String MYTechFunindstr1 = (String) listMYFunIndustryDomain_1.getSelectedValue();
					int myselectedindex = listMYFunIndustryDomain_1.getSelectedIndex();
						if (MYTechFunindstr1 != null) {
							if(listMYFunIndustryDomain_1.getSelectedIndex()>=0)
							
								MYFunIndDom.remove(listMYFunIndustryDomain_1.getSelectedIndex());
						
							String tempusrname = textField_1.getText();
						
							RemoveList myremovelist = new RemoveList();
							myremovelist.REMOVElistMYFunIndDomain(MYTechFunindstr1, tempusrname);
						
					}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
					}
				});
				btnRemoveFunind.setForeground(new Color(83, 83, 168));
				btnRemoveFunind.setBackground(new Color(174, 174, 215));
				btnRemoveFunind.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnRemoveFunind.setBounds(201, 135, 27, 23);
				panelFun.add(btnRemoveFunind);
				
				JButton btnAddFunTestExp = new JButton(">>");
				btnAddFunTestExp.setBorder(null);
				btnAddFunTestExp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					String FunTestExpstr1 = (String) listFunTestingExp.getSelectedValue();
						if (FunTestExpstr1 != null) {
							if (MYFunTestExp.contains(FunTestExpstr1)) {
								JOptionPane.showMessageDialog(null, "Already in List");
							}else {
								MYFunTestExp.addElement(FunTestExpstr1);
							
								String tempusrname = textField_1.getText();
								SaveList mysavelist = new SaveList();
								mysavelist.SAVEmylistFunTestExp(FunTestExpstr1, tempusrname);
								}			
						}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
					}
				});
				btnAddFunTestExp.setBackground(new Color(174, 174, 215));
				btnAddFunTestExp.setForeground(new Color(83, 83, 168));
				btnAddFunTestExp.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAddFunTestExp.setBounds(201, 287, 30, 23);
				panelFun.add(btnAddFunTestExp);
				
				JButton btnRemoveFunTestExp = new JButton("<<");
				btnRemoveFunTestExp.setBorder(null);
				btnRemoveFunTestExp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String MYFunTestExpstr1 = (String) listMYFunTestingExp_1.getSelectedValue();
					int myselectedindex = listMYFunTestingExp_1.getSelectedIndex();
						if (MYFunTestExpstr1 != null) {
							if(listMYFunTestingExp_1.getSelectedIndex()>=0)
							
								MYFunTestExp.remove(listMYFunTestingExp_1.getSelectedIndex());
						
							String tempusrname = textField_1.getText();
						
							RemoveList myremovelist = new RemoveList();
							myremovelist.REMOVElistMYFunTestExp(MYFunTestExpstr1, tempusrname);
							
						}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
				}
				});
				btnRemoveFunTestExp.setBackground(new Color(174, 174, 215));
				btnRemoveFunTestExp.setForeground(new Color(83, 83, 168));
				btnRemoveFunTestExp.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnRemoveFunTestExp.setBounds(201, 314, 28, 23);
				panelFun.add(btnRemoveFunTestExp);
				
				JButton btnAddFunCert = new JButton(">>");
				btnAddFunCert.setBorder(null);
				btnAddFunCert.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					String FunCertstr1 = (String) listFunCertifications.getSelectedValue();
						if (FunCertstr1 != null) {
								if (MYFunCert.contains(FunCertstr1)) {
							JOptionPane.showMessageDialog(null, "Already in List");
								}else {
									MYFunCert.addElement(FunCertstr1);
							
									String tempusrname = textField_1.getText();
									SaveList mysavelist = new SaveList();
									mysavelist.SAVEmylistFunCert(FunCertstr1, tempusrname);
									}		
						}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
					}
				});
				btnAddFunCert.setBackground(new Color(174, 174, 215));
				btnAddFunCert.setForeground(new Color(83, 83, 168));
				btnAddFunCert.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAddFunCert.setBounds(708, 108, 27, 23);
				panelFun.add(btnAddFunCert);
				
				JButton btnRemoveFunCert = new JButton("<<");
				btnRemoveFunCert.setBorder(null);
				btnRemoveFunCert.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String MYTechFunCertstr1 = (String) listMYFunCertifications_1.getSelectedValue();
					int myselectedindex = listMYFunCertifications_1.getSelectedIndex();
					if (MYTechFunCertstr1 != null) {
							if(listMYFunCertifications_1.getSelectedIndex()>=0)
							
								MYFunCert.remove(listMYFunCertifications_1.getSelectedIndex());
						
							String tempusrname = textField_1.getText();
						
							RemoveList myremovelist = new RemoveList();
							myremovelist.REMOVElistMYFunCert(MYTechFunCertstr1, tempusrname);
					}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");	
				}
				});
				btnRemoveFunCert.setBackground(new Color(174, 174, 215));
				btnRemoveFunCert.setForeground(new Color(83, 83, 168));
				btnRemoveFunCert.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnRemoveFunCert.setBounds(708, 135, 28, 23);
				panelFun.add(btnRemoveFunCert);
				
				JButton btnAddFunBadge = new JButton(">>");
				btnAddFunBadge.setBorder(null);
				btnAddFunBadge.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					String FunBadgestr1 = (String) listFunBadges.getSelectedValue();
						if (FunBadgestr1 != null) {
							if (MYFunBadge.contains(FunBadgestr1)) {
								JOptionPane.showMessageDialog(null, "Already in List");
							}else {
								MYFunBadge.addElement(FunBadgestr1);
							
								String tempusrname = textField_1.getText();
								SaveList mysavelist = new SaveList();
								mysavelist.SAVEmylistFunBadge(FunBadgestr1, tempusrname);
								}			
						}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
					}
				});
				btnAddFunBadge.setBackground(new Color(174, 174, 215));
				btnAddFunBadge.setForeground(new Color(83, 83, 168));
				btnAddFunBadge.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAddFunBadge.setBounds(708, 287, 27, 23);
				panelFun.add(btnAddFunBadge);
				
				JButton btnRemoveFunBadge = new JButton("<<");
				btnRemoveFunBadge.setBorder(null);
				btnRemoveFunBadge.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String MYTechFunBadgestr1 = (String) listMYFunBadges_1.getSelectedValue();
					int myselectedindex = listMYFunBadges_1.getSelectedIndex();
						if (MYTechFunBadgestr1 != null) {
							if(listMYFunBadges_1.getSelectedIndex()>=0)
							
								MYFunBadge.remove(listMYFunBadges_1.getSelectedIndex());
						
							String tempusrname = textField_1.getText();
						
							RemoveList myremovelist = new RemoveList();
							myremovelist.REMOVElistMYFunBadge(MYTechFunBadgestr1, tempusrname);
						}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
				}
				});
				btnRemoveFunBadge.setBackground(new Color(174, 174, 215));
				btnRemoveFunBadge.setForeground(new Color(83, 83, 168));
				btnRemoveFunBadge.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnRemoveFunBadge.setBounds(708, 314, 27, 23);
				panelFun.add(btnRemoveFunBadge);
				
				JButton btnAddFunDefectTrack = new JButton(">>");
				btnAddFunDefectTrack.setBorder(null);
				btnAddFunDefectTrack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					String FunDefectstr1 = (String) listFunTestMangement.getSelectedValue();
						if (FunDefectstr1 != null) {
							if (MYFunTestManDefect.contains(FunDefectstr1)) {
								JOptionPane.showMessageDialog(null, "Already in List");
							}else {
								MYFunTestManDefect.addElement(FunDefectstr1);
							
								String tempusrname = textField_1.getText();
								SaveList mysavelist = new SaveList();
								mysavelist.SAVEmylistFunTestManDefect(FunDefectstr1, tempusrname);
								}	
						}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");	
				}
				});
				btnAddFunDefectTrack.setBackground(new Color(174, 174, 215));
				btnAddFunDefectTrack.setForeground(new Color(83, 83, 168));
				btnAddFunDefectTrack.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAddFunDefectTrack.setBounds(238, 470, 27, 23);
				panelFun.add(btnAddFunDefectTrack);
				
				JButton btnRemoveFunDefectTrack = new JButton("<<");
				btnRemoveFunDefectTrack.setBorder(null);
				btnRemoveFunDefectTrack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String MYFunDefectTrackstr1 = (String) listMYFunTestMangement_1.getSelectedValue();
					int myselectedindex = listMYFunTestMangement_1.getSelectedIndex();
						if (MYFunDefectTrackstr1 != null) {
							if(listMYFunTestMangement_1.getSelectedIndex()>=0)
							
								MYFunTestManDefect.remove(listMYFunTestMangement_1.getSelectedIndex());
						
							String tempusrname = textField_1.getText();
						
							RemoveList myremovelist = new RemoveList();
							myremovelist.REMOVElistMYFunDefectTrack(MYFunDefectTrackstr1, tempusrname);
						}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
					}
				});
				btnRemoveFunDefectTrack.setBackground(new Color(174, 174, 215));
				btnRemoveFunDefectTrack.setForeground(new Color(83, 83, 168));
				btnRemoveFunDefectTrack.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnRemoveFunDefectTrack.setBounds(238, 495, 27, 23);
				panelFun.add(btnRemoveFunDefectTrack);
				
				JButton btnADDSkillFunIndDom = new JButton("+");
				btnADDSkillFunIndDom.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (AdminUser.equals("Y")){
							
							AddValueToList skillfunIndDom = new AddValueToList();
							try {
								listval = skillfunIndDom.add_SkillFUNIndDom();
							} catch (SQLException e1) {
								
								e1.printStackTrace();
							}
							//JList listFunIndustryDomain = new JList();
							//scrollPane_FunIndustryDom.setViewportView(listFunIndustryDomain);
							DefaultListModel listModel = (DefaultListModel) listFunIndustryDomain.getModel();
					        listModel.removeAllElements();
							filllistFunIndustryDomain(listFunIndustryDomain);
							
						}	
						else{
							JOptionPane.showMessageDialog(null, "admin use only");
						}		
						
					}
				});
				btnADDSkillFunIndDom.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnADDSkillFunIndDom.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnADDSkillFunIndDom.setBorder(null);
				btnADDSkillFunIndDom.setBackground(new Color(174, 174, 215));
				btnADDSkillFunIndDom.setBounds(72, 239, 46, 14);
				panelFun.add(btnADDSkillFunIndDom);
				
				JButton btnRMVSkillFunIndDom_1 = new JButton("-");
				btnRMVSkillFunIndDom_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
						if (AdminUser.equals("Y")){
			    			String selval = (String) listFunIndustryDomain.getSelectedValue();
			    		  if (result == JOptionPane.OK_OPTION) {
			    			if (selval != null){
			    				LookupSkill myfunIndDom = new LookupSkill();
			    				int FunIndDomid = (int) myfunIndDom.lookuplistMYFunIndDom(selval);
			    			
			    				RemoveList RMVSkills = new RemoveList();
			    				
			    				try {
									RMVSkills.RMVSkillIDemployeeSkills(FunIndDomid);
									
								} catch (SQLException e1) {
									e1.printStackTrace();}
			    				
			    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
			    				DefaultListModel listModel = (DefaultListModel) listFunIndustryDomain.getModel();
						        listModel.removeAllElements();
								filllistFunIndustryDomain(listFunIndustryDomain);
			    				
			    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
			    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}    			
			    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
					}
				});
				btnRMVSkillFunIndDom_1.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnRMVSkillFunIndDom_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnRMVSkillFunIndDom_1.setBorder(null);
				btnRMVSkillFunIndDom_1.setBackground(new Color(174, 174, 215));
				btnRMVSkillFunIndDom_1.setBounds(116, 239, 46, 14);
				panelFun.add(btnRMVSkillFunIndDom_1);
				
				JButton btnADDSkillFunTestExp = new JButton("+");
				btnADDSkillFunTestExp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (AdminUser.equals("Y")){
							
							AddValueToList skillfuntestexp = new AddValueToList();
							try {
								listval = skillfuntestexp.add_SkillFUNTestingExp();
							} catch (SQLException e1) {
								
								e1.printStackTrace();
							}
							//JList listFunTestingExp = new JList();
							//scrollPane_FunTestingExp.setViewportView(listFunTestingExp);
							DefaultListModel listModel = (DefaultListModel) listFunTestingExp.getModel();
					        listModel.removeAllElements();
							filllistFunTestingExp(listFunTestingExp);
							
						}	
						else{
							JOptionPane.showMessageDialog(null, "admin use only");
						}	
						
					}
				});
				btnADDSkillFunTestExp.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnADDSkillFunTestExp.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnADDSkillFunTestExp.setBorder(null);
				btnADDSkillFunTestExp.setBackground(new Color(174, 174, 215));
				btnADDSkillFunTestExp.setBounds(72, 412, 46, 14);
				panelFun.add(btnADDSkillFunTestExp);
				
				JButton btnRMVSkillFunTestExp_1 = new JButton("-");
				btnRMVSkillFunTestExp_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
						if (AdminUser.equals("Y")){
			    			String selval = (String) listFunTestingExp.getSelectedValue();
			    		  if (result == JOptionPane.OK_OPTION) {
			    			if (selval != null){
			    				LookupSkill myfunTestExp = new LookupSkill();
			    				int FunTestExpid = (int) myfunTestExp.lookuplistMYFunTestExp(selval);
			    			
			    				RemoveList RMVSkills = new RemoveList();
			    				
			    				try {
									RMVSkills.RMVSkillIDemployeeSkills(FunTestExpid);
									
								} catch (SQLException e1) {
									e1.printStackTrace();}
			    				
			    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
			    			
								DefaultListModel listModel = (DefaultListModel) listFunTestingExp.getModel();
						        listModel.removeAllElements();
								filllistFunTestingExp(listFunTestingExp); 
			    				
			    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
			    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
			    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
					}
				});
				btnRMVSkillFunTestExp_1.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnRMVSkillFunTestExp_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnRMVSkillFunTestExp_1.setBorder(null);
				btnRMVSkillFunTestExp_1.setBackground(new Color(174, 174, 215));
				btnRMVSkillFunTestExp_1.setBounds(116, 412, 46, 14);
				panelFun.add(btnRMVSkillFunTestExp_1);
				
				JButton btnADDSkillFunDefectTrack = new JButton("+");
				btnADDSkillFunDefectTrack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (AdminUser.equals("Y")){
							
							AddValueToList skillfuntestmang = new AddValueToList();
							try {
								listval = skillfuntestmang.add_SkillFUNTestMang();
							} catch (SQLException e1) {
								
								e1.printStackTrace();
							}
							//JList listFunTestMangement = new JList();
							//scrollPane_FunDefectTrack.setViewportView(listFunTestMangement);
							DefaultListModel listModel = (DefaultListModel) listFunTestMangement.getModel();
					        listModel.removeAllElements();
							filllistFunTestMangement(listFunTestMangement);
							
						}	
						else{
							JOptionPane.showMessageDialog(null, "admin use only");
						}		
						
					}
				});
				btnADDSkillFunDefectTrack.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnADDSkillFunDefectTrack.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnADDSkillFunDefectTrack.setBorder(null);
				btnADDSkillFunDefectTrack.setBackground(new Color(174, 174, 215));
				btnADDSkillFunDefectTrack.setBounds(113, 594, 46, 14);
				panelFun.add(btnADDSkillFunDefectTrack);
				
				JButton btnRMVSkillFunDefectTrack_1 = new JButton("-");
				btnRMVSkillFunDefectTrack_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
						if (AdminUser.equals("Y")){
			    			String selval = (String) listFunTestMangement.getSelectedValue();
			    		  if (result == JOptionPane.OK_OPTION) {
			    			if (selval != null){
			    				LookupSkill myfunTestManDef = new LookupSkill();
			    				int FunTestManDefid = (int) myfunTestManDef.lookuplistMYFunTestManDef(selval);
			    			
			    				RemoveList RMVSkills = new RemoveList();
			    				
			    				try {
									RMVSkills.RMVSkillIDemployeeSkills(FunTestManDefid);
									
								} catch (SQLException e1) {
									e1.printStackTrace();}
			    				
			    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
			    				
								DefaultListModel listModel = (DefaultListModel) listFunTestMangement.getModel();
						        listModel.removeAllElements();
								filllistFunTestMangement(listFunTestMangement); 
			    				
			    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}	
			    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
			    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
					}
				});
				btnRMVSkillFunDefectTrack_1.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnRMVSkillFunDefectTrack_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnRMVSkillFunDefectTrack_1.setBorder(null);
				btnRMVSkillFunDefectTrack_1.setBackground(new Color(174, 174, 215));
				btnRMVSkillFunDefectTrack_1.setBounds(157, 594, 46, 14);
				panelFun.add(btnRMVSkillFunDefectTrack_1);
				
				JButton btnADDSkillFunCert = new JButton("+");
				btnADDSkillFunCert.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (AdminUser.equals("Y")){
							
							AddValueToList skillfunCert = new AddValueToList();
							try {
								listval = skillfunCert.add_SkillFUNCert();
							} catch (SQLException e1) {
								
								e1.printStackTrace();
							}
							//JList listFunCertifications = new JList();
							//scrollPane_FunCertification.setViewportView(listFunCertifications);
							DefaultListModel listModel = (DefaultListModel) listFunCertifications.getModel();
					        listModel.removeAllElements();
							filllistFunCertifications(listFunCertifications);
							
						}	
						else{
							JOptionPane.showMessageDialog(null, "admin use only");
						}		
						
					}
				});
				btnADDSkillFunCert.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnADDSkillFunCert.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnADDSkillFunCert.setBorder(null);
				btnADDSkillFunCert.setBackground(new Color(174, 174, 215));
				btnADDSkillFunCert.setBounds(572, 239, 46, 14);
				panelFun.add(btnADDSkillFunCert);
				
				JButton btnRMVSkillFunCert_1 = new JButton("-");
				btnRMVSkillFunCert_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);	
						if (AdminUser.equals("Y")){
			    			String selval = (String) listFunCertifications.getSelectedValue();
			    		  if (result == JOptionPane.OK_OPTION) {
			    			if (selval != null){
			    				LookupSkill myfunCert = new LookupSkill();
			    				int FunCertid = (int) myfunCert.lookuplistMYFunCert(selval);
			    			
			    				RemoveList RMVSkills = new RemoveList();
			    				
			    				try {
									RMVSkills.RMVSkillIDemployeeSkills(FunCertid);
									
								} catch (SQLException e1) {
									e1.printStackTrace();}
			    				
			    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
			    				
			    				DefaultListModel listModel = (DefaultListModel) listFunCertifications.getModel();
						        listModel.removeAllElements();
								filllistFunCertifications(listFunCertifications); 
			    				
			    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
			    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
			    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
					}
				});
				btnRMVSkillFunCert_1.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnRMVSkillFunCert_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnRMVSkillFunCert_1.setBorder(null);
				btnRMVSkillFunCert_1.setBackground(new Color(174, 174, 215));
				btnRMVSkillFunCert_1.setBounds(616, 239, 46, 14);
				panelFun.add(btnRMVSkillFunCert_1);
				
				JButton btnADDSkillFunBadge = new JButton("+");
				btnADDSkillFunBadge.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (AdminUser.equals("Y")){
							
							AddValueToList skillfunBadge = new AddValueToList();
							try {
								listval = skillfunBadge.add_SkillFUNBadge();
							} catch (SQLException e1) {
								
								e1.printStackTrace();
							}
							//JList listFunBadges = new JList();
							//scrollPane_FunBadges.setViewportView(listFunBadges);
							DefaultListModel listModel = (DefaultListModel) listFunBadges.getModel();
					        listModel.removeAllElements();
							filllistFunBadges(listFunBadges);
							
						}	
						else{
							JOptionPane.showMessageDialog(null, "admin use only");
						}			
					}
				});
				btnADDSkillFunBadge.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnADDSkillFunBadge.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnADDSkillFunBadge.setBorder(null);
				btnADDSkillFunBadge.setBackground(new Color(174, 174, 215));
				btnADDSkillFunBadge.setBounds(572, 422, 46, 14);
				panelFun.add(btnADDSkillFunBadge);
				
				JButton btnRMVSkillFunBadge_1 = new JButton("-");
				btnRMVSkillFunBadge_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
						if (AdminUser.equals("Y")){
			    			String selval = (String) listFunBadges.getSelectedValue();
			    		  if (result == JOptionPane.OK_OPTION) {
			    			if (selval != null){
			    				LookupSkill myfunBadge = new LookupSkill();
			    				int FunBadgeid = (int) myfunBadge.lookuplistMYFunBadge(selval);
			    			
			    				RemoveList RMVSkills = new RemoveList();
			    				
			    				try {
									RMVSkills.RMVSkillIDemployeeSkills(FunBadgeid);
									
								} catch (SQLException e1) {
									e1.printStackTrace();}
			    				
			    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
			    				DefaultListModel listModel = (DefaultListModel) listFunBadges.getModel();
						        listModel.removeAllElements();
								filllistFunBadges(listFunBadges); 
			    				
			    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
			    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
			    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
					}
				});
				btnRMVSkillFunBadge_1.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnRMVSkillFunBadge_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnRMVSkillFunBadge_1.setBorder(null);
				btnRMVSkillFunBadge_1.setBackground(new Color(174, 174, 215));
				btnRMVSkillFunBadge_1.setBounds(616, 422, 46, 14);
				panelFun.add(btnRMVSkillFunBadge_1);
				
				JLabel lblMonthOfExperience = new JLabel("Months of Experience with Functional Skills");
				lblMonthOfExperience.setHorizontalAlignment(SwingConstants.LEFT);
				lblMonthOfExperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblMonthOfExperience.setBounds(351, 14, 293, 14);
				panelFun.add(lblMonthOfExperience);
				
				JLabel lblManMnthOfExperience_1 = new JLabel("Years and");
				lblManMnthOfExperience_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblManMnthOfExperience_1.setBounds(187, 14, 58, 14);
				panelFun.add(lblManMnthOfExperience_1);
				
		JPanel panelMang = new JPanel();
		panelMang.setBackground(new Color(223, 196, 132));
		
		tabbedpane.add("ManagementSkill",panelMang);
		panelMang.setLayout(null);
		
		JLabel lblWelcomeLabel = new JLabel("WELCOME!");
		lblWelcomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWelcomeLabel.setBounds(10, 0, 82, 19);
		getContentPane().add(lblWelcomeLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 1, 173, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblManYearsOfExperience = new JLabel("I have");
		lblManYearsOfExperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManYearsOfExperience.setBounds(52, 15, 46, 14);
		panelMang.add(lblManYearsOfExperience);
		
		JLabel lblManagementTeamDemo = new JLabel("Leadership Team demography");
		lblManagementTeamDemo.setToolTipText("SkillZone");
		lblManagementTeamDemo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManagementTeamDemo.setBounds(10, 70, 180, 14);
		panelMang.add(lblManagementTeamDemo);
		
		JLabel lblManagementLeadership = new JLabel("Leadership Software Projects");
		lblManagementLeadership.setToolTipText("SkillFocus");
		lblManagementLeadership.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManagementLeadership.setBounds(10, 262, 166, 14);
		panelMang.add(lblManagementLeadership);
		
		JLabel lblManagementIndustry = new JLabel("Management Industry and Domain");
		lblManagementIndustry.setToolTipText("Skill Industry");
		lblManagementIndustry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManagementIndustry.setBounds(10, 478, 198, 14);
		panelMang.add(lblManagementIndustry);
		
		JLabel lblManagementTrain = new JLabel("Management Training");
		lblManagementTrain.setToolTipText("SkillTool");
		lblManagementTrain.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManagementTrain.setBounds(498, 70, 134, 14);
		panelMang.add(lblManagementTrain);
		
		JLabel lblManagementBadgeCert = new JLabel("Management Badges and Certifications");
		lblManagementBadgeCert.setToolTipText("CertBadge");
		lblManagementBadgeCert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManagementBadgeCert.setBounds(498, 478, 216, 14);
		panelMang.add(lblManagementBadgeCert);
		
		JLabel lblManagementSDLC = new JLabel("Management SDLC Tools");
		lblManagementSDLC.setToolTipText("SkillTool");
		lblManagementSDLC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManagementSDLC.setBounds(498, 262, 152, 14);
		panelMang.add(lblManagementSDLC);
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_24.setToolTipText("SkillFocus");
		lblNewLabel_24.setBounds(10, 677, 119, 8);
		panelMang.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_25.setToolTipText("SkillLevel");
		lblNewLabel_25.setBounds(215, 671, 119, 8);
		panelMang.add(lblNewLabel_25);
		
		JLabel lblManagementExp = new JLabel("Management Experience");
		lblManagementExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManagementExp.setBounds(10, 657, 140, 22);
		panelMang.add(lblManagementExp);
		
		JLabel lblMyManagementExp = new JLabel("My Management Experience");
		lblMyManagementExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyManagementExp.setBounds(626, 657, 180, 22);
		panelMang.add(lblMyManagementExp);
		
		JLabel lblMyManagementIndustry = new JLabel("MY Management Industry and Domain");
		lblMyManagementIndustry.setToolTipText("");
		lblMyManagementIndustry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyManagementIndustry.setBounds(254, 479, 216, 14);
		panelMang.add(lblMyManagementIndustry);
		
		JLabel lblMYManagementBadgeCert = new JLabel("MY Management Badges and Certifications");
		lblMYManagementBadgeCert.setToolTipText("");
		lblMYManagementBadgeCert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMYManagementBadgeCert.setBounds(736, 478, 232, 14);
		panelMang.add(lblMYManagementBadgeCert);
		
		JLabel lblMYManagementLeadership = new JLabel("MY Leadership Software Projects");
		lblMYManagementLeadership.setToolTipText("");
		lblMYManagementLeadership.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMYManagementLeadership.setBounds(254, 263, 188, 14);
		panelMang.add(lblMYManagementLeadership);
		
		JLabel lblMyLeadershipTeam = new JLabel("MY Leadership Team demography");
		lblMyLeadershipTeam.setToolTipText("");
		lblMyLeadershipTeam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyLeadershipTeam.setBounds(250, 71, 192, 14);
		panelMang.add(lblMyLeadershipTeam);
		
		JLabel lblMYManagementTrain = new JLabel("MY Management Training");
		lblMYManagementTrain.setToolTipText("");
		lblMYManagementTrain.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMYManagementTrain.setBounds(736, 71, 152, 14);
		panelMang.add(lblMYManagementTrain);
		
		JLabel lblMyManagementSdlc = new JLabel("MY Management SDLC Tools");
		lblMyManagementSdlc.setToolTipText("");
		lblMyManagementSdlc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMyManagementSdlc.setBounds(736, 263, 152, 14);
		panelMang.add(lblMyManagementSdlc);
		
		JLabel lblManMnthOfExperience = new JLabel("Years and");
		lblManMnthOfExperience.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManMnthOfExperience.setBounds(191, 15, 58, 14);
		panelMang.add(lblManMnthOfExperience);
		
		JLabel lblManMyYearsExp = new JLabel("Months of Experience with  Management Skills");
		lblManMyYearsExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManMyYearsExp.setBounds(355, 15, 306, 14);
		panelMang.add(lblManMyYearsExp);
		
		textFieldManMyYears = new JTextField();
		textFieldManMyYears.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldManMyYears.setEditable(false);
		textFieldManMyYears.setBackground(new Color(223, 196, 132));
		textFieldManMyYears.setColumns(10);
		textFieldManMyYears.setBounds(101, 8, 36, 25);
		panelMang.add(textFieldManMyYears);
		
		textFieldManMyMonth = new JTextField();
		textFieldManMyMonth.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldManMyMonth.setEditable(false);
		textFieldManMyMonth.setBackground(new Color(223, 196, 132));
		textFieldManMyMonth.setColumns(10);
		textFieldManMyMonth.setBounds(259, 8, 36, 25);
		panelMang.add(textFieldManMyMonth);
		
		JScrollPane scrollPane_ManExp = new JScrollPane();
		scrollPane_ManExp.setBounds(10, 677, 540, 42);
		panelMang.add(scrollPane_ManExp);
		
		
		String[] ManYrsitems = new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12","13", "14", "15","16", "17", "18","19", "20", "+20", "+30", "+40"};
		JComboBox cbManYearsExp = new JComboBox(ManYrsitems);
		cbManYearsExp.setBorder(null);
		cbManYearsExp.setSelectedIndex(-1);
		cbManYearsExp.setBackground(new Color(255, 255, 255));
		cbManYearsExp.addItemListener(new ItemListener() {
			String selval;
			public void itemStateChanged(ItemEvent e) {
				
				selval = String.valueOf(cbManYearsExp.getSelectedItem());
				
				String usrtxtfield=textField_1.getText();
				textFieldManMyYears.setText(selval);
				
				try {
				
					String query = "UPDATE profiledata SET MANYearExp=? WHERE profiledata.username =?";
					
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, selval);
					pst.setString(2, usrtxtfield);
					pst.execute();
				
				} catch (Exception ex) {
					
					JOptionPane.showMessageDialog(null, " exception error Data not Saved");
					ex.printStackTrace();
					}
			}
		});
		cbManYearsExp.setBounds(136, 8, 39, 22);
		panelMang.add(cbManYearsExp);
		
		String[] ManMnthitems = new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12"};
		JComboBox cbManMonthExp = new JComboBox(ManMnthitems);
		cbManMonthExp.setBorder(null);
		cbManMonthExp.setSelectedIndex(-1);
		cbManMonthExp.setBackground(new Color(255, 255, 255));
		cbManMonthExp.addItemListener(new ItemListener() {
			String selval;
			public void itemStateChanged(ItemEvent e) {
				
				selval = String.valueOf(cbManMonthExp.getSelectedItem());
			
				String usrtxtfield=textField_1.getText();
				textFieldManMyMonth.setText(selval);
				
				try {
				
					String query = "UPDATE profiledata SET MANMnthExp=? WHERE profiledata.username =?";
					
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, selval);
					pst.setString(2, usrtxtfield);
					pst.execute();
				
				} catch (Exception ex) {
					
					JOptionPane.showMessageDialog(null, " exception error Data not Saved");
					ex.printStackTrace();
					}
				
			}
		});
		cbManMonthExp.setBounds(298, 8, 36, 22);
		panelMang.add(cbManMonthExp);
		
		JScrollPane scrollPane_ManLeadership = new JScrollPane();
		scrollPane_ManLeadership.setBounds(10, 95, 188, 143);
		panelMang.add(scrollPane_ManLeadership);
		
		JList listManLeadership = new JList();
		scrollPane_ManLeadership.setViewportView(listManLeadership);
		filllistLeadTeamDemo(listManLeadership);

		JScrollPane scrollPane_ManTraining = new JScrollPane();
		scrollPane_ManTraining.setBounds(498, 98, 173, 137);
		panelMang.add(scrollPane_ManTraining);
		
		JList listManTraining = new JList();
		scrollPane_ManTraining.setViewportView(listManTraining);
		filllistManTraining(listManTraining);
		
		JScrollPane scrollPane_MYManTraining = new JScrollPane();
		scrollPane_MYManTraining.setBounds(736, 98, 232, 140);
		panelMang.add(scrollPane_MYManTraining);
		
		JList MYlistManTraining = new JList(MYMANTraining);
		scrollPane_MYManTraining.setViewportView(MYlistManTraining);
		
		JScrollPane scrollPane_ManLeadSoftPrj = new JScrollPane();
		scrollPane_ManLeadSoftPrj.setBounds(10, 287, 188, 143);
		panelMang.add(scrollPane_ManLeadSoftPrj);
		
		JList listManLeadSoftPrj = new JList();
		scrollPane_ManLeadSoftPrj.setViewportView(listManLeadSoftPrj);
		filllistLeadSoftPrj(listManLeadSoftPrj);
		
		JScrollPane scrollPane_MYLeadSoftPrj = new JScrollPane();
		scrollPane_MYLeadSoftPrj.setBounds(254, 287, 216, 143);
		panelMang.add(scrollPane_MYLeadSoftPrj);
		
		JList MYlistManLeadSoftPrj = new JList(MYMANLeadSoftPrj);
		scrollPane_MYLeadSoftPrj.setViewportView(MYlistManLeadSoftPrj);
		
		JScrollPane scrollPane_ManSDLC = new JScrollPane();
		scrollPane_ManSDLC.setBounds(498, 287, 173, 143);
		panelMang.add(scrollPane_ManSDLC);
		
		JList listManSDLC = new JList();
		scrollPane_ManSDLC.setViewportView(listManSDLC);
		filllistManSDLC(listManSDLC);
	    
	    JScrollPane scrollPane_MYManSDLC = new JScrollPane();
	    scrollPane_MYManSDLC.setBounds(736, 287, 244, 137);
	    panelMang.add(scrollPane_MYManSDLC);
	    
	    JList MYlistManSDLC = new JList(MYMANSDLC);
	    scrollPane_MYManSDLC.setViewportView(MYlistManSDLC);
		
		JScrollPane scrollPane_ManIndDom = new JScrollPane();
		scrollPane_ManIndDom.setBounds(10, 503, 188, 130);
		panelMang.add(scrollPane_ManIndDom);
		
		JList listManIndDom = new JList();
		scrollPane_ManIndDom.setColumnHeaderView(listManIndDom);
		filllistManIndDom(listManIndDom);
		
		JScrollPane scrollPane_MYManIndDom = new JScrollPane();
		scrollPane_MYManIndDom.setBounds(254, 503, 216, 130);
		panelMang.add(scrollPane_MYManIndDom);
		
		JList MYlistManIndDom = new JList(MYMANIndDom);
		scrollPane_MYManIndDom.setViewportView(MYlistManIndDom);
		
		JScrollPane scrollPane_ManBadgeCert = new JScrollPane();
		scrollPane_ManBadgeCert.setBounds(498, 503, 173, 130);
		panelMang.add(scrollPane_ManBadgeCert);
		
		JList listManBadgeCert = new JList();
		scrollPane_ManBadgeCert.setViewportView(listManBadgeCert);
		filllistManBadgeCert(listManBadgeCert);
		
		JScrollPane scrollPane_MYManBadgeCert = new JScrollPane();
		scrollPane_MYManBadgeCert.setBounds(736, 503, 244, 130);
		panelMang.add(scrollPane_MYManBadgeCert);
		
		JList MYlistManBadgeCert = new JList(MYMANBadgeCert);
		scrollPane_MYManBadgeCert.setViewportView(MYlistManBadgeCert);
		
		JScrollPane scrollPane_MYLeadTeamDem = new JScrollPane();
		scrollPane_MYLeadTeamDem.setBounds(256, 96, 214, 141);
		panelMang.add(scrollPane_MYLeadTeamDem);
		
		JList MylistManLeadership_1 = new JList(MYManLeadership);
		scrollPane_MYLeadTeamDem.setViewportView(MylistManLeadership_1);
		
		JScrollPane scrollPane_TableMyManExp = new JScrollPane();
		scrollPane_TableMyManExp.setBounds(626, 677, 411, 94);
		panelMang.add(scrollPane_TableMyManExp);
		
		JScrollPane scrollPane_MYManExp= new JScrollPane();
		scrollPane_TableMyManExp.setViewportView(scrollPane_MYManExp);
		
		
		tableManagementExp = new JTable(1, 2);
		scrollPane_ManExp.setViewportView(tableManagementExp);
		tableManagementExp.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Management Skill", "Management Level"
			}
		));
		tableManagementExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		TableColumn ManagementExpColumn1 = tableManagementExp.getColumnModel().getColumn(0);
		
    	TableColumn ManagementExpColumn2 = tableManagementExp.getColumnModel().getColumn(1); 
    
    		JComboBox<String> cbManExpSkill = new JComboBox<>();
    		fillcbManExpSkill(cbManExpSkill);
    		ManagementExpColumn1.setCellEditor(new DefaultCellEditor(cbManExpSkill));	
    
    		JComboBox<String> cbManExpLvl = new JComboBox<>();	    
    		fillcbManExpLvl(cbManExpLvl);
    		ManagementExpColumn2.setCellEditor(new DefaultCellEditor(cbManExpLvl));	
    		
    	tableMyManagementExp = new JTable();
    	scrollPane_MYManExp.setViewportView(tableMyManagementExp);
    	tableMyManagementExp.setModel(new DefaultTableModel(
    			new Object[][] {
    			},
    			new String[] {
    				"Management Skill", "Management Level"
    			}
    		));
    		
    		tableMyManagementExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
    		
    		JButton btnAddManLeadTeam = new JButton(">>");
    		btnAddManLeadTeam.setBorder(null);
    		btnAddManLeadTeam.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    			String LeaderTeamstr1 = (String) listManLeadership.getSelectedValue();
    				if (LeaderTeamstr1 != null) {
    					if (MYManLeadership.contains(LeaderTeamstr1)) {
    						JOptionPane.showMessageDialog(null, "Already in List");
    					}else {
    						MYManLeadership.addElement(LeaderTeamstr1);
    					
    						String tempusrname = textField_1.getText();
    						SaveList mysavelist = new SaveList();
    						mysavelist.SAVEmylistManLeadership(LeaderTeamstr1, tempusrname);
    						}
    				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");				
    			}
    		});
    				
    		btnAddManLeadTeam.setForeground(new Color(204, 64, 74));
    		btnAddManLeadTeam.setFont(new Font("Tahoma", Font.BOLD, 11));
    		btnAddManLeadTeam.setBackground(new Color(223, 196, 132));
    		btnAddManLeadTeam.setBounds(208, 93, 31, 22);
    		panelMang.add(btnAddManLeadTeam);
    		
    	JButton btnRemoveManLeadTeam = new JButton("<<");
    	btnRemoveManLeadTeam.setBorder(null);
    			btnRemoveManLeadTeam.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    			String LeaderTeamstr1 = (String) MylistManLeadership_1.getSelectedValue();
    			int myselectedindex = MylistManLeadership_1.getSelectedIndex();
    				if (LeaderTeamstr1 != null) {
    					if(MylistManLeadership_1.getSelectedIndex()>=0)
    					
    						MYManLeadership.remove(MylistManLeadership_1.getSelectedIndex());
    				
    					String tempusrname = textField_1.getText();
    				
    					RemoveList myremovelist = new RemoveList();
    					myremovelist.REMOVEmylistManLeadership(LeaderTeamstr1, tempusrname);
    				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
    		}
    		});
    		
    		btnRemoveManLeadTeam.setVerticalTextPosition(SwingConstants.TOP);
    		btnRemoveManLeadTeam.setVerticalAlignment(SwingConstants.TOP);
    		btnRemoveManLeadTeam.setForeground(new Color(204, 64, 74));
    		btnRemoveManLeadTeam.setFont(new Font("Tahoma", Font.BOLD, 11));
    		btnRemoveManLeadTeam.setBackground(new Color(223, 196, 132));
    		btnRemoveManLeadTeam.setBounds(208, 126, 31, 22);
    		panelMang.add(btnRemoveManLeadTeam);
			
		JButton btnAddManExp = new JButton(" >>");
		btnAddManExp.setBorder(null);
		btnAddManExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					int rowIndex = 0;
	    			int vColIndex = 0;
					
					// This is the <skill> row 0 col 0						
					Object o = tableManagementExp.getValueAt(rowIndex, vColIndex);	
					
					// This is the <level> row 0 col 1 						
					vColIndex = (vColIndex +1);						
					Object ob = tableManagementExp.getValueAt(rowIndex, vColIndex);						
					
					if ((o != null)&&(ob !=  null)) {
						String Str1 = o.toString();						
						String Str2 = ob.toString();
						
						//This is add a row	
						AddRowManagementSkill(Str1,Str2);		
					}else {
						
						JOptionPane.showMessageDialog(null, "please enter a value for ManagementSkill and its corresponding Level!");
					}
					
					 							
				}catch (Exception ez) {							
				ez.printStackTrace();
				
				} 	
				
			}
		});
		btnAddManExp.setVerticalTextPosition(SwingConstants.TOP);
		btnAddManExp.setVerticalAlignment(SwingConstants.TOP);
		btnAddManExp.setForeground(new Color(204, 64, 74));
		btnAddManExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddManExp.setBackground(new Color(223, 196, 132));
		btnAddManExp.setBounds(560, 684, 56, 22);
		panelMang.add(btnAddManExp);
		
		JButton btnRemoveManExp = new JButton("<<");
		btnRemoveManExp.setBorder(null);
		btnRemoveManExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tableMyManagementExp.getSelectedRow()>=0) {
	                
					int selrow = (tableMyManagementExp.getSelectedRow());
					String ibstr1 = ((DefaultTableModel)tableMyManagementExp.getModel()).getValueAt(selrow, 0).toString();
					String ibstr2 = ((DefaultTableModel)tableMyManagementExp.getModel()).getValueAt(selrow, 1).toString();
					
					// Remove from the LIST
					((DefaultTableModel)tableMyManagementExp.getModel()).removeRow(selrow);
				
					//Remove from DB
					
					String tempusrname = textField_1.getText();
					
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVEManSkillExpTable(ibstr1,ibstr2, tempusrname);	
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		btnRemoveManExp.setVerticalTextPosition(SwingConstants.TOP);
		btnRemoveManExp.setVerticalAlignment(SwingConstants.TOP);
		btnRemoveManExp.setForeground(new Color(204, 64, 74));
		btnRemoveManExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveManExp.setBackground(new Color(223, 196, 132));
		btnRemoveManExp.setBounds(560, 710, 56, 22);
		panelMang.add(btnRemoveManExp);
		
		JButton btnAddManTrain = new JButton(" >>");
		btnAddManTrain.setBorder(null);
		btnAddManTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String MANTrainingstr1 = (String) listManTraining.getSelectedValue();
				if (MANTrainingstr1 != null) {
					if (MYMANTraining.contains(MANTrainingstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYMANTraining.addElement(MANTrainingstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVEmylistManTraining(MANTrainingstr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
			}
		});
		btnAddManTrain.setVerticalTextPosition(SwingConstants.TOP);
		btnAddManTrain.setVerticalAlignment(SwingConstants.TOP);
		btnAddManTrain.setForeground(new Color(204, 64, 74));
		btnAddManTrain.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddManTrain.setBackground(new Color(223, 196, 132));
		btnAddManTrain.setBounds(681, 97, 27, 22);
		panelMang.add(btnAddManTrain);
		
		JButton btnRemoveManTrain = new JButton("<<");
		btnRemoveManTrain.setBorder(null);
		btnRemoveManTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYManTrainingstr1 = (String) MYlistManTraining.getSelectedValue();
			int myselectedindex = MYlistManTraining.getSelectedIndex();
				if (MYManTrainingstr1 != null) {
					if(MYlistManTraining.getSelectedIndex()>=0)
					
						MYMANTraining.remove(MYlistManTraining.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYManTraining(MYManTrainingstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
		}
		});
		btnRemoveManTrain.setVerticalTextPosition(SwingConstants.TOP);
		btnRemoveManTrain.setVerticalAlignment(SwingConstants.TOP);
		btnRemoveManTrain.setForeground(new Color(204, 64, 74));
		btnRemoveManTrain.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveManTrain.setBackground(new Color(223, 196, 132));
		btnRemoveManTrain.setBounds(681, 126, 27, 22);
		panelMang.add(btnRemoveManTrain);
		
		JButton btnAddManLeadership = new JButton(" >>");
		btnAddManLeadership.setBorder(null);
		btnAddManLeadership.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String MANLeaderSoftstr1 = (String) listManLeadSoftPrj.getSelectedValue();
				if (MANLeaderSoftstr1 != null) {
					if (MYMANLeadSoftPrj.contains(MANLeaderSoftstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYMANLeadSoftPrj.addElement(MANLeaderSoftstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVEmylistManLeaderSoftPrj(MANLeaderSoftstr1, tempusrname);
						}	
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
		}
		});
		btnAddManLeadership.setVerticalTextPosition(SwingConstants.TOP);
		btnAddManLeadership.setVerticalAlignment(SwingConstants.TOP);
		btnAddManLeadership.setForeground(new Color(204, 64, 74));
		btnAddManLeadership.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddManLeadership.setBackground(new Color(223, 196, 132));
		btnAddManLeadership.setBounds(208, 294, 27, 22);
		panelMang.add(btnAddManLeadership);
		
		JButton btnRemoveManLeadership = new JButton("<<");
		btnRemoveManLeadership.setBorder(null);
		btnRemoveManLeadership.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYManLeadSoftstr1 = (String) MYlistManLeadSoftPrj.getSelectedValue();
			int myselectedindex = MYlistManLeadSoftPrj.getSelectedIndex();
				if (MYManLeadSoftstr1 != null) {
					if(MYlistManLeadSoftPrj.getSelectedIndex()>=0)
					
						MYMANLeadSoftPrj.remove(MYlistManLeadSoftPrj.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYManLeadSoft(MYManLeadSoftstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
		}
		});
		btnRemoveManLeadership.setVerticalTextPosition(SwingConstants.TOP);
		btnRemoveManLeadership.setVerticalAlignment(SwingConstants.TOP);
		btnRemoveManLeadership.setForeground(new Color(204, 64, 74));
		btnRemoveManLeadership.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveManLeadership.setBackground(new Color(223, 196, 132));
		btnRemoveManLeadership.setBounds(208, 322, 26, 22);
		panelMang.add(btnRemoveManLeadership);
		
		JButton btnAddManIndustry = new JButton(" >>");
		btnAddManIndustry.setBorder(null);
		btnAddManIndustry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String MANIndustrystr1 = (String) listManIndDom.getSelectedValue();
				if (MANIndustrystr1 != null) {
					if (MYMANIndDom.contains(MANIndustrystr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYMANIndDom.addElement(MANIndustrystr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVEmylistManIndustry(MANIndustrystr1, tempusrname);
						}	
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
		}
		});
		btnAddManIndustry.setVerticalTextPosition(SwingConstants.TOP);
		btnAddManIndustry.setVerticalAlignment(SwingConstants.TOP);
		btnAddManIndustry.setForeground(new Color(204, 64, 74));
		btnAddManIndustry.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddManIndustry.setBackground(new Color(223, 196, 132));
		btnAddManIndustry.setBounds(208, 510, 31, 22);
		panelMang.add(btnAddManIndustry);
		
		JButton btnRemoveManIndustry = new JButton("<<");
		btnRemoveManIndustry.setBorder(null);
		btnRemoveManIndustry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYManIndDomstr1 = (String) MYlistManIndDom.getSelectedValue();
			int myselectedindex = MYlistManIndDom.getSelectedIndex();
				if (MYManIndDomstr1 != null) {
					if(MYlistManIndDom.getSelectedIndex()>=0)
					
						MYMANIndDom.remove(MYlistManIndDom.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYManIndDomain(MYManIndDomstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
		}
		});
		btnRemoveManIndustry.setVerticalTextPosition(SwingConstants.TOP);
		btnRemoveManIndustry.setVerticalAlignment(SwingConstants.TOP);
		btnRemoveManIndustry.setForeground(new Color(204, 64, 74));
		btnRemoveManIndustry.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveManIndustry.setBackground(new Color(223, 196, 132));
		btnRemoveManIndustry.setBounds(208, 543, 29, 22);
		panelMang.add(btnRemoveManIndustry);
		
		JButton btnAddManSDLC = new JButton(" >>");
		btnAddManSDLC.setBorder(null);
		btnAddManSDLC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String MANSDLCstr1 = (String) listManSDLC.getSelectedValue();
				if (MANSDLCstr1 != null) {
					if (MYMANSDLC.contains(MANSDLCstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYMANSDLC.addElement(MANSDLCstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVEmylistManSDLC(MANSDLCstr1, tempusrname);
						}	
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");
		}
		});
		btnAddManSDLC.setVerticalTextPosition(SwingConstants.TOP);
		btnAddManSDLC.setVerticalAlignment(SwingConstants.TOP);
		btnAddManSDLC.setForeground(new Color(204, 64, 74));
		btnAddManSDLC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddManSDLC.setBackground(new Color(223, 196, 132));
		btnAddManSDLC.setBounds(681, 294, 31, 22);
		panelMang.add(btnAddManSDLC);
		
		JButton btnRemoveManSDLC = new JButton("<<");
		btnRemoveManSDLC.setBorder(null);
		btnRemoveManSDLC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYManSDLCstr1 = (String) MYlistManSDLC.getSelectedValue();
			int myselectedindex = MYlistManSDLC.getSelectedIndex();
				if (MYManSDLCstr1 != null) {
					if(MYlistManSDLC.getSelectedIndex()>=0)
					
						MYMANSDLC.remove(MYlistManSDLC.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYManSDLC(MYManSDLCstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
		}
		});
		btnRemoveManSDLC.setVerticalTextPosition(SwingConstants.TOP);
		btnRemoveManSDLC.setVerticalAlignment(SwingConstants.TOP);
		btnRemoveManSDLC.setForeground(new Color(204, 64, 74));
		btnRemoveManSDLC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveManSDLC.setBackground(new Color(223, 196, 132));
		btnRemoveManSDLC.setBounds(681, 322, 27, 22);
		panelMang.add(btnRemoveManSDLC);
		
		JButton btnAddManBadgesCert = new JButton(" >>");
		btnAddManBadgesCert.setBorder(null);
		btnAddManBadgesCert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String MANBadgeCertstr1 = (String) listManBadgeCert.getSelectedValue();
				if (MANBadgeCertstr1 != null) {
					if (MYMANBadgeCert.contains(MANBadgeCertstr1)) {
						JOptionPane.showMessageDialog(null, "Already in List");
					}else {
						MYMANBadgeCert.addElement(MANBadgeCertstr1);
					
						String tempusrname = textField_1.getText();
						SaveList mysavelist = new SaveList();
						mysavelist.SAVEmylistManBadgeCert(MANBadgeCertstr1, tempusrname);
						}
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list");	
		}
		});
		btnAddManBadgesCert.setVerticalTextPosition(SwingConstants.TOP);
		btnAddManBadgesCert.setVerticalAlignment(SwingConstants.TOP);
		btnAddManBadgesCert.setForeground(new Color(204, 64, 74));
		btnAddManBadgesCert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddManBadgesCert.setBackground(new Color(223, 196, 132));
		btnAddManBadgesCert.setBounds(681, 510, 26, 22);
		panelMang.add(btnAddManBadgesCert);
		
		JButton btnRemoveManBadgesCert = new JButton("<<");
		btnRemoveManBadgesCert.setBorder(null);
		btnRemoveManBadgesCert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String MYManBadgeCertstr1 = (String) MYlistManBadgeCert.getSelectedValue();
			int myselectedindex = MYlistManBadgeCert.getSelectedIndex();
				if (MYManBadgeCertstr1 != null) {
					if(MYlistManBadgeCert.getSelectedIndex()>=0)
					
						MYMANBadgeCert.remove(MYlistManBadgeCert.getSelectedIndex());
				
					String tempusrname = textField_1.getText();
				
					RemoveList myremovelist = new RemoveList();
					myremovelist.REMOVElistMYManBadgeCert(MYManBadgeCertstr1, tempusrname);
				}else JOptionPane.showMessageDialog(null, "Please Select a value from the list>>>>");
		}
		});
		btnRemoveManBadgesCert.setVerticalTextPosition(SwingConstants.TOP);
		btnRemoveManBadgesCert.setVerticalAlignment(SwingConstants.TOP);
		btnRemoveManBadgesCert.setForeground(new Color(204, 64, 74));
		btnRemoveManBadgesCert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemoveManBadgesCert.setBackground(new Color(223, 196, 132));
		btnRemoveManBadgesCert.setBounds(681, 543, 26, 22);
		panelMang.add(btnRemoveManBadgesCert);
		
		JButton btnADDSkillManTeamDem = new JButton("+");
		btnADDSkillManTeamDem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillManTeamDem = new AddValueToList();
					try {
						listval = skillManTeamDem.add_SkillManTeamDem();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listManLeadership = new JList();
					//scrollPane_ManLeadership.setViewportView(listManLeadership);
					DefaultListModel listModel = (DefaultListModel) listManLeadership.getModel();
			        listModel.removeAllElements();
					filllistLeadTeamDemo(listManLeadership);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}			
				
			}
		});
		btnADDSkillManTeamDem.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillManTeamDem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillManTeamDem.setBorder(null);
		btnADDSkillManTeamDem.setBackground(new Color(223, 196, 132));
		btnADDSkillManTeamDem.setBounds(74, 237, 46, 14);
		panelMang.add(btnADDSkillManTeamDem);
		
		JButton btnRMVSkillManTeamDem_1 = new JButton("-");
		btnRMVSkillManTeamDem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listManLeadership.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mymanLeaderTeam = new LookupSkill();
	    				int ManLeadTeamsid = (int) mymanLeaderTeam.lookupManLeaderTeam(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(ManLeadTeamsid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				DefaultListModel listModel = (DefaultListModel) listManLeadership.getModel();
				        listModel.removeAllElements();
				        filllistLeadTeamDemo(listManLeadership); 
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}	
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillManTeamDem_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillManTeamDem_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillManTeamDem_1.setBorder(null);
		btnRMVSkillManTeamDem_1.setBackground(new Color(223, 196, 132));
		btnRMVSkillManTeamDem_1.setBounds(118, 237, 46, 14);
		panelMang.add(btnRMVSkillManTeamDem_1);
		
		JButton btnADDSkillManSoftProj = new JButton("+");
		btnADDSkillManSoftProj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (AdminUser.equals("Y")){
					
					AddValueToList skillManSoftProj = new AddValueToList();
					try {
						listval = skillManSoftProj.add_SkillManSoftProj();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listManLeadSoftPrj = new JList();
					//scrollPane_ManLeadSoftPrj.setViewportView(listManLeadSoftPrj);
					DefaultListModel listModel = (DefaultListModel) listManLeadSoftPrj.getModel();
			        listModel.removeAllElements();
					filllistLeadSoftPrj(listManLeadSoftPrj);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
			}
		});
		btnADDSkillManSoftProj.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillManSoftProj.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillManSoftProj.setBorder(null);
		btnADDSkillManSoftProj.setBackground(new Color(223, 196, 132));
		btnADDSkillManSoftProj.setBounds(74, 428, 46, 14);
		panelMang.add(btnADDSkillManSoftProj);
		
		JButton btnRMVSkillManSoftProj_1 = new JButton("-");
		btnRMVSkillManSoftProj_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listManLeadSoftPrj.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mymanLeaderSoftPrj = new LookupSkill();
	    				int MANLeaderSoftid = (int) mymanLeaderSoftPrj.lookuplistManLeaderSoftPrj(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(MANLeaderSoftid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				
	    				DefaultListModel listModel = (DefaultListModel) listManLeadSoftPrj.getModel();
				        listModel.removeAllElements();
				        filllistLeadSoftPrj(listManLeadSoftPrj);
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillManSoftProj_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillManSoftProj_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillManSoftProj_1.setBorder(null);
		btnRMVSkillManSoftProj_1.setBackground(new Color(223, 196, 132));
		btnRMVSkillManSoftProj_1.setBounds(118, 428, 46, 14);
		panelMang.add(btnRMVSkillManSoftProj_1);
		
		JButton btnADDSkillManIndDom = new JButton("+");
		btnADDSkillManIndDom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (AdminUser.equals("Y")){
					
					AddValueToList skillManIndDom = new AddValueToList();
					try {
						listval = skillManIndDom.add_SkillManIndDom();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listManIndDom = new JList();
					//scrollPane_ManIndDom.setViewportView(listManIndDom);
					DefaultListModel listModel = (DefaultListModel) listManIndDom.getModel();
			        listModel.removeAllElements();
					filllistManIndDom(listManIndDom);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}	
			}
		});
		btnADDSkillManIndDom.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillManIndDom.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillManIndDom.setBorder(null);
		btnADDSkillManIndDom.setBackground(new Color(223, 196, 132));
		btnADDSkillManIndDom.setBounds(86, 632, 46, 14);
		panelMang.add(btnADDSkillManIndDom);
		
		JButton btnRMVSkillManIndDom_1 = new JButton("-");
		btnRMVSkillManIndDom_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listManIndDom.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mymanIndustry = new LookupSkill();
	    				int MANIndustryid = (int) mymanIndustry.lookuplistManIndustry(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(MANIndustryid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				DefaultListModel listModel = (DefaultListModel) listManIndDom.getModel();
				        listModel.removeAllElements();
				        filllistManIndDom(listManIndDom);
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillManIndDom_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillManIndDom_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillManIndDom_1.setBorder(null);
		btnRMVSkillManIndDom_1.setBackground(new Color(223, 196, 132));
		btnRMVSkillManIndDom_1.setBounds(130, 632, 46, 14);
		panelMang.add(btnRMVSkillManIndDom_1);
		
		JButton btnADDSkillManTraining = new JButton("+");
		btnADDSkillManTraining.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillManTrain = new AddValueToList();
					try {
						listval = skillManTrain.add_SkillManTraining();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listManTraining = new JList();
					//scrollPane_ManTraining.setViewportView(listManTraining);
					DefaultListModel listModel = (DefaultListModel) listManTraining.getModel();
			        listModel.removeAllElements();
					filllistManTraining(listManTraining);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}		
				
			}
		});
		btnADDSkillManTraining.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillManTraining.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillManTraining.setBorder(null);
		btnADDSkillManTraining.setBackground(new Color(223, 196, 132));
		btnADDSkillManTraining.setBounds(556, 237, 46, 14);
		panelMang.add(btnADDSkillManTraining);
		
		JButton btnRMVSkillManTraining_1 = new JButton("-");
		btnRMVSkillManTraining_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listManTraining.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mymanTraining = new LookupSkill();
	    				int MANTrainid = (int) mymanTraining.lookuplistManTraining(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(MANTrainid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				DefaultListModel listModel = (DefaultListModel) listManTraining.getModel();
				        listModel.removeAllElements();
				        filllistManTraining(listManTraining); 
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}	
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillManTraining_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillManTraining_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillManTraining_1.setBorder(null);
		btnRMVSkillManTraining_1.setBackground(new Color(223, 196, 132));
		btnRMVSkillManTraining_1.setBounds(604, 237, 46, 14);
		panelMang.add(btnRMVSkillManTraining_1);
		
		JButton btnADDSkillManSDLCTools = new JButton("+");
		btnADDSkillManSDLCTools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillManSDLCTool = new AddValueToList();
					try {
						listval = skillManSDLCTool.add_SkillManSDLCTool();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listManSDLC = new JList();
					//scrollPane_ManSDLC.setViewportView(listManSDLC);
					DefaultListModel listModel = (DefaultListModel) listManSDLC.getModel();
			        listModel.removeAllElements();
					filllistManSDLC(listManSDLC);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}			
				
			}
		});
		btnADDSkillManSDLCTools.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillManSDLCTools.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillManSDLCTools.setBorder(null);
		btnADDSkillManSDLCTools.setBackground(new Color(223, 196, 132));
		btnADDSkillManSDLCTools.setBounds(556, 428, 46, 14);
		panelMang.add(btnADDSkillManSDLCTools);
		
		JButton btnRMVSkillManSDLCTools_1 = new JButton("-");
		btnRMVSkillManSDLCTools_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listManSDLC.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mymanSDLC = new LookupSkill();
	    				int MANSDLCid = (int) mymanSDLC.lookuplistManSDLC(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(MANSDLCid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				DefaultListModel listModel = (DefaultListModel) listManSDLC.getModel();
				        listModel.removeAllElements();
				        filllistManSDLC(listManSDLC); 
				        
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillManSDLCTools_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillManSDLCTools_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillManSDLCTools_1.setBorder(null);
		btnRMVSkillManSDLCTools_1.setBackground(new Color(223, 196, 132));
		btnRMVSkillManSDLCTools_1.setBounds(604, 428, 46, 14);
		panelMang.add(btnRMVSkillManSDLCTools_1);
		
		JButton btnADDSkillManBadCert = new JButton("+");
		btnADDSkillManBadCert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillManBadCert = new AddValueToList();
					try {
						listval = skillManBadCert.add_SkillManBadCert();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					//JList listManBadgeCert = new JList();
					//scrollPane_ManBadgeCert.setViewportView(listManBadgeCert);
					DefaultListModel listModel = (DefaultListModel) listManBadgeCert.getModel();
			        listModel.removeAllElements();
					filllistManBadgeCert(listManBadgeCert);
					
				}	
				else{
					JOptionPane.showMessageDialog(null, "admin use only");
				}			
				
			}
		});
		btnADDSkillManBadCert.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillManBadCert.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillManBadCert.setBorder(null);
		btnADDSkillManBadCert.setBackground(new Color(223, 196, 132));
		btnADDSkillManBadCert.setBounds(556, 632, 46, 14);
		panelMang.add(btnADDSkillManBadCert);
		
		JButton btnRMVSkillManBadCert_1 = new JButton("-");
		btnRMVSkillManBadCert_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
	    			String selval = (String) listManBadgeCert.getSelectedValue();
	    		  if (result == JOptionPane.OK_OPTION) {
	    			if (selval != null){
	    				LookupSkill mymanBadgeCert = new LookupSkill();
	    				int MANBadgeCertid = (int) mymanBadgeCert.lookuplistManBadgeCert(selval);
	    			
	    				RemoveList RMVSkills = new RemoveList();
	    				
	    				try {
							RMVSkills.RMVSkillIDemployeeSkills(MANBadgeCertid);
							
						} catch (SQLException e1) {
							e1.printStackTrace();}
	    				
	    				JOptionPane.showMessageDialog(null, "Skill removed from employee and Skill DB");
	    				DefaultListModel listModel = (DefaultListModel) listManBadgeCert.getModel();
				        listModel.removeAllElements();
				        filllistManBadgeCert(listManBadgeCert);
	    				
	    			}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}
	    		  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
	    		}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillManBadCert_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillManBadCert_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillManBadCert_1.setBorder(null);
		btnRMVSkillManBadCert_1.setBackground(new Color(223, 196, 132));
		btnRMVSkillManBadCert_1.setBounds(604, 632, 46, 14);
		panelMang.add(btnRMVSkillManBadCert_1);
		
		JButton btnADDSkillManExp = new JButton("+");
		btnADDSkillManExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillManExpskill = new AddValueToList();
						try {
							listval = skillManExpskill.add_SkillManExpCol1();
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbManExpSkill.getModel();
    	        		model.removeAllElements();	
			    		fillcbManExpSkill(cbManExpSkill);
					}	
					else{
						JOptionPane.showMessageDialog(null, "admin use only");
					}
			}
		});
		btnADDSkillManExp.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillManExp.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillManExp.setBorder(null);
		btnADDSkillManExp.setBackground(new Color(223, 196, 132));
		btnADDSkillManExp.setBounds(118, 718, 46, 14);
		panelMang.add(btnADDSkillManExp);
		
		JButton btnRMVSkillManExp_1 = new JButton("-");
		btnRMVSkillManExp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
					String listval = (String) cbManExpSkill.getSelectedItem();
				  if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
						
						RemoveList RMVfromEmplySkillManExpSkill = new RemoveList();
						try {
							RMVfromEmplySkillManExpSkill.RMVManExpSkillEmplyTable(listval);	
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						RemoveList RMVfromSkillTableManExpSkill = new RemoveList();
						try {
							RMVfromSkillTableManExpSkill.RMVManExpSkillsTable(listval);
						}catch (SQLException e2) {
							{e2.printStackTrace();}
								
							DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbManExpSkill.getModel();
			        		model.removeAllElements();
			        		fillcbManExpSkill(cbManExpSkill);
					}	
					}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}	
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
				}else{JOptionPane.showMessageDialog(null, "admin use only");}
				
			}
		});
		btnRMVSkillManExp_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillManExp_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillManExp_1.setBorder(null);
		btnRMVSkillManExp_1.setBackground(new Color(223, 196, 132));
		btnRMVSkillManExp_1.setBounds(166, 718, 46, 14);
		panelMang.add(btnRMVSkillManExp_1);
		
		JButton btnADDSkillManExpLvl = new JButton("+");
		btnADDSkillManExpLvl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (AdminUser.equals("Y")){
					
					AddValueToList skillManExplevel = new AddValueToList();
						try {
							listval = skillManExplevel.add_SkillManExpCol2();
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbManExpLvl.getModel();
    	        		model.removeAllElements();    
			    		fillcbManExpLvl(cbManExpLvl);
						
					}	
					else{
						JOptionPane.showMessageDialog(null, "admin use only");
					}		
			}
		});
		btnADDSkillManExpLvl.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnADDSkillManExpLvl.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnADDSkillManExpLvl.setBorder(null);
		btnADDSkillManExpLvl.setBackground(new Color(223, 196, 132));
		btnADDSkillManExpLvl.setBounds(336, 718, 46, 14);
		panelMang.add(btnADDSkillManExpLvl);
		
		JButton btnRMVSkillManExpLvl_1 = new JButton("-");
		btnRMVSkillManExpLvl_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null, "Do you wish to remove value from list?", "CONFIRM",JOptionPane.OK_CANCEL_OPTION);
				if (AdminUser.equals("Y")){
					String listval = (String) cbManExpLvl.getSelectedItem();
				  if (result == JOptionPane.OK_OPTION) {
					if (listval != null){
						
						RemoveList RMVfromEmplySkillManExpLvl = new RemoveList();
						try {
							RMVfromEmplySkillManExpLvl.RMVManExplvlEmplyTable(listval);	
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						RemoveList RMVfromSkillTableManExplvl = new RemoveList();
						try {
							RMVfromSkillTableManExplvl.RMVManExplvlSkillsTable(listval);
						}catch (SQLException e2) {
							{e2.printStackTrace();}
								
							DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbManExpLvl.getModel();
			        		model.removeAllElements();
			        		fillcbManExpLvl(cbManExpLvl);
					}	
					}else{JOptionPane.showMessageDialog(null, "Please select a value from the list.");}	
				  }else{JOptionPane.showMessageDialog(null, "CANCELLED");}
				}else{JOptionPane.showMessageDialog(null, "admin use only");}	
				
			}
		});
		btnRMVSkillManExpLvl_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRMVSkillManExpLvl_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRMVSkillManExpLvl_1.setBorder(null);
		btnRMVSkillManExpLvl_1.setBackground(new Color(223, 196, 132));
		btnRMVSkillManExpLvl_1.setBounds(384, 718, 46, 14);
		panelMang.add(btnRMVSkillManExpLvl_1);
		
	}
	

/***********************************************************************************************************/
/*								METHOD Retrieve Values called when form opens   						   */
															                                               
/***************    Retrieve Values from DB for Profile Skills Proficiency Level ********************/
	
	public void filterProficiencyLevel() {
		
		String query ="SELECT SkillTable.SkillLevel FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Ignite Skills Proficiency Level'";
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills proficiencyLevel");
			  } else {
			     do {
			    	 sk = rs.getString("SkillLevel");
						addfromDBtoProflvl(sk);
			     } while (rs.next());
			  }  
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
	}
	
	@SuppressWarnings("unchecked")
	public void addfromDBtoProflvl(String listval) {
		
		listMYIgniteSkillProflvl1.setModel(myIgniteSkillProfList);
		myIgniteSkillProfList.addElement(listval);
	}
	
/***************    Retrieve Values from DB for Profile Skill Cloud Certification Badges ********************/
	
	
	public void filterCertBadge() {
		
		String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Cloud Certifications and Badges'";
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills CertBadge");
			  } else {
			     do {
			    	 sk = rs.getString("CertBadge");
			    	 addfromDBtoCertBadge(sk);
			     } while (rs.next());
			  } 
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}		
	}
	
	@SuppressWarnings("unchecked")
	public void addfromDBtoCertBadge(String listval) {
		
		listMYCloudCertBadges.setModel(myCloudCertBadgeList);
		myCloudCertBadgeList.addElement(listval);	
	}
	
/***************    Retrieve Values from DB for Profile Skill SDLC ********************/
	
	public void filterSDLC() {
		
		String query ="SELECT SkillTable.SkillTool FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'SDLC'";
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills SDLC");
			  } else {
			     do {
			    	 sk = rs.getString("SkillTool");
			    	 addfromDBtoSDLC(sk);
			     } while (rs.next());
			  } 
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
	}
	
	@SuppressWarnings("unchecked")
	public void addfromDBtoSDLC(String listval) {
		
		listMYSDLCModelExperience.setModel(mySDLCModExpList);
		mySDLCModExpList.addElement(listval);	
	}
	
/***************    Retrieve Values from DB for Profile Skill Mandatory Badge ********************/
	
	
	public void filterManBadge() {
		
		String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Mandatory Badge'";
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills ManBadge");
			  } else {
			     do {
			    	 sk = rs.getString("CertBadge");
			    	 addfromDBtoManBadge(sk);
			     } while (rs.next());
			  }	 
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		
		
	}
	
	@SuppressWarnings("unchecked")
	public void addfromDBtoManBadge(String listval) {
		
		listMYMandatoryBadges.setModel(myMandatoryList);
		myMandatoryList.addElement(listval);
	}
	

/***************    Retrieve Values from DB Profile Skill  Table for Industry Badge ********************/
		
	
	public void filterIndustryBadge() {
		
		String query ="SELECT SkillIndustry,SkillLevel FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Industry Badges and Expertise Level'";
		
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			
			DefaultTableModel tblModel = (DefaultTableModel) industrySelectTable.getModel();
  			 			
			while (rs.next()){
					  		
	  			String Industry =rs.getString("SkillIndustry");
	  			String Industrylvl = rs.getString("SkillLevel");
  			
	  		//String Array to store data	  			
	  			String tbData[] = {Industry,Industrylvl};
		
			//add String Array data into JTable	  			
	  			tblModel.addRow(tbData);
	  				  			
			}
				
		}
		
		catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	

	}
	
/***************    Retrieve Values from DB Profile Skill Table for Give Back ********************/
	
	public void filterGiveBack() {
		
		String query ="SELECT SkillZone,SkillFocus FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Practice Giveback'";
		
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			
			DefaultTableModel tblModel = (DefaultTableModel) givebackSelectTable.getModel();
  			 			
			while (rs.next()){
					  		
	  			String Zone =rs.getString("SkillZone");
	  			String Focus = rs.getString("SkillFocus");
  			
	  		//String Array to store data	  			
	  			String tbData[] = {Zone,Focus};
		
			//add String Array data into JTable	  			
	  			tblModel.addRow(tbData);
	  				  			
			}
				
		}
		
		catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	

	}
/***************      Retrieve Values from DB for BAYear                   *********************************/

	public void filterbayear() {
		String usrtxtfield=textField_1.getText();
		
		try {
			String query = "Select * FROM profiledata WHERE profiledata.username =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, usrtxtfield);
					rs = pst.executeQuery();
			while(rs.next()){
			          
				String bayx = rs.getString("BAYearExp");
	        	textFieldBAMyYears.setText(bayx);
	        	
			}
		}catch(SQLException ei) {
			    		JOptionPane.showMessageDialog(null, ei);
			        	ei.printStackTrace();
			}
		}

/***************    Retrieve Values from DB for BAMonth ***********************************/
	public void filterbamonth() {
		String usrtxtfield=textField_1.getText();
		
		try {
			String query = "Select BAMnthExp FROM profiledata WHERE profiledata.username =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, usrtxtfield);
					rs = pst.executeQuery();
			while(rs.next()){
			          
				String bamx = rs.getString("BAMnthExp");
				textFieldBAMyMonths.setText(bamx);
					
			}
		}
			    	
			catch(SQLException ei) {
			    		JOptionPane.showMessageDialog(null, ei);
			        	ei.printStackTrace();
			}
		
		}
	
/***************    Retrieve Values from DB for BARoles ***********************************/
	@SuppressWarnings("unchecked")
		public void addfromDBtoBARoles(String listval) {
		
		listMYBARoles.setModel(MYBARolls);
		MYBARolls.addElement(listval);
		
		}
	
		public void filterBARoll() {
		
		String query ="SELECT SkillTable.SkillFocus FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'BA Roll'";
	
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills BA Rolls");
			  } else {
			     do {
			    	 sk = rs.getString("SkillFocus");
						addfromDBtoBARoles(sk);
			     } while (rs.next());
			  }  
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		}
		
/***************    Retrieve Values from DB for BAIndustryDomain ***********************************/
			
		public void filterBAIndustryDomain() {
			
			String query ="SELECT SkillTable.SkillIndustry FROM SkillTable\r\n"
					+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
					+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
					+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'BA Industry Domain'";
		
			
			try (PreparedStatement pst = conn.prepareStatement(query)) {
				pst.setString(1,textField_1.getText());
				ResultSet rs = null;
				rs = pst.executeQuery();
				String sk = null;
				
				  if (!rs.next()) {
				   //System.out.println("no skills BA Industry Domain");
				  } else {
				     do {
				    	 sk = rs.getString("SkillIndustry");
				    	 addfromDBtoBAIndustryDomain(sk);
				     } while (rs.next());
				  }

			}catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e);
			}	
			}
		
		@SuppressWarnings("unchecked")
		
		public void addfromDBtoBAIndustryDomain(String listval) {
			listMYBAIndustryDomain.setModel(MyBaIndDom);
			MyBaIndDom.addElement(listval);
			}
		
/***************    Retrieve Values from DB for BAToolsSoftWorked ***********************************/
		
		public void filterBAToolsSoftWorked() {
			
			String query ="SELECT SkillTable.SkillTool FROM SkillTable\r\n"
					+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
					+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
					+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'BA Test Management Tools'";
		
			
			try (PreparedStatement pst = conn.prepareStatement(query)) {
				pst.setString(1,textField_1.getText());
				ResultSet rs = null;
				rs = pst.executeQuery();
				String sk = null;
				
				  if (!rs.next()) {
				   //System.out.println("no skills BA Skill Software Tools");
				  } else {
				     do {
				    	 sk = rs.getString("SkillTool");
				    	 addfromDBtoBAToolsSoftWorked(sk);
				     } while (rs.next());
				  }
				  
			}catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e);
			}	
			}
		
		@SuppressWarnings("unchecked")
		
		public void addfromDBtoBAToolsSoftWorked(String listval) {
			listMYBAToolsSoftware_1.setModel(MYBAToolSoft);
			MYBAToolSoft.addElement(listval);
			}

/***************    Retrieve Values from DB for BACertifications ***********************************/
		
		public void filterBACertifications() {
			
			String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
					+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
					+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
					+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'BA Certifications'";
		
			
			try (PreparedStatement pst = conn.prepareStatement(query)) {
				pst.setString(1,textField_1.getText());
				ResultSet rs = null;
				rs = pst.executeQuery();
				String sk = null;
				
				  if (!rs.next()) {
				   //System.out.println("no skills BACertifications");
				  } else {
				     do {
				    	 sk = rs.getString("CertBadge");
				    	 addfromDBtoBACertifications(sk);
				     } while (rs.next());
				  }
				  
			}catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e);
			}	
			}
		
		@SuppressWarnings("unchecked")
		
		public void addfromDBtoBACertifications(String listval) {
			listMYBACertAcheived.setModel(MYBACert);
			MYBACert.addElement(listval);
			}

/***************    Retrieve Values from DB for BASkillBadge ***********************************/
		
		public void filterBASkillsBadge() {
			
			String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
					+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
					+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
					+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'BA Skill Badge'";
		
			
			try (PreparedStatement pst = conn.prepareStatement(query)) {
				pst.setString(1,textField_1.getText());
				ResultSet rs = null;
				rs = pst.executeQuery();
				String sk = null;
				
				  if (!rs.next()) {
				   //System.out.println("no skills BACertifications");
				  } else {
				     do {
				    	 sk = rs.getString("CertBadge");
				    	 addfromDBtoBASkillBadge(sk);
				     } while (rs.next());
				  }
				  
				
			}catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e);
			}	
			}
		
		@SuppressWarnings("unchecked")
		
		public void addfromDBtoBASkillBadge(String listval) {
			listMYBASkillBadge.setModel(MYBASkillBad);
			MYBASkillBad.addElement(listval);
			}
		
/***************    Retrieve Values from DB for TechYear ***********************************/

	
	public void filtertechyear() {
		String usrtxtfield=textField_1.getText();
		
		try {
			String query = "Select * FROM profiledata WHERE profiledata.username =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, usrtxtfield);
					rs = pst.executeQuery();
			while(rs.next()){
			          
				String techyx = rs.getString("TECHYearExp");
				textFieldTechMyYears.setText(techyx);
					
			}
		}
			    	
			catch(SQLException ei) {
			    		JOptionPane.showMessageDialog(null, ei);
			        	ei.printStackTrace();
			    	}
		}
		
	
/***************    Retrieve Values from DB for TechMonth ***********************************/

	public void filtertechmonth() {
		String usrtxtfield=textField_1.getText();
		
		try {
			String query = "Select * FROM profiledata WHERE profiledata.username =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, usrtxtfield);
					rs = pst.executeQuery();
			while(rs.next()){
			          
				String techmx = rs.getString("TECHMnthExp");
				textFieldTechMyMonth.setText(techmx);
					
			}
		}
			    	
			catch(SQLException ei) {
			    		JOptionPane.showMessageDialog(null, ei);
			        	ei.printStackTrace();
			    	}
		}
	
/***************    Retrieve Values from DB for TechIndustryDomain ***********************************/
	
	public void filterMYTechIndustryDomain() {
		
		String query ="SELECT SkillTable.SkillIndustry FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Tech Industry Domain'";
	
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills TechIndustryDomain");
			  } else {
			     do {
			    	 sk = rs.getString("SkillIndustry");
			    	 addfromDBtoTechIndustryDomain(sk);
			     } while (rs.next());
			  }
			  
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		}
	
	@SuppressWarnings("unchecked")
	
	public void addfromDBtoTechIndustryDomain(String listval) {
		listMYTechIndustryDomain.setModel(MYTechIndDom);
		MYTechIndDom.addElement(listval);
		}	
	
/***************    Retrieve Values from DB for MYTechBadgeCert ***********************************/
	
	public void filterMYTechBadgeCert() {
		
		String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Technical Badge'";
	
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills TechIndustryDomain");
			  } else {
			     do {
			    	 sk = rs.getString("CertBadge");
			    	 addfromDBtoTechBadgeCert(sk);
			     } while (rs.next());
			  }
			  
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		}
	
	@SuppressWarnings("unchecked")
	
	public void addfromDBtoTechBadgeCert(String listval) {
		listMYTechBadgeCert.setModel(MYTechBadCert);
		MYTechBadCert.addElement(listval);
		}	
	
/***************    Retrieve Values from DB for MYTechOtherAreas ***********************************/
	
	public void filterMYTechOtherAreas() {
		
		String query ="SELECT SkillTable.SkillFocus FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Tech Other Areas of Expertise'";
	
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills TechOtherAreas");
			  } else {
			     do {
			    	 sk = rs.getString("SkillFocus");
			    	 addfromDBtoTechOtherAreas(sk);
			     } while (rs.next());
			  }
			  
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		}
	
	@SuppressWarnings("unchecked")
	
	public void addfromDBtoTechOtherAreas(String listval) {
		listMYTechOtherAreas.setModel(MYTechOthExp);
		MYTechOthExp.addElement(listval);
		}	
	
/***************    Retrieve Values from DB for MYTechTestManTools ***********************************/
	
	public void filterMyTechTestManTools() {
		
		String query ="SELECT SkillTable.SkillTool FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Tech Test Management Tools'";
	
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills TechOtherAreas");
			  } else {
			     do {
			    	 sk = rs.getString("SkillTool");
			    	 addfromDBtoTechTestManTools(sk);
			     } while (rs.next());
			  }
			  
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		}
	
	@SuppressWarnings("unchecked")
	
	public void addfromDBtoTechTestManTools(String listval) {
		listMYTechTestManTools.setModel(MYTechTestManTool);
		MYTechTestManTool.addElement(listval);
		}	

/***************    Retrieve Values from DB for MYTechCodeControlTools ***********************************/
	
	public void filterMYTechCodeControlTools() {
		
		String query ="SELECT SkillTable.SkillTool FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Tech Code Version Control Tools'";
	
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills TechCodeControlTools");
			  } else {
			     do {
			    	 sk = rs.getString("SkillTool");
			    	 addfromDBtoCodeControlTools(sk);
			     } while (rs.next());
			  }
			  
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		}
	
	@SuppressWarnings("unchecked")
	
	public void addfromDBtoCodeControlTools(String listval) {
		listMYTechCodeControlTools.setModel(MYTechCodeConTool);
		MYTechCodeConTool.addElement(listval);
		}	
	
	
/***************    Retrieve Values from DB for MYTechDevOpsTools ***********************************/
	
	public void filterMYTechDevOpsTools() {
		
		String query ="SELECT SkillTable.SkillTool FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Tech DEVOps CI-CD Tools'";
	
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills TechDevOpsTools");
			  } else {
			     do {
			    	 sk = rs.getString("SkillTool");
			    	 addfromDBtoDevOpsTools(sk);
			     } while (rs.next());
			  }
			  
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		}
	
	@SuppressWarnings("unchecked")
	
	public void addfromDBtoDevOpsTools(String listval) {
		listMYTechDevOpsTools.setModel(MYTechDevOpsTool);
		MYTechDevOpsTool.addElement(listval);
		}
	
/***************    Retrieve Values from DB for TABLE ********************/
	
	public void filterTechToolExp() {
		
		String query ="SELECT SkillTool,SkillLevel,SkillFocus FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Tech Technical Tools Experience'";
		
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			
			DefaultTableModel tblModel = (DefaultTableModel) tableMyTechToolExp.getModel();
  			 			
			while (rs.next()){
				
				String Tool =rs.getString("SkillTool");
	  			String Level =rs.getString("SkillLevel");
	  			String Focus = rs.getString("SkillFocus");
  			
	  		//String Array to store data	  			
	  			String tbData[] = {Tool,Level,Focus};
		
			//add String Array data into JTable	  			
	  			tblModel.addRow(tbData);
	  				  			
			}
				
		}
		
		catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
	}
	
/***************    Retrieve Values from DB for FUNYear ***********************************/

	
	public void filterfunyear() {
		String usrtxtfield=textField_1.getText();
		
		try {
			String query = "Select * FROM profiledata WHERE profiledata.username =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, usrtxtfield);
					rs = pst.executeQuery();
			while(rs.next()){
			          
				String techyx = rs.getString("FUNYearExp");
				textFieldFunMyYears.setText(techyx);
					
			}
		}
			    	
			catch(SQLException ei) {
			    		JOptionPane.showMessageDialog(null, ei);
			        	ei.printStackTrace();
			    	}
		}
		
	
/***************    Retrieve Values from DB for FUNMonth ***********************************/

	
	public void filterfunmonth() {
		String usrtxtfield=textField_1.getText();
		
		try {
			String query = "Select * FROM profiledata WHERE profiledata.username =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, usrtxtfield);
					rs = pst.executeQuery();
			while(rs.next()){
			          
				String techmx = rs.getString("FUNMnthExp");
				textFieldFunMyMonths.setText(techmx);
					
			}
		}
			    	
			catch(SQLException ei) {
			    		JOptionPane.showMessageDialog(null, ei);
			        	ei.printStackTrace();
			    	}
		}
	
/***************    Retrieve Values from DB for Functional Industry ***********************************/	
public void filterMYFunIndustryDom() {
		
		String query ="SELECT SkillTable.SkillIndustry FROM SkillTable\r\n"
				+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
				+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
				+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Functional Industry Domain'";
	
		
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1,textField_1.getText());
			ResultSet rs = null;
			rs = pst.executeQuery();
			String sk = null;
			
			  if (!rs.next()) {
			   //System.out.println("no skills Functional Industry");
			  } else {
			     do {
			    	 sk = rs.getString("SkillIndustry");
			    	 addfromDBtoFunIndustryDom(sk);
			     } while (rs.next());
			  }
			
		}catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}	
		}
	
	@SuppressWarnings("unchecked")
	
	public void addfromDBtoFunIndustryDom(String listval) {
		listMYFunIndustryDomain.setModel(MYFunIndDom);
		MYFunIndDom.addElement(listval);
		}
	
/***************    Retrieve Values from DB for Functional Certification ***********************************/	
	public void filterMYFunCertifications() {
			
			String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
					+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
					+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
					+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Functional Certifications ISTQB or Equivalent'";
		
			
			try (PreparedStatement pst = conn.prepareStatement(query)) {
				pst.setString(1,textField_1.getText());
				ResultSet rs = null;
				rs = pst.executeQuery();
				String sk = null;
				
				  if (!rs.next()) {
				   //System.out.println("no skills Functional Certification");
				  } else {
				     do {
				    	 sk = rs.getString("CertBadge");
				    	 addfromDBtoFunCert(sk);
				     } while (rs.next());
				  }
				
			}catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e);
			}	
			}
		
		@SuppressWarnings("unchecked")
		
		public void addfromDBtoFunCert(String listval) {
			listMYFunCertifications.setModel(MYFunCert);
			MYFunCert.addElement(listval);
			}	
	
/***************    Retrieve Values from DB for Functional Testing Experience ***********************************/	
		public void filterMYFunTestExp() {
				
				String query ="SELECT SkillTable.SkillFocus FROM SkillTable\r\n"
						+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
						+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
						+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Functional Testing Experience'";
			
				
				try (PreparedStatement pst = conn.prepareStatement(query)) {
					pst.setString(1,textField_1.getText());
					ResultSet rs = null;
					rs = pst.executeQuery();
					String sk = null;
					
					  if (!rs.next()) {
					   //System.out.println("no skills Functional Testing Experience");
					  } else {
					     do {
					    	 sk = rs.getString("SkillFocus");
					    	 addfromDBtoFunTestExp(sk);
					     } while (rs.next());
					  }
					
				}catch (SQLException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e);
				}	
				}
			
			@SuppressWarnings("unchecked")
			
			public void addfromDBtoFunTestExp(String listval) {
				listMYFunTestingExp.setModel(MYFunTestExp);
				MYFunTestExp.addElement(listval);
				}	
			
/***************    Retrieve Values from DB for Functional Badges ***********************************/	
			public void filterMYFunBadges() {
					
					String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
							+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
							+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
							+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Functional Badge'";
				
					
					try (PreparedStatement pst = conn.prepareStatement(query)) {
						pst.setString(1,textField_1.getText());
						ResultSet rs = null;
						rs = pst.executeQuery();
						String sk = null;
						
						  if (!rs.next()) {
						   //System.out.println("no skills Functional Badge");
						  } else {
						     do {
						    	 sk = rs.getString("CertBadge");
						    	 addfromDBtoFunBadge(sk);
						     } while (rs.next());
						  }
						
					}catch (SQLException e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, e);
					}	
					}
				
				@SuppressWarnings("unchecked")
				
				public void addfromDBtoFunBadge(String listval) {
					listMYFunBadges.setModel(MYFunBadge);
					MYFunBadge.addElement(listval);
					}
				
/***************    Retrieve Values from DB for Functional Testing Management ***********************************/	
		public void filterMYFunTestManagement() {
						
				String query ="SELECT SkillTable.SkillTool FROM SkillTable\r\n"
						+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
						+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
						+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Functional Test Management and Defect Tracking Tools'";
					
						
				try (PreparedStatement pst = conn.prepareStatement(query)) {
							pst.setString(1,textField_1.getText());
							ResultSet rs = null;
							rs = pst.executeQuery();
							String sk = null;
							
							  if (!rs.next()) {
							   //System.out.println("Functional Test Management and Defect Tracking Tools");
							  } else {
							     do {
							    	 sk = rs.getString("SkillTool");
							    	 addfromDBtoFunTestManDefect(sk);
							     } while (rs.next());
							  }
							
				}catch (SQLException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e);
				}	
				}
					
			@SuppressWarnings("unchecked")
					
			public void addfromDBtoFunTestManDefect(String listval) {		
				listMYFunTestMangement.setModel(MYFunTestManDefect);
				MYFunTestManDefect.addElement(listval);
				}
				
/***************    Retrieve Values from DB for ManYear ***********************************/

	public void filtermanyear() {
		String usrtxtfield=textField_1.getText();
		
		try {
			String query = "Select * FROM profiledata WHERE profiledata.username =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, usrtxtfield);
					rs = pst.executeQuery();
			while(rs.next()){
			          
				String manyx = rs.getString("MANYearExp");
				textFieldManMyYears.setText(manyx);
					
			}
		}
			    	
			catch(SQLException ei) {
			    		JOptionPane.showMessageDialog(null, ei);
			        	ei.printStackTrace();
			    	}
		}
		
	
/***************    Retrieve Values from DB for ManMonth ***********************************/

	public void filtermanmonth() {
		String usrtxtfield=textField_1.getText();
		
		try {
			String query = "Select * FROM profiledata WHERE profiledata.username =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, usrtxtfield);
					rs = pst.executeQuery();
			while(rs.next()){
			          
				String manmx = rs.getString("MANMnthExp");
				textFieldManMyMonth.setText(manmx);
					
			}
		}
			    	
			catch(SQLException ei) {
			    		JOptionPane.showMessageDialog(null, ei);
			        	ei.printStackTrace();
			    	}
		}
	
/***************    Retrieve Values from DB for MAN Leadership Demo ***********************************/	
	public void filterMYManLeadershipDem() {
			
			String query ="SELECT SkillTable.SkillZone FROM SkillTable\r\n"
					+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
					+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
					+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Manage Leadership Team demography'";
		
			
			try (PreparedStatement pst = conn.prepareStatement(query)) {
				pst.setString(1,textField_1.getText());
				ResultSet rs = null;
				rs = pst.executeQuery();
				String sk = null;
				
				  if (!rs.next()) {
				   //System.out.println("No Management Leadership Demo");
				  } else {
				     do {
				    	 sk = rs.getString("SkillZone");
				    	 addfromDBtoManLeaderDem(sk);
				     } while (rs.next());
				  }
				
			}catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e);
			}	
			}
		
		@SuppressWarnings("unchecked")
		
		public void addfromDBtoManLeaderDem(String listval) {
			MylistManLeadership.setModel(MYManLeadership);
			MYManLeadership.addElement(listval);
			}					
	
/***************    Retrieve Values from DB for MAN Management Training Software ***********************************/	
		public void filterMYManManagementTrain() {
				
				String query ="SELECT SkillTable.SkillTool FROM SkillTable\r\n"
						+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
						+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
						+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Management Training'";
			
				
				try (PreparedStatement pst = conn.prepareStatement(query)) {
					pst.setString(1,textField_1.getText());
					ResultSet rs = null;
					rs = pst.executeQuery();
					String sk = null;
					
					  if (!rs.next()) {
					   //System.out.println("No Management Training");
					  } else {
					     do {
					    	 sk = rs.getString("SkillTool");
					    	 addfromDBtoManTraining(sk);
					     } while (rs.next());
					  }
					
				}catch (SQLException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e);
				}	
				}
			
			@SuppressWarnings("unchecked")
			
		public void addfromDBtoManTraining(String listval) {
			MYlistManTraining.setModel(MYMANTraining);
			MYMANTraining.addElement(listval);
			}	
			
/***************    Retrieve Values from DB for MAN Leadership Software Project ***********************************/	
			public void filterMYManLeadershipSoftProj() {
					
					String query ="SELECT SkillTable.SkillFocus FROM SkillTable\r\n"
							+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
							+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
							+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Manage Leadership Software Projects'";
				
					
					try (PreparedStatement pst = conn.prepareStatement(query)) {
						pst.setString(1,textField_1.getText());
						ResultSet rs = null;
						rs = pst.executeQuery();
						String sk = null;
						
						  if (!rs.next()) {
						   //System.out.println("No MAN Leadership Software Project");
						  } else {
						     do {
						    	 sk = rs.getString("SkillFocus");
						    	 addfromDBtoManSDLCLeadSoftPrj(sk);
						     } while (rs.next());
						  }
						
					}catch (SQLException e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, e);
					}	
					}
				
				@SuppressWarnings("unchecked")
				
			public void addfromDBtoManSDLCLeadSoftPrj(String listval) {
				MYlistManLeadSoftPrj.setModel(MYMANLeadSoftPrj);
				MYMANLeadSoftPrj.addElement(listval);
				}				
		
/***************    Retrieve Values from DB for MAN SDLC Tool ***********************************/	
			public void filterMYManSDLCTool() {
					
					String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
							+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
							+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
							+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Management SDLC Tools'";
				
					
					try (PreparedStatement pst = conn.prepareStatement(query)) {
						pst.setString(1,textField_1.getText());
						ResultSet rs = null;
						rs = pst.executeQuery();
						String sk = null;
						
						  if (!rs.next()) {
						   //System.out.println("No Management Training");
						  } else {
						     do {
						    	 sk = rs.getString("CertBadge");
						    	 addfromDBtoManSDLC(sk);
						     } while (rs.next());
						  }
						
					}catch (SQLException e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, e);
					}	
					}
				
				@SuppressWarnings("unchecked")
				
			public void addfromDBtoManSDLC(String listval) {
				MYlistManSDLC.setModel(MYMANSDLC);
				MYMANSDLC.addElement(listval);
				}							

/***************    Retrieve Values from DB for MAN Industry Domain ***********************************/	
			public void filterMYManIndustryDom() {
						
					String query ="SELECT SkillTable.SkillIndustry FROM SkillTable\r\n"
							+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
							+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
							+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Management Industry Domain'";
					
						
					try (PreparedStatement pst = conn.prepareStatement(query)) {
							pst.setString(1,textField_1.getText());
							ResultSet rs = null;
							rs = pst.executeQuery();
							String sk = null;
							
						  if (!rs.next()) {
							   //System.out.println("No MAN Industry Domain");
						  } else {
							   do {
							  	 sk = rs.getString("SkillIndustry");
							  	 addfromDBtoManIndDom(sk);
							   } while (rs.next());
						}
							
						}catch (SQLException e) {
							e.printStackTrace();
							JOptionPane.showMessageDialog(null, e);
						}	
						}
					
				@SuppressWarnings("unchecked")
					
			public void addfromDBtoManIndDom(String listval) {
				MYlistManIndDom.setModel(MYMANIndDom);
				MYMANIndDom.addElement(listval);
				}							

/***************    Retrieve Values from DB for MAN Badge Cert ***********************************/	
			public void filterMYManBadgeCert() {
							
					String query ="SELECT SkillTable.CertBadge FROM SkillTable\r\n"
							+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
							+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
							+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Management Badges and Certifications'";
						
							
					try (PreparedStatement pst = conn.prepareStatement(query)) {
						pst.setString(1,textField_1.getText());
						ResultSet rs = null;
						rs = pst.executeQuery();
						String sk = null;
								
						  if (!rs.next()) {
								   //System.out.println("No MAN Badge Cert");
						  } else {
						     do {
							   	 sk = rs.getString("CertBadge");
						    	 addfromDBtoManBadgeCert(sk);
						     } while (rs.next());
						  }
								
					}catch (SQLException e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, e);
					}	
					}
						
				@SuppressWarnings("unchecked")
						
			public void addfromDBtoManBadgeCert(String listval) {
				MYlistManBadgeCert.setModel(MYMANBadgeCert);
				MYMANBadgeCert.addElement(listval);
				}
				
/***************    Retrieve Values from DB for TABLE ********************/
				
				public void filterMYManExperience() {
					
					String query ="SELECT SkillFocus,SkillLevel FROM SkillTable\r\n"
							+ "INNER JOIN employeeSkills ON SkillTable.SkillID = employeeSkills.SkillID\r\n"
							+ "INNER JOIN profiledata ON employeeSkills.username = profiledata.username\r\n"
							+ "WHERE employeeSkills.username =? and SkillTable.SkillTitle = 'Management Experience'";
					
					
					try (PreparedStatement pst = conn.prepareStatement(query)) {
						pst.setString(1,textField_1.getText());
						ResultSet rs = null;
						rs = pst.executeQuery();
						
						DefaultTableModel tblModel = (DefaultTableModel) tableMyManagementExp.getModel();
			  			 			
						while (rs.next()){
								  		
				  			String Focus =rs.getString("SkillFocus");
				  			String Level = rs.getString("SkillLevel");
			  			
				  		//String Array to store data	  			
				  			String tbData[] = {Focus,Level};
					
						//add String Array data into JTable	  			
				  			tblModel.addRow(tbData);
				  				  			
						}
							
					}
					
					catch (SQLException e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, e);
					}	

				}
									
/*********************************METHOD ADD Multi Rows to Table*****************************************************************/	
	
	public void AddRowIndustry(String str1, String str2){
		
		DefaultTableModel yourModel = (DefaultTableModel) industrySelectTable.getModel();
		 // The value that needs to be checked is the rowIndex and column 0
	    //check table industrySelectTable for existing value 
		
		try {
			
			CheckValueIndustry(str1);
		      if (rmvrow == ("true")){
		    	  
		    	  JOptionPane.showMessageDialog(null, "Already in List");
		    	  
		      }else {
		    	  
		    	  yourModel.addRow(new Object[]{str1, str2});
		    	  
		    	  	String tempusrname = textField_1.getText();
					SaveList mysavelist = new SaveList();
					mysavelist.SAVEindustrySelectTable(str1,str2, tempusrname);
		    	   
		      }
						
		}catch (Exception ez) {
			ez.printStackTrace();
			JOptionPane.showMessageDialog(null, ez);
		}	
	      

		}
	
	
	public void AddRowGiveBack(String str1giveback, String str2giveback){
		
		DefaultTableModel myModel = (DefaultTableModel) givebackSelectTable.getModel();
		 
		
		try {
			
			CheckValueGiveBack(str1giveback);
		      if (rmvrowgiveback == ("true")){
		    	  
		    	  JOptionPane.showMessageDialog(null, "Already in List");
		    	  
		      }else {
		    	  
		    	  myModel.addRow(new Object[]{str1giveback, str2giveback}); 
		    	  
		    	  String tempusrname = textField_1.getText();
		    	  SaveList mysavelist = new SaveList();
		    	  mysavelist.SAVEgivebackSelectTable(str1giveback,str2giveback, tempusrname);
		    	  
		      }
			
			
		}catch (Exception ez) {
			ez.printStackTrace();
			JOptionPane.showMessageDialog(null, ez);
			
			
		}	
	      

		}
	
	public void AddRowTechTool(String str1, String str2, String str3){											
		DefaultTableModel yourModel = (DefaultTableModel)tableMyTechToolExp.getModel();	
		
		// The value that needs to be checked is the rowIndex and column 0											
		//check table industrySelectTable for existing value 
		
		try {											
		CheckValueTechTool(str1);											
		if (rmvrow == ("true")){											
		JOptionPane.showMessageDialog(null, "Already in List");											
		}else {											
		yourModel.addRow(new Object[]{str1, str2, str3});	
		
		String tempusrname = textField_1.getText();											
		SaveList mysavelist = new SaveList();											
		mysavelist.SAVEtableMyTechToolExp(str1, str2, str3, tempusrname);	
		
		}											
		}catch (Exception ez) {											
		ez.printStackTrace();											
		JOptionPane.showMessageDialog(null, ez);	
		
		} 											
													
		}	
	
public void AddRowManagementSkill(String str1, String str2){
		
		DefaultTableModel yourModel = (DefaultTableModel) tableMyManagementExp.getModel();
		 // The value that needs to be checked is the rowIndex and column 0
	    //check table industrySelectTable for existing value 
		
		try {
			
			CheckValueManSkill(str1);
		      if (rmvrow == ("true")){
		    	  
		    	  JOptionPane.showMessageDialog(null, "Already in List");
		    	  
		      }else {
		    	  
		    	  yourModel.addRow(new Object[]{str1, str2});
		    	  
		    	 String tempusrname = textField_1.getText();
		    	 	SaveList mysavelist = new SaveList();
					mysavelist.SAVEtableManagementExp(str1,str2, tempusrname);
		    	   
		      }
						
		}catch (Exception ez) {
			ez.printStackTrace();
			JOptionPane.showMessageDialog(null, ez);
		}	
	      

		}
	
/*********************************Check Value Table *****************************************************************/
	
	public void CheckValueIndustry (String str1industry) {
		rmvrow="";
		
		DefaultTableModel model = (DefaultTableModel) industrySelectTable.getModel();
			
		    for (int i = 0; i != model.getRowCount(); i++) {  // Loop through the rows
		    	
		    	Object thevalueofcell = model.getValueAt(i,0);
		    	
		    	if (str1industry.equals(thevalueofcell)){
		    		rmvrow="true";
						} 
		     }   
		    return;
	}
	
	public void CheckValueGiveBack (String str1giveback) {
		rmvrowgiveback="";
		
		DefaultTableModel model = (DefaultTableModel) givebackSelectTable.getModel();
			
		    for (int i = 0; i != model.getRowCount(); i++) {  // Loop through the rows
		    	
		    	Object thevalueofcell = model.getValueAt(i,0);
		    	
		    	if (str1giveback.equals(thevalueofcell)){
		    		rmvrowgiveback="true";
						} 
		     }   
		    return;
	}
	
	public void CheckValueTechTool (String str1techtool) {									
		rmvrow="";	
		
		DefaultTableModel model = (DefaultTableModel) tableMyTechToolExp.getModel();
		
		for (int i = 0; i != model.getRowCount(); i++) { // Loop through the rows	
			
			Object thevalueofcell = model.getValueAt(i,0);	
			
			if (str1techtool.equals(thevalueofcell)){	
				
				rmvrow="true";									
			} 									
		 } 									
		return;									
		}	
	
	public void CheckValueManSkill(String str1manskill) {
		rmvrow="";
		
		DefaultTableModel model = (DefaultTableModel) tableMyManagementExp.getModel();
			
		    for (int i = 0; i != model.getRowCount(); i++) {  // Loop through the rows
		    	
		    	Object thevalueofcell = model.getValueAt(i,0);
		    	
		    	if (str1manskill.equals(thevalueofcell)){
		    		rmvrow="true";
						} 
		     }   
		    return;
	}

/*********************************Populate Lists and Combobox for Profile*******************************************************/

@SuppressWarnings({ "rawtypes", "unchecked" })
public void fillDataProflvlJlist(JList listIgniteSkillProflvl){
		
	String query = "Select * from SkillTable WHERE SkillTitle = \"Ignite Skills Proficiency Level\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String ProfLvL = rs.getString("SkillLevel");
                model.addElement(ProfLvL);
                
            }
            listIgniteSkillProflvl.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}	

@SuppressWarnings({ "rawtypes", "unchecked" })
public void fillDataCloudCert(JList listCloudCertBadges){
	
	String query = "Select * from SkillTable WHERE SkillTitle = \"Cloud Certifications and Badges\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String ProfLvL = rs.getString("CertBadge");
                model.addElement(ProfLvL);
                
            }
            listCloudCertBadges.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillDataSDLC(JList listSDLCModelExperience){
	
	String query = "Select * from SkillTable WHERE SkillTitle = \"SDLC\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String Profsdlc = rs.getString("SkillTool");
                model.addElement(Profsdlc);
                
            }
            listSDLCModelExperience.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
}	
@SuppressWarnings({ "rawtypes", "unchecked" })
public void fillDataManBadge(JList listMandatoryBadges){
	
	String query = "Select * from SkillTable WHERE SkillTitle = \"Mandatory Badge\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String Profmanbadge = rs.getString("CertBadge");
                model.addElement(Profmanbadge);
                
            }
            listMandatoryBadges.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}
	
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillDatacbSkillIndustry(JComboBox cbindustry){
	
	String query = "Select DISTINCT SkillIndustry FROM SkillTable WHERE SkillTitle =\"Industry Badges and Expertise Level\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
            	
			 cbindustry.addItem(rs.getString("SkillIndustry"));
            
            }

            rs.close();
            pst.close();
        }catch(SQLException ei) {
    	
        	ei.printStackTrace();
    }
	  
	return;
	
}
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillDatacbSkilllvl(JComboBox cbindustrylvl){
	
	String query = "Select DISTINCT SkillLevel FROM SkillTable WHERE SkillTitle =\"Industry Badges and Expertise Level\"";
	 
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
                cbindustrylvl.addItem(rs.getString("SkillLevel"));
               
            }

            rs.close();
            pst.close();
        }catch(SQLException eil) {
    	
        	eil.printStackTrace();
    }
	  
	return;
	
}
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillDatacbpraticezone(JComboBox cbpraticezone){
	
	String query = "Select DISTINCT SkillZone FROM SkillTable WHERE SkillTitle =\"Practice Giveback\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
            	
			cbpraticezone.addItem(rs.getString("SkillZone"));
            
            }

            rs.close();
            pst.close();
        }catch(SQLException ei) {
    	
        	ei.printStackTrace();
    }
	  
	return;
	
}
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillDatacbfocusgroup(JComboBox cbfocusgroup){
	
	String query = "Select DISTINCT SkillFocus FROM SkillTable WHERE SkillTitle =\"Practice Giveback\"";
	 
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
			cbfocusgroup.addItem(rs.getString("SkillFocus"));
               
            }

            rs.close();
            pst.close();
        }catch(SQLException eil) {
    	
        	eil.printStackTrace();
    }
	  
	return;
	
}	
	
/****************************************Populate Lists and combobox for BUSINESS  ************************************************/

//listBARoles - SkillFocus
	
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistBARoles(JList listBARoles){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"BA Roll\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String BaRoles = rs.getString("SkillFocus");
                model.addElement(BaRoles);
                
            }
            listBARoles.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//listBAToolsSoftware - SkillTool - BA Test Management Tools

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistBAToolsSoftware(JList listBAToolsSoftware){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"BA Test Management Tools\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String BATools = rs.getString("SkillTool");
                model.addElement(BATools);
                
            }
            listBAToolsSoftware.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//listBASkillBadge-CertBadge - BA Skill Badge
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistBASkillBadge(JList listBASkillBadge){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"BA Skill Badge\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String BABadge = rs.getString("CertBadge");
                model.addElement(BABadge);
                
            }
            listBASkillBadge.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}


//listBAIndustryDomain -SkillIndustry - BA Industry Domain

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistBAIndustryDomain(JList listBAIndustryDomain){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"BA Industry Domain\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String BAIndust = rs.getString("SkillIndustry");
                model.addElement(BAIndust);
                
            }
            listBAIndustryDomain.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//listBACertAcheived - CertBadge - BA Certifications

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistBACertAcheived(JList listBACertAcheived){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"BA Certifications\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String BACerts = rs.getString("CertBadge");
                model.addElement(BACerts);
                
            }
            listBACertAcheived.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

/***************************************Populate Lists and combobox for Technical*************************************************/

//listTechIndustryDomain - SkillIndustry - Tech Industry Domain

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistTechIndustryDomain(JList listTechIndustryDomain){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Tech Industry Domain\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String TechIndust = rs.getString("SkillIndustry");
                model.addElement(TechIndust);
                
            }
            listTechIndustryDomain.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//listTechOtherAreas - SkillFocus - Tech Other Areas of Expertise
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistTechOtherAreas(JList listTechOtherAreas){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Tech Other Areas of Expertise\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String TechOther = rs.getString("SkillFocus");
                model.addElement(TechOther);
                
            }
            listTechOtherAreas.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//listTechCodeControlTools - SkillTool - Tech Code Version Control Tools
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistTechCodeControlTools(JList listTechCodeControlTools){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Tech Code Version Control Tools\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String TechCtrlTool = rs.getString("SkillTool");
                model.addElement(TechCtrlTool);
                
            }
            listTechCodeControlTools.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//listTechBadgeCert - CertBadge - Technical Badge
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistTechBadgeCert(JList listTechBadgeCert){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Technical Badge\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String TechBadgeCert = rs.getString("CertBadge");
                model.addElement(TechBadgeCert);
                
            }
            listTechBadgeCert.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//listTechTestManTools - SkillTool - Tech Test Management Tools
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistTechTestManTools(JList listTechTestManTools){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Tech Test Management Tools\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String TechTestMan = rs.getString("SkillTool");
                model.addElement(TechTestMan);
                
            }
            listTechTestManTools.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//listTechDevOpsTools -  SkillTool - Tech DEVOps CI-CD Tools
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistTechDevOpsTools(JList listTechDevOpsTools){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Tech DEVOps CI-CD Tools\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
            while (rs.next()) {
            	
                String TechDevOPS = rs.getString("SkillTool");
                model.addElement(TechDevOPS);
                
            }
            listTechDevOpsTools.setModel(model);
            
            rs.close();
            pst.close();
        }catch(SQLException ep) {
    	
        	ep.printStackTrace();
    }
	  
	return;
	
}

//  Technical Tools Experience Table (combo box)

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillcbtechtool(JComboBox cbtechtool){
	
	String query = "Select DISTINCT SkillTool FROM SkillTable WHERE SkillTitle =\"Tech Technical Tools Experience\"";
	 
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
			cbtechtool.addItem(rs.getString("SkillTool"));
               
            }

            rs.close();
            pst.close();
        }catch(SQLException eil) {
    	
        	eil.printStackTrace();
    }
	  
	return;
	
}	

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillcbrateskill(JComboBox cbrateskill){
	
	String query = "Select DISTINCT SkillLevel FROM SkillTable WHERE SkillTitle =\"Tech Technical Tools Experience\"";
	 
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
			cbrateskill.addItem(rs.getString("SkillLevel"));
               
            }

            rs.close();
            pst.close();
        }catch(SQLException eil) {
    	
        	eil.printStackTrace();
    }
	  
	return;
	
}	

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillcbsmetrainer(JComboBox cbsmetrainer){
	
	String query = "Select DISTINCT SkillFocus FROM SkillTable WHERE SkillTitle =\"Tech Technical Tools Experience\"";
	 
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
			cbsmetrainer.addItem(rs.getString("SkillFocus"));
               
            }

            rs.close();
            pst.close();
        }catch(SQLException eil) {
    	
        	eil.printStackTrace();
    }
	  
	return;
	
}	

/***************************************Populate Lists and combobox for Functional *************************************************/

 /*listFunIndustryDomain
 * SkillGroup: Functional
 * SkillTitle: Functional Industry Domain
 * SkillIndustry:
 */
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistFunIndustryDomain(JList listFunIndustryDomain){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Functional Industry Domain\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String FunIndDom = rs.getString("SkillIndustry");
              model.addElement(FunIndDom);
              
          }
          listFunIndustryDomain.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException etd) {
  	
      	etd.printStackTrace();
  }
	  
	return;
	
}

/* listFunTestingExp
 * SkillGroup: Functional
 * SkillTitle: Functional Testing Experience
 * SkillFocus:
 */
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistFunTestingExp(JList listFunTestingExp){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Functional Testing Experience\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String FunTestExp = rs.getString("SkillFocus");
              model.addElement(FunTestExp);
              
          }
          listFunTestingExp.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException etd) {
  	
      	etd.printStackTrace();
  }
	  
	return;
	
}
 
/* listFunTestMangement
 * SkillGroup: Functional
 * SkillTitle: Functional Test Management and Defect Tracking Tools
 * SkillTool:
 */
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistFunTestMangement(JList listFunTestManagement){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Functional Test Management and Defect Tracking Tools\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String FunTestMan = rs.getString("SkillTool");
              model.addElement(FunTestMan);
              
          }
          listFunTestManagement.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException etd) {
  	
      	etd.printStackTrace();
  }
	  
	return;
	
}
 
 /* listFunCertifications
  * Functional Certifications ISTQB or Equivalent  
  * CertBadge*/
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistFunCertifications(JList listFunCertifications){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Functional Certifications ISTQB or Equivalent\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String FunCert = rs.getString("CertBadge");
              model.addElement(FunCert);
              
          }
          listFunCertifications.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException etd) {
  	
      	etd.printStackTrace();
  }
	  
	return;
	
}
 
 /*listFunBadges
 *Functional Badge
 *CertBadge
 */
 @SuppressWarnings({ "rawtypes", "unchecked" })	
 public void filllistFunBadges(JList listFunBadges){
 	
 String query = "Select * from SkillTable WHERE SkillTitle = \"Functional Badge\"";
 	
 	try (PreparedStatement pst = conn.prepareStatement(query)) {
 		ResultSet rs;
 		rs = pst.executeQuery();
 		
 		DefaultListModel model = new DefaultListModel();
           while (rs.next()) {
           	
               String FunBadge = rs.getString("CertBadge");
               model.addElement(FunBadge);
               
           }
           listFunBadges.setModel(model);
           
           rs.close();
           pst.close();
       }catch(SQLException etd) {
   	
       	etd.printStackTrace();
   }
 	  
 	return;
 	
 }
 
/**********************************************Populate Lists and combobox for Management******************************************/

/*********
 * SkillGroup: Management
 * SkillTitle: Manage Leadership Team demography
 * SkillZone: <select from list>
 */

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistLeadTeamDemo(JList listManLeadership){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Manage Leadership Team demography\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String ManLeadDemo = rs.getString("SkillZone");
              model.addElement(ManLeadDemo);
              
          }
          listManLeadership.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException etd) {
  	
      	etd.printStackTrace();
  }
	  
	return;
	
}

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistManIndDom(JList listManIndDom){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Management Industry Domain\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String ManIndDom = rs.getString("SkillIndustry");
              model.addElement(ManIndDom);
              
          }
          listManIndDom.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException eid) {
  	
      	eid.printStackTrace();
  }
	  
	return;
	
}

/*********
 * SkillGroup: Management
 * SkillTitle: Manage Leadership Software Projects
 * Skill Focus: <select from list> listManLeadSoftPrj
 */
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistLeadSoftPrj(JList listManLeadSoftPrj){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Manage Leadership Software Projects\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String ManLeadSoftPrj = rs.getString("SkillFocus");
              model.addElement(ManLeadSoftPrj);
              
          }
          listManLeadSoftPrj.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException ef) {
  	
      	ef.printStackTrace();
  }
	  
	return;
	
}

/** Skill Title: Management Experience
 *  Skill Focus:
 *  Skill Level:
 */
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillcbManExpSkill(JComboBox cbManExpSkill){
	
	String query = "Select DISTINCT SkillFocus FROM SkillTable WHERE SkillTitle =\"Management Experience\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
            	
			 cbManExpSkill.addItem(rs.getString("SkillFocus"));
            
            }

            rs.close();
            pst.close();
        }catch(SQLException ex) {
    	
        	ex.printStackTrace();
    }
	  
	return;
	
}

@SuppressWarnings({ "rawtypes", "unchecked" })	
public void fillcbManExpLvl(JComboBox cbManExpLvl){
	
	String query = "Select DISTINCT SkillLevel FROM SkillTable WHERE SkillTitle =\"Management Experience\"";
	 
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
   
		while (rs.next()) {
			cbManExpLvl.addItem(rs.getString("SkillLevel"));
               
            }

            rs.close();
            pst.close();
        }catch(SQLException exl) {
    	
        	exl.printStackTrace();
    }
	  
	return;
	
}   

/**listManTraining
 * Skill Title: Management Training
 * Skill Tool:
 * 
 */
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistManTraining(JList listManTraining){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Management Training\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String ManTraining = rs.getString("SkillTool");
              model.addElement(ManTraining);
              
          }
          listManTraining.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException et) {
  	
      	et.printStackTrace();
  }
	  
	return;
	
}

 /*listManSDLC
 * Skill Title: Management SDLC Tools 
 * CertBadge: 
 */
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistManSDLC(JList listManSDLC){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Management SDLC Tools\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String ManSDLC = rs.getString("CertBadge");
              model.addElement(ManSDLC);
              
          }
          listManSDLC.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException esd) {
  	
      	esd.printStackTrace();
  }
	  
	return;
	
}

/*listManBadgeCert
 * Skill Title: Management Badges and Certifications
 * CertBadge:
 */
@SuppressWarnings({ "rawtypes", "unchecked" })	
public void filllistManBadgeCert(JList listManBadgeCert){
	
String query = "Select * from SkillTable WHERE SkillTitle = \"Management Badges and Certifications\"";
	
	try (PreparedStatement pst = conn.prepareStatement(query)) {
		ResultSet rs;
		rs = pst.executeQuery();
		
		DefaultListModel model = new DefaultListModel();
          while (rs.next()) {
          	
              String ManBadgeCert = rs.getString("CertBadge");
              model.addElement(ManBadgeCert);
              
          }
          listManBadgeCert.setModel(model);
          
          rs.close();
          pst.close();
      }catch(SQLException es) {
  	
      	es.printStackTrace();
  }
	  
	return;
	
}


/**********************************Pass in User Id*****************************************/
public void my_update(String str) {
		textField_1.setText(str);
		textField_1.setBorder(null);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setBounds(259, 0, 360, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		if (str.equals("E101") || str.equals("admin") || str.equals("admin3") ){
			AdminUser = "Y";
		}else {
			AdminUser = "N";
		}
	}
}
