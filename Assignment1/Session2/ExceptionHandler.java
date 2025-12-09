import java.util.Scanner;
public class ExceptionHandler{
    //methid to perform division
    static void divide( int a, int b){
        try{
            int result = a/b;
            System.out.println("result: " + result);
        }catch( ArithmeticException e){
            System.out.println("err0e..");
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter numerator: ");
    int num = sc.nextInt();

    System.err.println("enter denominator: ");
    int den = sc.nextInt();

    divide(num, den);
    sc.close();
} 
}

