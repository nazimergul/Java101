import java.util.Scanner;
public class Calc_Sw_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = input.nextInt();
        System.out.print("Second number: ");
        int num2 = input.nextInt();

        System.out.println("1-Add\n2-Sub\n3-Mul\n4-Div");
        System.out.print("Select transaction: ");
        int selection = input.nextInt();

        switch(selection){
            case 1: System.out.println("Addition: "+ (num1+num2));
                break;
            case 2: System.out.println("Subtraction: "+ (num1-num2));
                break;
            case 3: System.out.println("Multiplication: "+ (num1*num2));
                break;
            case 4: System.out.println("Division: "+ (num1/num2));  
                break; 
        }

    }
}
