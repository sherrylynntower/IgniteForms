package Profile;

import java.sql.*;

public class dbConnection {
	
	Connection conn = null;
	
	public static Connection ConnectDB() {
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite/db/igniteCensus.db");
			
			//System.out.println("Connection Succeeded");
			return conn;
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connection Failed"+e);
			return null;
		}

	}
}
