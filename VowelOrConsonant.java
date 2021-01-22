import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        scanner.close();


        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
         && ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            System.out.println(ch + " is vowel");
         }
            
        else{
            System.out.println(ch + " is consonant");
        }
           
    }
}
