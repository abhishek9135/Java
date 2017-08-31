// Example of RMI 
// This example continue a serverapplication that implements the MethoImpl interface and binds the remote method with registry
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

interface MethodImpl extends Remote {
	double getSqrt(double x) throws RemoteException;
	double getsum(double x, double y) throws RemoteException;
}

public class RMIServer extends UnicastRemoteObject implements MethodImpl{
	public RMIServer() throws RemoteException{
		System.out.println("The Server is Initiated");
	}
	public double getSqrt(double x){
		return Math.sqrt(x);
	}
	public double getsum(double x, double y){
		return (x+y);
	}
	public static void main(String args[]){
		try{
			// initiates the RMIServer Object 
			RMIServer server = new RMIServer();
			Naming.rebind("sqrt",server); 
			Naming.rebind("sum",server);
		}catch(Exception e){
			System.out.println("ErR0r ---"+e.toString());
		}
	}
}