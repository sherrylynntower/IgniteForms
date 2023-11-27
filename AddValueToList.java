package Profile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


@SuppressWarnings("unused")
public class AddValueToList {
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	public String listval;
	

	/**********************************Add Skills to SkillProfLvl and update Jlist*****************************************/

	public String add_SkillProfLvltoList() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Profile";
		String sktitle = "Ignite Skills Proficiency Level";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,listval);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to SDLCModelExperience and update Jlist*****************************************/

	public String add_SkillSDLCModelExperience() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Profile";
		String sktitle = "SDLC";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank()) 
         {	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,listval);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to CloudCertBadges and update Jlist******************************************/

	public String add_SkillCloudCertBadges() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Profile";
		String sktitle = "Cloud Certifications and Badges";
		String filler = "NA";
		String listvalue = "";
		
		
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank()) 
         {	
		
        	String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
        		PreparedStatement ps=conn.prepareStatement(query);
	         try {
	        	 
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;
       
		}
	
	/**********************************Add Skills to MandatoryBadges and update Jlist*****************************************/

	public String add_SkillMandatoryBadges() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Profile";
		String sktitle = "Mandatory Badge";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank()) 
         {	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to Industry Badge and Expertise cbindustrycol1 and update Jlist*****************************************/

	public String add_SkillIndustryBadges() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Profile";
		String sktitle = "Industry Badges and Expertise Level";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="Select Distinct SkillLevel FROM SkillTable where SkillTitle = 'Industry Badges and Expertise Level'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
	 	  		String Industrylvl = rs.getString("SkillLevel");
	 	  		
	 	  		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	 	  		PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
	 	  			ps.setString(1,skgrp);
					ps.setString(2,sktitle);
					ps.setString(3,filler);
					ps.setString(4,filler);
					ps.setString(5,listval);
					ps.setString(6,Industrylvl);
					ps.setString(7,filler);
					ps.setString(8,filler);
					ps.setString(9,filler);
					ps.execute();
					ps.close();
	 	  				  			
	 			}
				
			} catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to Industry Level cbindustrycol2 and update Jlist*****************************************/

	public String add_SkillIndustryBad() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Profile";
		String sktitle = "Industry Badges and Expertise Level";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank()) 
         {
	         try {String que="Select Distinct SkillIndustry FROM SkillTable where SkillTitle = 'Industry Badges and Expertise Level'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
	 	  		String Industrybad = rs.getString("SkillIndustry");
	 	  		
	 	  		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	 	  		PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
	 	  			ps.setString(1,skgrp);
					ps.setString(2,sktitle);
					ps.setString(3,filler);
					ps.setString(4,filler);
					ps.setString(5,Industrybad);
					ps.setString(6,listval);
					ps.setString(7,filler);
					ps.setString(8,filler);
					ps.setString(9,filler);
					ps.execute();
					ps.close();
	 	  				  			
	 			}
				
			} catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to Giveback and practice zone PracticeZoneColumn1 and update Jlist*****************************************/

	public String add_SkillPracticeGBZone() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Profile";
		String sktitle = "Practice Giveback";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="Select Distinct SkillFocus FROM SkillTable where SkillTitle = 'Practice Giveback'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
	 	  		String GBfocus = rs.getString("SkillFocus");
	 	  		
	 	  		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	 	  		PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
	 	  			ps.setString(1,skgrp);
					ps.setString(2,sktitle);
					ps.setString(3,listval);
					ps.setString(4,GBfocus);
					ps.setString(5,filler);
					ps.setString(6,filler);
					ps.setString(7,filler);
					ps.setString(8,filler);
					ps.setString(9,filler);
					ps.execute();
					ps.close();
	 	  				  			
	 			}
				
			} catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to Giveback and practice focus PracticeZoneColumn2 and update Jlist*****************************************/

	public String add_SkillIGBFocus() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Profile";
		String sktitle = "Practice Giveback";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank()) 
         {
	         try {String que="Select Distinct SkillZone FROM SkillTable where SkillTitle = 'Practice Giveback'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
	 	  		String GBzone = rs.getString("SkillZone");
	 	  		
	 	  		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	 	  		PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
	 	  			ps.setString(1,skgrp);
					ps.setString(2,sktitle);
					ps.setString(3,GBzone);
					ps.setString(4,listval);
					ps.setString(5,filler);
					ps.setString(6,filler);
					ps.setString(7,filler);
					ps.setString(8,filler);
					ps.setString(9,filler);
					ps.execute();
					ps.close();
	 	  				  			
	 			}
				
			} catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	//****************Business********************
	/**********************************Add Skills to BARolls and update Jlist*****************************************/

	public String add_SkillBARolls() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "BA";
		String sktitle = "BA Roll";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,listval);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	/**********************************Add Skills to BAManToolSoft and update Jlist*****************************************/

	public String add_SkillBAManToolSoft() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "BA";
		String sktitle = "BA Test Management Tools";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,listval);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to BAManToolSoft and update Jlist*****************************************/

	public String add_SkillBASkillBadge() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "BA";
		String sktitle = "BA Skill Badge";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to BAIndustryDomain and update Jlist*****************************************/

	public String add_SkillBAIndDom() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "BA";
		String sktitle = "BA Industry Domain";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,listval);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to BACertification and update Jlist*****************************************/

	public String add_SkillBACert() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "BA";
		String sktitle = "BA Certifications";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to FUNCertification and update Jlist*****************************************/

	public String add_SkillFUNIndDom() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Functional";
		String sktitle = "Functional Industry Domain";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,listval);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to FUNTestingExp and update Jlist*****************************************/

	public String add_SkillFUNTestingExp() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Functional";
		String sktitle = "Functional Testing Experience";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,listval);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to FUNTestMang and update Jlist*****************************************/

	public String add_SkillFUNTestMang() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Functional";
		String sktitle = "Functional Test Management and Defect Tracking Tools";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,listval);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to FUNCert and update Jlist*****************************************/

	public String add_SkillFUNCert() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Functional";
		String sktitle = "Functional Certifications ISTQB or Equivalent";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to FUNBadge and update Jlist*****************************************/

	public String add_SkillFUNBadge() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Functional";
		String sktitle = "Functional Badge";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to TechIndDom and update Jlist*****************************************/

	public String add_SkillTechIndDom() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Tech Industry Domain";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,listval);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to TechOthAreaExpertise and update Jlist*****************************************/

	public String add_SkillTechOthAreaExpertise() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Tech Other Areas of Expertise";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,listval);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to TechCodeControlTools and update Jlist*****************************************/

	public String add_SkillTechCodeConTools() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Tech Code Version Control Tools";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,listval);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to TechBadge and update Jlist*****************************************/

	public String add_SkillTechBadge() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Technical Badge";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to TechTestMangTools and update Jlist*****************************************/

	public String add_SkillTechTestManTools() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Tech Test Management Tools";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,listval);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to TechDevOpsCDTool and update Jlist*****************************************/

	public String add_SkillTechDevOpsCDTool() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Tech DEVOps CI-CD Tools";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,listval);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to TableTechExpTools and update Jlist*****************************************/
	
	public String add_SkillTableTechExpTools() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Tech Technical Tools Experience";
		String filler = "NA";
		String listtool = "";
        
        listtool = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listtool != null && !listtool.isEmpty() && !listtool.isBlank())
         {
	         try {		
	        	 
	        	String que="Select Distinct SkillFocus FROM SkillTable where SkillTitle = 'Tech Technical Tools Experience'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
					String SmeTrainFocus = rs.getString("SkillFocus");
					
					String q="Select Distinct SkillLevel FROM SkillTable where SkillTitle = 'Tech Technical Tools Experience'";
		 			PreparedStatement pst2=conn.prepareStatement(q);
		 			ResultSet rs2 = null;
		 			rs2 = pst2.executeQuery();
					
					
					while(rs2.next()){
						String RateSkillLvl  = rs2.getString("SkillLevel");

						String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
						PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
						ps.setString(1,skgrp);
						ps.setString(2,sktitle);
						ps.setString(3,filler);
						ps.setString(4,SmeTrainFocus);
						ps.setString(5,filler);
						ps.setString(6,RateSkillLvl);
						ps.setString(7,listtool);
						ps.setString(8,filler);
						ps.setString(9,filler);
						ps.execute();
						ps.close();
	 	  			}	  			
	 			}
				
			} catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
/**********************************Add Skills to TableTechSkillLevel and update Jlist*****************************************/
	
	public String add_SkillTableTechRateLvl() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Tech Technical Tools Experience";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	try {		
	        	 
	        	String que="Select Distinct SkillFocus FROM SkillTable where SkillTitle = 'Tech Technical Tools Experience'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
					String SmeTrainFocus = rs.getString("SkillFocus");
					
					String q="Select Distinct SkillTool FROM SkillTable where SkillTitle = 'Tech Technical Tools Experience'";
		 			PreparedStatement pst2=conn.prepareStatement(q);
		 			ResultSet rs2 = null;
		 			rs2 = pst2.executeQuery();
					
					
					while(rs2.next()){
						String SkillTool  = rs2.getString("SkillTool");

						String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
						PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
						ps.setString(1,skgrp);
						ps.setString(2,sktitle);
						ps.setString(3,filler);
						ps.setString(4,SmeTrainFocus);
						ps.setString(5,filler);
						ps.setString(6,listval);
						ps.setString(7,SkillTool);
						ps.setString(8,filler);
						ps.setString(9,filler);
						ps.execute();
						ps.close();
	 	  			}	  			
	 			}
				
			} catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
/**********************************Add Skills to TableTechSkillSMETrainFocus and update Jlist*****************************************/
	
	public String add_SkillTableTechSMETrain() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Tech";
		String sktitle = "Tech Technical Tools Experience";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	try {		
	        	 
	        	String que="Select Distinct SkillLevel FROM SkillTable where SkillTitle = 'Tech Technical Tools Experience'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
					String skilllvl = rs.getString("SkillLevel");
					
					String q="Select Distinct SkillTool FROM SkillTable where SkillTitle = 'Tech Technical Tools Experience'";
		 			PreparedStatement pst2=conn.prepareStatement(q);
		 			ResultSet rs2 = null;
		 			rs2 = pst2.executeQuery();
					
					
					while(rs2.next()){
						String SkillTool  = rs2.getString("SkillTool");

						String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
						PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
						ps.setString(1,skgrp);
						ps.setString(2,sktitle);
						ps.setString(3,filler);
						ps.setString(4,listval);
						ps.setString(5,filler);
						ps.setString(6,skilllvl);
						ps.setString(7,SkillTool);
						ps.setString(8,filler);
						ps.setString(9,filler);
						ps.execute();
						ps.close();
	 	  			}	  			
	 			}
				
			}catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to ManTeamDem and update Jlist*****************************************/

	public String add_SkillManTeamDem() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Management";
		String sktitle = "Manage Leadership Team demography";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,listval);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to ManSoftProj and update Jlist*****************************************/

	public String add_SkillManSoftProj() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Management";
		String sktitle = "Manage Leadership Software Projects";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,listval);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to ManManIndDom and update Jlist*****************************************/

	public String add_SkillManIndDom() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Management";
		String sktitle = "Management Industry Domain";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,listval);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to ManManTrain and update Jlist*****************************************/

	public String add_SkillManTraining() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Management";
		String sktitle = "Management Training";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,listval);
				ps.setString(8,filler);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to ManSDLCTool and update Jlist*****************************************/

	public String add_SkillManSDLCTool() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Management";
		String sktitle = "Management SDLC Tools";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to ManBadCert and update Jlist*****************************************/

	public String add_SkillManBadCert() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Management";
		String sktitle = "Management Badges and Certifications";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,skgrp);
				ps.setString(2,sktitle);
				ps.setString(3,filler);
				ps.setString(4,filler);
				ps.setString(5,filler);
				ps.setString(6,filler);
				ps.setString(7,filler);
				ps.setString(8,listval);
				ps.setString(9,filler);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to ManagementExpColumn1 Focus and update Jlist*****************************************/

	public String add_SkillManExpCol1() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Management";
		String sktitle = "Management Experience";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="Select Distinct SkillLevel FROM SkillTable where SkillTitle = 'Management Experience'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
	 	  		String MElevel = rs.getString("SkillLevel");
	 	  		
	 	  		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	 	  		PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
	 	  			ps.setString(1,skgrp);
					ps.setString(2,sktitle);
					ps.setString(3,filler);
					ps.setString(4,listval);
					ps.setString(5,filler);
					ps.setString(6,MElevel);
					ps.setString(7,filler);
					ps.setString(8,filler);
					ps.setString(9,filler);
					ps.execute();
					ps.close();
	 	  				  			
	 			}
				
			} catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to ManagementExpColumn1 Level and update Jlist*****************************************/

	public String add_SkillManExpCol2() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String skgrp = "Management";
		String sktitle = "Management Experience";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="Select Distinct SkillFocus FROM SkillTable where SkillTitle = 'Management Experience'";
	 			PreparedStatement pst=conn.prepareStatement(que);
	 			ResultSet rs = null;
	 			rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
	 	  		String MEfocus = rs.getString("SkillFocus");
	 	  		
	 	  		String query="INSERT into skillTable(SkillGroup,SkillTitle,SkillZone,SkillFocus,SkillIndustry,SkillLevel,SkillTool,CertBadge,SkillDescription)	values(?,?,?,?,?,?,?,?,?)";
	 	  		PreparedStatement ps=conn.prepareStatement(query); 
	 	  		
	 	  		
	 	  			ps.setString(1,skgrp);
					ps.setString(2,sktitle);
					ps.setString(3,filler);
					ps.setString(4,MEfocus);
					ps.setString(5,filler);
					ps.setString(6,listval);
					ps.setString(7,filler);
					ps.setString(8,filler);
					ps.setString(9,filler);
					ps.execute();
					ps.close();
	 	  				  			
	 			}
				
			} catch (SQLException e) {e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Saved");  	
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to Profile Hire Type and update Jlist*****************************************/

	public String add_ProfileHireType() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String seltitle = "HiringType";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into profileInfoSelections(selectionTitle,selectionName)values(?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,seltitle);
				ps.setString(2,listval);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
				System.out.println("this is a catch");
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to Profile Additional Experience and update Jlist*****************************************/

	public String add_ProfileAddExp() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String seltitle = "AdditionalExperience";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into profileInfoSelections(selectionTitle,SelectionName)values(?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,seltitle);
				ps.setString(2,listval);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to Profile SecurityLevel and update Jlist*****************************************/

	public String add_ProfileSeclvl() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String seltitle = "SecurityLevel";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into profileInfoSelections(selectionTitle,SelectionName)values(?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,seltitle);
				ps.setString(2,listval);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	/**********************************Add Skills to Profile HiredBandLevel and update Jlist*****************************************/

	public String add_ProfileHireBanlvl() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String seltitle = "HiredBandLevel";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into profileInfoSelections(selectionTitle,SelectionName)values(?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,seltitle);
				ps.setString(2,listval);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
	
	/**********************************Add Skills to Profile CurrentBandLevel and update Jlist*****************************************/

	public String add_ProfileCurrBanlvl() throws SQLException {
		conn = dbConnection.ConnectDB();
		
		String seltitle = "CurrentBandLevel";
		String filler = "NA";
		String listval = "";
        
        listval = JOptionPane.showInputDialog(null, 
                "Please Enter value for list");
         
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
        	
		String query="INSERT into profileInfoSelections(selectionTitle,SelectionName)values(?,?)";
	         PreparedStatement ps=conn.prepareStatement(query);
	         
	         try {
	        	  
				ps.setString(1,seltitle);
				ps.setString(2,listval);
				ps.execute();
				JOptionPane.showMessageDialog(null, "Saved");
				ps.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			} 
	         finally{
	        	 conn.close();
					}
        }else {
        	JOptionPane.showMessageDialog(null, "Cancelled");
        }
		return null;   
		}
}