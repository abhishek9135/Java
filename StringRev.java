import java.lang.*;
import java.util.*;

public class StringRev {
	public static void main(String[] args){
		int n;
		System.out.print("Enter Number to reverse ");
		Scanner br = new Scanner(System.in);
		n = br.nextInt();
		System.out.println("\n Number Before reverse : "+n);
		String reverse = Integer.toString(n);
		reverse = new StringBuffer(reverse).reverse().toString();
		System.out.println("\n Number After reverse :  "+reverse);
	}
}