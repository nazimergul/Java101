import java.util.Scanner;
public class CircleSectorArea {
    public static void main(String[] args){
        double radius,angle , pi = Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        radius=input.nextDouble();
        System.out.print("Enter the angle of circle : ");
        angle=input.nextDouble();
        double sectorArea = (pi*radius*radius)*(angle/360);
        System.out.println("Sector Area : " + sectorArea);
    }
}