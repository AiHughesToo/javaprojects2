package _Todo;
import java.util.Scanner;
import java.io.IOException;
/**
 * Created by alexhughes on 10/10/16.
 */
public class AddItemToList {

    boolean addAnotherItem = true;


    public void addPersonalItem() throws IOException{


        while (addAnotherItem) {
            System.out.println("Enter your Item:");
            Scanner scanner = new Scanner(System.in);

            String item = scanner.nextLine();

            System.out.println("Does this item have a high priority? y/n");
            String priority = scanner.nextLine();

            switch (priority) {

                case "y":
                    MemoryFileHandler s1 = new MemoryFileHandler();
                    s1.todoArray.add(0, item);
                    break;
                case "n":
                    MemoryFileHandler s2 = new MemoryFileHandler();
                    s2.todoArray.add(item);
                    break;
                default:
                    MemoryFileHandler s3 = new MemoryFileHandler();
                    s3.todoArray.add(item);
                    break;
            }
            System.out.println("Would you like to enter another item?");
            String addAnotherAnswer = scanner.nextLine();
            switch (addAnotherAnswer){
                case "n":
                    addAnotherItem = false;
                    break;
                default:
                    addPersonalItem();

            }

        }
    }
    // end of addPersonalItem method

    public void addWorkItem() throws IOException{


        while (addAnotherItem) {
            System.out.println("Enter your Item:");
            Scanner scanner = new Scanner(System.in);

            String item = scanner.nextLine();

            System.out.println("Does this item have a high priority? y/n");
            String priority = scanner.nextLine();

            switch (priority) {

                case "y":
                    MemoryFileHandler s1 = new MemoryFileHandler();
                    s1.workListArray.add(0, item);
                    break;
                case "n":
                    MemoryFileHandler s2 = new MemoryFileHandler();
                    s2.workListArray.add(item);
                    break;
                default:
                    MemoryFileHandler s3 = new MemoryFileHandler();
                    s3.workListArray.add(item);
                    break;
            }
            System.out.println("Would you like to enter another item?");
            String addAnotherAnswer = scanner.nextLine();
            switch (addAnotherAnswer){
                case "n":
                    addAnotherItem = false;
                    break;
                default:
                    addWorkItem();

            }

        }
    }
    // end of addworkItem method

    public void addGroceryItem() throws IOException{


        while (addAnotherItem) {
            System.out.println("Enter your Item:");
            Scanner scanner = new Scanner(System.in);

            String item = scanner.nextLine();

            System.out.println("Does this item have a high priority? y/n");
            String priority = scanner.nextLine();

            switch (priority) {

                case "y":
                    MemoryFileHandler s1 = new MemoryFileHandler();
                    s1.groceryListArray.add(0, item);
                    break;
                case "n":
                    MemoryFileHandler s2 = new MemoryFileHandler();
                    s2.groceryListArray.add(item);
                    break;
                default:
                    MemoryFileHandler s3 = new MemoryFileHandler();
                    s3.groceryListArray.add(item);
                    break;
            }
            System.out.println("Would you like to enter another item?");
            String addAnotherAnswer = scanner.nextLine();
            switch (addAnotherAnswer){
                case "n":
                    addAnotherItem = false;
                    break;
                default:
                    addGroceryItem();

            }

        }
    }

    // end of class
}

