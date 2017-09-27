import java.util.*;

public class IteratorUsage {
    public static void main(String[] args) {

        // (1) Create a list of Integers.
        Collection intList = new ArrayList();
        int[] values = { 9, 11, -4, 1, 13, 99, 1, 0 };
        for (int i = 0; i < values.length; i++)
             intList.add(new Integer(values[i]));

        System.out.println("Before: " + intList);         // (2)

        Iterator interator = intList.iterator();          // (3) Get an iterator.
        while (interator.hasNext()) {                     // (4) Loop
            Integer element = (Integer) interator.next(); // (5) The next element
            int value = element.intValue();
            if (value < 1 || value > 10) // (6) Remove the element if
                interator.remove();      //     its value is not between 1 and 10.
        }

        System.out.println("After:  " + intList);    // (7)
    }
}
