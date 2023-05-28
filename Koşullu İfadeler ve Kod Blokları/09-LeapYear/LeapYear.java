import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Enter Year: ");
        year = input.nextInt();

        String result = findLeapYear(year);
        System.out.println(result);
    }

    private static String findLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return year + " is a Leap Year";
            } else {
                return year + " is not a Leap Year";
            }
        } else if (year % 4 == 0) {
            return year + " is a Leap Year";
        } else {
            return year + " is not a Leap Year";
        }
    }
}
