// class Book {
//     String title;   // variable to store book title
//     String author;  // variable to store author name
// }

// public class ClassesObjects {
//     public static void main(String[] args) {
        
//         // creating an object of Book
//         Book b = new Book();

//         // assigning values to the variables
//         b.title = "Wings of Fire";
//         b.author = "A.P.J. Abdul Kalam";

//         // printing the values
//         System.out.println("Title: " + b.title);
//         System.out.println("Author: " + b.author);
//     }
// }
///the above is the direct implementation...and below is as given to do task as 
// class, fields, constructor, methods
class Book {
    String title;   // field to store book title
    String author;  // field to store author name

    // Constructor to initialize fields
    Book(String t, String a) {
        title = t;     
        author = a;
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        // creating an object and passing values through constructor
        Book b = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

        // calling the method to print information
        b.displayInfo();
    }
}
