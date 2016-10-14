package _Zoo;

/**
 * Created by alexhughes on 10/14/16.
 */
public class Visitor extends Person{

        String zipCode;
        String likeTacos;

    public Visitor(String n, String a, String g, String zip, String taco) {
        super(n, a, g);
        zipCode= zip;
        likeTacos = taco;
    }


    public String viewEmployeeInfo(){

            return "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Gender" + gender +
                    "ZipCode" + zipCode +
                    "Serve Tacos?" + likeTacos;

        }

    }
