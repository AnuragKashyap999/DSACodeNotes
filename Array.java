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



// <------------------- Array Approches --------------------->

// <----------------- Two Pointer --------------------->
/* 
The Two Pointer Technique is an efficient method used in arrays and strings where two indices (pointers) move through the data structure to solve problems in linear time O(n).

When to Use Two Pointers

Use it when:

Array is sorted
Need to find:
pairs
subarrays
duplicates
reversed elements
Want to reduce nested loops from O(n^2) to O(n)
*/

/* 
//code
public class Array{
    public static int[] twoSum(int arr[] , int target){
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
          if((arr[p1]+arr[p2])==target){
            return new int[]{p1,p2};
          }else if((arr[p1]+arr[p2])>target){
            p2--;
          }else{
            p1++;
          }
        }
        return new int []{-1,-1};
      
    }
    public static void main(String [] args){
        int arr[]={1,2,4,6,10};
        int target= 10;
        int res[] = twoSum(arr, target);
        
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
*/

// <--------------------- Sliding Window---------------------->

/* 
Sliding Window is an optimized technique used to solve subarray / substring problems 
efficiently by maintaining a “window” instead of recalculating results again and again.

Core Idea

Instead of recalculating every subarray:

Brute force → O(n²)

We maintain a window and update it:

Algorithm Steps
1.Calculate the sum of the first window of size k.
2.Store it as the current result.
3.Move the window one position at a time:
*Remove the element leaving the window.
*Add the new element entering the window.
4.Update the answer if needed.

Sliding Window → O(n)
📌 Types of Sliding Window
1. Fixed Size Window
2. Variable Size Window

Use it when you see:
Subarray or substring problems
Continuous sequence
Maximum / minimum / sum / average
Longest or shortest window problems

*/

/* 
// find maxsum using Sliding window 
public class Array{
    public static int slidingWindow(int arr[] , int k){
        // base case 
        if(arr.length<k || k<=0){
            System.out.println("Invalid window size.");
            return -1;
        }

        int maxSum = 0;
        int sum=0;
        for (int i = 0; i<k; i++) {
            sum+=arr[i];
        }     
        maxSum=sum;   
        for (int i =k ; i < arr.length; i++) {
            sum=sum+arr[i]-arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
    public static void main(String[] args){
        int arr[]= {-1,2,1,-3,1};
        int arr1[]={2,-2,1,-1,-6,7};
        System.out.println(slidingWindow(arr,2));
        System.out.println(slidingWindow(arr1,3));
    }
}
*/

// <----------------------- Kadane's Algorithm --------------------------->

/* 
Kadane's Algorithm is used to find the maximum sum of a contiguous subarray in an array.

Main Idea
If the current sum becomes negative, it is better to start a new subarray rather than continue with the negative sum.

Algorithm Steps
1.Initialize:
currSum = 0;
maxSum = Integer.MIN_VALUE;
2.Traverse the array:
Add the current element to currSum.
Update maxSum.
If currSum becomes negative, reset it to

Complexity
Time Complexity: O(n)
Space Complexity: O(1)
*/

/* 
// Find maxSum subarray Sum using kadane's algorithm
//code
public class Array{
    public static void kadane_algo(int arr[]){
        //base case 
        if(arr.length==1){
            System.out.println(arr[0]);
        }

        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
 
    }
    public static void main(String[] args){
        int arr[]={-1,-2,-5,-6,-3};
        int arr1[]={2,-2,1,-1,-6,7};
        kadane_algo(arr);
        kadane_algo(arr1);
    }
}    
*/

// <------------------------ Binary Search --------------------------->

/* 
Binary Search

Definition:
Binary Search is an efficient searching algorithm used to find an element in a sorted array by repeatedly dividing the search space into two halves.

Main Idea
Instead of checking every element one by one, Binary Search:
1.Finds the middle element.
2.If the target equals the middle element → return it.
3.If the target is smaller → search the left half.
4.If the target is larger → search the right half.
5.Repeat until the element is found or the search space becomes empty.

Complexity
Algorithm	Time Complexity
Linear Search	O(n)
Binary Search	O(log n)

Space Complexity: O(1) (iterative version)

Condition
✅ Array must be sorted.
❌ Binary Search does not work correctly on an unsorted array.
*/

//code
/* 
public class Array{
    public static int binary_Search(int arr[],int key){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                left =mid+1;
            }else{
                right =mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={2,3,5,6,7,8,9,12};
        int key = 7;
        System.out.println(binary_Search(arr,key));
    }
}
    */

// <------------------------ Prefix Based --------------------------->

/* 
Prefix Sum Approach (Simple Language)

Prefix Sum is a technique where we store the running sum of the array so that we can find any subarray sum quickly.
Example

Array:

arr = {1, 2, 3, 4, 5}

Create a prefix array:

prefix = {1, 3, 6, 10, 15}

How?

prefix[0] = 1
prefix[1] = 1 + 2 = 3
prefix[2] = 1 + 2 + 3 = 6
prefix[3] = 1 + 2 + 3 + 4 = 10
prefix[4] = 1 + 2 + 3 + 4 + 5 = 15

Finding Subarray Sum

Suppose we want the sum of:

{2, 3, 4}

(indices 1 to 3)

Instead of adding:

2 + 3 + 4 = 9

we use the prefix array:

sum = prefix[3] - prefix[0]
    = 10 - 1
    = 9

Each position stores the sum from index 0 to that position.

Complexity
Creating prefix array → O(n)
Finding any subarray sum → O(1)
So, Prefix Sum is an optimization technique used to answer subarray sum queries faster
*/

// code
public class Array{
    public static void prefixSum(int arr[]){

        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int [arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i ==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(currSum>maxsum){
                    maxsum=currSum;
                }
            }
        }
        System.out.println("MaxSubArraySum is :"+maxsum);
    }
    public static void main(String[] args){
        int arr[]= {2,4,6,8,10};
        prefixSum(arr);
    }
}