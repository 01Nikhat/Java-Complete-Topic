/*
 🔹 Stack vs Heap in Java Memory

 ➡ Stack:
    - Stores local variables (inside methods)
    - Stores references (addresses) to objects in heap
    - Follows LIFO (Last In First Out)
    - Each thread has its own stack

 ➡ Heap:
    - Stores objects created using 'new'
    - Stores instance variables of objects
    - Shared across all threads

 In this example:
   - Local variables (data, obj, obj1, r1) → stored in Stack
   - Objects (Calculator instances) → stored in Heap
   - Instance variable 'num' → stored inside Heap, as part of each object
   - Method 'add()' → code resides in Method Area, but local execution (n1, n2) is in Stack
*/

class Calculator {
    int num = 5;  // Instance variable (stored in Heap, inside object)

    // Method stored in Method Area (code), but local variables are in Stack
    public int add(int n1, int n2) {
        // n1, n2 are local variables (Stack)
        System.out.println(num); // Accessing 'num' from Heap object
        return n1 + n2;          // Result stored in Stack
    }
}

public class Stack_Heap {
    public static void main(String[] args) {
        int data = 10;                  // Local variable → Stack

        Calculator obj = new Calculator();  // 'obj' reference → Stack, Object → Heap
        Calculator obj1 = new Calculator(); // 'obj1' reference → Stack, Object → Heap

        int r1 = obj.add(3, 4); // n1=3, n2=4 → Stack, 
                                // obj refers to Heap object where num=5

        obj.num = 8; // Changes num value inside obj's Heap object

        System.out.println(obj.num);  // Prints 8 (Heap value updated)
        System.out.println(obj1.num); // Prints 5 (separate Heap object)
    }
}

/*
 ------------------ MEMORY DIAGRAM ------------------

                 STACK (main thread)                    HEAP
  ┌───────────────────────────────┐       ┌───────────────────────────────┐
  │ main() frame                   │      │ Calculator object #101      │
  │ ─────────────────────────────  │      │   num = 5 (updated value 8)    │
  │ data = 10                      │      └───────────────────────────────┘
  │ obj  → ref#101 ────────────────┼────▶ │ Calculator object #102      │
  │ obj1 → ref#102 ────────────────┼────▶ │   num = 5                     │
  │ r1 = ? (waiting for add)       │       └───────────────────────────────┘
  └───────────────────────────────┘
  │ add() frame                    │
  │ ─────────────────────────────  │
  │ n1 = 3                         │
  │ n2 = 4                         │
  │ return → n1+n2 = 7             │
  └───────────────────────────────┘


 Method Area (shared):
   - Bytecode of class Calculator
   - Bytecode of class Stack_Heap
   - Method definitions (add(), main())

-----------------------------------------------------

 🔹 Explanation:
 - `data`, `obj`, `obj1`, `r1`, `n1`, `n2` → Stack
 - `new Calculator()` objects → Heap
 - Each object has its own copy of `num`
 - Changing obj.num does NOT affect obj1.num
*/
