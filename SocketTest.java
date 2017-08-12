// Example of TCP Client 
import java.net.*;
import java.io.*;

public class SocketTest{
	public static void main(String[] args)  {
		try{
			Socket soc = new Socket(InetAddress.getLocalHost(),7);
			System.out.println("Local Address :"+soc.getLocalAddress());
			System.out.println("Local Host :"+InetAddress.getLocalHost());
			System.out.println("Local Port :"+soc.getLocalPort());
			System.out.println("Inet Address :"+soc.getInetAddress());
			InputStream in = soc.getInputStream();
			System.out.println("Stream Created ");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String str = null;
			while((str = br.readLine())!= null)
				System.out.println(str);

			in.close();
			soc.close();

		}catch(Exception e){
			System.out.println(e);
		}
	}
}