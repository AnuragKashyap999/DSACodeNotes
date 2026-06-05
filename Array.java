// <------------- Array Declaration with Memory Allocatio ------------>

/*import java.util.Arrays; 

public class Array {
    public static void main(String[] args) {

        // Array declaration (preferred Java style)
        // Creates an integer array of size 5.
        // All elements are initialized to 0 by default.
        int[] arr = new int[5];

        // Another valid way to declare an array in Java.
        // Functionally same as int[] arr1 = new int[5];
        int arr1[] = new int[5];

        // Prints the value at index 1.
        // Since no value has been assigned yet, output will be 0.
        System.out.print(arr[1]);

        // Prints the array object's reference, not the elements.
        // To print elements, use a loop or Arrays.toString(arr1).
        System.out.print(arr1);

        // Arrays.toString() converts an array into a readable String
        // and prints all elements instead of the array's memory reference.
        System.out.println(Arrays.toString(arr));
    }
} */


// String array 

/* 
// Imports all classes and interfaces from the java.util package.
import java.util.*;

public class Array{
    public static void main (String[] args){
       // Creates a String array of size 5.
       // All elements are initialized to null by default.
       String fruits[] = new String[5];

       // Prints the value at index 1.
       // Since no String is assigned yet, output is null.
       System.out.print(fruits[1]);
    }
}

*/

// <-----------Array Initialization with Values---------------->
/* 
public class Array {
    public static void main(String[] args) {

        // Array initialized with values
        // Size is automatically set to 2
        String fruits[] = {"Mango", "Apple"};

        // Prints the element at index 1
        System.out.print(fruits[1]);
    }
}
    */

// <---------- Accessing and Updating Array Elements ------------->

// import java.util.*;
/* 
public class Array {
    public static void main(String[] args) {

        // Creates an integer array of size 5.
        // All elements are initialized to 0 by default.
        int arr2[] = new int[5];

        // Assign value to the first element (index 0)
        arr2[0] = 5;

        // Loop through the entire array
        for (int i = 0; i < arr2.length; i++) {

            // Print each element followed by a comma
            System.out.print(arr2[i] + ",");
        }
    }
} 

*/

// <------------ Taking Array Input from User and Displaying Elements -------------->
/* 
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // Create an integer array of size 5
        int arr[] = new int[5];

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Input values into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print a blank line for better output formatting
        System.out.println();

        // Display all array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Close the Scanner to free resources
        sc.close();
    }
}

*/

// <----------- Pass by Value in Java and Array Behavior in Methods ---------------->

/* 
import java.util.*;

public class Array {

    // Method receives:
    // 1. An array (reference type)
    // 2. An integer (primitive type)
    public static void update(int arr[], int nonchangeable) {

        // Changes only the local copy of the primitive variable.
        // This will NOT affect the original variable in main().
        nonchangeable = 10;

        // Prints each array element + 1.
        // Note: The array itself is NOT modified here.
        // We are only printing incremented values.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + 1 + ",");
        }

        System.out.println();

        // Prints the local value of nonchangeable (10)
        System.out.print(nonchangeable);
        System.out.println();
    }

    public static void main(String[] args) {

        // Array initialization
        int arr[] = {100, 120, 121, 129};

        // Primitive variable
        int nonchangeable = 5;

        // Method call
        update(arr, nonchangeable);

        // Original array remains unchanged because
        // we never modified arr[i]
        System.out.println(Arrays.toString(arr));

        // Original primitive variable remains unchanged
        // because Java passes primitives by value
        System.out.print(nonchangeable);
    }
}
*/

// Key Points for Revision

/* 
// Primitive types (int, double, char, boolean)
// are passed by value.
// Changes inside a method do not affect the original variable.

int x = 5;
update(x); // x remains 5


// Arrays are reference types.
// The reference is passed by value.
// If you modify arr[i], the original array changes.

arr[i] = arr[i] + 1;


// Simply printing arr[i] + 1 does NOT change the array.

System.out.print(arr[i] + 1);

*/



// <-------------- 2D Array ---------------->

/*
import java.util.*;

public class Array {
    public static void main(String[] args) {

        // 2D Array Declaration (Preferred Style)
        // Creates a 3x3 matrix (3 rows and 3 columns).
        // All elements are initialized to 0 by default.
        int[][] matrix = new int[3][3];

        // Another valid way to declare a 2D array.
        // Functionally the same as int[][] matrix1 = new int[3][3];
        int matrix1[][] = new int[3][3];
    }
}
    */

// key points 
/* 
1D Array  -> Single row of elements
2D Array  -> Rows and Columns (Matrix/Table)
*/
// <------------- Taking Input in a 2D Array and Printing the Matrix -------->
/* 
import java.util.*;
public class Array {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create a 2D array (3 rows × 4 columns)
        int table[][] = new int[3][4];

        // Input values into the matrix
        // Outer loop -> Rows
        for (int i = 0; i < table.length; i++) {

            // Inner loop -> Columns
            for (int j = 0; j < table[i].length; j++) {

                // Store user input at position [row][column]
                table[i][j] = sc.nextInt();
            }
        }

        // Print the entire 2D array in readable format
        // deepToString() is used for multidimensional arrays
        System.out.println(Arrays.deepToString(table));

        // Close Scanner to release resources
        sc.close();
    }
}
    */

// Important Key Points
/* 
// table.length
// Returns the number of rows.

table.length; // 3


// table[i].length
// Returns the number of columns in row i.

table[i].length; // 4
*/
