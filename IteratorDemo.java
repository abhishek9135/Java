 import java.util.*; 
 class IteratorDemo { 
 public static void main(String args[]) { 
 // create an array list 
 ArrayList<String> al = new ArrayList<String>(); 
 // add elements to the array list 
 al.add("C"); 
 al.add("A"); 
 al.add("E"); 
 al.add("B"); 
 al.add("D"); 
 al.add("F"); 
 // use iterator to display contents of al 
 System.out.print("Original contents of al: "); 
 Iterator<String> itr = al.iterator(); 
 while(itr.hasNext()) {

     Object element = itr.next(); 
     System.out.print(element + " ");

 } 
 System.out.println(); 
 // modify objects being iterated 
 ListIterator<String> litr = al.listIterator(); 
 while(litr.hasNext()) {

     String element = litr.next(); 
     if(element.equals("A"))
    	 litr.set("G");
     //else
    	 litr.set(element + "+");   //shows that an element can be modified twice for one call to next
     

 } 
 System.out.print("Modified contents of al: "); 
 itr = al.iterator();
 while(itr.hasNext()) {

     Object element = itr.next(); 
     System.out.print(element + " ");

 } 
 System.out.println(); 
 // now, display the list backwards 
 System.out.print("Modified list backwards: "); 
 while(litr.hasPrevious()) {

     Object element = litr.previous(); 
     System.out.print(element + " ");

 } 
 System.out.println(); 
 } 
 }