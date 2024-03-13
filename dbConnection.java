package Profile;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

@SuppressWarnings("unused")
public class dbConnection {
	
	Connection conn = null;
	
	public static Connection ConnectDB() {

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
			JOptionPane.showMessageDialog(null, "Communications link failure Application closing");
			System.exit(0);
			return null;
		}

	}

}
