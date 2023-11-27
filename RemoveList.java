package Profile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class RemoveList {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	public int IndustrySkillID;
	public int PracticeGBSkillID;
	public int TechExpToolSkillID;
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
	
	public void RMVprofileinfo(String listval, String title)throws SQLException {
		conn = dbConnection.ConnectDB();
        
		if (listval != null && !listval.isEmpty() && !listval.isBlank()){
			
			String query = "DELETE FROM profileInfoSelections WHERE selectionTitle = ? AND selectionName = ?";
			try {	
				PreparedStatement pst = conn.prepareStatement(query);

					pst.setString(1,title);
					pst.setString(2,listval);
					pst.executeUpdate();
			    
			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
        
		return;   
		}
	
	public void RMVprofiledataHireTyp(String listval)throws SQLException {
		conn = dbConnection.ConnectDB();
        
		if (listval != null && !listval.isEmpty() && !listval.isBlank()) {
			
			try {String que="SELECT * FROM profileData WHERE hiringType = ?";	
			PreparedStatement pst = conn.prepareStatement(que);
	   		pst.setString(1, listval);
	   		ResultSet rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
				 	
				 		try {String qry="UPDATE profileData SET hiringType = 'NA' ";
						PreparedStatement ps=conn.prepareStatement(qry);
						ps.executeUpdate();
				 		
				 		}catch (Exception e2){
				 		e2.printStackTrace();}    
				}
			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
        
		return;   
		}
	
	public void RMVprofiledataAddExp(String listval)throws SQLException {
		conn = dbConnection.ConnectDB();
        
		if (listval != null && !listval.isEmpty() && !listval.isBlank()) {
			
			try {String que="SELECT * FROM profileData WHERE additionalExp = ?";	
			PreparedStatement pst = conn.prepareStatement(que);
	   		pst.setString(1, listval);
	   		ResultSet rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
				 	
				 		try {String qry="UPDATE profileData SET additionalExp = 'NA' ";
						PreparedStatement ps=conn.prepareStatement(qry);
						ps.executeUpdate();
				 		
				 		}catch (Exception e2){
				 		e2.printStackTrace();}    
				}
			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
        
		return;   
		}
	
	public void RMVprofiledataSecLvl(String listval)throws SQLException {
		conn = dbConnection.ConnectDB();
        
		if (listval != null && !listval.isEmpty() && !listval.isBlank()) {
			
			try {String que="SELECT * FROM profileData WHERE securityLevel = ?";	
			PreparedStatement pst = conn.prepareStatement(que);
	   		pst.setString(1, listval);
	   		ResultSet rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
				 	
				 		try {String qry="UPDATE profileData SET securityLevel = 'NA' ";
						PreparedStatement ps=conn.prepareStatement(qry);
						ps.executeUpdate();
				 		
				 		}catch (Exception e2){
				 		e2.printStackTrace();}    
				}
			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
        
		return;   
		}
	
	public void RMVprofiledataHireBandLvl(String listval)throws SQLException {
		conn = dbConnection.ConnectDB();
        
		if (listval != null && !listval.isEmpty() && !listval.isBlank()) {
			
			try {String que="SELECT * FROM profileData WHERE hiredBandLevel = ?";	
			PreparedStatement pst = conn.prepareStatement(que);
	   		pst.setString(1, listval);
	   		ResultSet rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
				 	
				 		try {String qry="UPDATE profileData SET hiredBandLevel = 'NA' ";
						PreparedStatement ps=conn.prepareStatement(qry);
						ps.executeUpdate();
				 		
				 		}catch (Exception e2){
				 		e2.printStackTrace();}    
				}
			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
        
		return;   
		}
	
	public void RMVprofiledataCurBandLvl(String listval)throws SQLException {
		conn = dbConnection.ConnectDB();
        
		if (listval != null && !listval.isEmpty() && !listval.isBlank()) {
			
			try {String que="SELECT * FROM profileData WHERE currentBandLevel = ?";	
			PreparedStatement pst = conn.prepareStatement(que);
	   		pst.setString(1, listval);
	   		ResultSet rs = pst.executeQuery();
	   			 			
	 			while (rs.next()){
				 	
				 		try {String qry="UPDATE profileData SET currentBandLevel = 'NA' ";
						PreparedStatement ps=conn.prepareStatement(qry);
						ps.executeUpdate();
				 		
				 		}catch (Exception e2){
				 		e2.printStackTrace();}    
				}
			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
        
		return;   
		}
	
	public void REMOVElistMYBARoles(String rmvBARolesstr, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaroll = new LookupSkill();
		BARollsid = (int) mybaroll.lookuplistMYBARoles(rmvBARolesstr);
		
		if (BARollsid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, BARollsid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}	

	public void REMOVElistRemoveBAToolsSoft(String rmvBAToolSoftstr, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaTool = new LookupSkill();
		BAToolid = (int) mybaTool.lookuplistMYBAToolSoft(rmvBAToolSoftstr);
		
		
		if (BAToolid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, BAToolid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}	

	public void REMOVElistMYBACert(String rmvBACertliststr, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaCert = new LookupSkill();
		BACertid = (int) mybaCert.lookuplistMYBACert(rmvBACertliststr);
		
		
		if (BACertid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, BACertid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYBAIndustry(String rmvBAIndDomstr, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaind = new LookupSkill();
		BAIndustryid = (int) mybaind.lookuplistMYBAIndustry(rmvBAIndDomstr);
		
		if (BAIndustryid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, BAIndustryid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}	

	public void REMOVElistMYBASkillBadge(String rmvBASkillBadgestr, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaSkillBadge = new LookupSkill();
		BASkillBadgeid = (int) mybaSkillBadge.lookuplistMYBASkillBadge(rmvBASkillBadgestr);
		
		if (BASkillBadgeid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, BASkillBadgeid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYTechIndustryDomain(String rmvTechIndDomStr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechIndDom = new LookupSkill();
		TechIndDomid =  (int) mytechIndDom.lookuplistMYTechIndDom(rmvTechIndDomStr1);
		
		if (TechIndDomid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, TechIndDomid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYTechOtherExp(String rmvTechOtherExpStr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill mytechOthExp = new LookupSkill();
		TechOthExpid = (int) mytechOthExp.lookuplistMYTechOthExp(rmvTechOtherExpStr1);
		
		if (TechOthExpid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, TechOthExpid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYTechMgmtTool(String rmvTechMgmtToolStr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechMgmtTool = new LookupSkill();
		TechMgmtToolid = (int) mytechMgmtTool.lookuplistMYTechTestManTool(rmvTechMgmtToolStr1);
		
		if (TechMgmtToolid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, TechMgmtToolid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYTechBadgeCert(String rmvTechBadgeCertstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechBadgeCert = new LookupSkill();
		TechBadCertid = (int) mytechBadgeCert.lookuplistMYTechBadgeCert(rmvTechBadgeCertstr1);
		
		if (TechBadCertid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, TechBadCertid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYTechCodeVerControl(String rmvTechCodeVerConstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechCodeConTool = new LookupSkill();
		TechConToolid = (int) mytechCodeConTool.lookuplistMYTechCodeConTool(rmvTechCodeVerConstr1);
		
		if (TechConToolid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, TechConToolid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYTechDevOpsTool(String rmvTechDevOpsToolstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechDevOps = new LookupSkill();
		TechDevOpsid = (int) mytechDevOps.lookuplistMYTechDevOps(rmvTechDevOpsToolstr1);
		
		if (TechDevOpsid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, TechDevOpsid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void  REMOVElistMYFunIndDomain(String rmvFunIndDomainstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill myfunIndDom = new LookupSkill();
		FunIndDomid = (int) myfunIndDom.lookuplistMYFunIndDom(rmvFunIndDomainstr1);
		
		if (FunIndDomid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, FunIndDomid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void  REMOVElistMYFunCert(String rmvFunCertstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill myfunCert = new LookupSkill();
		FunCertid = (int) myfunCert.lookuplistMYFunCert(rmvFunCertstr1);
		
		if (FunCertid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, FunCertid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void  REMOVElistMYFunTestExp(String rmvFunTestExpstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill myfunTestExp = new LookupSkill();
		FunTestExpid = (int) myfunTestExp.lookuplistMYFunTestExp(rmvFunTestExpstr1);
		
		if (FunTestExpid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, FunTestExpid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}


	public void  REMOVElistMYFunBadge(String rmvFunBadgestr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill myfunBadge = new LookupSkill();
		FunBadgeid = (int) myfunBadge.lookuplistMYFunBadge(rmvFunBadgestr1);
		
		if (FunBadgeid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, FunBadgeid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}


	public void  REMOVElistMYFunDefectTrack(String rmvFunDefectTrackstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill myfunTestManDef = new LookupSkill();
		FunTestManDefid = (int) myfunTestManDef.lookuplistMYFunTestManDef(rmvFunDefectTrackstr1);
		
		
		if (FunTestManDefid!= 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1, FunTestManDefid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVEmylistManLeadership(String rmvLeadTeamstr1, String username){
		conn = dbConnection.ConnectDB();		
		
		LookupSkill mymanLeaderTeam = new LookupSkill();
		ManLeadTeamsid = (int) mymanLeaderTeam.lookupManLeaderTeam(rmvLeadTeamstr1);
		
		if (ManLeadTeamsid != 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,ManLeadTeamsid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}	


	public void REMOVElistMYManTraining(String rmvManTrainingstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mymanTraining = new LookupSkill();
		MANTrainid = (int) mymanTraining.lookuplistManTraining(rmvManTrainingstr1);
		
		if (MANTrainid != 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANTrainid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}	

	public void REMOVElistMYManLeadSoft(String rmvManLeadSoftstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mymanLeaderSoftPrj = new LookupSkill();
		MANLeaderSoftid = (int) mymanLeaderSoftPrj.lookuplistManLeaderSoftPrj(rmvManLeadSoftstr1);
		
		if (MANLeaderSoftid != 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANLeaderSoftid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYManSDLC(String rmvManSDLCstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill mymanSDLC = new LookupSkill();
		MANSDLCid = (int) mymanSDLC.lookuplistManSDLC(rmvManSDLCstr1);
		
		if (MANSDLCid != 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANSDLCid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYManIndDomain(String rmvManIndDomainstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mymanIndustry = new LookupSkill();
		MANIndustryid = (int) mymanIndustry.lookuplistManIndustry(rmvManIndDomainstr1);
		
		if (MANIndustryid != 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANIndustryid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVElistMYManBadgeCert(String rmvManBadgeCertstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mymanBadgeCert = new LookupSkill();
		MANBadgeCertid = (int) mymanBadgeCert.lookuplistManBadgeCert(rmvManBadgeCertstr1);
		
		if (MANBadgeCertid != 0 ){
		String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANBadgeCertid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}	
	}

	public void REMOVEmyIgniteSkillProfList(String rmvprofliststr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mySkillProfList = new LookupSkill();
		skilllvlskid = (int) mySkillProfList.lookupSkillIdSkilllvl(rmvprofliststr1);
			
			if (skilllvlskid!= 0 ){
			String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
			try {	
				PreparedStatement pst = conn.prepareStatement(query);

					pst.setInt(1,skilllvlskid);
					pst.setString(2,username);
					pst.executeUpdate();
			    
			} catch (Exception ex) {
		
				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
		}	
		
		
	public void REMOVEmySDLCModExpList(String rmvSDLCModExpltstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mySkillIdSDLC = new LookupSkill();
		SDLCskid = (int) mySkillIdSDLC.lookupSkillIdSDLC(rmvSDLCModExpltstr1);
			
			if (SDLCskid != 0 ) {
				String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
			try {	
				PreparedStatement pst = conn.prepareStatement(query);

					pst.setInt(1,SDLCskid);
					pst.setString(2,username);
					pst.executeUpdate();
			    
			} catch (Exception ex) {
		
				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}		
		}	
		
		public void REMOVEMYMandatoryBadges(String rmvmanbadstr1, String username){
			conn = dbConnection.ConnectDB();
			
			LookupSkill myMandatoryBadge = new LookupSkill();
			MandCertskid = (int) myMandatoryBadge.lookupSkillIdMandatoryCert(rmvmanbadstr1);		
			
			if (MandCertskid != 0 ) {
				String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
			try {	
				PreparedStatement pst = conn.prepareStatement(query);

					pst.setInt(1,MandCertskid);
					pst.setString(2,username);
					pst.executeUpdate();
			    
			} catch (Exception ex) {
		
				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}		
		}	
				
		public void REMOVEmyIgniteSkillCertBadge(String rmvcertbadstr1, String username){
			conn = dbConnection.ConnectDB();
			
			LookupSkill mySkillIdCertBadge = new LookupSkill();
			CertBadgskid = (int) mySkillIdCertBadge.lookupSkillIdCertBadge(rmvcertbadstr1);
					
					if (CertBadgskid!= 0 ){
						String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
						try {		
						PreparedStatement pst = conn.prepareStatement(query);

							pst.setInt(1,CertBadgskid);
							pst.setString(2,username);
							pst.executeUpdate();
					    
					} catch (Exception ex) {
				
						JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
						ex.printStackTrace();

				}
				}else {
					JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
				}			
			}	
					
		public void REMOVEindustrySelectTable(String str1, String str2, String username){
			conn = dbConnection.ConnectDB();
			
			LookupSkill mySkillIdIndustryBadge = new LookupSkill();
			IndustBadskid = (int) mySkillIdIndustryBadge.lookupSkillIdIndustryBadge(str1,str2);
			
			if (IndustBadskid!= 0 ){
				String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
			try {	
				PreparedStatement pst = conn.prepareStatement(query);

					pst.setInt(1,IndustBadskid);
					pst.setString(2,username);
					pst.executeUpdate();
			    
			} catch (Exception ex) {
		
				JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
				ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}				
		}

		public void REMOVEgivebackSelectTable(String givebackstr1, String givebackstr2, String username){
			conn = dbConnection.ConnectDB();	
			
			LookupSkill mySkillIdPratGiveback = new LookupSkill();
			PratGiveBkskid = (int) mySkillIdPratGiveback.lookupSkillIdPraticeGiveback(givebackstr1,givebackstr2);

		if (PratGiveBkskid!= 0 ){
			String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,PratGiveBkskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
		}	
		
		public void REMOVEMyTechToolExpTable(String str1, String str2, String str3, String username){
			conn = dbConnection.ConnectDB();	
			
			LookupSkill mySkillIdTechTookExp = new LookupSkill();
			TechSkillExpskid = (int) mySkillIdTechTookExp.lookupTechToolExp(str1,str2,str3);

		if (TechSkillExpskid!= 0 ){
			String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,TechSkillExpskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
		}	
		
		public void REMOVEManSkillExpTable(String str1, String str2, String username){
			conn = dbConnection.ConnectDB();	
			
			LookupSkill mySkillIdMANSkillExp = new LookupSkill();
			ManSkillExpskid = (int) mySkillIdMANSkillExp.lookupmagementSkill(str1,str2);

		if (ManSkillExpskid!= 0 ){
			String query = "DELETE FROM employeeSkills WHERE SkillID = ? AND username = ?";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,ManSkillExpskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Removed from DB");
			ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}	
		}	
//*************************************************************************//
		public void RMVSkillIDemployeeSkills(int certBadgskid2)throws SQLException{
			conn = dbConnection.ConnectDB();
			//remove from employeeSkills
			
				String que="DELETE FROM employeeSkills WHERE SkillID = ?";
				PreparedStatement pst=conn.prepareStatement(que);
		         try {
		        	
		        	pst.setInt(1,certBadgskid2);
		 	        pst.execute();
		 			pst.close();	
		 	  				
		 			RemoveList RMVskilltableid = new RemoveList();
			         RMVskilltableid.RMVSkillIDSkillTable(certBadgskid2);
			         
				} catch (SQLException e){
					e.printStackTrace();} 
		         
		         
		         
		}
		
public void RMVSkillIDSkillTable(int skillid)throws SQLException{
			conn = dbConnection.ConnectDB();
		    //remove from SkillTable    
			
		         String qry="DELETE FROM SkillTable WHERE SkillID = ?";
		         PreparedStatement ps=conn.prepareStatement(qry);
		         try {
		         	
		         	ps.setInt(1,skillid);
		            ps.execute();
		         	ps.close();
		         	
		         	
		         }catch (Exception e2){
		         	
		         	e2.printStackTrace();} 
		}

public void RMVSkidIndustryEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillIndustry=?";
	         
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				IndustrySkillID = (results.getInt(1));
	 				
	 				String query="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement pst1=conn.prepareStatement(query);
	 		         try {
	 		        	
	 		        	pst1.setInt(1,IndustrySkillID);
	 		 	        pst1.execute();
	 		 			pst1.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
	 		        
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		
		}


public void RMVSkidIndustrySkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillIndustry=?";
        
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();

			while (results.next()){
				IndustrySkillID = (results.getInt(1));
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {
			 			
			 		ps.setInt(1,IndustrySkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}

public void RMVSkidIndlvlEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillLevel=?";
	         
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				IndustrySkillID = (results.getInt(1));
	 				
	 				String query="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement pst1=conn.prepareStatement(query);
	 		         try {
	 		        	
	 		        	pst1.setInt(1,IndustrySkillID);
	 		 	        pst1.execute();
	 		 			pst1.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
	 		        
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		
		}

public void RMVSkidIndlvlSkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillLevel=?";
        
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();

			while (results.next()){
				IndustrySkillID = (results.getInt(1));
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {
			 			
			 		ps.setInt(1,IndustrySkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}

public void RMVSkidPracZoneEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillZone=?";
	         
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				PracticeGBSkillID = (results.getInt(1));
	 				
	 				String query="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement pst1=conn.prepareStatement(query);
	 		         try {
	 		        	
	 		        	pst1.setInt(1,PracticeGBSkillID);
	 		 	        pst1.execute();
	 		 			pst1.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
	 		        
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		
		}

public void RMVSkidPracZoneSkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillZone=?";
        
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();

			while (results.next()){
				PracticeGBSkillID = (results.getInt(1));
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {
			 			
			 		ps.setInt(1,PracticeGBSkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}

public void RMVSkidFocusGrpEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillFocus=?";
	         
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				PracticeGBSkillID = (results.getInt(1));
	 				
	 				String query="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement pst1=conn.prepareStatement(query);
	 		         try {
	 		        	
	 		        	pst1.setInt(1,PracticeGBSkillID);
	 		 	        pst1.execute();
	 		 			pst1.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
	 		        
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		
		}

public void RMVSkidFocusGrpSkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillFocus=?";
        
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();

			while (results.next()){
				PracticeGBSkillID = (results.getInt(1));
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {
			 			
			 		ps.setInt(1,PracticeGBSkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}

public void RMVManExpSkillEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillFocus=?";
	         
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				int ManExpSkillID = (results.getInt(1));
	 				
	 				String query="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement pst1=conn.prepareStatement(query);
	 		         try {
	 		        	
	 		        	pst1.setInt(1,ManExpSkillID);
	 		 	        pst1.execute();
	 		 			pst1.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
	 		        
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		
		}

public void RMVManExpSkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillFocus=?";
        
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();
        
			while (results.next()){
				int ManExpSkillID = (results.getInt(1));
				System.out.println("Skill id to delete"+ManExpSkillID);
				
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {
			 			
			 		ps.setInt(1,ManExpSkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}
public void RMVManExplvlEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillLevel=?";
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				int ManExplvlSkillID = (results.getInt(1));
	 				String query="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement pst1=conn.prepareStatement(query);
	 		         try {
	 		        	pst1.setInt(1,ManExplvlSkillID);
	 		 	        pst1.execute();
	 		 			pst1.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		}

public void RMVManExplvlSkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillLevel=?";
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();

			while (results.next()){
				int ManExplvlSkillID = (results.getInt(1));
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {	
			 		ps.setInt(1,ManExplvlSkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}

public void RMVTechExpToolEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillTool=?";
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				TechExpToolSkillID = (results.getInt(1));
	 				
	 				String qry="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement ps=conn.prepareStatement(qry);
	 		         try {
	 		        	ps.setInt(1,TechExpToolSkillID);
	 		 	        ps.execute();
	 		 			ps.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		}

public void RMVTechExpToolSkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillTool=?";
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();

			while (results.next()){
				int TechExpToolSkillID = (results.getInt(1));
				
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {	
			 		ps.setInt(1,TechExpToolSkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}

public void RMVTechRatelvlEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillLevel=?";
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				int TechRatelvlSkillID = (results.getInt(1));
	 				String query="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement pst1=conn.prepareStatement(query);
	 		         try {
	 		        	pst1.setInt(1,TechRatelvlSkillID);
	 		 	        pst1.execute();
	 		 			pst1.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		}

public void RMVTechRatelvlSkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillLevel=?";
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();

			while (results.next()){
				int TechRatelvlSkillID = (results.getInt(1));
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {	
			 		ps.setInt(1,TechRatelvlSkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}

public void RMVTechSMETrainEmplyTable(String listval)throws SQLException{
conn = dbConnection.ConnectDB();
          
        if (listval != null && !listval.isEmpty() && !listval.isBlank())
         {
	         try {String que="SELECT SkillID FROM SkillTable WHERE SkillFocus=?";
	         PreparedStatement pst=conn.prepareStatement(que);
	         pst.setString(1,listval);
	         ResultSet results = pst.executeQuery();
	
	 			while (results.next()){
	 				int TechSMETrainSkillID = (results.getInt(1));
	 				String query="DELETE FROM employeeSkills WHERE SkillID = ?";
	 				PreparedStatement pst1=conn.prepareStatement(query);
	 		         try {
	 		        	pst1.setInt(1,TechSMETrainSkillID);
	 		 	        pst1.execute();
	 		 			pst1.close();	  
	 		 			
	 				} catch (SQLException e){
	 					e.printStackTrace();} 
				}
				
			} catch (SQLException e) {
				e.printStackTrace();} 
	         JOptionPane.showMessageDialog(null, "Deleted from EmployeeSkills DB");		
        }else {
        	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
        }
		return;  
		}

public void RMVTechSMETrainSkillsTable(String listval)throws SQLException{
	conn = dbConnection.ConnectDB();
	//remove from employeeSkills
	
	if (listval != null && !listval.isEmpty() && !listval.isBlank())
    {
        try {String que="SELECT SkillID FROM SkillTable WHERE SkillFocus=?";
        PreparedStatement pst=conn.prepareStatement(que);
        pst.setString(1,listval);
        ResultSet results = pst.executeQuery();

			while (results.next()){
				int TechSMETrainSkillID = (results.getInt(1));
				String qry="DELETE FROM SkillTable WHERE SkillID = ?";
			 	PreparedStatement ps=conn.prepareStatement(qry);
			 		try {	
			 		ps.setInt(1,TechSMETrainSkillID);
			   		ps.execute();
			 		ps.close();
			 		
			 		}catch (Exception e2){
			 		e2.printStackTrace();}    
			}
			
		} catch (SQLException e) {
			e.printStackTrace();} 
    JOptionPane.showMessageDialog(null, "Deleted from Skill Table DB");  		
   }else {
   	JOptionPane.showMessageDialog(null, "Not Deleted from DB");
   }
	return;  
	}

}
