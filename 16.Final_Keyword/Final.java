// ---------------------- FINAL KEYWORD ----------------------
// final can be applied to:
// 1. variable → makes the variable constant (cannot be reassigned)
// 2. method   → prevents method overriding
// 3. class    → prevents inheritance (cannot extend the class)

// ---------------------- FINAL CLASS EXAMPLE ----------------------

// If we mark Calc as final, then no class can extend it.
// Uncomment below to see error: "The type AdvCalc cannot subclass the final class Calc"

// final class Calc
// {
//     public void show()
//     {
//         System.out.println("in Calc show");
//     }
//     public void add(int a, int b)
//     {
//         System.out.println(a+b);
//     }
// }

// ---------------------- FINAL METHOD EXAMPLE ----------------------

class Calc
{
    // final method → cannot be overridden in child classes
    public final void show()
    {
        System.out.println("By Nikhat"); // fixed behavior
    }

    // normal method → can be overridden in child class
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

// AdvCalc is extending Calc because Calc is not final here
class AdvCalc extends Calc
{
    // If we try to override show(), compiler gives ERROR
    // Because show() is marked as final in Calc class
    
//     @Override
//     public void show()
//     {
//         System.out.println("By John");
//     }
    
    // But we can override add() if needed (because it's not final)
   
    public void add(int a, int b)
    {
        System.out.println("Sum from AdvCalc: " + (a+b));
    }
}

// ---------------------- FINAL VARIABLE EXAMPLE ----------------------

public class Final
{
    public static void main(String[] args) 
    {
        // -------- Example of final variable --------
        
        final int num = 8; // num is constant now
        // num = 9; // ERROR → cannot reassign a final variable
        System.out.println("Final variable value: " + num);
        
        
        // -------- Example with Calc object --------
        
        Calc obj1 = new Calc();
        obj1.show(); // calls Calc.show() → "By Navin"
        obj1.add(4, 5); // calls Calc.add() → 9
        
        
        // -------- Example with AdvCalc object --------
        
        AdvCalc obj2 = new AdvCalc();
        obj2.show(); // still calls Calc.show() because it's final → "By Navin"
        obj2.add(4, 5); // overridden method in AdvCalc → "Sum from AdvCalc: 9"
    }
}
