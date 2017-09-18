import java.lang.*;
import java.util.*;
import java.io.*;

public class ShiftDemo{
	public static void main(String args[]){
		byte b = 11;
		// Shift to the Left
		System.out.println(b << 1); 
		//Signed Shift to the Right
		System.out.println(b >> 1);
		//Unsigned Shift to the right
		byte c = -10;
		//Shift to the left three
		System.out.println(c << 3);
		//Sign shift to the right
		System.out.println(c >> 1);
		System.out.println(c >>> 1);
		System.out.println(b >>> 2);
	}
}