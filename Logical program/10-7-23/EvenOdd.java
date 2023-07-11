//5. WAP to check whether a number is even or odd.
import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("The given number  is Even ");
        }
        else
        {
            System.out.println("The given number  is Odd ");
	}
    }
}