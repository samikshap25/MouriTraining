//FactorialLoop
import java.util.Scanner;

public class  Mathematical  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // multiply factorial by i
        }

        System.out.println(n + "! = " + factorial);
        sc.close();
    }
}
