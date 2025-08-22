

// A simple class to demonstrate Constructors
class Human {

    private int age;
    private String name;

    // 1️⃣ Default Constructor
    // A constructor that does not take any parameters.
    // If you don’t define ANY constructor, Java automatically provides
    // a default constructor (with no parameters).
    // But if you define your own constructor, Java will not create one for you.
    public Human() {
        System.out.println("Default Constructor Called ✅");
        age = 0;
        name = "Unknown";
    }

    // 2️⃣ Parameterized Constructor
    // Constructor with parameters → used to initialize objects with values
    public Human(int age, String name) {
        System.out.println("Parameterized Constructor Called ✅");
        this.age = age;       // "this" refers to the current object
        this.name = name;
    }

    // 3️⃣ Copy Constructor (Custom Made)
    // Java does not provide built-in copy constructors, but you can create one manually.
    public Human(Human obj) {
        System.out.println("Copy Constructor Called ✅");
        this.age = obj.age;     // copying age from another object
        this.name = obj.name;   // copying name from another object
    }

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

// Demo class to test constructors
public class Constructor {
    public static void main(String[] args) {

        // 1️⃣ Using Default Constructor
        Human obj1 = new Human();  
        System.out.println("Obj1 -> " + obj1.getName() + " : " + obj1.getAge());

        // 2️⃣ Using Parameterized Constructor
        Human obj2 = new Human(25, "Reddy");  
        System.out.println("Obj2 -> " + obj2.getName() + " : " + obj2.getAge());

        // 3️⃣ Using Copy Constructor
        Human obj3 = new Human(obj2); 
        System.out.println("Obj3 -> " + obj3.getName() + " : " + obj3.getAge());
    }
}
