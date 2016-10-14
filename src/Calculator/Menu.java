package Calculator;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by alexhughes on 10/8/16.
 */
public class Menu {

    public static void menu() throws IOException {
        try {
            System.out.println("Welcome to Calculator the project");
            System.out.println("Please select from the fallowing options.");
            System.out.println("1. Basic Math");
            System.out.println("2. Tip Calculator");
            System.out.println("3. Grocery Calculator");
            System.out.println("4. Past Calculations");
            System.out.println("5. Help");
            System.out.println("6. Quit");
            Scanner menuInput = new Scanner(System.in);
            int menuSelect = menuInput.nextInt();

            if (menuSelect == 1) {
                boolean goA = true;
                while (goA) {
                    BasicMath p1 = new BasicMath();
                    double outPut = p1.basicMath();
                    System.out.println("The Result is " + outPut);
                    // we have our answer lets see what user wants to do now.
                    System.out.println("Main Menu y/n?");
                    Scanner goAgain = new Scanner(System.in);
                    String gA = goAgain.nextLine();
                    if (gA.equals("y")) {
                        goA = false;
                        menu();
                    }
                }
            } else if (menuSelect == 2) {
                TipCal t1 = new TipCal();
                String tip = t1.tipCal();
                System.out.println(tip);
                menu();

            } else if (menuSelect == 3) {
                Grocery g1 = new Grocery();
                String gCal = g1.gerCal();
                System.out.println(gCal);
                menu();
            } else if (menuSelect == 4) {
                PastMenu pm1 = new PastMenu();
                pm1.pastMenu();
            } else if (menuSelect == 5) {
                Help h1 = new Help();
                System.out.println(h1.helpMenu());
                menu();
            } else if (menuSelect == 6) {
                System.out.print("Thank You for using Calculator the Project.");
            }else if (menuSelect > 6){
                System.out.println("Not an option");
                menu();
            }
        }catch(InputMismatchException c1){
            System.out.println("Try entering a number this time.");
            menu();
        }
    } //end of method


}
