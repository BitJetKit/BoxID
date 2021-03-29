package BoxID;

/**
 * @author: Bit Jet Kit
 * Title: Test
 * Date: March 26, 2021
 * Purpose: Using user input, populate a user-defined array.
 */

 public class Test{

    // Declare the main method.
    public static void main(String[] args) {
        // Instantiate the calculator.
        BoxID boxes = new BoxID();
        // Call the calculator 
        boxes.setTotalBoxes();
        boxes.setItemList();
        boxes.toString();
    }
}
