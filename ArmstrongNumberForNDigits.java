import java.util.Scanner;

public class ArmstrongNumberForNDigits {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scanner.nextInt();
       
           int a=0,remainder;
           int temp=num;
           while(num>0){
               remainder=num%10;
               a=a+remainder*remainder*remainder;
                num=num/10;
           }
 
           if(a==temp){
               System.out.println("number is armstrong number");
           }
           else{
             System.out.println("number is not armstrong number");
           }
 
        scanner.close();
     }
}
