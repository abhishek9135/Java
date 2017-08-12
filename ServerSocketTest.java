// Example of TCP Server
import java.net.*;
import java.io.*;
import java.util.*;

class ServerSocketTest {
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(7);
			while(true){
				Socket client = ss.accept();
				System.out.println("Socket Created ");
				System.out.println("Client Inet Address :"+client.getInetAddress());
				System.out.println("Client Port :"+client.getPort());
				OutputStream out = client.getOutputStream();
				PrintWriter pw = new PrintWriter(out,true);
				System.out.println("Stream Created....");
				String msg = "hello, How are You?";
				Calendar c = Calendar.getInstance();
				pw.println(msg);
				pw.println("The Server Date And Time is :"+c.getTime());
				System.out.println("Contents written to "+client.getInetAddress().getHostName());
				pw.close();
			}
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}