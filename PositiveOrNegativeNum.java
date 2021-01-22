import java.util.Scanner;

public class PositiveOrNegativeNum {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();

        if(num>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
    }
}
