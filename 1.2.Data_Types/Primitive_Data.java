// Java Data Types

// In Java, data types are divided into two main categories:

// 1. Primitive Data Types

// 2. Non-Primitive (Reference) Data Types

/*  1️⃣ Primitive Data Types  */

// 👉 These are the basic data types built into Java.
// 👉 They are not objects, and they store values directly in memory.
// 👉 There are 8 primitive data types.

/* table of Primitive Types
Data Type	Size	Default Value	Example
byte	   1 byte	   0	         byte a = 100;
short	   2 bytes	 0	         short s = 32000;
int	     4 bytes	 0	         int num = 100000;
long	   8 bytes	 0L	         long l = 15000000000L;
float	   4 bytes	 0.0f	       float f = 12.5f;
double	 8 bytes	 0.0d	       double d = 19.99;
char	   2 bytes	'\u0000'	   char c = 'A';
boolean	 1 bit	    false	     boolean  flag = true; */

/* ============code ==================================== */
public class Primitive_Data {
    public static void main(String[] args) {
        byte a = 100;
        short s = 32000;
        int num = 100000;
        long l = 15000000000L; // 'L' is required for long literals
        float f = 12.5f;       // 'f' is required for float literals
        double d = 19.99;      // by default java consider decimal value as double if we want float value then we have to specify as float f = 12.5f; at the end f should be mentioned to represent float value 
        char c = 'A';  // we can't put here double quotation as "A"
        boolean flag = true; //java doesn't support 0 or 1 as true false

        System.out.println("byte: " + a);
        System.out.println("short: " + s);
        System.out.println("int: " + num);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
    }
}
