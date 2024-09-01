/*  02 : Write a program to prompt the user to enter a name, and print “Hello <name>”. Replace
“<name>” with the text entered by a user running the program. */

//importing Scanner Class
import java.util.Scanner;

// Define class Question02
public class Question02 {

    public static void main(String[] args) {

        // Creating instance of Scanner class for taking input
        Scanner sc = new Scanner(System.in);

        // define the varible which take input from user
        System.out.print("Enter You Name :");
        String name = sc.nextLine();

        // Displaying Name of user
        System.out.println(" Hello " + name + " !!!");
    
        // to avoid resource leak
        sc.close();

    }

}
