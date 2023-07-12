
//58. Write a JAVAprogram to print all unique elements in the array.
import java.util.*;

public class UniqueElem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the elements of the array separated by spaces:");
    String[] input = scanner.nextLine().split(" ");
    int[] arr = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      arr[i] = Integer.parseInt(input[i]);
    }
    Set<Integer> uniqueElements = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      uniqueElements.add(arr[i]);
    }
    System.out.println("Unique elements in the array are:");
    for (int element : uniqueElements) {
      System.out.print(element + " ");
    }
  }
}
