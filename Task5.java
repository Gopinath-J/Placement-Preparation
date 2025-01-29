
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two mysterious numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compare the numbers
        if (num1 > num2) {
            System.out.println("The first number (" + num1 + ") is bigger.");
        } else if (num2 > num1) {
            System.out.println("The second number (" + num2 + ") is bigger.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
