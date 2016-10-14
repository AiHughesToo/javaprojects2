package _Todo;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

/**
 * Created by alexhughes on 10/10/16.
 */
public class Menu {

    public void menu() throws IOException {
        Scanner menuInput = new Scanner(System.in);
        CategoryMenu cm1 = new CategoryMenu();
        ListItems l1 = new ListItems();
        RemoveItem r1 = new RemoveItem();

        System.out.print("To-Do List Main Menu" + "\n");
        System.out.print("Please Select From The Following:" + "\n");
        System.out.print("1. Add Item" + "\n");
        System.out.print("2. List Items" + "\n");
        System.out.print("3. List Single Category" + "\n");
        System.out.print("4. Remove Item" + "\n");
        System.out.print("5. Help" + "\n");
        System.out.print("6. Save & Quit" + "\n");

        String menuSelect = menuInput.nextLine();


        switch (menuSelect){
            case "1":
                cm1.subMenu();
                menu();
                break;

            case "2":
                l1.listAllItems();
                menu();
                break;

            case "3":
                System.out.println("Which Category would you like to see?");
                System.out.println("1. Personal    2 Work    3 Grocery");
                String Choice = menuInput.nextLine();

                switch (Choice){
                    case "1":
                        l1.listOneItem(1);
                        break;
                    case "2":
                        l1.listOneItem(2);
                        break;
                    case "3":
                        l1.listOneItem(3);
                        break;
                    default:
                        System.out.println("You didn't get that quite right but here is everything anyway.");
                        l1.listAllItems();
                        menu();
                        break;
                }

                menu();
                break;

            case "4":
                r1.chooseWhichToRemove();
                menu();
                break;

            case "5":
                cm1.helpMenu();
                menu();
                break;

            case "6":
//Save the personal history list to a text doc.
                PrintWriter saveFile = new PrintWriter(new FileWriter("todo.txt"));
                MemoryFileHandler save1 = new MemoryFileHandler();

                for (int i = 0; i < save1.todoArray.size(); ++i){
                    saveFile.println(save1.todoArray.get(i));
                }

                saveFile.close();

//Save the personal history list to a text doc.
                PrintWriter saveWorkFile = new PrintWriter(new FileWriter("workhistory.txt"));


                for (int i = 0; i < save1.workListArray.size(); ++i){
                    saveWorkFile.println(save1.workListArray.get(i));
                }

                saveWorkFile.close();

//Save the personal history list to a text doc.
                PrintWriter saveGroceryFile = new PrintWriter(new FileWriter("groceryhistory.txt"));


                for (int i = 0; i < save1.groceryListArray.size(); ++i){
                    saveGroceryFile.println(save1.groceryListArray.get(i));
                }

                saveGroceryFile.close();

                System.out.print("Sorry to see you go.");
                break;

            default:
                menu();
        }
        System.out.println("");

    }

}
