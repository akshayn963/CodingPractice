import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        int Number=scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= Number; i++) {
            if(Number%i==0){
               count++;
            
            }
        }
            if(count==2){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not Prime number");
            }
        
        
    }
}
