import java.util.Scanner;

public class ArmstrongNumberBetweenIntervals {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Starting number : ");
        int num1=scanner.nextInt();
        System.out.println("Enter a Ending number : ");
        int num2=scanner.nextInt();
       
        for (int i = num1; i<num2; i++){
            int num, rem, a = 0;
            num = i;
            while(num != 0) {
               rem = num % 10;
               a = a + (rem * rem * rem);
               num = num / 10;
            }
            if(a == i){
               System.out.print(" "+i);
            }
         }
 
        scanner.close();
     }
}
