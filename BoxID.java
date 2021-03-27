package BoxID;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author: Bit Jet Kit
 * Title: BoxID
 * Date: March 26, 2021
 * Purpose: Make UserArrayDef's primary approach Object Oriented.
 */
public class BoxID{
    // Declare the fields.
    private int totalBoxes;
    private int boxID;
    private int boxCounter;

    // Instantiate a Scanner.
    private Scanner readUserInput = new Scanner(System.in);
        
    // Utilize a Vector: this can be resized dynamically, and without an array's starting static size.
    private List<Integer> myItemList = new Vector<Integer>();

    // Declare the accessors.
    public int getTotalBoxes() {
        return totalBoxes;
    }
    public void setTotalBoxes() {
        this.totalBoxes = readUserInput.nextInt();
    }
    public int getBoxID() {
        return boxID;
    }
    public void setBoxID(int boxID) {
        this.boxID = boxID;
    }
    public int getBoxCounter() {
        return boxCounter;
    }
    public void setBoxCounter(int boxCounter) {
        this.boxCounter = boxCounter;
    }

    public void setItemList(){       
        // Fill the item boxes.
        for(boxCounter = 0; boxCounter < totalBoxes; boxCounter++){
            System.out.println("Enter the box ID: ");
            boxID = readUserInput.nextInt();
            myItemList.add(boxID);  
        }
    }
    public String toString(){
        for(boxCounter = 0; boxCounter < totalBoxes; boxCounter++){
            System.out.println("Item " + (boxCounter + 1) + " ID: " + myItemList.get(boxCounter));
        }
        return "";
    }
}