//parent class
class Animal{
    void makeSound(){
        System.out.println("Animals make sound");
    }
}
//child class
class Dog extends Animal{
    void  makeSound(){
        System.out.println("Dog barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //creating objects
        Animal a= new Animal();
        Dog d = new Dog();

        //calling methds
        a.makeSound();
        d.makeSound();
    }
    
}
