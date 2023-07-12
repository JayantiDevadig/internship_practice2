
//51. Write a JAVAprogram to find second largest element in an array.
import java.util.Scanner;

public class SecndLarg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    int largest = arr[0];
    int secondLargest = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }
    System.out.println("Second largest element: " + secondLargest);
  }
}
