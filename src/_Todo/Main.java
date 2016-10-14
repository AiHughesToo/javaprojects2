package _Todo;
import java.io.IOException;
/**
 * Created by alexhughes on 10/10/16.
 */
public class Main {

    public static void main(String[] args) throws IOException{
        // setup the arrays and add the history
        MemoryFileHandler s1 = new MemoryFileHandler();
        s1.setup();

        Menu m1 = new Menu();
        m1.menu();
    }

}
