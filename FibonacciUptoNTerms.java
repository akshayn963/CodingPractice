import java.util.Scanner;

public class FibonacciUptoNTerms {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();
        int a=0;
        int b=1;
        
       
        while(a <= num){
          System.out.println(a);

          int sum= a+b;
          a=b;
          b=sum;
    
        }
       
    }
}
