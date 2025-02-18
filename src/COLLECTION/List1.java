package COLLECTION;
// If we want to represent a group of objects as a single entity where duplicate objects are allowed
// and insertion order is preserved then we shoud go for List.
// 1. Insertion order is preserved
// 2. Duplicate objects are allowed
// The main implementation classes of List interface are:
// 1. ArrayList 2. LinkedList 3. Vector 4. Stack

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class List1 {
    public static void main(String[] args)
    {
       ArrayList<String> l = new ArrayList<String>();
       l.add("Sunny");
       l.add("Bunny");
       l.add("Chinny");
       l.add("Sunny");
       System.out.println(l); 
      // Default Natural Sorting Order
        Collections.sort(l);
        System.out.println("Sorted List (Natural Order): " + l);
        
        // Customized Sorting Order (Reverse Order)
        Collections.sort(l, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Reverse order
            }
        });
        System.out.println("Sorted List (Custom Order - Reverse): " + l);
    }
}
// List(may be ArrayList,LinkedList,Vector or Stack) never talks about sorting order. If we want
// sorting for the list then we should use Collections class sort() method.
