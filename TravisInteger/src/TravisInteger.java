/*
    Travis Nickerson
    CSD 405
    June 18th, 2021
    Assignment 3
    Goal: Create 3 methods isEven(), isOdd(), isPrime() to test if true and override them with (int) and
    (*Integer), create an equals(int) and equals(*Integer) method to compare if they are equal.
*/


public class TravisInteger {

    // Declaring int variable with my name to be used as a reference and passed into
    // methods and returned for getter()
    private int travis;

    // Constructor for our objects. Takes an int
    public TravisInteger(int value) {
        travis = value;
    }

    // Getter method to grab our values passed into our methods
    public int getTravis() {
        return travis;
    }

    // Method to check if value of object is even. No parameter
    public boolean isEven(){

        if(travis % 2 == 0) {
            return true;
        }
        return false;
    }

    // Method to check if value of object is odd. No parameter
    public boolean isOdd(){
        if(travis % 2 != 0) {
            return true;
        }
        return false;
    }

    // Method to check if value of object is prime. No parameter
    public boolean isPrime() {

        // Check if number is less than equal to 1
        if (travis <= 1)
            return false;

        // Check if number is 2
        else if (travis == 2)
            return true;

        // Check if number is a multiple of 2
        else if (travis % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(travis); i += 2)
        {
            if (travis % i == 0)
                return false;
        }
        return true;
    }

    // Method to check if int argument is even. Int parameter can be passed in
    public static boolean isEven(int initialValue){

        if(initialValue % 2 == 0) {
            return true;
        }
        return false;
    }

    // Method to check if int argument is odd. Int parameter can be passed in
    public static boolean isOdd(int initialValue) {
        if(initialValue % 2 != 0) {
            return true;
        }
        return false;
    }

    // Method to check if int argument is prime. Int parameter can be passed in
    public static boolean isPrime(int initialValue) {

        // Check if number is less than or equal to 1
        if (initialValue <= 1)
            return false;

        // Check if number is 2
        else if (initialValue == 2)
            return true;

        // Check if number is a multiple of 2
        else if (initialValue % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(initialValue); i += 2)
        {
            if (initialValue % i == 0)
                return false;
        }
        return true;
    }

    // Method to check if object argument is even. Object parameter can be passed in
    public static boolean isEven(TravisInteger initialValue){
        return initialValue.isEven();
    }

    // Method to check if object argument is odd. Object parameter can be passed in
    public static boolean isOdd(TravisInteger initialValue){
        return initialValue.isOdd();
    }

    // Method to check if object argument is prime. Object parameter can be passed in
    public static boolean isPrime(TravisInteger initialValue) {
        return initialValue.isPrime();
    }

    // Method that compares two ints and checks for equality
    public boolean equals(int equalInt) {
        if(equalInt == travis) {
            return true;
        } return false;
    }

    // Method that compares two objects and checks for equality. Overrides the equals()
    public boolean equals(TravisInteger equalObj) {
        if( equalObj.travis == getTravis()) {
            return true;
        } return false;
    }

    public static void main(String[] args) {

        // Creates 1st new object
        TravisInteger initial = new TravisInteger(73);
        // Gets the value of object with getter() and displays if the value is even, odd
        // and prime
        System.out.println("The first value is: " + initial.getTravis());
        System.out.println("Is Even: " + initial.isEven());
        System.out.println("Is Odd: " + initial.isOdd());
        System.out.println("Is Prime: " + initial.isPrime());

        System.out.println();

        // Creates 2nd new object
        TravisInteger initial2 = new TravisInteger(73);

        // Gets the value of object with getter() and displays if the value is even, odd
        // and prime. The value passed in is the same per assignment
        System.out.println("The second value is: " + initial2.getTravis());
        System.out.println("Is Even: " + isEven(initial2.getTravis()));
        System.out.println("Is Odd: " + isOdd(initial2.getTravis()));
        System.out.println("Is Prime: " + isPrime(initial2.getTravis()));

        System.out.println();

        // Creates 3rd new object
        TravisInteger initial3 = new TravisInteger(66);

        // Gets the value of object with getter() and displays if the value is even, odd
        // and prime.
        System.out.println("The third value is: " + initial3.getTravis());
        System.out.println("Is Even: " + isEven(initial3));
        System.out.println("Is Odd: " + isOdd(initial3));
        System.out.println("Is Prime: " + isPrime(initial3));

        System.out.println();

        // Calls the equals(int) method and checks if object initial is equal to 12. Any number
        // can be passed in here to check
        System.out.println("Int Equality:");
        System.out.println(initial.equals(12));

        System.out.println();

        // Calls the equals(TravisInteger) method and checks if initial and initial2 objects are
        // equal. Any of the 3 objects created can be checked here
        // *** THIS IS A METHOD OVERRIDE OF EQUALS() ***
        System.out.println("Object Equality:");
        System.out.println(initial.equals(initial2.getTravis()));

    }
}
