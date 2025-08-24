
class A {
    String name = "Nikhat";

    public void setName() {
        System.out.println(name + " "+ "Outer class A method");
    }

    class B{
        public void methodB(){
            System.out.println("Inner class B");
        }
    }
}

public static void main(String[] args) {
    A obj = new A();
    obj.setName();
    B obj1 = new B();
}