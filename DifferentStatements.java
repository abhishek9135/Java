import java.sql.*;
public class DifferentStatements {
	public static void main(String args[]) throws Exception {
		String driver = "com.mysql.jdbc.Driver", url = "jdbc:mysql://localhost:3306/ABC?user=root&password=";
		Connection conn=null;
		Statement stmt;
		try {
			if (driver != null) {
				Class.forName(driver);
				System.out.println("Driver found");
			}
			conn = DriverManager.getConnection(url);
			System.out.println("Database connected");
			/***showing use of Statement for database manipulation***/
			stmt=conn.createStatement();
			String value="'a3'";
			int nRows=stmt.executeUpdate("insert into departments values('a3','Computer Science','ab04')");
			System.out.println(nRows + "row is inserted.");
			if(nRows>0){
				ResultSet rs=null;
				boolean status=stmt.execute("select deptno,deptname from departments");
				if(status)
					rs=stmt.getResultSet();
				while(rs.next()){
					String deptno = rs.getString(1);
					String dept = rs.getString(2);
					System.out.println("Id of " + dept + " department is " + deptno);
				}
			}
			nRows=stmt.executeUpdate("delete from departments where deptno like " + value);
			System.out.println(nRows + "row is deleted.");
			
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

