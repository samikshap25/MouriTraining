class Counter {

    // Static variable shared by all objects
    static int count = 0;

    // Constructor
    Counter() {
        count++; // Increment count whenever a new object is created
    }

    // Method to display the current count
    void displayCount() {
        System.out.println("Number of Counter objects: " + count);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {

        // Creating 3 objects of Counter
        Counter c1 = new Counter();
        c1.displayCount();  // Output: 1

        Counter c2 = new Counter();
        c2.displayCount();  // Output: 2

        Counter c3 = new Counter();
        c3.displayCount();  // Output: 3

        // You can also access static variable directly using class name
        System.out.println("Total count (via class): " + Counter.count);
    }
}
