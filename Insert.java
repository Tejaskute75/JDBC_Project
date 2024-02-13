package Insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Insert  {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college?DatabaseIfNotExist=true", "root", "root");
		
        PreparedStatement ps=c.prepareStatement("insert into student values(?,?)");
		ps.setInt(1, 8);
		ps.setString(2, "Tejas");
		ps.executeUpdate();	
		
		ps.setInt(1, 9);
		ps.setString(2, "Virat");
		ps.executeUpdate();	
		
		ps.setInt(1, 10);
		ps.setString(2, "Sanket");
		ps.executeUpdate();	
		
		System.out.println("Data Inserted");
	}
}
