import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true; // assume number is prime

        if (n <= 1) {
            isPrime = false; 
        } else {
            // check divisors from 2 to n/2
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {   // if divisible
                    isPrime = false;
                    break;          // no need to check further
                }
            }
        }
        // Output result
        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
        sc.close();
    }
}
