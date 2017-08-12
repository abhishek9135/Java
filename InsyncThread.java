// Example of Synchronizing a block of code 
import java.lang.*;
import java.io.*;
import java.util.*;
class InsyncThread extends Thread {
	StringBuffer letter;
	public InsyncThread (StringBuffer letter) {
		this.letter = letter;
		System.out.println("Letter is :- "+letter);
	}
	public void run() {
		synchronized(letter) {
			for(int i=1; i<26; i++){
				System.out.print(letter);
			}
				System.out.print("\t");
			// Incrementing The letter in StringBuffer
				char temp = letter.charAt(0);
					++temp;
				letter.setCharAt(0,temp);
		}
	}
	public static void main(String args[]) {
		final StringBuffer str = new StringBuffer("A");
		new Insync(str).start();			
		new Insync(str).start();			
		new Insync(str).start();			
	}
}