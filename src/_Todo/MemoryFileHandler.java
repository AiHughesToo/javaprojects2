package _Todo;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
/**
 * Created by alexhughes on 10/11/16.
 */
public  class MemoryFileHandler {
    //establish the array for to-do category

   public static  ArrayList<String> todoArray = new ArrayList<>();
    public static ArrayList<String> groceryListArray = new ArrayList<>();
    public static ArrayList<String> workListArray = new ArrayList<>();

  // the set up method this goes and gets the info from the text file and enters it into the array

    public boolean setup() throws IOException{

        Scanner inFile = new Scanner(new FileReader("todo.txt"));

        // this reads the personal text file and enters each line into to-do array.
        String itemLine;

        while (inFile.hasNextLine()){
            itemLine = inFile.nextLine();
            todoArray.add(itemLine);
        }
// get ready for the next fiel
        Scanner groceryFile = new Scanner(new FileReader("groceryhistory.txt"));
        String groceryItemLine;

        while (groceryFile.hasNextLine()){
            groceryItemLine = groceryFile.nextLine();
            groceryListArray.add(groceryItemLine);
        }
// get ready for the last file.
        Scanner workFile = new Scanner(new FileReader("workhistory.txt"));
        String workItemLine;

        while (workFile.hasNextLine()){
            workItemLine = workFile.nextLine();
            workListArray.add(workItemLine);
        }

        // end of while statements
        return true;
    }
    // end of setup method

}

