// ✅ Method Overriding in Java
// ----------------------------------------------------
// 👉 Method Overriding occurs when a child class (subclass)
//    provides its own implementation of a method that is 
//    already defined in the parent class (superclass).
//
// 👉 Rules of Method Overriding:
//    1. Method name must be the same.
//    2. Parameters (number & type) must be the same.
//    3. Return type must be the same (or covariant in case of objects).
//    4. Access modifier should not be more restrictive than parent’s.
//    5. Happens only in Inheritance (child extends parent).
//
// 👉 Why use overriding?
//    - To provide specific implementation for child class.
//    - To achieve runtime polymorphism (dynamic method dispatch).

// ---------------- PARENT CLASS -----------------
class A {

  // Parent method
  public void show() {
    System.out.println("in A"); // Default behavior from parent
  }

  // Another method (not overridden in child)
  public int sum(int n1, int n2) {
    return n1 + n2; // This will be inherited as it is
  }
}

// ---------------- CHILD CLASS -----------------
class B extends A { // B is inheriting from A

  // 🔹 Overriding the show() method from A
  @Override // <-- (annotation) tells compiler this method overrides a parent method
  public void show() {
    System.out.println("in B"); 
    // This replaces parent’s "in A" when called from B object
  }

  // Note: We did not override sum() method here,
  // so sum() from class A will be used by objects of class B.
}

// ---------------- MAIN CLASS -----------------
public class Method_OverRiding {
  public static void main(String[] args) {
    
    // ✅ Case 1: Object of child class
    B obj = new B();

    // Calls show() → since it's overridden in B,
    // it will NOT call parent's show(), it will call B's version.
    obj.show(); // Output: "in B"

    // Calls sum() → since sum() is NOT overridden in B,
    // it will use parent class (A)'s implementation.
    int res = obj.sum(5, 3);

    System.out.println(res); // Output: 8

    // ✅ This shows method overriding in action:
    // - show() → overridden → executes child class version.
    // - sum()  → inherited → executes parent class version.
  }
}
