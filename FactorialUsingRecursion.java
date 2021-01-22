import java.util.Scanner;

public class FactorialUsingRecursion {
    static int factorial(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial(n-1));    
       }    
       public static void main(String args[]){  
        int fact=1;  
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter a number : ");
          int number=sc.nextInt();
          sc.close();
        fact = factorial(number);   
        System.out.println("Factorial of "+number+" is: "+fact);    
       }  

}
