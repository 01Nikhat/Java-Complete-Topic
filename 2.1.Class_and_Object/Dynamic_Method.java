class A {
  public void show() {
    System.out.println("in A");
  }
}

class B extends A {
  public void show() {
    System.out.println("in B");
  }

  public void show1() {
    System.out.println("Another method in B");
  }
}

class C extends A {
  public void show() {
    System.out.println("in C");
  }
}

public class Dynamic_Method {
  public static void main(String[] args) {

    // Case 1:
    A obj = new A();
    obj.show();  
    // Output: in A
    // Diagram:
    //  obj ---> [Object of A]
    //   |
    //   --> can only call methods in A

    // Case 2:
    obj = new B();  
    obj.show();  
    // Output: in B
    // Diagram:
    //  obj (A type) ---> [Object of B]
    //   |
    //   --> Compiler sees obj as A (so only A's methods visible)
    //   --> JVM sees actual object is B, so B's show() runs

    // obj.show1(); ❌ ERROR
    // Why? ---> Compiler only knows obj is of type A.
    // A does NOT have show1().
    //
    // Diagram:
    //  At COMPILE TIME:
    //   obj is A-type → methods available = { show() }
    //   show1() ❌ not found
    //
    //  At RUNTIME:
    //   obj points to B object (which has show1)
    //   But compiler already blocked it before runtime.
    //
    // To call show1(), you need downcasting:
    //   ((B)obj).show1(); ✅

    // Case 3:
    obj = new C();
    obj.show();
    // Output: in C
    // Diagram:
    //  obj (A type) ---> [Object of C]
    //   |
    //   --> Compiler sees A
    //   --> JVM executes C's show()
  }
}
