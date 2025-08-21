public class StringSample {
  public static void main(String[] args) {
    
    // Creating String using new keyword:
    // Here, "nikhat" goes inside String Constant Pool (SCP).
    // But 'new String("nikhat")' forces a new object to be created in the HEAP memory.
    // So now we have:
    //  - One "nikhat" in SCP
    //  - One "nikhat" in heap (referenced by 'name')
    String name = new String("nikhat");
    
    // Another way (recommended):
    // String name = "nikhat";
    // In this case, only one object is created inside SCP (if not already present).
    
    System.out.println(name);  // prints "nikhat"
    System.out.println(name.hashCode()); // prints hash code based on characters

    
    // concat() method does NOT modify the existing string.
    // Because Strings in Java are IMMUTABLE.
    // It creates a NEW String object in heap and returns it.
    // The original 'name' object remains unchanged unless reassigned.
    System.out.println(name.concat(" parvin")); // creates new string "nikhat parvin"

    // Reassignment example:
    // Here 'name + "parvin"' creates a new string object in heap, 
    // and now 'name' reference is updated to point to that new object.
    name = name + "parvin"; 
    System.out.println("hello " + name); // hello nikhatparvin


    // String literals example:
    // Both s1 and s2 point to the SAME object in SCP because "Nikhat" is already present.
    String s1 = "Nikhat";
    String s2 = "Nikhat";

    // == compares memory addresses (references), not content.
    // Since both s1 and s2 point to the same SCP object, it prints true.
    System.out.println(s1 == s2); // true

    // hashCode() returns same value because content is same
    System.out.println(s1.hashCode()); 
    System.out.println(s2.hashCode()); 

    

/* 
    Heap Memory
 ┌───────────────────────────────────┐
 │   new String("nikhat") → #101     │  ← 'name' reference
 │   "nikhatparvin" (new object) → #102 (after concatenation name refering to new address where nikhatparvin stored )
 │                                   │
 │   SCP (inside Heap)               │
 │   ┌─────────────────────────────┐ │
 │   │   "nikhat" (literal) → #201 │ │
 │   │   "Nikhat" (literal) → #202 │ │
 │   └─────────────────────────────┘ │
 └───────────────────────────────────┘

Variables:
 name → #102 ("nikhatparvin")
 s1   → #202 ("Nikhat")
 s2   → #202 ("Nikhat")   (same as s1)
*/

    // NOTE:
    // If you had used:
    // String s1 = new String ("Nikhat");
    // String s2 = new String ("Nikhat");
    // Then == would give false, because one object is in heap, and another is in SCP.  

    /* 
                    [Heap Memory]                           [String Constant Pool (SCP)]
        ┌───────────────────────────┐          ┌───────────────────────────────┐
        │   s1 ────────────────┐    │          │   "Nikhat" (literal)          │
        │   ┌───────────────┐  │    │          └───────────────────────────────┘
        │   │  "Nikhat"     │  │    │
        │   │(Heap Object #1│──┘    │
        │   └───────────────┘       │
        │                           │
        │   s2 ────────────────┐    │
        │   ┌───────────────┐  │    │
        │   │  "Nikhat"     │  │    │
        │   │(Heap Object #2│──┘    │
        │   └───────────────┘       │
        └───────────────────────────┘

        "Nikhat" is stored in SCP (once).

        s1 → refers to a new object "Nikhat" in heap (which internally points to SCP "Nikhat").
        s2 → again creates another new object "Nikhat" in heap (again internally pointing to SCP "Nikhat").
    */  
  }
}
