package _Zoo;

/**
 * Created by alexhughes on 10/13/16.
 */
public class ListPeople {

    public void listEmployee(){
        Zoo b1 = new Zoo();

        for (int i = 0; i< b1.peopleArray.size(); ++i){
            System.out.println( "Name: " + b1.peopleArray.get(i).name);
            System.out.println( "Age: " + b1.peopleArray.get(i).age);
            System.out.println( "Gender: " + b1.peopleArray.get(i).gender);
            System.out.println( "Employee #: " + b1.peopleArray.get(i).employeeNumber);
            System.out.println( "Exhibit " + b1.peopleArray.get(i).assignment + "\n");


        }


    }

    public void listVisitor(){

        Zoo v1 = new Zoo();

        for (int i = 0; i< v1.visitorArray.size(); ++i){
            System.out.println( "Name: " + v1.visitorArray.get(i).name);
            System.out.println( "Age: " + v1.visitorArray.get(i).age);
            System.out.println( "Gender: " + v1.visitorArray.get(i).gender);
            System.out.println( "Zip Code " + v1.visitorArray.get(i).zipCode);
            System.out.println( "Likes Tacos " + v1.visitorArray.get(i).likeTacos + "\n");


        }





    }
}
