import java.util.Scanner;

public class PracticeUserLogin {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        userName = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("Java101")) {
            System.out.println("Login successful");
        } else if (userName.equals("Patika")) {
            System.out.println("Login failed !");
            System.out.println("Do you want to reset password: Yes / No");
            String answer = input.nextLine();
            if (answer.equals("Yes")) {
                short tryCounter = 0;
                while (tryCounter < 5) {
                    System.out.print("Enter new password: ");
                    String newPassword = input.nextLine();
                    tryCounter += 1;
                    if (tryCounter >= 5) {
                        System.out.println(
                                "You have made too many incorrect login attempts, please wait a while and try again later.");
                        break;
                    }
                    if (newPassword.equals("Java101") || newPassword.equals(password)) {
                        System.out.println("Choose a password that has not been used before.");
                    } else {
                        password = newPassword;
                        System.out.println("Password changed: " + password);
                        break;
                    }
                }
            }
        } else {
            System.out.print("User not found.");
        }
    }
}
