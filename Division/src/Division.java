/*
Travis Nickerson
CSD 405
July 2nd, 2021
Assignment 6
Goal:
-Create an abstract Division class with fields for a company's division name and account number, and an abstract
display() method that will be defined in the subclasses.
-Use a constructor in the superclass that requires values for both fields.
-Create two subclasses named InternationalDivision and DomesticDivision.
-The InternationalDivision class includes a field for the country in which the division is located, a field for the
language spoken, and a constructor that requires all fields when created.
-The DomesticDivision class includes a field for the state in which the division is located and a constructor that
requires all fields when created.
-Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
-Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
 */

// Division class that holds the structure for our International and Domestic classes
public abstract class Division {

    // Declaring our variables for division name and account number. All divisions will contain these
    String divisionName;
    int accountNumber;
    int employeeNum;

    // Our display method that will be overridden when used by our subclasses
    public abstract void display();

    // Constructor for our Superclass that takes in division name and account number
    public Division(String divisionName, int accountNumber, int employeeNum) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
        this.employeeNum = employeeNum;
    }


}
