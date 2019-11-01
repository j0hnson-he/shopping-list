
/**
 * Write a description of class ShoppingListDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
public class ShoppingListUtil
{
    public static void readShoppingList(String fileName){
      DecimalFormat moneyDecimal = new DecimalFormat(".##");
        String line= FileUtility.readString(fileName);

        List<Item> shoppingItemList = new ArrayList<Item>();
      
        double totalCost = 0.0;
        
        String[] items = line.split("[|]");
       
        for (String item : items) {
            if (item.length() > 0) {
            String[] values = item.split("[,]"); 
            Item itemDetail = new Item (Integer.valueOf(values[0].trim()), values[1].trim(), Double.valueOf(values[2].trim()),
            Double.valueOf(values[3].trim()));
            shoppingItemList.add(itemDetail);
          }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Shopping List by Type: ");
        System.out.println("-------------------------------------------------------");
        
        Collections.sort(shoppingItemList, new SortbyType());
        for (Item shoppingItem: shoppingItemList) {
            System.out.println("Type: " + shoppingItem.getType() + ", Name: " + shoppingItem.getName() + ", Price: " + 
            shoppingItem.getPrice() + ", Cost + Tax:" + moneyDecimal.format(shoppingItem.getCost()));
            totalCost = totalCost + shoppingItem.getCost();
        }
        System.out.println("\n");
        System.out.println("Total Cost + Tax is : $" + moneyDecimal.format(totalCost));
        System.out.println("Total amount of items: " + shoppingItemList.size());
        if (shoppingItemList.size() <= 10){
            System.out.println("Please use the express lane.");
        }
        else {
            System.out.println("Please use the regular lane.");
        }
        
        System.out.println("\n-------------------------------------------------------");
        System.out.println("Shopping List by Cost: ");  
        System.out.println("-------------------------------------------------------");
        Collections.sort(shoppingItemList, new SortbyCost());
        totalCost = 0.0;
        for (Item shoppingItem: shoppingItemList) {
            System.out.println("Type: " + shoppingItem.getType() + ", Name: " + shoppingItem.getName() + ", Price: " + 
            shoppingItem.getPrice() + ", Cost + Tax:" + moneyDecimal.format(shoppingItem.getCost()));
            totalCost = totalCost + shoppingItem.getCost();
        }
        System.out.println("\n");
        System.out.println("Total Cost + Tax is : $" + moneyDecimal.format(totalCost));
        System.out.println("Total amount of items: " + shoppingItemList.size());
        if (shoppingItemList.size() <= 10){
            System.out.println("Please use the express lane.");
        }
        else {
            System.out.println("Please use the regular lane.");
        }
    }
    
    public static void writeShoppingList(String item, String fileName){
        FileUtility.writeString(item, fileName);
        FileUtility.saveAndClose();
    }
}
