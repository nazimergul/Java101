import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        double distance, price;
        short flightType, age;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        distance = input.nextDouble();

        System.out.print("Enter age: ");
        age = input.nextShort();

        System.out.print("Select Flight Type (1-One Way / 2-Round Trip): ");
        flightType = input.nextShort();

        if (distance > 0 && age > 0 && (flightType == 1 || flightType == 2)) {
            price = 0.10 * distance;
            if (age < 12) {
                price *= 0.5;
            } else if (age < 25) {
                price *= 0.9;
            } else if (age > 65) {
                price *= 0.7;
            }
            if(flightType == 2){
                price *= 0.8;
                price *= 2;
            }
            System.out.println("Total Price: " + price + " TL");
        } else {
            System.out.println("Incorrect Data!");
        }
    }
}
