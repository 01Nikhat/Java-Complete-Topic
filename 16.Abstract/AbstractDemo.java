/*
------------------------------------------
💡 ABSTRACT CLASS (Definition & Notes)
------------------------------------------
1. An abstract class in Java is a class declared with the keyword "abstract".
   - It can have both abstract methods (no body) and concrete methods (with body).
   - Abstract methods are meant to be implemented by child classes.
   - You cannot create objects of abstract classes directly.

2. Why use Abstract Classes?
   - To provide a common base with some shared functionality (like playMusic()).
   - To enforce child classes to implement specific methods (like drive() & fly()).

3. Key Rules:
   - If a class has even 1 abstract method, the class must be declared abstract.
   - Subclasses must either implement all abstract methods OR be abstract themselves.
   - Abstract classes can have constructors, variables, and concrete methods.

------------------------------------------
💡 Code Walkthrough
------------------------------------------
Step 1 → Car (abstract class)
   - Declares abstract methods: drive(), fly()
   - Defines normal method: playMusic()

Step 2 → WagnoR (abstract class)
   - Extends Car
   - Implements drive() method
   - But doesn’t implement fly(), so it remains abstract

Step 3 → UpdateWagnoR (concrete class)
   - Extends WagnoR
   - Implements fly() method
   - Now it has all methods → so it becomes a concrete (normal) class

Step 4 → main()
   - Car obj = new UpdateWagnoR(); // polymorphism
   - Calls drive(), playMusic(), fly() (fly if added in code)

------------------------------------------
*/

abstract class Car {
    // Abstract methods → no body, must be implemented by child classes
    public abstract void drive();
    public abstract void fly();

    // Concrete method → can be directly inherited and used by child classes
    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagnoR extends Car {
    // Implementing only drive() method
    public void drive() {
        System.out.println("Driving...");
    }
    // fly() is not implemented, so WagnoR stays abstract
}

class UpdateWagnoR extends WagnoR {  // concrete class
    // Must implement fly(), otherwise it will also be abstract
    public void fly() {
        System.out.println("Flying...");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // ❌ Car obj = new Car();        // Error: cannot instantiate abstract class
        // ❌ Car obj = new WagnoR();     // Error: still abstract (fly not implemented)
        
        // ✅ Concrete class object (polymorphism: reference type = abstract class)
        Car obj = new UpdateWagnoR();

        obj.drive();      // calls UpdateWagnoR -> WagnoR's implementation
        obj.playMusic();  // calls Car's concrete method
        obj.fly();        // calls UpdateWagnoR's implementation
    }
}
