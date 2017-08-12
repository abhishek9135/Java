import java.io.*;
import java.util.*;

public class StudentWrite {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("Student.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		String[] subject = new String[] { "Math","Science","Social Science","English","Hindi","Sanskrit"};
		int[] marks = new int[6];
		int tmo = 0;
		double per;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Student Name :");
		dos.writeUTF(sc.nextLine());
		System.out.print("Enter Student Roll :");
		dos.writeInt(sc.nextInt());
		for(int i = 0; i<6;i++){
			System.out.print("Enter Marks of "+subject[i]+" : ");
			marks[i] = sc.nextInt();
			dos.writeInt(marks[i]);
			tmo += marks[i];
		}	
		dos.writeInt(tmo);
		per =  tmo/6.0;
		dos.writeDouble(per);
		sc.close();	
		dos.close();
		fos.close();	
	}
}
