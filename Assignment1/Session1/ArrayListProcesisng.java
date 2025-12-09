//SecondSmallestEasy
public class ArrayListProcesisng
 {
    public static void main(String[] args) {

        int[] arr = {12, 5, 7, 3, 9};

        // Step 1: find smallest
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Step 2: find second smallest
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}


// public class SecondSmallestApproach4 {
//     public static void main(String[] args) {

//         int[] arr = {12, 5, 7, 3, 9};

//         // Step 1: initialize smallest and second smallest from first two elements
//         int smallest, secondSmallest;

//         if (arr[0] < arr[1]) {
//             smallest = arr[0];
//             secondSmallest = arr[1];
//         } else {
//             smallest = arr[1];
//             secondSmallest = arr[0];
//         }

//         // Step 2: loop from the 3rd element onwards
//         for (int i = 2; i < arr.length; i++) {

//             if (arr[i] < smallest) {
//                 // new smallest found
//                 secondSmallest = smallest;
//                 smallest = arr[i];
//             }
//             else if (arr[i] < secondSmallest && arr[i] != smallest) {
//                 // new second smallest found
//                 secondSmallest = arr[i];
//             }
//         }

//         // Step 3: print result
//         System.out.println("Smallest: " + smallest);
//         System.out.println("Second Smallest: " + secondSmallest);
//     }
// }

