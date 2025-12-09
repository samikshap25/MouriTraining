//using string builder 
public class StringManipulation {
    public static void main(String[] args) {

        String input = "hello";

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed String: " + reversed);
    }
}

//two pointer method
// public class ReverseStringTwoPointer {
//     public static void main(String[] args) {
        
//         String str = "hello";
//         char[] arr = str.toCharArray(); // convert string to char array
        
//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) {
//             // swap characters
//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }

//         String reversed = new String(arr);

//         System.out.println("Reversed String: " + reversed);
//     }
// }
