package nengboonchai.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
      }
    // Print the first item
    //System.out.println(it.next());
    }
}
