// Demonstrate Sockets.
import java.net.*;
import java.io.*;

class Whois {
	public static void main(String[] args) throws Exception {
		int c;
		// Create a Socket connected to internic.net port 43.
		Socket s = new Socket("whois.internic.net",43);

		//Obtain Input and OutPut streams.
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();

		// Construct a request string

		String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
		// Convert to Bytes.
		byte buf[] = str.getBytes();

		// Send request.
		out.write(buf);

		//Read and display response.
		while((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		s.close();
	}
}