/*
Travis Nickerson
CSD 405
July 15th, 2021
Assignment 9: Lambda
*/

// Creating a functional interface with one method
interface Adding {
    //add method
    int add(int a, int b);
}

// public class
public class LambdaExample {
    public static void main(String[] args) {

        // how we would use our functional interface method without lambda
        Adding adding = new Adding() {
            //overriding our add method and returning result of a+b
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        // printing our result of add method with arguments 10 and 20 passed in
        System.out.println(adding.add(10, 20));

        // using a lambda expression to get the same result
        Adding lambdaAdd = (a,b) -> (a + b);

        // printing the lambda expression result
        System.out.println(lambdaAdd.add(10,20));
    }
}
