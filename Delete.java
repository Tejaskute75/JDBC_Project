package Delete;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		
        PreparedStatement ps=c.prepareStatement("Delete from student where id=?");
		ps.setInt(1, 1);
		ps.executeUpdate();	
		
		ps.setInt(1, 2);
		ps.executeUpdate();	
		
		ps.setInt(1, 3);
		ps.executeUpdate();	
		
		System.out.println("Record Deleted..");
		
	}

}
