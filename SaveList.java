package Profile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

	
@SuppressWarnings("unused")
public class SaveList {
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
	
	public void SAVElistMYBARoles(String BARolesstr, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaroll = new LookupSkill();
		BARollsid = (int) mybaroll.lookuplistMYBARoles(BARolesstr);
			
		if (BARollsid != 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,BARollsid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {
	
			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
		
	}
	
	public void SAVElistMYBAIndustry (String BAIndDomstr1, String username){
		conn = dbConnection.ConnectDB();
			
		LookupSkill mybaind = new LookupSkill();
		BAIndustryid = (int) mybaind.lookuplistMYBAIndustry(BAIndDomstr1);
		
		if (BAIndustryid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,BAIndustryid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVElistMYBAToolSoft (String BAToolSoftstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaTool = new LookupSkill();
		BAToolid = (int) mybaTool.lookuplistMYBAToolSoft(BAToolSoftstr1);
		
		if (BAToolid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,BAToolid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVElistMYBACert (String MYBACertliststr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaCert = new LookupSkill();
		BACertid = (int) mybaCert.lookuplistMYBACert(MYBACertliststr1);
		
		if (BACertid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,BACertid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVElistMYBASkillBadge (String MYBASkillBadgestr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mybaSkillBadge = new LookupSkill();
		BASkillBadgeid = (int) mybaSkillBadge.lookuplistMYBASkillBadge(MYBASkillBadgestr1);
		
		if (BASkillBadgeid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,BASkillBadgeid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVElistMYTechIndDom (String TechIndDomstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechIndDom = new LookupSkill();
		TechIndDomid =  (int) mytechIndDom.lookuplistMYTechIndDom(TechIndDomstr1);
		
		if (TechIndDomid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,TechIndDomid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVElistMYTechBadgeCert (String TechBadgeCertstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechBadgeCert = new LookupSkill();
		TechBadCertid = (int) mytechBadgeCert.lookuplistMYTechBadgeCert(TechBadgeCertstr1);
		
		if (TechBadCertid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,TechBadCertid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVElistMYTechOthExp (String TechOthExpstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill mytechOthExp = new LookupSkill();
		TechOthExpid = (int) mytechOthExp.lookuplistMYTechOthExp(TechOthExpstr1);
		
		if (TechOthExpid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,TechOthExpid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVElistMYTechMgmtTool (String TechTestManToolstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechMgmtTool = new LookupSkill();
		TechMgmtToolid = (int) mytechMgmtTool.lookuplistMYTechTestManTool(TechTestManToolstr1);
		
		if (TechMgmtToolid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,TechMgmtToolid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistMYTechCodeConTool (String TechCodeVConstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechCodeConTool = new LookupSkill();
		TechConToolid = (int) mytechCodeConTool.lookuplistMYTechCodeConTool(TechCodeVConstr1);
		
		if (TechConToolid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,TechConToolid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistTechDevOps (String TechDevOpsToolstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mytechDevOps = new LookupSkill();
		TechDevOpsid = (int) mytechDevOps.lookuplistMYTechDevOps(TechDevOpsToolstr1);
		
		if (TechDevOpsid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,TechDevOpsid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVEmylistFUNIndDom (String FunIndDomstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill myfunIndDom = new LookupSkill();
		FunIndDomid = (int) myfunIndDom.lookuplistMYFunIndDom(FunIndDomstr1);
		
		if (FunIndDomid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,FunIndDomid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistFunCert (String FunCertstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill myfunCert = new LookupSkill();
		FunCertid = (int) myfunCert.lookuplistMYFunCert(FunCertstr1);
		
		if (FunCertid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,FunCertid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistFunTestExp (String FunTestExpstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill myfunTestExp = new LookupSkill();
		FunTestExpid = (int) myfunTestExp.lookuplistMYFunTestExp(FunTestExpstr1);
		
		if (FunTestExpid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,FunTestExpid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistFunBadge (String FunBadgestr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill myfunBadge = new LookupSkill();
		FunBadgeid = (int) myfunBadge.lookuplistMYFunBadge(FunBadgestr1);
		
		if (FunBadgeid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,FunBadgeid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistFunTestManDefect (String FunDefectstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill myfunTestManDef = new LookupSkill();
		FunTestManDefid = (int) myfunTestManDef.lookuplistMYFunTestManDef(FunDefectstr1);
		
		if (FunTestManDefid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,FunTestManDefid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVEmylistManLeadership(String LeadTeamstr1, String username){
		conn = dbConnection.ConnectDB();		
			
		LookupSkill mymanLeaderTeam = new LookupSkill();
		ManLeadTeamsid = (int) mymanLeaderTeam.lookupManLeaderTeam(LeadTeamstr1);
			
			if (ManLeadTeamsid != 0 ){	
			String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
			try {	
				PreparedStatement pst = conn.prepareStatement(query);

					pst.setInt(1,ManLeadTeamsid);
					pst.setString(2,username);
					pst.executeUpdate();
			    
			} catch (Exception ex) {
		
				JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
				ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}
		}

	public void SAVEmylistManTraining(String MANTrainingstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mymanTraining = new LookupSkill();
		MANTrainid = (int) mymanTraining.lookuplistManTraining(MANTrainingstr1);
		
		if (MANTrainid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANTrainid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVEmylistManLeaderSoftPrj (String MANLeaderSoftstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mymanLeaderSoftPrj = new LookupSkill();
		MANLeaderSoftid = (int) mymanLeaderSoftPrj.lookuplistManLeaderSoftPrj(MANLeaderSoftstr1);
		
		if (MANLeaderSoftid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANLeaderSoftid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistManSDLC (String MANSDLCstr1, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill mymanSDLC = new LookupSkill();
		MANSDLCid = (int) mymanSDLC.lookuplistManSDLC(MANSDLCstr1);
		
		if (MANSDLCid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANSDLCid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistManIndustry (String MANIndustrystr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mymanIndustry = new LookupSkill();
		MANIndustryid = (int) mymanIndustry.lookuplistManIndustry(MANIndustrystr1);
		
		if (MANIndustryid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANIndustryid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmylistManBadgeCert (String MANBadgeCertstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mymanBadgeCert = new LookupSkill();
		MANBadgeCertid = (int) mymanBadgeCert.lookuplistManBadgeCert(MANBadgeCertstr1);
		
		if (MANBadgeCertid!= 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MANBadgeCertid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmyIgniteSkillProfList(String profliststr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mySkillProfList = new LookupSkill();
		skilllvlskid = (int) mySkillProfList.lookupSkillIdSkilllvl(profliststr1);
		
		if (skilllvlskid != 0 ){	
		String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,skilllvlskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}

	public void SAVEmySDLCModExpList(String SDLCModExpltstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mySkillIdSDLC = new LookupSkill();
		SDLCskid = (int) mySkillIdSDLC.lookupSkillIdSDLC(SDLCModExpltstr1);
		
		if (SDLCskid != 0 ) {
			String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,SDLCskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();
		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}
	}	

	public void SAVEMYMandatoryBadges(String manbadstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill myMandatoryBadge = new LookupSkill();
		MandCertskid = (int) myMandatoryBadge.lookupSkillIdMandatoryCert(manbadstr1);

		if (MandCertskid != 0 ) {
			String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,MandCertskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}			
	}	

	public void SAVEmyIgniteSkillCertBadge(String certbadstr1, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mySkillIdCertBadge = new LookupSkill();
		CertBadgskid = (int) mySkillIdCertBadge.lookupSkillIdCertBadge(certbadstr1);
		
		if (CertBadgskid!= 0 ){
			String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,CertBadgskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}		
	}	

	public void SAVEindustrySelectTable(String str1, String str2, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mySkillIdIndustryBadge = new LookupSkill();
		IndustBadskid = (int) mySkillIdIndustryBadge.lookupSkillIdIndustryBadge(str1, str2);
		
		if (IndustBadskid!= 0 ){
			String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,IndustBadskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}				
	}	

	public void SAVEgivebackSelectTable(String givebstr1, String givebstr2, String username){
		conn = dbConnection.ConnectDB();	
		
		LookupSkill mySkillIdPratGiveback = new LookupSkill();
		PratGiveBkskid = (int) mySkillIdPratGiveback.lookupSkillIdPraticeGiveback(givebstr1, givebstr2);
		
		if (PratGiveBkskid!= 0 ){
			String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,PratGiveBkskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

			}
			}else {
				JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
			}		
		}
	public void SAVEtableMyTechToolExp(String str1, String str2, String str3, String username){
		conn = dbConnection.ConnectDB();
		//System.out.println("This is the info"+str1+str2+str3+username);
		LookupSkill mySkillTechExp = new LookupSkill();
		TechSkillExpskid = (int) mySkillTechExp.lookupTechToolExp(str1, str2, str3);
		
		if (TechSkillExpskid!= 0 ){
			String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,TechSkillExpskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}				
	}	

	
	public void SAVEtableManagementExp(String str1, String str2, String username){
		conn = dbConnection.ConnectDB();
		
		LookupSkill mySkillManExp = new LookupSkill();
		ManSkillExpskid = (int) mySkillManExp.lookupmagementSkill(str1, str2);
		
		if (ManSkillExpskid!= 0 ){
			String query = "INSERT INTO employeeSkills (SkillID,username) VALUES (?,?)";
		try {	
			PreparedStatement pst = conn.prepareStatement(query);

				pst.setInt(1,ManSkillExpskid);
				pst.setString(2,username);
				pst.executeUpdate();
		    
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, " exception error Data not Saved to DB");
			ex.printStackTrace();

		}
		}else {
			JOptionPane.showMessageDialog(null, " null was returned Please contact Admin");
		}				
	}	

	
}
