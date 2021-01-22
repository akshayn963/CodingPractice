import java.util.Scanner;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base value : ");
        int x=sc.nextInt();
        System.out.println("Enter a powerraised value : ");
        int y=sc.nextInt();
        sc.close();
       
        int result = power(x, y);

        System.out.print(x+" ^ "+y+" = "+result);
    }

    public static int power(int x, int y) {
        if (y != 0)
            return (x * power(x, y- 1));
        else
            return 1;
    }
}
