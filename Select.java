package Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Select {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch146", "root", "root");
		System.out.println("Connection Done");
		
		Statement s=c.createStatement();
		s.executeQuery("Select * from student");
		
		System.out.println("Data Displayed...");
		System.out.println();
	}
}
