package _Todo;
import java.util.Scanner;
/**
 * Created by alexhughes on 10/12/16.
 */
public class RemoveItem {

    MemoryFileHandler m1 = new MemoryFileHandler();
    int listNumber = 0;

    public void chooseWhichToRemove(){
        Scanner removeChoice = new Scanner(System.in);
        MemoryFileHandler m1 = new MemoryFileHandler();

        System.out.println("Which Category would you like to remove an item from?");
        System.out.println("1. Personal    2 Work    3 Grocery");
        String removeChoiceInput = removeChoice.nextLine();

        switch (removeChoiceInput){

            case "1":
                removePersonalItem();
                break;
            case "2":
                removeWorklItem();
                break;
            case "3":
                removeGroceryItem();
                break;
        }


    }

    public void removePersonalItem() {
// list the items so user can see what to remove add a number to the first of each item.


// for loop to print the items from the array

        for (int i = 0; i < m1.todoArray.size(); ++i) {
            listNumber = i + 1;
            System.out.println(listNumber + " " + m1.todoArray.get(i));
        }

        System.out.println("Please select the item you wish to remove and enter the number");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        m1.todoArray.remove(choice - 1);
            // remove item
        System.out.println("Item Removed.");

// end of method
    }
// remove work method

    public void removeWorklItem() {
// for loop to print the items from the array

        for (int i = 0; i < m1.workListArray.size(); ++i) {
            listNumber = i + 1;
            System.out.println(listNumber + " " + m1.workListArray.get(i));
        }

        System.out.println("Please select the item you wish to remove and enter the number");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        m1.workListArray.remove(choice - 1);
        // remove item
        System.out.println("Item Removed.");

// end of method
    }

// remove grocery method

    public void removeGroceryItem() {
// list the items so user can see what to remove add a number to the first of each item.


// for loop to print the items from the array

        for (int i = 0; i < m1.groceryListArray.size(); ++i) {
            listNumber = i + 1;
            System.out.println(listNumber + " " + m1.groceryListArray.get(i));
        }

        System.out.println("Please select the item you wish to remove and enter the number");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        m1.groceryListArray.remove(choice - 1);
        // remove item
        System.out.println("Item Removed.");

// end of method
    }
// end of class
}
