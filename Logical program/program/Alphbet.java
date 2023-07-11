//7. Write java prgm to check whether a character is alphabet or not.
import java.util.Scanner;
class Alphbet{
  public static void main (String args[]);
  Scanner sc=new Scanner(System.in);
  char ch;
  System.out.println("enter a alphbet");
  ch=sc.next().charAt(0);  
if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
  {
  System.out.println("it is alphbet");
  }
else{
  System.out.println("it is not alphbet ");
}
}