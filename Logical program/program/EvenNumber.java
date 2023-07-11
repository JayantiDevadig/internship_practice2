//20. Write a JAVAprogram to print all even numbers between 1 to 100. - using while loop

import java.util.*;
class EvenNumber {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.print(num );
            
            num++;
        }
    }
}