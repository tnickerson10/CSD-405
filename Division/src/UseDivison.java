// Creating an UseDivision class that extends our Superclass of Division
// This is where we create our instances of our two concrete classes
class UseDivision extends Division {

    // We must have a display method from our abstract class even if it isn't called in this
    // program
    @Override
    public void display() {

    }

    // We must have a constructor for our UseDivision class. It takes in our superclass parameters.
    // This constructor is not used for this specific program but it is required due to the abstract
    // class
    public UseDivision(String divisionName, int accountNumber, int employeeNum) {
        super(divisionName, accountNumber, employeeNum);
    }

    public static void main(String[] args) {

        // Creating our 4 instances (2 of InternationalDivision and 2 of Domestic Division)
        InternationalDivision intDiv1 = new InternationalDivision("Asia", 1234, 675,
                "Japan", "Japanese");
        InternationalDivision intDiv2 = new InternationalDivision("Europe", 2345, 555,
                "France", "French");
        InternationalDivision intDiv3 = new InternationalDivision("South America", 73636, 77,
                "Brazil", "Portuguese");
        DomesticDivision domDiv1 = new DomesticDivision("United States", 8675309, 875,
                "Nebraska");
        DomesticDivision domDiv2 = new DomesticDivision("United States", 9035768, 346,
                "Hawaii");
        DomesticDivision domDiv3 = new DomesticDivision("United States", 765848, 88,"Alaska"
                );

        // Calling our overridden display methods from our instances on our concrete classes
        intDiv1.display();
        intDiv2.display();
        intDiv3.display();
        domDiv1.display();
        domDiv2.display();
        domDiv3.display();
    }

}
