import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısı giriniz: ");
        int N = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        for(int i = 1 ; i<N ; i++){
            int addNums = num1+num2;
            System.out.println(num1 + " + " + num2 + " = " + addNums);
            num1 = num2;
            num2 = addNums;
        }
    }
}
