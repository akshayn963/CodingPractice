import java.util.Scanner;

public class largestAmongThree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number1 : ");
        int a=scanner.nextInt();
        System.out.println("Enter a Number2 : ");
        int b=scanner.nextInt();
        System.out.println("Enter a Number3 : ");
        int c=scanner.nextInt();
        scanner.close();

        if(a>b && a>c){
            System.out.println(a+" is largest number ");
        }
        else if (b>c) {
            System.out.println(b+" is largest number ");
        }
        else{
            System.out.println(c+" is largest number ");
        }
    }
}
