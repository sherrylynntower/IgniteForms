package Profile;

import java.sql.*;

public class dbConnection {
	
	Connection conn = null;
	
	public static Connection ConnectDB() {
		//String jdbcUrl = "jdbc:sqlite://9.42.208.242\\instanceOfMsSQL;databaseName=igniteCensus";
		//String server = "9.42.208.242";
		//String port =":3306/";
	   // String usern ="/exttest2";
	   // String pass ="strext14";
	    //IP Address: 9.42.208.242
	    //User id: /exttest2
	    //Pass: strext14

		
		try {
			
			Class.forName("org.sqlite.JDBC");
			
			
			//SQLITE CONNECTION//
			//Connection conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite/db/igniteCensus.db");
			
			//SERVER CONNECTION FOR MYSQL//
			Connection conn = DriverManager.getConnection("jdbc:mysql://9.42.208.242:3307/ignitecensus","root", "Winter2024");  
			
			//MySQL CONNECTION LOCALHOST//
			//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ignitecensus","root", "Winter@2024");
		
			return conn;
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connection Failed"+e);
			return null;
		}

	}
}
