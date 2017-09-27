import java.util.*;

public class ComparatorUsage {
    public static void main(String[] arg) {

        // Choice of comparator.
         Set strSet = new TreeSet();                              // (1a)
    	//Set strSet = new TreeSet(String.CASE_INSENSITIVE_ORDER); // (1b)
        //Set strSet = new TreeSet(new RhymingStringComparator()); // (1c)
        String args[]={"art","chart","start","Cart","Sort","Short"};
        // Add each command line argument to the set.
        for (int i=0; i < args.length; i++) {                    // (2)
            strSet.add(args[i]);
        }
        System.out.println(strSet);                              // (3)
    }
}

class RhymingStringComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {               // (4)

        // (5) Create reversed versions of the strings.
        String reverseStr1 = new StringBuffer((String) obj1).reverse().toString();
        String reverseStr2 = new StringBuffer((String) obj2).reverse().toString();

        // Compare the reversed strings lexicographically.
        return reverseStr1.compareTo(reverseStr2);               // (6)
    }
}
