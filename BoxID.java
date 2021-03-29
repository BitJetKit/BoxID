package BoxID;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author: Bit Jet Kit
 * Title: BoxID
 * Date: March 26, 2021
 * Purpose: Make BoxID's primary approach Object Oriented.
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
        // Prompt the user.
        System.out.println("Enter the total items: ");
        // Get the total boxes.
        this.totalBoxes = readUserInput.nextInt();
    }
    public int getBoxID() {
        return boxID;
    }
    public void setBoxID() {
        this.boxID = readUserInput.nextInt();
    }
    public int getBoxCounter() {
        return boxCounter;
    }
    public void setBoxCounter(int boxCounter) {
        this.boxCounter = boxCounter;
    }

    public void setItemList(){       
        // Fill the item boxes.
        for(setBoxCounter(0); getBoxCounter() < getTotalBoxes(); boxCounter++){
            System.out.println("Enter the box ID: ");
            setBoxID();
            myItemList.add(getBoxID());  
        }
    }
    
    public String toString(){
        for(setBoxCounter(0); getBoxCounter() < getTotalBoxes(); setBoxCounter(getBoxCounter() + 1)){
            System.out.println("Item " + (getBoxCounter() + 1) + " ID: " + myItemList.get(getBoxCounter()));
        }
        return "";
    }
}
