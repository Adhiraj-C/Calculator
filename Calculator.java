
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the two numbers(Please keep in mind to add a space between the two numbers you choose instead of a comma): ");

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        System.out.print("Choose an operation (+, -, *, /): ");

        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':

                System.out.println(num1 + num2);
                break;

            case '-':

                System.out.println(num1 - num2);
                break;

            case '*':

                System.out.println(num1 * num2);
                break;

            case '/':

                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    break; // exit the program immediately after printing the error message
                }

                else { // if num2 is not zero, divide num1 by num2 and print the result.
                    System.out.println(num1 / num2);

                }
                break;
            default:

                System.out.println("Invalid Operator.");
                break;
        }

    }
}
