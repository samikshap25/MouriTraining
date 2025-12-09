
//RightAngledTriangle
import java.util.Scanner;

public class  PatternPrinting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) { // outer loop for rows

            for (int j = 1; j <= i; j++) { // inner loop for stars
                System.out.print("* ");   // print star with space
            }

            System.out.println(); // move to next row
        }

        sc.close();
    }
}
