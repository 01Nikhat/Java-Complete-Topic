
/*
 🔹 Method Overloading in Java:
    → Method overloading means defining multiple methods 
      in the same class with the **same method name** but 
      **different parameter lists** (different number or type of arguments).
    → It increases code readability and reusability.
*/

class Calculator {
    
    // Method with 3 integer parameters
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;  // returns sum of three integers
    }

    // Method with 2 integer parameters
    public int add(int n1, int n2) {
        return n1 + n2;  // returns sum of two integers
    }

    // Method with 1 double and 1 integer parameter
    public double add(double n1, int n2) {
        return n1 + n2;  // returns sum (double + int → double result)
    }
}

public class Method_OverLoading {
    public static void main(String[] args) {
        
        // Creating an object of Calculator class
        Calculator obj = new Calculator();
        
        // Calls add(int, int) method → because we passed 2 integers
        int r1 = obj.add(3, 4);
        System.out.println("Sum of two integers: " + r1);

        // Calls add(int, int, int) method → because we passed 3 integers
        int r2 = obj.add(10, 20, 30);
        System.out.println("Sum of three integers: " + r2);

        // Calls add(double, int) method → because we passed double + int
        double r3 = obj.add(5.5, 10);
        System.out.println("Sum of double and integer: " + r3);
    }
}
