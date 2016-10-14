package _Todo;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created by alexhughes on 10/12/16.
 */
public class CategoryMenu {
    public boolean subMenu() throws IOException {
        //ask for choice
        System.out.println("Please select a category for this item.");
        System.out.println("1. Personal    2 Work    3 Grocery");
        Scanner scanner = new Scanner(System.in);
        String subMenuChoice = scanner.nextLine();
        AddItemToList a1 = new AddItemToList();
        //direct user to proper list

        switch (subMenuChoice) {

            case "1":
                a1.addPersonalItem();
                break;
            case "2":

                a1.addWorkItem();
                break;

            case "3":
                a1.addGroceryItem();
                break;

            case "4":
                return true;


        }
        return true;
    }

    public void helpMenu(){

        System.out.println("Help Menu");

        System.out.println("ADDING AN ITEM - You will be asked which category you wish to enter an item. " + "\n");
        System.out.println("You will then enter you item to add to your to-do list. Then you will be asked  " + "\n");
        System.out.println("if this item has a high priority. High priority items will be added to the top of your list. " + "\n");
        System.out.println(" " + "\n");
        System.out.println("There are three categories to choose from; Personal work and grocery. " + "\n");
        System.out.println("You can add and remove items by selecting the option and inputting a number.  " + "\n");
        System.out.println(" " + "\n");

    }
}
