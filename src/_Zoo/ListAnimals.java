package _Zoo;

/**
 * Created by alexhughes on 10/14/16.
 */
public class ListAnimals {

    public void listAnimals(){
        Zoo b1 = new Zoo();
        for (int i = 0; i< b1.animalArray.size(); ++i){

            System.out.println( "Name: " + b1.animalArray.get(i).Aname);
            System.out.println( "Age: " + b1.animalArray.get(i).Aage);
            System.out.println( "Gender: " + b1.animalArray.get(i).Agender);
            System.out.println( "Exhibit: " + b1.animalArray.get(i).Aexhibit + "\n");

        }


    }


}
