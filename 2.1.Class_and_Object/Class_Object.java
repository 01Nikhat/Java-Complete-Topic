
class Calculator{ // java allow only one public class whihch must be similar to file name so it's not allowed public class Calculator
  public int Sum(int n1, int n2){
    return n1 + n2;
  }
}
public class Class_Object {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 89;
    Calculator obj = new Calculator();
    int result  = obj.Sum(num1, num2);
    System.out.println(result);
  }
}
/*  1️⃣ Class in Java

👉 A class is a blueprint or template for creating objects.
👉 It defines attributes (fields/variables) and behaviors (methods/functions) of an object.
👉 A class does not occupy memory until an object is created. */

/*
 2️⃣ Object in Java

👉 An object is an instance of a class.
👉 It represents a real-world entity (like a car, student, employee).
👉 Objects occupy memory and allow us to use the variables and methods defined in the class.
 */

 /*
  * Class → Defines properties + behaviors.

   * Object → Represents a real entity with its own properties (data/state) and can perform behaviors  (methods).
   
  */

  /*
   *    ┌─────────────────────────┐
        │        CLASS            │
        │   (Blueprint / Design)  │
        ├─────────────────────────┤
        │ Properties (Fields):    │
        │   - color               │
        │   - model               │
        │                         │
        │ Behaviors (Methods):    │
        │   - drive()             │
        │   - brake()             │
        └─────────────────────────┘
                   │
                   │  (create object)
                   ▼
        ┌─────────────────────────┐
        │        OBJECT           │
        │   (Real Instance)       │
        ├─────────────────────────┤
        │ Properties:             │
        │   color = "Red"         │
        │   model = "BMW"         │
        │                         │
        │ Behaviors:              │
        │   drive() → "BMW is     │
        │   driving..."           │
        │   brake() → "BMW has    │
        │   stopped."             │
        └─────────────────────────┘

   */