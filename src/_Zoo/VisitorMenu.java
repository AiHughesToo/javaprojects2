package _Zoo;
import java.util.Scanner;
/**
 * Created by alexhughes on 10/14/16.
 */
public class VisitorMenu {

    public void visitorSubMenu(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zoo Visitor Menu");
        System.out.println("Please select from the following");
        System.out.println("1 Enter Your Info");
        System.out.println("2 View Animals");
        System.out.println("3 Quit");


        String visitorInput = scanner.nextLine();

        switch (visitorInput){

            case "1":
                System.out.println("New Visitor Info");
                System.out.println("Enter a name");
                String Vname = scanner.nextLine();
                System.out.println("Enter age");
                String Vage = scanner.nextLine();
                System.out.println("Enter gender");
                String Vgender = scanner.nextLine();
                System.out.println("Enter Zip Code:");
                String zip = scanner.nextLine();
                System.out.println("Do You Like Tacos?");
                String taco = scanner.nextLine();


                Zoo v1 = new Zoo();
                Visitor vis1 = new Visitor(Vname, Vage, Vgender, zip, taco);

                v1.visitorArray.add(vis1);

                visitorSubMenu();


            case "2":
                ListAnimals la1 = new ListAnimals();
                la1.listAnimals();

                visitorSubMenu();
                break;

            case "3":
                System.out.println("Goodbye");
                break;

        }
    }
}
