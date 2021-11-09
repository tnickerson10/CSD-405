/*
    Travis Nickerson
    CSD 405
    JUne 22nd 2021
    Assignment 5
    Goal: Write a program that uses an ArrayList filled with a minimum of 10 Strings. Use a ‘for-each’ loop to print
    the ArrayList collection. Then ask a user which element they would like to see again. Then, attempt printing the
    element in a try/catch format which will result in the element being display. If the element value received is
    invalid, display a message that an Exception has been thrown displaying “Out of Bounds”. In this program, include
    the use of Autoboxing/Auto-Unboxing, working with a user String input.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringPrompts {
    public static void main(String[] args) {

        // Creating a new ArrayList that takes Strings
        ArrayList<String> compareString = new ArrayList<String>();

        // adding in our string to our new ArrayList object
        compareString.add("1. Chargers");
        compareString.add("2. Chiefs");
        compareString.add("3. Raiders");
        compareString.add("4. Broncos");
        compareString.add("5. Packers");
        compareString.add("6. 49ers");
        compareString.add("7. Steelers");
        compareString.add("8. Bears");
        compareString.add("9. Lions");
        compareString.add("10. Cowboys");

        // Displaying these strings with a for each loop
        for (String i: compareString) {
            System.out.println(i);
        }

        // Creating a new scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring variables for our while loop of user input
        int userSelection;
        boolean start = true;

        // Starting while loop asking for user input of an integer that corresponds to the matching string value
        while(start) {

            // Try catch for user input
            try {
                System.out.println("Please select your favorite team from the list. Use the corresponding number: ");

                // Setting user input variable form scanner
                userSelection = sc.nextInt();

                // Checking if the user input a match to a valid string. A correct selection displays it and breaks
                // the loop
                if (userSelection == 1) {
                    System.out.println(compareString.get(0));
                    break;
                }
                if (userSelection == 2) {
                    System.out.println(compareString.get(1));
                    break;
                }
                if (userSelection == 3) {
                    System.out.println(compareString.get(2));
                    break;
                }
                if (userSelection == 4) {
                    System.out.println(compareString.get(3));
                    break;
                }
                if (userSelection == 5) {
                    System.out.println(compareString.get(4));
                    break;
                }
                if (userSelection == 6) {
                    System.out.println(compareString.get(5));
                    break;
                }
                if (userSelection == 7) {
                    System.out.println(compareString.get(6));
                    break;
                }
                if (userSelection == 8) {
                    System.out.println(compareString.get(7));
                    break;

                }
                if (userSelection == 9) {
                    System.out.println(compareString.get(8));
                    break;

                }
                if (userSelection == 10) {
                    System.out.println(compareString.get(9));
                    break;

                }

                // Checking if the user input is out of bounds with a local try catch. Value would need to be larger
                // than selection limit
                if (userSelection > 10) {
                    try { compareString.get(10);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Index out of bounds");
                        sc.nextLine();
                        start = true;
                    }
                }
            }

            // catching a mismatch input if a user inputs anything other than an integer
            catch (InputMismatchException e) {
                System.out.println("You didn't Enter a number. Out Of Bounds");
                sc.nextLine();
                start = true;

            }
        }
    }
}
