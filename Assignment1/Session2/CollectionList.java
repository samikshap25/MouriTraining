import java.util.ArrayList;
public class CollectionList {
    public static void main(String[] args) {
        //create arraylist
     ArrayList<String> names = new ArrayList<>();

     // add names to list
        names.add("Sam");
        names.add("Alice");
        names.add("Steve");
        names.add("John");
        names.add("Sophie");

        //iterate using for each loop
        System.out.println("names starting with S: ");
        for(String name:names){
            if( name.startsWith("S") ){
                System.out.println(name);
            }
        }
        }
    
}
