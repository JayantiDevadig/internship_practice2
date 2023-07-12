//55. Write a JAVAprogram to copy all elements from an array to another array.
import java.util.Scanner;

public class CopyArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      int[] arr1 = new int[size];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < size; i++) {
         arr1[i] = sc.nextInt();
      }
      int[] arr2 = new int[arr1.length];
      for (int i = 0; i < arr1.length; i++) {
         arr2[i] = arr1[i];
      }
      System.out.println("Elements of arr1: ");
      for (int i = 0; i < arr1.length; i++) {
         System.out.print(arr1[i] + " ");
      }
      System.out.println("\nElements of arr2: ");
      for (int i = 0; i < arr2.length; i++) {
         System.out.print(arr2[i] + " ");
      }
      sc.close();
   }
}