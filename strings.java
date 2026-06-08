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

// <----------------------- String Concatenate ------------------>

/* 
public class strings{
    public static void main(String[] args){
        String Str = "Anurag";
        String Str1 = "Kashyap";
        System.out.println(Str+" "+Str1);
    }
}
*/

// <---------------------------------   Palindrome ----------------------------------->
/* 
import java.util.*;
public class strings{
    public static Boolean Palindrome(String str){
        for(int i =0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Word is :"+str);
        System.out.println(Palindrome(str));
    }
}
    */

// <----------------------- String Functions Compare ------------------------>
/* 
public class strings{
    public static void main(String [] args){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 =new String ("Tony");
        System.out.println(s1==s2);
        System.out.print(s1==s3);

    }
}
Output:
true
false
*/

/*
String Pool vs Heap Memory in Java
String Pool
String Pool is a special memory area inside the Heap.
It stores String literals(A String literal is a String value written directly inside double quotes (")) to save memory.
If the same String literal already exists, Java reuses it instead of creating a new object.
String s1 = "Tony";
String s2 = "Tony";
String Pool
┌─────────┐
│ "Tony"  │
└─────────┘
   ↑   ↑
  s1  s2
Only one "Tony" object is created.
Both s1 and s2 point to the same object.
Heap Memory
Heap is the memory area where objects are stored during runtime.
Using new always creates a new object in Heap memory.
String s3 = new String("Tony");
String Pool           Heap
┌─────────┐         ┌─────────┐
│ "Tony"  │         │ "Tony"  │
└─────────┘         └─────────┘
     ↑                   ↑
    s1                  s3
s3 points to a different object, even though the content is the same.
Example
String s1 = "Tony";
String s2 = "Tony";
String s3 = new String("Tony");

System.out.println(s1 == s2); // true
System.out.println(s1 == s3); // false
System.out.println(s1.equals(s3)); // true
Output
true
false
true
*/

// Comparing String Contents Using equals() in Java
/* 
public class strings {
    public static void main(String[] args) {

        // String literals stored in the String Pool.
        String str = "Tony";
        String str1 = "Tony";

        // Creates a new String object in Heap memory.
        String str2 = new String("Tony");

        // equals() compares the actual content of the Strings.
        System.out.println(str.equals(str1));

        // Even though str1 and str2 are different objects,
        // their contents are the same, so equals() returns true.
        System.out.println(str1.equals(str2));
    }
}
Output:
true
true
*/

/*
Key Notes
1.equals() compares the contents (characters) of two Strings.
2.It does not compare memory locations.
3.If the text inside both Strings is the same, equals() returns true.
4.Use equals() when you want to check whether two Strings contain the same value.
*/

// <-------------------- String Functions ------------------>
/* 
public class strings {
    public static void main(String[] args) {

        String str = "Hello World";

        // substring(startIndex, endIndex)
        // Returns characters from startIndex to endIndex-1
        // Here it returns "Hello"
        System.out.println(str.substring(0, 5));

        // compareTo()
        // Compares two strings lexicographically (dictionary order)
        // Returns:
        // 0  -> both strings are equal
        // >0 -> calling string is greater
        // <0 -> calling string is smaller

        String str1[] = {"Mango", "apple", "Banana"};

        // Assume first string is the largest initially
        String largest = str1[0];

        // Traverse array to find lexicographically largest string
        for (int i = 0; i < str1.length; i++) {

            // If current string is greater than 'largest',
            // update largest
            //"Kya largest string, str1[i] se chhoti hai?"
            //Agar haan, to compareTo() negative value return karega aur condition true ho jayegi.
            if (largest.compareTo(str1[i]) < 0) {
                largest = str1[i];
            }
        }

        System.out.println("Largest String: " + largest);
    }
}
*/

/* 
key point:
Output:
Largest String: apple
Because compareTo() is case-sensitive and lowercase letters (a) 
have a higher Unicode value than uppercase letters (M, B), "apple" 
is considered larger than "Mango" and "Banana".
*/

// <--------------------------- String Builder -------------------->
/* 
String vs StringBuilder in Java
Feature	String	StringBuilder
Mutable?	❌ No (Immutable)	✅ Yes (Mutable)
Memory	New object banta hai modification par	Same object modify hota hai
Performance	Slow for many modifications	Faster for many modifications
Thread Safe	✅ Safe (immutable)	❌ Not thread-safe
Package	java.lang.String	java.lang.StringBuilder
1. String (Immutable)
String str = "Hello";
str = str + " World";

Kya hota hai?

"Hello" object banta hai.
"Hello World" ke liye naya object banta hai.
Purana object unchanged rehta hai.
Hello  ---> old object
Hello World ---> new object

Isliye baar-baar concatenation costly hoti hai.

2. StringBuilder (Mutable)
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");

Yahan naya object nahi banta.

Existing object me hi data add ho jata hai.

Hello
   ↓ append
Hello World

Common StringBuilder Methods
StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");     // Hello World
sb.insert(5, ",");       // Hello, World
sb.delete(5, 6);         // Hello World
sb.reverse();            // dlroW olleH

System.out.println(sb);

Key Points:
1.String is immutable, so every modification creates a new object.
2.StringBuilder is mutable, so modifications happen in the same object and are faster for repeated string operations.
3.Use String when content rarely changes.
4.Use StringBuilder when you need frequent concatenation or modifications.
*/

public class strings {
    public static void main(String[] args) {

        // Create an empty StringBuilder object
        StringBuilder sb = new StringBuilder("");

        // Append (add) "Hello" to the StringBuilder
        sb.append("Hello");

        // Convert StringBuilder to String
        // Note: The returned String is not stored anywhere,
        // so this line has no effect on the output.
        sb.toString();

        // Print the contents of StringBuilder
        // println() automatically calls toString() internally
        System.out.println(sb);
    }
}