

public class JaggedArray {
  public static void main(String[] args) {
    // Create jagged array with 3 rows
    int jagged[][] = new int[3][];

    // Initialize each row with different column sizes
    jagged[0] = new int[3];  // 1st row has 3 elements
    jagged[1] = new int[2];  // 2nd row has 2 elements
    jagged[2] = new int[4];  // 3rd row has 4 elements

    // inside for loop array length concept 
    /* 🔹 jagged.length

        👉 Gives the number of rows (outer array size).
        In above case: jagged.length = 3 
    */

    /*
       * 🔹 jagged[i].length

          👉 Gives the number of columns in row i.
          Here i is the index of a particular row.
     */
    // Assign random values
    for (int i = 0; i < jagged.length; i++) {  // Outer loop → rows 

       for (int j = 0; j < jagged[i].length; j++) { // Inner loop → columns (variable size)
        jagged[i][j] = (int)(Math.random() * 100);
      }
    }

    // Print values using Enhanced for loop
    for (int[] row : jagged) {   // Each row is an array
      for (int value : row) {    // Traverse each element in the row
        System.out.print(value + " ");
      }
      System.out.println(); // Move to next row
    }
  }
}
