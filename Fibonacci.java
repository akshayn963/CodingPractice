import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();
        int a=0;
        int b=1;
        int i=1;
       
        while(i <= num){
          System.out.println(a);

          int sum= a+b;
          a=b;
          b=sum;
          i++;
        }
       
    }
}
