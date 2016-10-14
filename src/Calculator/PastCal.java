package Calculator;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
/**
 * Created by alexhughes on 10/9/16.
 */
public class PastCal {
    public void readMath() throws IOException{
        String mathFile = "basicMath.txt";
        Scanner inFile = new Scanner(new FileReader(mathFile));
        String info;
        while(inFile.hasNextLine()){
            info = inFile.nextLine();
            System.out.println(info);
        }

    }

    public void readTip() throws IOException{
        String tipFile ="tipHistory.txt";
        Scanner inFile = new Scanner(new FileReader("tipHistory.txt"));
        String tipInfo;
        while (inFile.hasNextLine()){
            tipInfo = inFile.nextLine();
            System.out.println(tipInfo);
        }
    }
    public void readGro() throws IOException{
        Scanner inFile = new Scanner(new FileReader("grocery.txt"));
        String growInfo;
        while (inFile.hasNextLine()){
            growInfo = inFile.nextLine();
            System.out.println(growInfo);
        }
    }

}
