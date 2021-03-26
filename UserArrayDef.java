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
        // Declare the variables.
        Scanner readUserInput = new Scanner(System.in);
        int totalBoxes;
        int boxID;
        int boxCounter;
        // Prompt the user.
        System.out.println("Enter the total items: ");
        totalBoxes = readUserInput.nextInt();
        // Utilize a Vector: this can be resized dynamically, and without an array's starting static size.
        List<Integer> myItemList = new Vector<Integer>();
        // Fill the item boxes.
        for(boxCounter = 0; boxCounter < totalBoxes; boxCounter++){
            System.out.println("Enter the box ID: ");
            boxID = readUserInput.nextInt();
            myItemList.add(boxID);  
        }
        for(boxCounter = 0; boxCounter < totalBoxes; boxCounter++){
            System.out.println("Item " + (boxCounter + 1) + " ID: " + myItemList.get(boxCounter));
        }
    }
}
