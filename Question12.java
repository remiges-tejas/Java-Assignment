/* 12. Write a program to prompt for two whole positive numbers -- “num1” and “num2”. Print
multiplication table for the number e.g. for num1=3 and num2=20, output will be “3 * 1 = 3\n3
* 2 = 6\n … \n3 * 20 = 60”. */

// Importing package
import java.util.Scanner;

class MultiplicationTable {

    private int num1;
    private int num2;

    // define constructor
    public MultiplicationTable(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // getter and setter for num1
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // getter and setter for Num2
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Method that print table
    public void printTable() {
        // logic that checks for negative inputs
        if (num1 < 0 || num2 <= 0) {
            System.out.println("Invalid input. Both numbers must be positive and num2 must be greater than zero.");
            return;
        }

        int sum;
        for (int i = 1; i <= num2; i++) {
            sum = num1 * i;
            System.out.println(num1 + " * " + i + " = " + sum);
        }
    }

}

// Define the class
public class Question12 {
    public static void main(String[] args) {

        // Creating the instance of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Num 2");
        int num2 = sc.nextInt();

        // creating instace of class
        MultiplicationTable m1 = new MultiplicationTable(num1, num2);

        // calling method that print table
        m1.printTable();

        // To avoid resource leaks
        sc.close();
    }
}
