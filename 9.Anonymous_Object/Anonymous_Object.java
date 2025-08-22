class A
{
    // Constructor (runs automatically when object is created)
    public A()
    {
        System.out.println("object created");
    }

    // Normal method
    public void show()
    {
        System.out.println("in A show");
    }
}

public class Anonymous_Object
{
    public static void main(String a[]) 
    {
        int marks;
        marks = 99;

        // 🔹 Anonymous Object Example 1
        // Here, "new A();" creates an object, so constructor is called.
        // But since we don’t store the reference in a variable,
        // we cannot use this object again. (Object becomes unreachable after this line)
        new A();  

        // 🔹 Anonymous Object Example 2
        // Here, "new A().show();" creates an object and immediately calls 'show()'.
        // The object exists only for this statement.
        // After execution, no reference is kept → object is ready for Garbage Collection.
        new A().show();  

        // 🔹 Normal Object Creation
        // Here, we create an object and store its reference in 'obj'.
        A obj;        // Declare a reference variable (does not hold any object yet)
        obj = new A();// Create an object & assign its address to 'obj'
        
        // Now we can use 'obj' multiple times because the reference is stored.
        obj.show();   
        obj.show();   // can call again and again
    }
}
