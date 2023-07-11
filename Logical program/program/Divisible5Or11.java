4.Write java program to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;
public class Divisible5Or11
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        num= sc.nextInt();
        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println(" is divisible by 5 and 11");
        }
        else
        {
            System.out.println(" is not divisible by 5and 11");
        }
    }
}