package BoxID;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author: Bit Jet Kit
 * Title: Test
 * Date: March 26, 2021
 * Purpose: Using user input, populate a user-defined vector.
 */

 public class Test{

    // Declare the main method.
    public static void main(String[] args) {
        // Instantiate the calculator.
        BoxID boxes = new BoxID();
        // Prompt the user.
        System.out.println("Enter the total items: ");
        // Call the calculator 
        boxes.setTotalBoxes();
        boxes.setItemList();
        boxes.toString();
    }
}
