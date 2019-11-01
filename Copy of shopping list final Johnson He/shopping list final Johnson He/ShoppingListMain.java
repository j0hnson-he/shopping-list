import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

public class ShoppingListMain
{
    private static final String DATA_FILE = "shoppinglist.txt";

    private static Scanner in;
    private static BufferedWriter out;

   
    public static void main(String[] args) throws FileNotFoundException {
       
        
        String fileName = "shoppinglist.txt";
        ShoppingListUtil.readShoppingList(fileName);
        
        System.out.println("Please provide the information necessary to add a new item to the shopping list for you.");
        System.out.print("Enter item type(integer 1-7):");
        String itemType = UserInput.getString();
        System.out.print("Enter item name(string):");
        String itemName = UserInput.getString();
        System.out.print("Enter item quantity(double):");
        String itemQuantity= UserInput.getString();
        System.out.print("Enter item price(double):");
        String itemPrice = UserInput.getString();
        
        String newItem = itemType +","+ itemName +","+ itemQuantity + "," + itemPrice;
        ShoppingListUtil.writeShoppingList(newItem,fileName );
        System.out.println("Write new item: " + newItem + " to file " + fileName);
        System.out.println("The new shopping List " );
        ShoppingListUtil.readShoppingList(fileName);
    }
}
