public class String_Buffer {
  public static void main(String[] args) 
	{
		// StringBuffer is a mutable sequence of characters (unlike String which is immutable)
		// Here a new StringBuffer object is created with content "Navin"
		StringBuffer sb= new StringBuffer("Navin"); 
		
		// sb.length() → returns number of characters currently stored in sb
		// Example: "Navin" has 5 characters
		// System.out.println(sb.length()); // Output: 5

		// sb.capacity() → returns the allocated memory capacity
		// By default, StringBuffer has capacity = 16 + length of string
		// For "Navin" → 16 + 5 = 21
		// System.out.println(sb.capacity()); // Output: 21

		// append() → adds new content at the end (modifies the same object, unlike String)
		sb.append("Reddy"); // Now content = "NavinReddy"
		System.out.println(sb); // Output: NavinReddy

		// Convert StringBuffer to normal String (if immutability is needed)
		// String str=sb.toString(); 
		
		// deleteCharAt(2) → removes character at index 2 (0-based index)
		// Example: if sb = "NavinReddy", removing index 2 → "Na inReddy"
		// sb.deleteCharAt(2);

		// insert(index, "text") → inserts text at a specific index
		// sb.insert(0,"Java");   // Output: "JavaNavinReddy"
		// sb.insert(6,"java");   // Output: "JavaNa java vinReddy"

		// setLength(30) → changes the length of sequence
		// If shorter, extra chars are removed; if longer, null chars ('\u0000') are added
		// sb.setLength(30);

		// ensureCapacity(100) → ensures buffer can hold at least 100 chars
		// Current capacity might expand if less than 100
		sb.ensureCapacity(100);

		// Printing again after ensuring capacity
		System.out.println(sb); // Output: NavinReddy (content unchanged, only capacity increased)
	}
}
