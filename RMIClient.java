// RMIClient 
import java.rmi.*;
import java.rmi.registry.*;

public class RMIClient {
	public static void main(String[] args) {
		try{
			MethodImpl mthdpl = (MethodImpl) Naming.lookup("rmi://127.0.0.1/sqrt");
			double dbl = mthdpl.getSqrt(100);
			System.out.println("SQRT: "+dbl);
			MethodImpl mthdpl1 = (MethodImpl) Naming.lookup("rmi://127.0.0.1/sum");
			double db2 = mthdpl1.getsum(100.15,562.88);
			System.out.println("SUM: "+db2);
		}catch(Exception e){
			System.out.println("Error ---"+e.toString());
			e.printStackTrace();
		}
	}
}