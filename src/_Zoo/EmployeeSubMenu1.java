package _Zoo;
import java.util.Scanner;
/**
 * Created by alexhughes on 10/13/16.
 */
public class EmployeeSubMenu1 {

    Scanner scanner = new Scanner(System.in);


    public void employeeSubMenu1(){
        System.out.println("Zoo Employee Menu");
        System.out.println("Please select from the following");
        System.out.println("1 Add Animal");
        System.out.println("2 View Animal");
        System.out.println("3 Add Employee");
        System.out.println("4 View Employee");
        System.out.println("5 Add Visitor");
        System.out.println("6 View Visitor");
        System.out.println("7 Quit");

        String employeeInput = scanner.nextLine();

        switch (employeeInput){

            case "1":

                System.out.println("New Animal Info");
                System.out.println("Enter a name");
                String Aname = scanner.nextLine();
                System.out.println("Enter age");
                String Aage = scanner.nextLine();
                System.out.println("Enter gender");
                String Agender = scanner.nextLine();
                System.out.println("Enter Exhibit");
                String Aexhibit = scanner.nextLine();


                Zoo a2 = new Zoo();
                Animal an1 = new Animal(Aname, Aage, Agender, Aexhibit);

                a2.animalArray.add(an1);
                System.out.println("Total number of animals in system:" + a2.animalArray.size()+ "\n");
                employeeSubMenu1();
                break;

            case "2":
                ListAnimals la1 = new ListAnimals();
                la1.listAnimals();
                employeeSubMenu1();
                break;

            case "3":
                System.out.println("New Employee Info");
                System.out.println("Enter a name");
                String name = scanner.nextLine();
                System.out.println("Enter age");
                String age = scanner.nextLine();
                System.out.println("Enter gender");
                String gender = scanner.nextLine();
                System.out.println("Enter employee number:");
                String employeeNumber = scanner.nextLine();
                System.out.println("Enter Exhibit Assignment:");
                String assignment = scanner.nextLine();


                Zoo a1 = new Zoo();
                Employee p1 = new Employee(name, age, gender, employeeNumber, assignment);

                a1.peopleArray.add(p1);
                System.out.println("Total number of employees in system:" + a1.peopleArray.size()+ "\n");

                employeeSubMenu1();
                break;

            case "4":
                ListPeople l1 = new ListPeople();
                l1.listEmployee();
                employeeSubMenu1();
                break;

            case "5":
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
                System.out.println("Total number of visitors in system:" + v1.visitorArray.size() + "\n");

                employeeSubMenu1();

            case "6":
                ListPeople l2 = new ListPeople();
                l2.listVisitor();
                employeeSubMenu1();
                break;

            case "7":
                System.out.println("Goodbye");



        }
    }
}
