import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // output
        System.out.print("Enter a floating point value :");

        // wait for the user to enter something
        double value = scanner.nextDouble();

        // tell the user what was entered
        System.out.print("You have entered :" + value);
    }
}
