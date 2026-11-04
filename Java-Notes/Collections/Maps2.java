import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Maps2 {
    public static void main(String[] args) {
        
    System.out.println("ConcurrencyHashMap And HashTable In Collection ");

    //  ConcurrentHashMap = Best for Multi-threaded applications needing high-performance concurrent access.

    ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    // ---- put ----
    map.put("Name", "Akshay");
    map.put("Age", "25");
    map.put("Address", "Mumbai");
    map.put("Designation", "Developer");

    System.out.println(map);

     // ---- get ----
    System.out.println(map.get("Name"));          // Akshay
    System.out.println(map.get("Unknown"));       // null

     // ---- remove ----
    System.out.println(map.remove("Age"));        // 25

     // ---- contains ----
    System.out.println(map.containsKey("Address"));      // true
    System.out.println(map.containsValue("Akshay"));     // true

     // ---- size / isEmpty / clear ----
    System.out.println(map.size());
    System.out.println(map.isEmpty());
     // map.clear();

     // ---- views ----
    System.out.println(map.keySet());
    System.out.println(map.values());
    System.out.println(map.entrySet());

     // ---- iteration ----
     map.forEach((k, v) -> System.out.println(k + " = " + v));
     for (var e : map.entrySet()) {
        System.out.println(e.getKey() + " -> " + e.getValue());
    }



     //  Atomic Methods (The Real Power of ConcurrentHashMap)
     //  These are the methods that make ConcurrentHashMap different from HashMap:

     ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
     stock.put("Apple", 10);
     stock.put("Banana", 5);
     stock.put("Orange", 8);

     // ---- putIfAbsent ----
     stock.putIfAbsent("Mango", 3);     // added
     stock.putIfAbsent("Apple", 99);    // ignored (exists)
     System.out.println(stock);

     // ---- replace(K, V) ----
     stock.replace("Apple", 15);        // replace if key present
     System.out.println(stock.get("Apple")); // 15

     // ---- replace(K, oldV, newV) ----
     stock.replace("Banana", 5, 20);    // replace only if current value == 5
     System.out.println(stock.get("Banana")); // 20
     stock.replace("Banana", 5, 99);    // ignored (current is 20, not 5)

     // ---- remove(K, V) ----
     stock.remove("Orange", 8);         // remove only if value matches
     System.out.println(stock.containsKey("Orange")); // false

     // ---- compute ----
     stock.compute("Apple", (k, v) -> v + 5);        // 15 → 20
     stock.compute("Kiwi", (k, v) -> 100);           // adds Kiwi=100
     stock.compute("Mango", (k, v) -> null);         // null → removes Mango

     // ---- computeIfAbsent ----
     stock.computeIfAbsent("Grapes", k -> 50);       // adds
     stock.computeIfAbsent("Apple", k -> 999);       // ignored (present)

     // ---- computeIfPresent ----
     stock.computeIfPresent("Banana", (k, v) -> v + 5); // 20 → 25
     stock.computeIfPresent("Papaya", (k, v) -> 999);   // ignored (absent)

     // ---- merge ----
     stock.merge("Apple", 10, Integer::sum);         // 20 + 10 = 30
     stock.merge("Cherry", 7, Integer::sum);         // adds Cherry=7

     // ---- getOrDefault ----
     System.out.println(stock.getOrDefault("Papaya", 0)); // 0

     System.out.println(stock);


        // HashTable - Best for Legacy code only — prefer ConcurrentHashMap for concurrent use.

        Hashtable<String, String> table = new Hashtable<>();

        // ---- put ----
        table.put("Name", "Akshay");
        table.put("Age", "25");
        table.put("Address", "Mumbai");
        table.put("Designation", "Developer");

        System.out.println(table);

        // ---- get ----
        System.out.println(table.get("Name"));     // Akshay
        System.out.println(table.get("Unknown"));  // null

        // ---- remove ----
        System.out.println(table.remove("Age"));   // 25

        // ---- contains ----
        System.out.println(table.containsKey("Address"));    // true
        System.out.println(table.containsValue("Akshay"));   // true
        System.out.println(table.contains("Developer"));     // (deprecated) checks value

        // ---- size / isEmpty / clear ----
        System.out.println(table.size());
        System.out.println(table.isEmpty());
        // table.clear();

        // ---- views ----
        System.out.println(table.keySet());
        System.out.println(table.values());
        System.out.println(table.entrySet());

        // ---- iteration ----
        table.forEach((k, v) -> System.out.println(k + " = " + v));
        for (var e : table.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
          }





    }
}
