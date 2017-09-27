import java.sql.*;
public class TestingDatabase {
	public static void main(String args[]) throws Exception {
		String driver = "com.mysql.jdbc.Driver", url = "jdbc:mysql://localhost:3306/ABC?user=root&password=";
		Connection conn=null;
		try {
			if (driver != null) {
				Class.forName(driver);
				System.out.println("Driver found");
			}
			conn = DriverManager.getConnection(url);
			System.out.println("Database connected");
			String sql = ""
				+ " SELECT D.deptname, E.fname, E.lname,"
				+ " E.title, E.hiredate"
				+ " FROM departments D, employees E"
				+ " WHERE D.deptmgr = E.empno"
				+ " ORDER BY D.deptname";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String dept = rs.getString(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String title = rs.getString(4);
				Date hireDate=rs.getDate(5);
				System.out.println(title + " " + fname + " " + lname + " is the manager of " + dept + " department from " + hireDate);
				
			}
			rs.close();
			rs = null;
			stmt.close();
			stmt = null;
		}
		catch (SQLException sq){
			sq.printStackTrace();
		}
		finally{
			if(conn!=null)
				conn.close();
			conn=null;
		}


	}
}
