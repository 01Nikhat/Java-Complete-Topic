// Class Mobile
class Mobile {
    // Instance variables (each object will have its own copy)
    String brand;
    int price;
    String network;

    // Static variable (shared across all objects of Mobile class)
    static String name;

    // Method to display details
    public void show() {
        // brand and price come from the object
        // name is static, so it's shared by all objects
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Static_Variable {
    public static void main(String[] args) {
        
        // Creating first object of Mobile
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";      // unique to obj1
        obj1.price = 1500;         // unique to obj1
        // Static variable accessed using class name
        Mobile.name = "SmartPhone";

        // Creating second object of Mobile
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";    // unique to obj2
        obj2.price = 1700;         // unique to obj2
        // Again setting static variable (shared by all objects)
        Mobile.name = "SmartPhone";

        // Changing static variable again (this will affect ALL objects)
        Mobile.name = "SmartPhone";

        // Displaying object details
        obj1.show();   // Output → Apple : 1500 : SmartPhone
        obj2.show();   // Output → Samsung : 1700 : SmartPhone
    }
}
