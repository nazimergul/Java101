import java.util.Scanner;
public class RecursiveFibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısı giriniz: ");
        int n = input.nextInt();
        System.out.println("Sonuç: "+fib(n));
    }
    static int fib(int n){
        if(n == 0){        
        return 0;
        }else if(n == 1){        
        return 1;
        }else if(n > 1){        
        return fib(n-1) + fib(n-2);
        }
        return 0;
     }
}
