import java.util.*;
class X{
	int key;
}
class Y{
	int data;
}
class HashMapTest {
	public static void main(String[] args) {
		HashMap<X,Y> hashmap = new HashMap<X,Y>();
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter No Values to Store in Map : ");
		int len = scan.nextInt();
		X keyArr[] = new X[len];
		for(int i = 0; i < len; i++){
			X xkey = new X();
			System.out.println(" Enter Value Of Key "+(i+1)+" : ");
			xkey.key = scan.nextInt();
			keyArr[i] = xkey;
			Y ydata = new Y();
			System.out.println(" Enter Value of Given key : ");
			ydata.data = scan.nextInt();
			hashmap.put(xkey,ydata);
		}
		for(int i = 0; i < len; i++){
			Y oy = hashmap.get(keyArr[i]);
			System.out.println(oy.data);
		}
	}
}