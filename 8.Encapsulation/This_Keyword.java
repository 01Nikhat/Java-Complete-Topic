class Human
{
    // private variables → encapsulation (cannot be accessed directly outside this class)
    private int age;
    private String name;
    
    // Getter method for age → allows controlled access to private variable 'age'
    public int getAge()
    {
        return age; // returns the current value of age for the calling object
    }

    // Setter method for age (Version 1)
    public void SetAge(int age, Human obj)
    {
        /*
         Here we are passing a Human object (obj) into the method. 
         Inside the method, we are creating another reference obj1 
         and assigning it to obj (both point to the SAME object in memory).
         
         Then we set obj1.age = age, which indirectly sets obj.age = age.
         This works because obj1 and obj point to the same object.
        */

        Human obj1 = obj;   // obj1 is pointing to the same object as obj
        obj1.age = age;     // modifies the private variable of that object
    }
    
    /*
    Setter method for age (Version 2 - more common way)
    public void SetAge(int age)
    {
        this.age = age;
    }
    */

    // Getter method for name
    public String getName()
    {
        return name;  // returns the current value of name
    }

    // Setter method for name
    public void setName(String name)
    {
        /*
         Here 'this' is used. 
         'this' always refers to the current object that called the method.
         
         Example:
         obj.setName("Reddy");
         → inside this method, 'this' refers to 'obj'.
         → so 'this.name = name' means 'obj.name = "Reddy"'.
        */
        this.name = name;  
    }
    
    /*
    Alternate version:
    public void setName(String n)
    {
        name = n; // this is valid too, because variable names are different (no ambiguity)
    }
    */
}

public class This_Keyword {
    public static void main(String[] args)
    {
        // Creating an object of Human class
        Human obj = new Human();
        System.out.println();

        // Using SetAge method with object as parameter
        obj.SetAge(30, obj);  // passes obj into method, method sets age to 30

        // Using setName method
        obj.setName("Reddy"); // sets obj.name = "Reddy"

        // Printing name and age
        System.out.println(obj.getName() + " : " + obj.getAge()); 
        // Output: Reddy : 30
    }
}
