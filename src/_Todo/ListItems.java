package _Todo;

/**
 * Created by alexhughes on 10/12/16.
 */
public class ListItems {

    public void listAllItems(){
        MemoryFileHandler s2 = new MemoryFileHandler();

        System.out.println("Personal To-Do List");
        for (int x = 0; x < s2.todoArray.size(); ++x){
            System.out.println(s2.todoArray.get(x));
        }

        System.out.println("\n" + "Work To-Do List");

        for (int y = 0; y < s2.workListArray.size(); ++y){
            System.out.println(s2.workListArray.get(y));
        }


        System.out.println("\n" + "Grocery Item List");

        for (int z = 0; z < s2.groceryListArray.size(); ++z){
            System.out.println(s2.groceryListArray.get(z));
        }

    }
//end of list all items
   // int categoryNumber = 0;
    public void listOneItem(int categoryNumber){

        MemoryFileHandler s2 = new MemoryFileHandler();

        switch (categoryNumber){

            case 1:
                System.out.println("Personal To-Do List");
                for (int x = 0; x < s2.todoArray.size(); ++x){
                    System.out.println(s2.todoArray.get(x));
                }
                break;
            case 2:

                System.out.println("\n" + "Work To-Do List");

                for (int y = 0; y < s2.workListArray.size(); ++y){
                    System.out.println(s2.workListArray.get(y));
                }
                break;
            case 3:

                System.out.println("\n" + "Grocery Item List");

                for (int z = 0; z < s2.groceryListArray.size(); ++z){
                    System.out.println(s2.groceryListArray.get(z));

                }
                break;


        }

    }

}
