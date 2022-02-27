import java.io.*;
import java.util.*;

public class Hashing {


    // Create a Hash Map
    public static void main(String[] args) {
        
        
       // Create Hash Map
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("4", "five"); // OVERWRITE
        map.put("5", "four");

        //Print Hash Map
        System.out.println("Hash Map: " + map);

        // Print Size of Hash Map
        System.out.println("Size of Hash Map: " + map.size());

        // Check if Hash Map is Empty
        System.out.println("Is Hash Map Empty? " + map.isEmpty()); // false

        // Check if Hash Map contains a Key
        System.out.println("Contains Key 1? " + map.containsKey("1")); // true

        // Check if Hash Map contains a Value
        System.out.println("Contains Value four? " + map.containsValue("four")); // true
         
        // Get Value from Hash Map
        System.out.println("Value for Key 1: " + map.get("1")); // one

        // Remove Key from Hash Map
        map.remove("1");
        
        //Print Hash Map
        System.out.println("Hash Map: " + map);



        /*

        // Create Hash Set
        HashSet<String> set = new HashSet<String>();
        set.add("one"); // Insert- O(1)
        set.add("two");  //- OP, NO OVERWRITE
        set.add("three");
        set.add("two"); // Same HashCode as that of "two" - Not Inserted

        // Print Hash Set
        System.out.println("Hash Set: " + set); // [one two three]

        // Print Size of Hash Set
        System.out.println("Size of Hash Set: " + set.size()); //[3]

        // Remove values from Hash Set
        set.remove("three");

        // Print Hash Set
        System.out.println("Hash Set: " + set); // [one two ]

        // Check if Hash Set contains a value
        System.out.println("Contains: " + set.contains("two")); // Search- O(1)
        
        */




    }

}
