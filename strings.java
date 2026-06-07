// <----------------------- String -------------------------------->
/* 
public class strings {

    // Program entry point.
    // The JVM starts execution from the main() method.
    // The parameter must be String[] args, not strings[] args.
    public static void main(String[] args) {

        // Creates a String variable and stores the text "Anurag".
        String name = "Anurag";

        // Prints the value of the variable without moving to a new line.
        System.out.print(name);
    }
}

*/

// <----------------- Input/Output from user --------------------->

/* 
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {

        // Creates a Scanner object to take input from the keyboard.
        Scanner sc = new Scanner(System.in);

        // Reads a single word entered by the user.
        // Input stops at the first space, tab, or newline.
        String name = sc.next();

        // Prints the entered name.
        System.out.println("Enter the Name: " + name);

        // Closes the Scanner to free system resources.
        sc.close();
    }
}

output:
Anurag Kashyap
Enter the Name:Anurag
*/

/* 
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {

        // Creates a Scanner object to take input from the keyboard.
        Scanner sc = new Scanner(System.in);

        // Reads the entire line entered by the user, including spaces.
        String name = sc.nextLine();

        // Prints the entered text.
        System.out.println("Enter the Name: " + name);

        // Closes the Scanner to free system resources.
        sc.close();
    }
}

output:
Anurag Kashyap
Enter the Name: Anurag Kashyap
*/

// <--------------- Find String length ----------------------->
// Using length() and charAt() Methods in Java Strings
/* 
import java.util.*;
public class strings {
    public static void main(String[] args) {

        // Creates a String object and stores a full name.
        String name = "Anurag Kashyap";

        // length() returns the total number of characters in the String,
        // including spaces.
        System.out.println(name.length());

        // charAt(index) returns the character at the specified index.
        // Indexing starts from 0.
        System.out.println(name.charAt(0));

        // Loops through each character of the String.
        for (int i = 0; i < name.length(); i++) {

            // Prints each character followed by a space.
            System.out.print(name.charAt(i) + " ");
        }
    }
}

output:
14
A
A n u r a g   K a s h y a p
*/

