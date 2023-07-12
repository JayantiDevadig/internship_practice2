//59. Write a JAVAprogram to count total number of duplicate elements in an array.
import java.util.*;

public class CountDuplicateElem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i], 1);
            }
        }
        int count = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > 1) {
                count += frequency - 1;
            }
        }
        System.out.println("Total number of duplicate elements in the array is: " + count);
    }
}