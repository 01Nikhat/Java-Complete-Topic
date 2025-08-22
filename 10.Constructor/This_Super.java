// ================================
// Example of super() and this()
// ================================

// ---------- Class A (Parent / Superclass) ----------
class A
{
    // Default constructor of A
    public A() 
    {
        // super() here calls Object class constructor 
        // (since every class implicitly extends Object if no other parent is defined).
        super();  
        System.out.println("in A");   // Prints when default constructor is called
    }

    // Parameterized constructor of A
    public A(int n)
    {
        // Again calls Object's constructor
        super();  
        System.out.println("in A int");  // Prints when constructor with int is called
    }
}

// ---------- Class B (Child / Subclass of A) ----------
class B extends A
{
    // Default constructor of B
    public B()
    {
        // super() explicitly calls parent class constructor
        // If not written, compiler automatically inserts super();
        super();  
        System.out.println("in B");   // Executes after A() finishes
    }

    // Parameterized constructor of B
    public B(int n)
    {
        // Instead of calling parent constructor directly,
        // we call another constructor of SAME CLASS using this()
        // Here it calls B() constructor first.
        this();  
        System.out.println("in B int");  // Executes after B() finishes
    }
}

// ---------- Driver Class ----------
public class This_Super {
    public static void main(String[] args) 
    {
        // Case 1: Calling default constructor of B
        // Output sequence:
        //   in A   -> Parent constructor runs first
        //   in B   -> Then child constructor runs
        // B obj = new B();

        // Case 2: Calling parameterized constructor of B
        // Output sequence:
        //   in A   -> From B() constructor (called by this())
        //   in B   -> From B() constructor
        //   in B int -> After B() finishes, B(int) continues
        B obj = new B(5);
    }
}
