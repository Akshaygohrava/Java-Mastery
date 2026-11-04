import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        
        System.out.println("Maps In Collection");

        // Maps are used to store key-value pairs
        // HashMap - LinkedHashMap - TreeMap 


        // HashMap - fastest for lookups when order doesn't matter.

        HashMap<String, String> Records = new HashMap<>();

        Records.put("Name", "Akshay");
        Records.put("Age", "25");
        Records.put("Address", "Mumbai");     // Add
        Records.put("Designation", "Developer");

        System.out.println(Records);

        System.out.println(Records.get("Name"));    // Get using kay
        System.out.println(Records.remove("Age"));   // Remove using key

        System.out.println(Records);

        System.out.println(Records.containsKey("Address")); // check key
        System.out.println(Records.containsValue("Akshay"));  // checkvalue

        Records.size();
        Records.isEmpty();
        // Records.clear();

        // LinkedHashMap - maintains INSERTION ORDER (predictable iteration)

        LinkedHashMap<String, String> linkedRecords = new LinkedHashMap<>();

        linkedRecords.put("Name", "Akshay");
        linkedRecords.put("Age", "25");
        linkedRecords.put("Address", "Mumbai");
        linkedRecords.put("Designation", "Developer");

        System.out.println(linkedRecords);
        // Output: {Name=Akshay, Age=25, Address=Mumbai, Designation=Developer}
        // (always in insertion order)

        // ---- Basic Methods (same as HashMap) ----
        System.out.println(linkedRecords.get("Name"));           // Akshay
        System.out.println(linkedRecords.remove("Age"));         // 25
        System.out.println(linkedRecords.containsKey("Address")); // true
        System.out.println(linkedRecords.containsValue("Akshay"));// true
        System.out.println(linkedRecords.size());                // 3
        System.out.println(linkedRecords.isEmpty());             // false

        // ---- Updating a value ----
        linkedRecords.put("Name", "Akshay Kumar");   // updates value, keeps position
        // Note: put() on existing key does NOT move it to end (insertion order)

        // ---- getOrDefault ----
        System.out.println(linkedRecords.getOrDefault("Phone", "Not Available"));

        // ---- putIfAbsent ----
        linkedRecords.putIfAbsent("Email", "ak@example.com");  // adds (absent)
        linkedRecords.putIfAbsent("Name", "Changed");          // ignored (present)

        // ---- replace ----
        linkedRecords.replace("Age", "26");                    // replace value
        linkedRecords.replace("Age", "26", "27");              // replace only if old==26




        // TreeMap - keys SORTED (natural order or custom Comparator) , 
        // Sorted data, range queries, nearest-element search

        TreeMap<String, String> treeRecords = new TreeMap<>();

        treeRecords.put("Name", "Akshay");
        treeRecords.put("Age", "25");
        treeRecords.put("Address", "Mumbai");
        treeRecords.put("Designation", "Developer");
        treeRecords.put("City", "Pune");

        System.out.println(treeRecords);
       // Output: {Address=Mumbai, Age=25, City=Pune, Designation=Developer, Name=Akshay}
       // (keys sorted alphabetically — capitalized keys sort before lowercase)

       // ---- Basic Methods (same as HashMap) ----
        System.out.println(treeRecords.get("Name"));             // Akshay
        System.out.println(treeRecords.remove("Age"));           // 25
        System.out.println(treeRecords.containsKey("Address"));  // true
        System.out.println(treeRecords.containsValue("Akshay")); // true
        System.out.println(treeRecords.size());
        System.out.println(treeRecords.isEmpty());

        // ---- SortedMap Methods ----
        System.out.println(treeRecords.firstKey());   // smallest key
        System.out.println(treeRecords.lastKey());    // largest key
        System.out.println(treeRecords.firstEntry()); // smallest entry
        System.out.println(treeRecords.lastEntry());  // largest entry





        //   HashMap        LinkedHashMap         TreeMap         ConcurrentHashMap        HashTable
        
        //  FastLookup      Ordered Iteratiom      Sorted data           Concurrency             Legacy Sync
        //  No Thread Safe       Not safe          Not safe        Thread safe           Thread safe 
        //  1 Null key       1 null key            no null          no null                no null 
        //   No Order      Insert/access Order     Sorted           None                    None 

     

        // Final Rule of Thumb:
        // Fast, unordered → HashMap
        // Ordered iteration → LinkedHashMap
        // Sorted / range queries → TreeMap
        // Concurrent access → ConcurrentHashMap
        // Legacy → Hashtable (avoid)


    }
}
