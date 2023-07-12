//56. Write a JAVAprogram to delete an element from an array at specified position.
import java.util.Scanner;

public class DeleteElement {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < size; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.print("Enter the position of the element to be deleted: ");
      int pos = sc.nextInt();
      if (pos < 1 || pos > arr.length) {
         System.out.println("Invalid position");
      } else {
         int[] newArr = new int[arr.length - 1];
         int j = 0;
         for (int i = 0; i < arr.length; i++) {
            if (i != pos - 1) {
               newArr[j] = arr[i];
               j++;
            }
         }
         System.out.println("Elements of the array after deletion: ");
         for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
         }
      }
      
   }
}


