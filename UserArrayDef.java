import java.util.Scanner;

/**
 * @author: Bit Jet Kit
 * Title: User Array Definition
 * Date: March 26, 2021
 * Purpose: Using user input, populate a user-defined array.
 */

 public class UserArrayDef{

    // Declare the main method.
    public static void main(String[] args) {
        // Declare the variables.
        Scanner readUserInput = new Scanner(System.in);
        int size;
        String myArray[];
        // Prompt the user.
        System.out.println("Enter the total items: ");
        size = readUserInput.nextInt();
        myArray = new String [size];
        // Fill the item boxes.
        for(int currentBox = 0; currentBox < size; currentBox++){
            myArray[currentBox] = readUserInput.nextLine();  
        }
    }
}
