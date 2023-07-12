
//50. Write a JAVAprogram to print all negative elements in an array
import java.util.Scanner;

public class NegativeElem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the array elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.print("Negative elements: ");
    for (int i = 0; i < size; i++) {
      if (arr[i] < 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}