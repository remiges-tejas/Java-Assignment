/* 03 : Write a program to accept “<name>” as command line argument, and print “Hello <name>”.
Replace “<name>” with the text entered by a user running the program. */

//define the The class
public class Question03 {

    // Define the Main Method inside the class
    public static void main(String[] args) {

        // * Custom Eror Handle *
        // Check if at least one command line argument is provided
        if (args.length == 0) {
            System.out.println("Error: No command line argument provided.");
        } else 
            /* Displaying the Name which comes through command line 
            [While run the Program passed at least one Argument like : java <filename> <args-1> ] */
            System.out.println("Hello " + args[0] + "!!");
        }

    }