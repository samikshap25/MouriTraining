
//ArmstrongNumber 
import java.util.Scanner;

public class NumberProperty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int originalNum = num; // store original number
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;        // get last digit
            sum += digit * digit * digit; // cube it and add to sum
            num /= 10;                   // remove last digit
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
