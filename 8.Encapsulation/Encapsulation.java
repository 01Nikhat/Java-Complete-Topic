// Encapsulation Example in Java

// ✅ Encapsulation → Definition:
// Encapsulation is the process of wrapping (binding) the data (variables) and 
// the methods (functions) that operate on the data into a single unit (class).
// It also restricts direct access to some of the object's components, 
// which is why we make variables PRIVATE and access them using PUBLIC getter/setter methods.

// ---------------------------- CLASS ----------------------------
class Human {

    // 🔒 Step 1: Make variables PRIVATE (data hiding)
    private int number;       // Account number is private → cannot be accessed directly outside class
    private String gender;    // Gender is private
    String name = "Nikhat";   // Here name is public (default package access), 
                              // but ideally this should also be private for full encapsulation

    // ---------------------------- SETTER ----------------------------
    // Setter Method → Used to SET / update the value of private variable
    // Naming Convention → Always starts with 'set' + VariableName (CamelCase)
    public void setAccountNumber(int n) {
        number = n; // 'this.number = n;' is also valid if variable names are same
    }

    public void setGender(String g) {
        gender = g;
    }

    // ---------------------------- GETTER ----------------------------
    // Getter Method → Used to GET / read the value of private variable
    // Naming Convention → Always starts with 'get' + VariableName (CamelCase)
    public int getAccountNumber() {
        return number;
    }

    public String getGender() {
        return gender;
    }
}

// ---------------------------- MAIN CLASS ----------------------------
public class Encapsulation {
    public static void main(String[] args) {
        
        // ✅ Step 2: Create object of Human class
        Human obj = new Human();

        // ✅ Step 3: Access private variables using SETTER methods
        obj.setAccountNumber(123457);  // Setting account number
        obj.setGender("F");            // Setting gender

        // ✅ Step 4: Access private variables using GETTER methods
        System.out.println(
            obj.name + " : " + obj.getGender() + " : " + obj.getAccountNumber()
        );
    }
}

/*
---------------------------- NOTES ----------------------------

1. Why Encapsulation?
   - Provides data security (sensitive data cannot be accessed directly)
   - Controlled access (only through getters/setters)
   - Makes code more maintainable and flexible

2. How Getter/Setter Works?
   - Setter → sets/updates value in private variable
   - Getter → retrieves value from private variable
   - Example:
       obj.setGender("F");   // store "F" inside private variable gender
       obj.getGender();      // return the value of gender → "F"

3. Naming Convention:
   - Variable name → camelCase (accountNumber, gender)
   - Getter → getVariableName() → getAccountNumber()
   - Setter → setVariableName() → setAccountNumber()

4. Good Practice:
   - Always keep instance variables private
   - Always use getters/setters to access/modify values
   - This hides implementation details and provides controlled access
*/
