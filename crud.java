package forsql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class crud {

	public static void main(String[]args) throws Exception {
		
		String sql = "select name from crudo where emp = 2 ";
		String url = "jdbc:postgresql://localhost:5432/CRUD";
		String username="postgres";
		String password="0000";
		
		Connection con =DriverManager.getConnection(url, username, password);
		System.out.println("Connection successful!");
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(sql);
		rs.next();
		String name= rs.getString("name");
		System.out.println(name);
		 
		con.close();
			
		
		
	}
	
}
