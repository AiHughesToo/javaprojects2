package _Zoo;
import java.util.Scanner;

/**
 * Created by alexhughes on 10/13/16.
 */


public class Menu {

  //  ArrayList<Person> peopleArray = new ArrayList<>();
    Zoo a1 = new Zoo();

    Scanner scanner = new Scanner(System.in);

    public static int visitorCount;


    public void MainMenu(){

        System.out.println("Welcome to Zoo Management Systems");
        System.out.println("Terminal Setup Menu");
        System.out.println("Please Select From The Following");
        System.out.println("1. Visitor Kiosk");
        System.out.println("2. Employee Terminal");

        String firstInput = scanner.nextLine();

        switch (firstInput){

            case "1":
                VisitorMenu vm1 = new VisitorMenu();
                vm1.visitorSubMenu();
                break;

            case "2":
            EmployeeSubMenu1 e1 = new EmployeeSubMenu1();
                e1.employeeSubMenu1();
                break;
        }

    }
}
