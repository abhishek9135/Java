import java.io.*;
import java.util.*;

public class StudentRead {
	public static void main(String args[]) throws IOException {
		FileInputStream fis = new FileInputStream("Student.txt");
		DataInputStream dis = new DataInputStream(fis);
		String[] subject = new String[] { "Math","Science","Social Science","English","Hindi","Sanskrit"};
		System.out.println("Student Name : "+dis.readUTF());
		System.out.println("Student Roll NO : "+dis.readInt());
		for(int i = 0; i<6;i++){
			System.out.println("Marks of "+subject[i]+" : "+dis.readInt());
		}	
		System.out.println("Total marks : "+dis.readInt());
		System.out.println(" Percentage : "+dis.readDouble());
		dis.close();
		fis.close();	
	}
}
