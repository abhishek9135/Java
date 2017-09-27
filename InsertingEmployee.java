import java.sql.*;
public class InsertingEmployee {
	public static void main(String args[]) throws Exception {
		String driver = "com.mysql.jdbc.Driver", url = "jdbc:mysql://localhost:3306/ABC?user=root&password=";
		Connection conn=null;
		PreparedStatement pstmt;
		ResultSet rs=null;
		try {
			if (driver != null) {
				Class.forName(driver);
				System.out.println("Driver found");
			}
			conn = DriverManager.getConnection(url);
			System.out.println("Database connected");
			/***showing use of PreparedStatement for database manipulation***/
			pstmt=conn.prepareStatement("insert into employees (deptno, empno, lname, fname, title) values (?,?,?,?,?)");
			pstmt.setString(1,"a3");
			pstmt.setString(2,"ab04");
			pstmt.setString(3,"Ghosh");
			pstmt.setString(4,"Dip");
			pstmt.setString(5,"Mr.");
			pstmt.execute();
			pstmt.close();
			pstmt=conn.prepareStatement("select title, fname, lname from employees where lname like ?");
			pstmt.setString(1,"Ghosh");
			rs=pstmt.executeQuery();
			while (rs.next()) {
				String title = rs.getString(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				System.out.println(title + " " + fname + " " + lname);
			}
			rs.close();
			pstmt.close();
			
		}
		finally {
			if(conn!=null)
				conn.close();
		conn=null;
	}
	}
}
