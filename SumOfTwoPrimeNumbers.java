import java.util.Scanner;

public class SumOfTwoPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        scanner.close();
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
    
        
          if (checkPrime(i)) {
    
           
            if (checkPrime(number - i)) {
    
             
              System.out.println(number+" = " +i+" + "+(number - i));
              flag = true;
            }
    
          }
        }
    
        if (!flag)
          System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
      }
    
      
      static boolean checkPrime(int num) {
        boolean isPrime = true;
    
        for (int i = 2; i <= num / 2; ++i) {
          if (num % i == 0) {
            isPrime = false;
            break;
          }
        }
    
        return isPrime;
      }
    }

