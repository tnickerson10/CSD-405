/* Travis Nickerson
   CSD 405
   June 11th, 2021
   Assignment 2
   Goal: Create A UseFan Class and Create a collection of Fan instances.
         Create a method taking a collection of Fan instances for displaying without using the toString() method.
         Create a method that takes a single instance of a Fan for displaying without using the toString() method.
 */

import java.util.ArrayList;

// Create Fan Class
public class Fan {

    // Creation of static final variables of the fan speed. These are set as static final so they
    // are constant and can be accessed by the main method
    private static final int stopped = 0;
    private static final int slow = 1;
    private static final int medium = 2;
    private static final int fast = 3;

    // Creation of default fan variables of Fan Class. These are set to public for  all class use
    private int speed;
    private boolean on;
    private int radius;
    private String color;


    // Setting values for the default fan object. This is a constructor that takes no arguments
    public Fan() {
        speed = stopped;
        on = false;
        radius = 6;
        color = "White";
    }

    // Creating a constructor that takes in our arguments for Fan objects
    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Creation of getters and setters for the Fan objects.
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Creation of a custom toString() method for the constructor that will take arguments
    public String toString() {
        return "\nSpeed: " + speed + "\nOn: " + on + "\nRadius: " + radius + "\nColor: " + color;
    }

    public static void main(String[] args) {

        // Creating a new Fan object with the constructor that takes no arguments
        Fan defaultFan = new Fan();

        // Setting the default Fan object using setters. This shows the setters are functioning
        defaultFan.setSpeed(stopped);
        defaultFan.setOn(false);
        defaultFan.setRadius(6);
        defaultFan.setColor("White");

        // Printing the default Fan object using getters. This shows the getters are functioning
        System.out.println("The Default Fan");
        System.out.println("Speed: " + defaultFan.getSpeed());
        System.out.println("On: " + defaultFan.isOn());
        System.out.println("Radius: " + defaultFan.getRadius());
        System.out.println("Color: " + defaultFan.getColor());

        // Calling addFans method to make sure the fan objects have been added to collectionOfFans
        UseFan.addFans();

        // Calling the method printCollectionOfFans and passing in the collectionOfFans
        UseFan.printCollectionOfFans(UseFan.collectionOfFans);

        // Calling the method printSingleFan and passing in a single fan object
        UseFan.printSingleFan(UseFan.f2);

    }
}

// Creation of the UseFan class
class UseFan {

    // Creation of a Collection of Fans named "collectionOfFans"
    static ArrayList<Fan> collectionOfFans = new ArrayList<>();

    // Creating new fan objects from a Fan constructor with given parameters
    static Fan f1 = new Fan(1, true, 8, "Red");
    static Fan f2 = new Fan(2, true, 5, "White");
    static Fan f3 = new Fan(3, true, 4, "Blue");
    static Fan f4 = new Fan(1, true, 9, "Green");
    static Fan f5 = new Fan(0, false, 11, "Yellow");

    // Creating a method for Adding fan objects to the collection of Fans named "collectionOfFans"
    public static void addFans() {
        collectionOfFans.add(f1);
        collectionOfFans.add(f2);
        collectionOfFans.add(f3);
        collectionOfFans.add(f4);
        collectionOfFans.add(f5);
    }

    // Method for taking in our collectionOfFans and printing the collection
    public static void printCollectionOfFans(ArrayList collection) {

        System.out.print("\nOur Collection of Fans:");

        // Initialize fan number count for display in collection
        int fanNum = 1;

        // For loop to iterate over the objects in collectionOfFans to display neatly
        for(Object f: collectionOfFans){
            System.out.print("\nFan Number: " + fanNum);
            System.out.print(f + "\n");
            fanNum++;
        }
    }

    // Method for taking a single fan object from our collectionOfFans collection and printing the fan object
    public static void printSingleFan(Fan fanNumber) {

        // Printing the single fan object 
        System.out.println("\nSelected Single Fan: " + fanNumber);
    }
}
