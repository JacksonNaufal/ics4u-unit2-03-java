/*
* The program gets a input from the user to use
* in the JacksonStacks program.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-04
*
* This is a JacksonStacks program.
*/

import java.util.Scanner;

/**
 * This is the main class.
 * Class Main
 */
final class Main {

    /**
     * This is the max for the for loop.
     */
    public static final int MAX = 5;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final int arrayPopped;

        // This is a stack program
        final Scanner userInt = new Scanner(System.in);
        final Scanner removeInt = new Scanner(System.in);
        final JacksonStacks stackNum = new JacksonStacks();
        // Input user loop.
        while (true) {
            System.out.print("Enter a number!: ");
            final int userInput = userInt.nextInt();
            if (userInput == -1) {
                break;
            } else {
                stackNum.push(userInput);
            }
        }

        // Shows the first stack.
        stackNum.finishedStack();

        // Before the new popped array.
        System.out.println("The new array is");
        System.out.println("Calculating...");

        // Shows the popped array.
        arrayPopped = stackNum.pop();
        stackNum.finishedStack();

        // End of program.
        System.out.print("\nDone!");
    }
}
