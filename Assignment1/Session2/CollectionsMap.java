
import java.util.HashMap; // Import HashMap class from java.util
import java.util.Map;     // Import Map interface (for Map.Entry)

public class CollectionsMap {

    public static void main(String[] args) {

        // Step 1: Create a HashMap to store countries and their capitals
        // Key = country (String), Value = capital (String)
        HashMap<String, String> countryCapital = new HashMap<>();

        // Step 2: Add entries to the HashMap using put(key, value)
        countryCapital.put("India", "New Delhi");
        countryCapital.put("USA", "Washington D.C.");
        countryCapital.put("Japan", "Tokyo");

        // Step 3: Print a header
        System.out.println("Countries and their Capitals:");

        // Step 4: Iterate through the HashMap using Map.Entry
        // entrySet() gives all key-value pairs in the map
        for (Map.Entry<String, String> entry : countryCapital.entrySet()) {

            // entry.getKey() -> gets the key (country)
            // entry.getValue() -> gets the value (capital)
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}

