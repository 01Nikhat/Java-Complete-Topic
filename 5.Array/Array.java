public class Array {
  public static void main(String[] args) {
    
    // --------- First way: Declare & Initialize in one line ---------
    // int nums[]= {3,7,2,4};  // Array with 4 elements
    // nums[1]=6;              // Update element at index 1 (2nd position)
    // System.out.println(nums[1]); // Print updated value (6)
    

    // --------- Second way: Declare with size, then assign ---------
    int nums[] = new int[4];  // Create an array of size 4, default values = 0
    // Array indexes: 0,1,2,3 (total 4 slots)
    
    // Assign values to each index
    nums[0] = 4;  // index 0 → first element
    nums[1] = 8;  // index 1 → second element
    nums[2] = 3;  // index 2 → third element
    nums[3] = 9;  // index 3 → fourth element
    
    // --------- Printing values individually ---------
    // System.out.println(nums[0]);
    // System.out.println(nums[1]);
    // System.out.println(nums[2]);
    // System.out.println(nums[3]);
    

    // --------- Using loop to print all values ---------
    for (int i = 0; i < 4; i++) {    // Loop runs 4 times (i=0 to 3)
      System.out.println(nums[i]);  // Access element at index 'i'
    }
    
    // NOTE: 
    // - Array is stored in Heap memory.
    // - 'nums' is a reference variable stored in Stack memory,
    //   pointing to the array object in Heap.
    // - Each element is stored in a continuous block of memory.
  }
}
