import java.io.*;
import java.util.*;

public class FileHandling {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("Student.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		String[] subject = new String[] { "Math","Science","Social Science","English","Hindi","Sanskrit"};
		int[] marks = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Student Name :");
		dos.writeUTF(sc.nextLine());
		System.out.print("Enter Student Roll :");
		dos.writeInt(sc.nextInt());
		for(int i = 0; i<6;i++){
			System.out.print("Enter Marks of "+subject[i]+" : ");
			marks[i] = sc.nextInt();
			dos.writeInt(marks[i]);
		}	
		sc.close();	
		dos.close();
		fos.close();	
	
	}
}
