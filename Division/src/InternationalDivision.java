// Creating an International Division class that extends our Superclass of Division
class InternationalDivision extends Division{

    // Our Subclass inherits the variables of our superclass in addition the our country and language
    // variables
    String country;
    String language;

    // Creating a constructor for our InternationalDivision. This takes in our Superclass parameters and our
    // InternationalDivision Class variables
    public InternationalDivision(String divisionName, int accountNumber, int employeeNum, String country, String language) {

        // Assigning our superclass parameters as well as class parameters
        super(divisionName, accountNumber, employeeNum);
        this.country = country;
        this.language = language;
    }

    // This is our overridden display method that will show us the proper output for this class
    @Override
    public void display() {
        System.out.println("International Division:\n");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println("Employee Number: " + employeeNum);
        System.out.println();

    }
}
