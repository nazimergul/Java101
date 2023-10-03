import java.util.Scanner;
public class PalindromNumbers{
    static boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;            
            reverseNumber = (reverseNumber *10) + lastNumber;            
            temp /= 10;
        }        
        return (number == reverseNumber) ? true:false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a palindrome number: ");
        int palindromNum = input.nextInt();   
        System.out.println((isPalindrome(palindromNum) == true) ? (palindromNum +" is a palindrome"):(palindromNum +" is not a palindrome"));
    }
}