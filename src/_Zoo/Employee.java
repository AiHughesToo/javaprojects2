package _Zoo;

/**
 * Created by alexhughes on 10/14/16.
 */



public class Employee extends Person {

    String employeeNumber;
    String assignment;

    public Employee(String n, String a, String g, String en, String ass) {
        super(n, a, g);
        employeeNumber = en;
        assignment = ass;
    }



    public String viewEmployeeInfo(){
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender" + gender +
                "Employee #" + employeeNumber +
                "Exhibit Assignment" + assignment;

    }

}
