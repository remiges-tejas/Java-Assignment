/* 13. Write a program to prompt for three inputs: character to be used for display, num1 to
represent number of rows and num2 to represent number of columns. The output will be a
rectangular matrix where each cell will print a character input as a first input value. */

// Importing Scanner class 
import java.util.Scanner;

import utilities.InputHandler.WholeNumberValidator;

class Matrix {

    // define instance varible
    private int rows;
    private int cols;
    private char str;

    char[][] getchar = new char[rows][cols];

    // define constructor
    public Matrix(int rows, int cols, char[][] getchar, char str) {
        this.rows = rows;
        this.cols = cols;
        this.getchar = getchar;
        this.str = str;

    }

    // getter setter for rows and column
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    // getter setter for str
    public char getStr() {
        return str;
    }

    public void setStr(char str) {
        this.str = str;
    }

    // define method that print matrix
    public void printMatrix() {
        // Print the character array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                getchar[i][j] = str;
                System.out.print(getchar[i][j] + " ");
            }
            System.out.println();
        }

    }

}

// define the class
public class Question13 {
    public static void main(String[] args) {

        // creating instace of scanner classs
        Scanner scanner = new Scanner(System.in);

        // clas that validate input
        WholeNumberValidator wholeNumberValidator = new WholeNumberValidator();

        // taking rows and column input from the user
        System.out.println("How many rows do you want to create?");
        int rows = wholeNumberValidator.validateWholeNumber(scanner);

        // taking rows and column input from the user
        System.out.println("How many cols do you want to create?");
        int cols = wholeNumberValidator.validateWholeNumber(scanner);

        // Initialize the character array with the given dimensions
        char[][] getchar = new char[rows][cols];

        // taking character input from user
        System.out.println("Enter the character to print:");
        char str = scanner.next().charAt(0);

        // creating instance of Matrix Class
        Matrix m1 = new Matrix(rows, cols, getchar, str);

        // calling method that print the matrix
        m1.printMatrix();

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
