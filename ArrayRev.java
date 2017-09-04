import java.lang.*;
import java.util.*;

class ArrayRev {
	public static void main(String[] args) {
		int  i,n;
		Scanner br = new Scanner(System.in);
		System.out.println("Enter Length of Array ");
		n = br.nextInt();
		int array[] = new int[n];
		for( i =0; i < n; i++){
			System.out.print(" Enter Value Array["+(i+1)+"] : ");
			array[i] = br.nextInt();
		}
		System.out.println("Array Before Reverse :");
		for(i = 0; i < n; i++){
			System.out.print(" "+array[i]);
		}
		for(i = 0; i < array.length/2; i++){
			int tmp = array[i];
			array[i] = array[array.length -1 -i];
			array[array.length-1-i] =  tmp;
		}
		System.out.println("\nArray After Reverse :");
		for(i = 0; i < n; i++){
			System.out.print(" "+array[i]);
		}
	}
}