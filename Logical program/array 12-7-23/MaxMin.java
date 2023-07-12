
//52. Write a JAVAprogram to find maximum and minimum element in an array. 
import java.util.Scanner;

public class MaxMin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }
    sc.close();
    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      } else if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Maximum element: " + max);
    System.out.println("Minimum element: " + min);
  }
}