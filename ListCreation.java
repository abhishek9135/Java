import java.util.*;
public class ListCreation {
		public static void main(String args[]) {
			List<String> slist = new ArrayList<String>(); 
			slist.add("g"); 
			slist.add("a"); 
			slist.add("d"); 
			slist.add("a");
			slist.add("f");
			slist.add("e");
			slist.add("c");
			slist.add("b");
			   
			for(String s : slist){  
			 System.out.print(s + "\t");  
			}
			System.out.println();  
			Set<String> s2set = new TreeSet<String>(slist);  
			for(String s : s2set){  
			 System.out.print(s + "\t");  
			}
		}
}
