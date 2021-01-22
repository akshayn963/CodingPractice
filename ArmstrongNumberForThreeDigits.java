import java.util.Scanner;

public class ArmstrongNumberForThreeDigits {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       System.out.println("Enter the three digit Number");
       int num=scanner.nextInt();
       if(num>99 && num<1000){
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

       }
       else{
           System.out.println("please enter three digit number only!!!");
       }
       scanner.close();
    }
}
