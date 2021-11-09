// Creating an Domestic Division class that extends our Superclass of Division
class DomesticDivision extends Division{

    // Our Subclass inherits the variables of our superclass in addition the our state variable
    String state;



    // Creating a constructor for our DomesticDivision. This takes in our Superclass parameters and our
    // DomesticDivision Class variables
    public DomesticDivision(String divisionName, int accountNumber, int employeeNum, String state) {

        // Assigning our superclass parameters as well as class parameters
        super(divisionName, accountNumber, employeeNum);
        this.state = state;

    }

    // This is our overridden display method that will show us the proper output for this class
    @Override
    public void display() {
        System.out.println("Domestic Division:\n");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println("Employee Number: " + employeeNum);
        System.out.println();

    }
}
