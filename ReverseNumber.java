import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int a,b;
        int d=0;
        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        scanner.close();

        while (a>0) {
            b=a%10;
            a=a/10;
            d=(d*10)+b;

        }
        System.out.println("Reverse Number = "+ d);
    }
}
