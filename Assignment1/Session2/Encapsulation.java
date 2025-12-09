//encapsulated book class
class Book {
    //make the fields privatr
    private String title;
    private String author;

    //generate constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    //getter/setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    // for cheacking output
    public void displayInfo(){
        System.out.println("Titke:" + title);
        System.out.println("author:" + author);
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        //creating book object
         Book myBook = new Book("Wings of Fure","APJ Abdul Kalam");

         //display info
         myBook.displayInfo();
         System.out.println("\nchanging title using setter...");
         myBook.setTitle("WOF");

         //chaeck updated info
         myBook.displayInfo();
    }
    
}
