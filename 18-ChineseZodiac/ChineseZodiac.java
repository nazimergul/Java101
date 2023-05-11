import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String [] zodiacs = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
    System.out.print("Enter year of birth: ");
    int yearOfBirth = input.nextInt();
    System.out.println("Your Chinese Zodiac: " + zodiacs[(yearOfBirth %12)]);
    }
}
