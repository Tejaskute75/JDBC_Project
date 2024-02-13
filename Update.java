package Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Update {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		
        PreparedStatement ps=c.prepareStatement("Update student set name=? where id=?");
		
		ps.setString(1,"Ishwar" );
		ps.setInt(2,3);
		ps.executeUpdate();	
		
//		ps.setInt(2, 7);
//		ps.setString(1, "Avyyya");
//		ps.executeUpdate();	
//		
//		ps.setInt(2, 8);
//		ps.setString(1, "Ishwar");
//		ps.executeUpdate();	
		
		System.out.println("Data Updated...");
	

	}
}
