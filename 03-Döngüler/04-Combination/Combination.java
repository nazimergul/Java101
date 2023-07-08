import java.util.Scanner;
import java.util.function.Function;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter r: ");
        int r = input.nextInt();
        System.out.println(factorial(n)/(factorial(r)*factorial(n-r)));

    }
    static int factorial(int num){
        return num > 1 ? num*factorial(num-1) : 1;    
    }
}