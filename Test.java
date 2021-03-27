package UserArrayDef;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author: Bit Jet Kit
 * Title: User Array Definition
 * Date: March 26, 2021
 * Purpose: Using user input, populate a user-defined array.
 */

 public class UserArrayDef{

    // Declare the main method.
    public static void main(String[] args) {
        // Instantiate the calculator.
        Calculator calculator = new Calculator();
        // Prompt the user.
        System.out.println("Enter the total items: ");
        // Call the calculator 
        calculator.setTotalBoxes();
        calculator.setItemList();
        calculator.toString();
    }
}
