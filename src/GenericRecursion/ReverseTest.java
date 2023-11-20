package GenericRecursion;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ReverseTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String dataType;
        boolean validDataType = false;

        // looping do while condition to prevent any code breaks from data type input.
        do {
            System.out.println("Please enter a datatype(Int, Double, or String ONLY): ");
            dataType = input.nextLine().toLowerCase(); // should resolve case-sensitive code breaks

            if (dataType.equals("int") || dataType.equals("double")|| dataType.equals("string")) {
                validDataType = true;
            }else {
                System.out.println("Invalid data type. Please try again!");
            }

        } while (!validDataType);

        RecursiveReverser reverser = new RecursiveReverser();

        // Do while loop to ensure user input is based on the chosen data type
        boolean validInput = false;
        do {
            switch (dataType) {
                case "int":
                    try {
                        System.out.println("Enter an integer to reverse: ");
                        int initialInt = input.nextInt();
                        input.nextLine(); // (\n)
                        int reversedInt = reverser.reverse(initialInt);
                        System.out.println("Initial Integer: " + initialInt);
                        System.out.println("Reversed Integer: " + reversedInt);
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("That input is not an integer. LOL Nice try.");
                        input.nextLine();
                    }
                    break;

                case "double":
                    try {
                        System.out.println("Enter a double to reverse: ");
                        double initialDouble = input.nextDouble();
                        input.nextLine(); // (\n)
                        double reversedDouble = reverser.reverse(initialDouble);
                        System.out.println("Initial Double: " + initialDouble);
                        System.out.println("Reversed Double: " + reversedDouble);
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("That input is not a double. LOL Nice Try.");
                        input.nextLine();
                    }
                    break;

                case "string":
                    System.out.println("Enter a string to reverse: ");
                    String initialString = input.nextLine();
                    String reversedString = reverser.reverse(initialString);
                    System.out.println("Initial String: " + initialString);
                    System.out.println("Reversed String: " + reversedString);
                    validInput = true;
                    break;

                default:
                    System.out.println("How did you even get here?");
            }
        } while (!validInput);
        input.close();
    }
}
