package Profile;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JList;
import javax.swing.JOptionPane;


@SuppressWarnings("unused")
public class LookupSkill {
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public int skilllvlskid=0;
	public int CertBadgskid=0;
	public int SDLCskid=0;
	public int MandCertskid=0;
	public int IndustBadskid=0;
	public int PratGiveBkskid=0;
	public int BARollsid=0;
	public int BAIndustryid=0;
	public int BAToolid=0;
	public int BACertid=0;
	public int BAYearid;
	public int BASkillBadgeid=0;
	public int TechIndDomid=0;
	public int TechBadCertid=0;
	public int TechOthExpid=0;
	public int TechMgmtToolid=0;
	public int TechConToolid=0;
	public int TechDevOpsid=0;
	public int FunIndDomid=0;
	public int FunCertid=0;
	public int FunBadgeid=0;
	public int FunTestExpid=0;
	public int FunTestManDefid=0;
	public int MANTrainid=0;
	public int MANLeaderSoftid=0;
	public int MANSDLCid=0;
	public int MANIndustryid=0;
	public int MANBadgeCertid;
	public int ManLeadTeamsid=0;
	public int ManSkillExpskid=0;
	public int TechSkillExpskid=0;

public Object lookuplistMYBARoles(String BARolesstr) {
	conn = dbConnection.ConnectDB();	
	    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillFocus=?")) {

	        pst.setString(1, BARolesstr);	       
	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                return BARollsid = (rs.getInt(1));
	            }
	            rs.close();
	            pst.close();
	        }
	    } catch (SQLException ex) {
	    	
			ex.printStackTrace();
	    }
	    
	    return null;
}

public Object lookuplistMYBAIndustry (String BAIndDomstr1) {
   conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"BA Industry Domain\" and SkillIndustry = ?")) {

        pst.setString(1, BAIndDomstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return BAIndustryid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYBAToolSoft(String BAToolSoftstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"BA Test Management Tools\" and SkillTool = ?")) {

        pst.setString(1, BAToolSoftstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return BAToolid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}	

public Object lookuplistMYBACert(String MYBACertliststr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"BA Certifications\" and CertBadge = ?")) {

        pst.setString(1, MYBACertliststr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return BACertid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYBASkillBadge(String MYBASkillBadgestr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"BA Skill Badge\" and CertBadge = ?")) {

        pst.setString(1, MYBASkillBadgestr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return BASkillBadgeid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYTechIndDom(String TechIndDomstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Tech Industry Domain\" and SkillIndustry = ?")) {

        pst.setString(1, TechIndDomstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return TechIndDomid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYTechBadgeCert(String TechBadgeCertstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Technical Badge\" and CertBadge = ?")) {

        pst.setString(1, TechBadgeCertstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return TechBadCertid = (rs.getInt(1));
                
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYTechOthExp(String TechOthExpstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Tech Other Areas of Expertise\" and SkillFocus = ?")) {

        pst.setString(1, TechOthExpstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return TechOthExpid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYTechTestManTool(String TechTestManToolstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Tech Test Management Tools\" and SkillTool = ?")) {

        pst.setString(1, TechTestManToolstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return TechMgmtToolid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYTechCodeConTool(String TechCodeVConstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Tech Code Version Control Tools\" and SkillTool = ?")) {

    	pst.setString(1, TechCodeVConstr1);     
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return TechConToolid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYTechDevOps(String TechDevOpsToolstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Tech DEVOps CI-CD Tools\" and SkillTool = ?")) {

        pst.setString(1, TechDevOpsToolstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return TechDevOpsid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYFunIndDom(String FunIndDomstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Functional Industry Domain\" and SkillIndustry = ?")) {

        pst.setString(1, FunIndDomstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return FunIndDomid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYFunCert(String FunCertstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Functional Certifications ISTQB or Equivalent\" and CertBadge = ?")) {

        pst.setString(1, FunCertstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return FunCertid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYFunTestExp(String FunTestExpstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Functional Testing Experience\" and SkillFocus = ?")) {

        pst.setString(1, FunTestExpstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return FunTestExpid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYFunBadge(String FunBadgestr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Functional Badge\" and CertBadge = ?")) {

        pst.setString(1, FunBadgestr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return FunBadgeid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistMYFunTestManDef(String FunDefectstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Functional Test Management and Defect Tracking Tools\" and SkillTool = ?")) {

        pst.setString(1, FunDefectstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return FunTestManDefid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}


public Object lookupManLeaderTeam(String LeadTeamstr1) {
	conn = dbConnection.ConnectDB();
		    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillZone=?")) {
		    	
		        pst.setString(1, LeadTeamstr1);	       
		        try (ResultSet rs = pst.executeQuery()) {
		            while (rs.next()) {
		                return ManLeadTeamsid = (rs.getInt(1));
		                
		            }
		            rs.close();
		            pst.close();
		        }
		    } catch (SQLException ex) {
		    	
				ex.printStackTrace();
		    }
		    
		    return null;
		    
}

public Object lookuplistManTraining(String MANTrainingstr1) {
	conn = dbConnection.ConnectDB();	
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Management Training\" and SkillTool = ?")) {

        pst.setString(1, MANTrainingstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return MANTrainid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistManLeaderSoftPrj(String MANLeaderSoftstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Manage Leadership Software Projects\" and SkillFocus = ?")) {

        pst.setString(1, MANLeaderSoftstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return MANLeaderSoftid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistManSDLC(String MANSDLCstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Management SDLC Tools\" and CertBadge = ?")) {

        pst.setString(1, MANSDLCstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return MANSDLCid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistManIndustry(String MANIndustrystr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Management Industry Domain\" and SkillIndustry = ?")) {

        pst.setString(1, MANIndustrystr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return MANIndustryid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}

public Object lookuplistManBadgeCert(String MANBadgeCertstr1) {
	conn = dbConnection.ConnectDB();
    try (PreparedStatement pst = conn.prepareStatement ("SELECT SkillID FROM SkillTable WHERE SkillTitle = \"Management Badges and Certifications\" and CertBadge = ?")) {

        pst.setString(1, MANBadgeCertstr1);	       
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                return MANBadgeCertid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    
    return null;
}
	
public Object lookupSkillIdSkilllvl(String slvlstr1) {
	conn = dbConnection.ConnectDB();
		    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillLevel=?")) {

		        pst.setString(1, slvlstr1);	       
		        try (ResultSet rs = pst.executeQuery()) {
		            while (rs.next()) {
		                return skilllvlskid = (rs.getInt(1));
		            }
		            rs.close();
		            pst.close();
		        }
		    } catch (SQLException ex) {
		    	
				ex.printStackTrace();
		    }
		    
		    return null;
}
	
public Object lookupSkillIdCertBadge(String cbstr1) {
	conn = dbConnection.ConnectDB();	
	    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE CertBadge=?")) {

	        pst.setString(1, cbstr1);
	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                return CertBadgskid = (rs.getInt(1));
	            }
	            rs.close();
	            pst.close();
	        }
	    } catch (SQLException ex) {
	    	
			ex.printStackTrace();
	    }
	    return null;
	}
	
public Object lookupSkillIdSDLC(String sdlcstr1) {
	conn = dbConnection.ConnectDB();	
	    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillTool=?")) {

	        pst.setString(1, sdlcstr1);
	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                return SDLCskid = (rs.getInt(1));
	            }
	            rs.close();
	            pst.close();
	        }
	    } catch (SQLException ex) {
	    	
			ex.printStackTrace();
	    }
	    return null;
	}
	
public Object lookupSkillIdMandatoryCert(String mcstr1) {
	conn = dbConnection.ConnectDB();	
	    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE CertBadge=?")) {

	        pst.setString(1, mcstr1);
	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                return MandCertskid = (rs.getInt(1));
	            }
	            rs.close();
	            pst.close();
	        }
	    } catch (SQLException ex) {
	    	
			ex.printStackTrace();
	    }
	    return null;
	}
	
public Object lookupSkillIdIndustryBadge(String ibstr1, String ibstr2) {
	conn = dbConnection.ConnectDB();	
    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillIndustry=? and SkillLevel=?")) {

        pst.setString(1, ibstr1);
        pst.setString(2, ibstr2);
        
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
            	
                return IndustBadskid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
            
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    return null;
	}

public Object lookupSkillIdPraticeGiveback(String pgstr1, String pgstr2) {
	conn = dbConnection.ConnectDB();	
	    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillZone=? and SkillFocus=?")) {

	        pst.setString(1, pgstr1);
	        pst.setString(2, pgstr2);
	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                return PratGiveBkskid = (rs.getInt(1));
	            }
	            rs.close();
	            pst.close();
	        }
	    } catch (SQLException ex) {
	    	
			ex.printStackTrace();
	    }
	    return null;
		}

public Object lookupTechToolExp(String tsestr1, String tsestr2, String tsestr3) {
	conn = dbConnection.ConnectDB();	
    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillTool=? and SkillLevel=? and SkillFocus=?")) {

        pst.setString(1, tsestr1);
        pst.setString(2, tsestr2);
        pst.setString(3, tsestr3);
        
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
            	
                return TechSkillExpskid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
            
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    return null;
	}

public Object lookupmagementSkill(String msestr1, String msestr2) {
	conn = dbConnection.ConnectDB();	
    try (PreparedStatement pst = conn.prepareStatement("SELECT SkillID FROM SkillTable WHERE SkillFocus=? and SkillLevel=?")) {

        pst.setString(1, msestr1);
        pst.setString(2, msestr2);
        
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
            	
                return ManSkillExpskid = (rs.getInt(1));
            }
            rs.close();
            pst.close();
            
        }
    } catch (SQLException ex) {
    	
		ex.printStackTrace();
    }
    return null;
	}







}
