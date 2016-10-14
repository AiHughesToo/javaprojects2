package Calculator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Created by alexhughes on 10/9/16.
 */
public class PastMenu {

    public static void pastMenu() throws IOException {
       System.out.println("PAST CALCULATIONS MENU");
        System.out.println("Select from the following");
        System.out.println("1. view Basic Math History");
        System.out.println("2. CLEAR Basic Math History");
        System.out.println("3. view Tip Calculator History");
        System.out.println("4. CLEAR Tip Calculator History");
        System.out.println("5. view Grocery History");
        System.out.println("6. CLEAR Grocery History");
        System.out.println("7. Main Menu");
        Scanner uInput = new Scanner(System.in);
        String uI1 = uInput.nextLine();

        if (uI1.equals("1")){
            System.out.println("Basic Math History"+"\n");
            PastCal h1 = new PastCal();
            h1.readMath();
            System.out.println("\n");
            pastMenu();
        }else if (uI1.equals("2")){
            String mathFile = "basicMath.txt";
            PrintWriter bmFile = new PrintWriter(new FileWriter(mathFile));
            System.out.println("Basic Math History Cleared."+"\n");
            pastMenu();
        }else if (uI1.equals("3")){
            System.out.println("Tip Calculator History"+"\n");
            PastCal t1 = new PastCal();
            t1.readTip();
            pastMenu();
        }else if (uI1.equals("4")){
            String tipFile = "tipHistory.txt";
            PrintWriter thFile = new PrintWriter(new FileWriter(tipFile));
            System.out.println("Tip Calculator History Cleared."+"\n");
            pastMenu();
        }else if (uI1.equals("5")){
            System.out.println("Grocery Calculator History"+"\n");
            PastCal g1 = new PastCal();
            g1.readGro();
            pastMenu();
        }else if (uI1.equals("6")){
            String grFile = "grocery.txt";
            PrintWriter bmFile = new PrintWriter(new FileWriter(grFile));
            pastMenu();
        }else if (uI1.equals("7")){
            Menu mainMenu = new Menu();
            mainMenu.menu();
        }

    }
}
