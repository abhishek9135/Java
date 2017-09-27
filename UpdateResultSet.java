import java.sql.*;
public class UpdateResultSet {
	public static void main(String args[]) throws Exception {
		String driver = "com.mysql.jdbc.Driver", url = "jdbc:mysql://localhost:3306/ABC?user=root&password=";
		Connection conn=null;
		Statement stmt;
		ResultSet rs=null;
		try {
			if (driver != null) {
				Class.forName(driver);
				System.out.println("Driver found");
			}
			conn = DriverManager.getConnection(url);
			System.out.println("Database connected");
			// Open a statement that supports scrollable result sets
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery("select empno, title, fname, lname from employees");
			while(rs.next()) {
				String name=rs.getString("fname");
				name.toUpperCase();
				rs.updateString("fname", name);
				name=rs.getString("lname");
				name.toUpperCase();
				rs.updateString("lname", name);
				rs.updateRow();
			}
			rs.close();
			stmt.close();
		}
		finally {
			if(conn!=null)
				conn.close();
		conn=null;
	}
	}
			
}
