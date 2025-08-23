// ✅ Inheritance in Java:
// Inheritance is a mechanism where one class (child/derived class) 
// can use the properties (methods & variables) of another class (parent/base class).
// It helps in code reusability and method extension (adding new features).

// -------------------- PARENT CLASS (Base Class / Superclass) --------------------
class Calc {

  // Method to perform addition
  public int add(int n1, int n2) {
    return n1 + n2;
  }

  // Method to perform subtraction
  public int sub(int n1, int n2) {
    return n1 - n2;
  }
}
// Here, Calc is the "parent/base class". 
// It provides basic calculator operations (add and subtract).

// -------------------- CHILD CLASS (Derived Class / Subclass) --------------------
class AdvancedCalc extends Calc {
  // The keyword "extends" means AdvancedCalc is inheriting Calc.
  // So, AdvancedCalc gets access to add() and sub() methods from Calc automatically.

  // Method to perform multiplication
  public int mult(int n1, int n2) {
    return n1 * n2;
  }

  // Method to perform division
  public int div(int n1, int n2) {
    return n1 / n2;
  }
}
// AdvancedCalc is the "child/derived class". 
// It inherits add() and sub() from Calc, and also defines its own methods (mult and div).

// -------------------- MAIN CLASS --------------------
public class Inheritance {
  public static void main(String[] args) {

    // Creating object of AdvancedCalc (child class)
    AdvancedCalc obj = new AdvancedCalc();

    // Since AdvancedCalc extends Calc:
    // 👉 obj can use both parent class methods (add, sub) 
    //    and child class methods (mult, div)

    int res1 = obj.add(5, 4);   // add() method is inherited from Calc
    int res2 = obj.sub(7, 4);   // sub() method is also inherited from Calc
    int res3 = obj.mult(4, 7);  // mult() method is defined in AdvancedCalc
    int res4 = obj.div(8, 2);   // div() method is also defined in AdvancedCalc

    // Print results
    System.out.println(res1 + " " + res2 + " " + res3 + " " + res4);
    // Output: 9 3 28 4
  }
}

/*
⚡ How It Works:
1. The "extends" keyword makes AdvancedCalc a child of Calc.
2. AdvancedCalc inherits add() and sub() methods from Calc.
3. AdvancedCalc also has its own methods: mult() and div().
4. When we create an object of AdvancedCalc (obj), it can call:
   - Parent methods: add(), sub()
   - Child methods: mult(), div()
5. This demonstrates "code reusability" because we don’t rewrite add and sub again.
*/
