public class MultiDimensional_Array {  
  public static void main(String[] args) {  
    
    // Creating a 2D array (3 rows, 4 columns)
    // This means we have 3 arrays, and each array has 4 elements.
    int arr[][] = new int[3][4];

    // A variable just declared (not really used later, you can remove it)
    int random = 0;

    // Filling the 2D array with random values between 0-99
    for(int i = 0; i < 3; i++) {  // Outer loop → rows (0 to 2)
      for (int j = 0; j < 4; j++) { // Inner loop → columns (0 to 3)
        arr[i][j] = (int)(Math.random() * 100); // Assign random number
      }
    }

    // Printing the 2D array elements
    for (int[] row : arr) {              // Each row is a 1D array
        for (int element : row) {          // Loop through each element in the row
          System.out.print(element + " "); // Print element
        }
        System.out.println();              // Move to next line after each row
    }

  }
}
