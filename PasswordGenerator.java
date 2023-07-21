import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input from the user name , email and mobile number
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        scanner.close();

        // generating a password
        String password = generatePassword(name, email, mobileNumber);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(String name, String email, String mobileNumber) {
        // combining strings to create a new string
        String inputString = name + email + mobileNumber;

        // characters to be used in the password
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[{]}|;:,.<>?";

        // Length of the password
        int passwordLength = 15; 

        
        Random random = new Random();
        StringBuilder password = new StringBuilder(passwordLength);

        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(index));
        }

        return password.toString();
    }
}
