/*
    Travis Nickerson
    CSD 405
    JUne 23nd 2021
    Assignment 5
    Goal:Write a program to create a new file titled data.file, if the file does not exist. Then write to the new file,
     adding 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file. Each integer is
     to be separated by a space. Close the file, then reopen the file and read the data from the file and display it.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesProject {

    public static void main(String[] args) throws FileNotFoundException {

        // Creating a new file object
        File file1 = new File("data.txt");

        // Declaring a Print Writer and Scanner
        PrintWriter writer;
        Scanner sc;

        // setting our PrintWriter and passing in file1 to hold in the variable writer
        writer = new PrintWriter(file1);

        // Writing to the file For our random numbers
        writer.println("Random Numbers: ");

        // Writing our random numbers 1 - 100
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");
        writer.print((int) (Math.random() * 100) + 1 + " ");

        // closing our file
        writer.close();

        // creating a new scanner that holds file1
        sc = new Scanner(file1);

        // Using a while loop to display contents of file1
        while (sc.hasNext()) {
            System.out.print(sc.next() + " ");
        }

    }
}
