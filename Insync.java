// Example of Synchronizing a block of code 
import java.lang.*;
import java.io.*;
import java.util.*;
class Insync extends Thread {
	StringBuffer letter;
	public Insync (StringBuffer letter) {
		this.letter = letter;
		//System.out.println("Letter is :- "+letter);
	}
	public void run(){
		synchronized(letter) {
			for(int i=1; i<=26; i++){
				System.out.print(letter);
				System.out.print("\t");
			// Incrementing The letter in StringBuffer
				char temp = letter.charAt(0);
					++temp;
				letter.setCharAt(0,temp);
			}
		}
	}
	public static void main(String args[]) {
		final StringBuffer str = new StringBuffer("A");

			//System.out.println("str is :- "+str);
		new Insync(str).start();
			//System.out.println("str is :- "+str);
		new Insync(str).start();
			//System.out.println("str is :- "+str);
		new Insync(str).start();
			//System.out.println("str is :- "+str);
	}

}	
/*class Insync {
	public static void main(String args[]) {
		final StringBuffer str = new StringBuffer("A");

			System.out.println("str is :- "+str);
		InsyncTest t1 = new InsyncTest();
			
		InsyncTest t2 = new InsyncTest(str);
			
		InsyncTest t3 = new InsyncTest(str);
			
			try {
				t1.start();
				System.out.println("str is :- "+str);
				t2.start();
				System.out.println("str is :- "+str);
				t3.start();
				System.out.println("str is :- "+str);
			}
			catch(InterruptedException e) {}
	}
}*/