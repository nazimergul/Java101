import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){
        double height, weight;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height (mt) : ");
        height=input.nextDouble();
        System.out.print("Enter your weight (kg) : ");
        weight=input.nextDouble();
        double bodyMassIndex = weight/(height*height);
        System.out.println("Body Mass Index : " + bodyMassIndex );
    }
}