//1. create an abstract class
abstract class Shape{

    //abstract method
    abstract double calculateArea();
}

//2. concrete subclass: circle
class Circle extends Shape{
    double radius;

    Circle( double radius){
        this.radius=radius;
    }

    //implement abstract method
    @Override
    double calculateArea() {
        // TODO Auto-generated method stub
        return Math.PI * radius*radius;
    }
}
//3. concrete subclass: rectangle
class Rectangle extends Shape{
    double height;
    double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    //implement abstract methid

    @Override
    double calculateArea() {
// TODO Auto-generated method stub
        return height * width;
    }
      
}

public class Polymorphism {
    public static void main(String[] args) {
        //polymorphism: shape referance holding different objects
        Shape s1= new Circle(5);
        Shape s2 = new Rectangle(5,5 );

        System.out.println("Circle area= "+ s1.calculateArea());
        System.out.println("Rectangle area = "+ s2.calculateArea());
    }
    
}
