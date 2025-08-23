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
// 👉 Calc is the "parent/base class" (also called Superclass).
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
// 👉 AdvancedCalc is a "child/derived class" of Calc.
// It inherits add() and sub() from Calc, and also defines new methods (mult and div).

// -------------------- GRANDCHILD CLASS --------------------
class ScientificCalc extends AdvancedCalc {
  // ScientificCalc is extending AdvancedCalc.
  // This means it indirectly inherits methods from Calc as well.
  // So, ScientificCalc can access:
  // - add(), sub() → from Calc (grandparent)
  // - mult(), div() → from AdvancedCalc (parent)
  // - power() → its own method

  public double power(int n1, int n2) {
    return Math.pow(n1, n2); // Math.pow() returns n1 raised to power n2
  }
}
// 👉 ScientificCalc is the "grandchild class" (subclass of AdvancedCalc).
// It demonstrates **Multi-level Inheritance**:
// Calc → AdvancedCalc → ScientificCalc


// -------------------- MAIN CLASS --------------------
public class MultiLevel_Inheritance {
  public static void main(String[] args) {

    // Creating object of ScientificCalc (grandchild class)
    ScientificCalc obj = new ScientificCalc();

    // Since ScientificCalc extends AdvancedCalc, which extends Calc:
    // 👉 obj can use:
    // - methods from Calc: add(), sub()
    // - methods from AdvancedCalc: mult(), div()
    // - its own method: power()

    int res1 = obj.add(5, 4);     // add() from Calc (grandparent)
    int res2 = obj.sub(7, 4);     // sub() from Calc (grandparent)
    int res3 = obj.mult(4, 7);    // mult() from AdvancedCalc (parent)
    int res4 = obj.div(8, 2);     // div() from AdvancedCalc (parent)
    double res5 = obj.power(4, 2); // power() from ScientificCalc (child)

    // Print results
    System.out.println(res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5);
    // Output: 9 3 28 4 16.0
  }
}

/*
⚡ Multi-Level Inheritance Explanation:
--------------------------------------
1. Multi-level inheritance means inheritance across multiple levels:
   - Calc → AdvancedCalc → ScientificCalc
   (Grandparent → Parent → Child)

2. Flow of inheritance:
   - Calc defines add() and sub().
   - AdvancedCalc inherits add() & sub() from Calc, 
     and also adds mult() & div().
   - ScientificCalc inherits everything from AdvancedCalc (so also from Calc),
     and adds its own method power().

3. Advantages:
   ✅ Code reusability (don’t rewrite add() and sub()).
   ✅ Extensibility (we can keep building more specialized classes).
   ✅ Cleaner hierarchy (basic → advanced → scientific).

So ScientificCalc object has access to:
✔ Parent + Grandparent methods + Its own methods.
*/
