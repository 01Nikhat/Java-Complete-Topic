// No package here, it's in the default package

import ParentPackage.Child_Package.Child;
import ParentPackage.Parent;

public class PackageFile {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("Parent A: " + p.A(10));

        Child c = new Child();
        System.out.println("Child B: " + c.B(10));
    }
}
