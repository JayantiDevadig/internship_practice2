//25. Write a JAVAprogram to print multiplication table of any number.

import java.util.*;
class DwMultiplication   {   
  public static void main(String args[]){      
    int n=5;      
    int i=1;     
    do{        
      System.out.println(n+"*"+i+"="+(n*i));     
      i++;     
    }while(i<=10);  
  } 
}