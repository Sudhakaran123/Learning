import java.util.Scanner;

public class BitwiseSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

         swapUsingBitwise(first, second);
         System.out.println("After swapping: First = " + first + ", Second = " + second);
    }
     public static void swapUsingBitwise(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

      
    }
}
