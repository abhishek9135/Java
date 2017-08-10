// demonstration of InetAddress Class Java.net package
import java.net.*;

class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);

		//address = InetAddress.getByName("www.google.com");
		//System.out.println(address);

		address = InetAddress.getByName("www.youtube.com");
		System.out.println(address);
		System.out.println(" Using toString() Method  ");
		System.out.println(address.toString());
		System.out.println(" Using getAddress() return Ip in byte array");
		System.out.println(address.getAddress());
		System.out.println(" Using getHostAddress()  to get host Address ");
		System.out.println(address.getHostAddress());

		System.out.println(" Using getHostName() to get Host name ");
		System.out.println(address.getHostName());
		InetAddress sw[] = InetAddress.getAllByName("www.google.com");
		for(int i = 0; i < sw.length; i++)
			System.out.println(sw[i]);

		InetAddress w[] = InetAddress.getAllByName("www.youtube.com");
		for(int i = 0; i < w.length; i++)
			System.out.println(w[i]);
	}
}