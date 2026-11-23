import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        // Access value by key
        System.out.println("Student 102: " + students.get(102));

        // Remove entry
        students.remove(101);

        // Iterate through entries
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
//2. HashMap

//A HashMap stores key-value pairs.
//It is part of the java.util package.

//✅ Key Features

//No duplicate keys

//Null key and null values allowed

//Unordered (doesn’t maintain insertion order)

//Fast lookup using hashing