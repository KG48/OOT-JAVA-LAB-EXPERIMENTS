import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");

        Iterator<String> itr = cities.iterator();

       // System.out.println("Cities:");
        while (itr.hasNext()) {
            String city = itr.next();
            System.out.println(city);

            // Remove element conditionally
            if (city.equals("Mumbai")) {
                itr.remove();
            }
        }

        System.out.println("After removal: " + cities);
    }
}
//3. Iterators

//An Iterator is used to traverse (loop through) collections like ArrayList, HashSet, etc.

//✅ Key Features

//Can iterate through elements one by one

//Allows element removal safely during iteration

//Found in the java.util package
