class Mobile {
  String brand;   // Instance variable (unique for each object)
  int price;      // Instance variable (unique for each object)
  static String name; // Static variable (shared among all objects of Mobile class)

  // Instance Method → needs an object to call
  public void show() {
    // Can directly access both instance variables and static variable
    System.out.println(brand + " : " + price + " : " + name);
  }

  // Static Method → belongs to class, no object needed
  public static void show1(Mobile obj) {
    // Cannot directly access 'brand' and 'price' (since they are instance variables)
    // That's why we use 'obj' reference to access them
    System.out.println(obj.brand + " : " + obj.price + " : " + name);
  }

  // Static Block → runs only once when class is loaded
  static {
    name = "Smartphone"; // Static variable initialized
  }
}

public class Static_Method {
  public static void main(String[] args) {
    // Creating first object
    Mobile obj1 = new Mobile();
    obj1.brand = "Samsung";
    obj1.price = 27000;

    // Creating second object
    Mobile obj2 = new Mobile();
    obj2.brand = "Iphone";
    obj2.price = 37000;

    // Calling static method using class name
    Mobile.show1(obj1); // Prints: Samsung : 27000 : Smartphone
    Mobile.show1(obj2); // Prints: Iphone : 37000 : Smartphone
  }
}
