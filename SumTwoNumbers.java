
import java.util.*;

public class SumTwoNumbers {

    public static void main(String[] args) {

        // Create Scanner object to help us input our numbers
        Scanner input = new Scanner(System.in);

        // Ask user for first number
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        // Ask user for second number
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);

        input.close();
    }
}
