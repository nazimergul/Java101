import java.util.Scanner;
public class CircleAreaAndCircumference {
    public static void main(String[] args){
        double radius , pi = Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        radius=input.nextDouble();
        double area = pi*radius*radius;
        double circumference = 2*pi*radius;
        System.out.println("Area : " + area);
        System.out.println("Circumference : " + circumference);
    }
}