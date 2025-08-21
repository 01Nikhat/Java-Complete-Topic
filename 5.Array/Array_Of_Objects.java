// Class representing a Student
class Student {
  // Properties/fields of Student class
  int rollno;   // To store student's roll number
  String name;  // To store student's name
  int marks;    // To store student's marks
}

public class Array_Of_Objects {
  public static void main(String[] args) {
    
    // Creating first Student object (s1)
    Student s1 = new Student(); // memory allocated for Student
    s1.rollno = 12;             // assigning roll number
    s1.name = "nikhat";         // assigning name
    s1.marks = 89;              // assigning marks

    // Creating second Student object (s2)
    Student s2 = new Student();
    s2.rollno = 13;
    s2.name = "naaz";
    s2.marks = 92;

    // Creating third Student object (s3)
    Student s3 = new Student();
    s3.rollno = 14;
    s3.name = "sam";
    s3.marks = 85;

    // Creating an array of Student objects
    // This array can hold 3 Student references
    Student students[] = new Student[3];

    // Assigning student objects into the array
    students[0] = s1; // first element is s1
    students[1] = s2; // second element is s2
    students[2] = s3; // third element is s3

    // -----------------------------
    // 1. Normal for loop (index-based iteration)
    // -----------------------------
    // for (int i = 0; i < students.length; i++) {
    //   // students[i] gives the Student object at index i
    //   // .name and .marks are used to access Student properties
    //   System.out.println(students[i].name + " : " + students[i].marks);
    // }

    // -----------------------------
    // 2. Enhanced for loop (for-each loop)
    // -----------------------------
    // More concise way to iterate through arrays
    for (Student stud : students) {
      // "stud" directly refers to each Student object in array
      System.out.println(stud.name + " : " + stud.marks);
    }
  }
}
