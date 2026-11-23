import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // Remove element
        fruits.remove("Banana");

        // Iterate using for-each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
//1. ArrayList

//An ArrayList is a dynamic array — it can grow or shrink automatically.
//It is part of the java.util package.

//✅ Key Features

//Maintains insertion order

//Allows duplicate elements

//Provides random access (like arrays)

//Automatically resizes