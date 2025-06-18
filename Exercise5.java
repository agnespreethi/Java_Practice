import java.util.Scanner;

public class Exercise5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String again = "y";
    // TODO: Use a while loop to keep calculating while 'again' is 'y'
    while (again.equalsIgnoreCase("y")) {
   
    // TODO: Ask user for two numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

    // TODO: Ask user for the operation (+, -, *, /)
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = input.next().charAt(0);
    
    // TODO: Use if-else to perform the operation
        double result;
        boolean validOperation = true;

        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
    
    // TODO: Handle division by zero case
        else if (operation == '/') {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
        }    
        else {
            System.out.println("Invalid operation.");
            validOperation = false;
        }

    // TODO: Ask if user wants to continue
        System.out.print("Do you want to calculate again? (y/n): ");
        again = input.next();
    }
    
    // TODO: Exit the loop and print a thank you message
     System.out.println("Thank you for using the calculator.");
     input.close();

}
}
