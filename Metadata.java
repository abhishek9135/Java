import java.sql.*;
import java.util.*;
import javax.sql.*;
import java.lang.reflect.*;
public class Metadata {
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
			DatabaseMetaData md = conn.getMetaData();
			// Use reflection to get a list of methods that the
			// metadata class supports. Select only public methods
			// that take no parameters and that return either
			// a string or a boolean.
			Class mdclass = md.getClass();
			Method[] methods = mdclass.getDeclaredMethods();
			Map methodMap = new TreeMap();
			for (int i = 0; i < methods.length; i++) {
				Method method = methods[i];
				// Public methods only
				if (!Modifier.isPublic(method.getModifiers()))
					continue;
				// with no parameters
				if (method.getParameterTypes().length > 0)
					continue;
				// that return String or boolean
				Class returnType = method.getReturnType();
				if ((returnType != java.lang.Boolean.TYPE) &&
						(returnType != java.lang.String.class))
					continue;
				// Add selected methods to sorted map
				methodMap.put(method.getName(), method);
			}
			System.out.println(md.getDatabaseProductName()+ " " + md.getDatabaseProductVersion());
			int row = 0;
			Iterator im = methodMap.keySet().iterator();
			while (im.hasNext()) {
				String methodName = (String) im.next();
				Object methodValue = null;
				Method method = (Method) methodMap.get(methodName);
				// Invoke the method and get the result
				try {
					Object[] noParameters = new Object[0];
					methodValue = method.invoke(md, noParameters);
				}
				catch (Exception ignore) {}
				// Display the results
				row++;
				String rowClass = "row" + (row % 2);
				System.out.println(" " + rowClass + "\n " + methodName );
		}
		}
		finally {
			if(conn!=null)
				conn.close();
		conn=null;
	}
	}
	
	
}
