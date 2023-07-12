//53. Write a JAVAprogram to count total number of even and odd elements in an array.
import java.util.Scanner;

public class EvenOdd {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int evenCount = 0;
      int oddCount = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] % 2 == 0) {
            evenCount++;
         } else {
            oddCount++;
         }
      }
      System.out.println("Total even elements: " + evenCount);
      System.out.println("Total odd elements: " + oddCount);
   }
}