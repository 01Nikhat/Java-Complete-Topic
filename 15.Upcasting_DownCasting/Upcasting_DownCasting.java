// Parent class
class A {
    public void show1() {
        System.out.println("in A show");
    }
}

// Child class B extends A
class B extends A {
    public void show2() {
        System.out.println("in show B");
    }
}

/*
 * ================================
 * UPCASTING & DOWNCASTING CONCEPT
 * ================================
 *
 * Upcasting:
 *   - Reference of parent class (A) can point to child object (B).
 *   - This is safe and implicit.
 *   - But, parent reference can only call parent methods.
 *
 * Downcasting:
 *   - Converting back the parent reference (pointing to child) into child reference.
 *   - This is explicit (we need to cast).
 *   - Once downcasted, we can access child methods as well.
 *
 * ---------------------
 * MEMORY REPRESENTATION
 * ---------------------
 *
 *   B object in heap:
 *
 *          +---------------------+
 *   obj →  |   show1() from A    |
 *          |   show2() from B    |
 *          +---------------------+
 *
 *   When Upcasting (A obj = new B();):
 *          obj can only see methods of A (show1()).
 *
 *   When Downcasting (B obj1 = (B)obj;):
 *          obj1 now sees both show1() and show2().
 */

public class Upcasting_DownCasting {
    public static void main(String[] args) {

        // Example of primitive type casting
        // double d = 4.5;
        // int i = (int) d;  // explicit narrowing
        // System.out.println(i); // prints 4 (decimal part lost)

        // =========================
        // UPCASTING
        // =========================
        A obj = new B();   // Parent ref → Child object (safe, implicit casting)
        obj.show1();       // Allowed (method from A)
        // obj.show2();    // ❌ Not allowed (compiler sees obj as type A)

        // =========================
        // DOWNCASTING
        // =========================
        B obj1 = (B) obj;  // Explicit casting (Parent ref → Child ref)
        obj1.show2();      // Now we can access child method
        obj1.show1();      // Also still can access parent method
    }
}
