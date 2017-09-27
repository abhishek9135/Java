import java.sql.*;
public class ScrollableResults {
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
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=stmt.executeQuery(" SELECT D.deptname, E.fname, E.lname," + " E.title, E.hiredate" + " FROM departments D, employees E"
				+ " WHERE D.deptmgr = E.empno"
				+ " ORDER BY D.deptname");
			//rs.last();
			int nRows = rs.getRow();
			System.out.println(nRows + "retrieved.");
			rs.relative(4);
			while(rs.previous()) {
				String dept = rs.getString(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String title = rs.getString(4);
				Date hireDate=rs.getDate(5);
				System.out.println(title + " " + fname + " " + lname + " is the manager of " + dept + " department from " + hireDate);
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
