import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // output
        System.out.println("Enter a floating point value :");

        // wait for the user to enter something
        double value = input.nextDouble();

        // tell the user what was entered
        System.out.println("You have entered :" + value);
    }
}
