/*
    Travis Nickerson
    CSD 405
    JUne 22nd 2021
    Assignment 4
    Goal:   A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
            The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
            The ArrayList is then to be sent to the method.
            The method is then to return the largest value in the ArrayList.
            If the ArrayList is sent in empty, the method will then return 0.
            The method signature is to be: public static Integer max (ArrayList list).
            Write additional code for testing your method.
            The method will return the largest value that is displayed to the user.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class TravisArrayListTest {

    // Method that receives an ArrayList and returns it
    public static ArrayList getUserArray(ArrayList userArr) {
        return userArr;
    }

    // Method that calculates the max number of a passed in ArrayList and returns an Integer max number
    // in array. Method return 0 if arraylist passed in is empty
    public static Integer max (ArrayList list){
        if(list.isEmpty()) {
            System.out.println("Your array was empty");
            return 0;
        }

        // Using Java Collection package for taking in arraylist and finding max value and casting to an Int
        int max = (int) Collections.max(list);
        return max;
    }

    public static void main(String[] args) {

        // Declaring a new arrayList object
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        // Setting a new scanner
        Scanner scanner = new Scanner(System.in);

        // Declaring variables for our while loop that will take in user input for the array
        int input;
        boolean start = true;

        System.out.println("Enter your integers for your array. Press 0 to end your array. \n**Enter 99 to submit an empty array** \n");

        // Initializing while loop with our start variable as true
        while(start) {

            // Try catch for invalid input
            try {
                System.out.println("ADD YOUR INTEGERS:");

                // Setting our int variable with the next input from the user in the scanner object
                input = scanner.nextInt();

                // Checking if user inputs 99 as this is the key to sending in an empty array
                if (input == 99) {
                    break;
                }

                // Checking if user input is 0 as this ends the user input. Adds 0 to the array as well
                if (input == 0) {
                    intArray.add(input);
                    break;
                } else {
                    intArray.add(input);
                }
            }

            // catching our invalid user input and throwing an exception with prompt. We clear the
            // input and restart loop
            catch (Exception e) {
                System.out.println("Please Enter An Integer Only");
                scanner.nextLine();
                start = true;

            }
        }

        // Output of the arrayList using our getUserArray() method that stores user arrayList
        System.out.println("Your User ArrayList Is: " + getUserArray(intArray));

        // Printing the max value of the arrayList or 0 if empty
        System.out.println(max(intArray));


    }
}
