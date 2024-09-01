/* 04 :  Modify the above program to take two command-line parameters. The first is the string for
the message template, like “Hello <name>” or any other template. The second is the actual
name to print in the message by replacing “<name>” with the given name. */

// define the class Question04
public class Question04 {

    // define the Main Method
    public static void main(String[] args) {
        // Defining the string Arguments
        String str1 = args[0];
        String str2 = args[1];

        // Check that At least two argument Needed
        // Custom eror handle
        if (args.length == 0 || args.length == 1) {
            System.out.println("Eror : Two Argument not Provided");
        } else {
            // replacing the name using string method

            String resultMessage = str1.replace("<name>", str2);
            System.out.println(resultMessage);

        }

    }
}