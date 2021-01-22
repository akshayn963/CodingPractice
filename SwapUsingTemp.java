import java.util.Scanner;

public class SwapUsingTemp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number1 : ");
        int num1=scanner.nextInt();
        System.out.println("Enter a Number2 : ");
        int num2=scanner.nextInt();
        System.out.println("numbers before Swapping : ");
        System.out.println(num1+" "+num2);
        scanner.close();

        int temp;

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("numbers After Swapping : ");
        System.out.println(num1+" "+num2);
    }
}
