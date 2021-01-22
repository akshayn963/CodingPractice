import java.util.Scanner;

public class PrimeBetweenTwoIntervals {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Starting number : ");
        int StartNum=scanner.nextInt();
        System.out.println("Enter a Ending number : ");
        int EndNum=scanner.nextInt();
        scanner.close();
     
        while (StartNum < EndNum) {
            boolean flag = false;

            for(int i = 2; i <= StartNum/2; ++i) {
            
                if(StartNum % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && StartNum != 0 && StartNum != 1)
                System.out.print(StartNum + " ");

            ++StartNum;
        }
    }
    
}
