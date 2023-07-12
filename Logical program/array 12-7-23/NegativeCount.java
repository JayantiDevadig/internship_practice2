//54. Write a JAVAprogram to count total number of negative elements in an array.
import java.util.Scanner;

public class NegativeCount {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int size = input.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < size; i++) {
         arr[i] = input.nextInt();
      }
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] < 0) {
            count++;
         }
      }
      System.out.println("Total negative elements: " + count);
   }
}