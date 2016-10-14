package Calculator;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

/**
 * Created by alexhughes on 10/8/16.
 */

// Think about this naming. Does it really define the actions this class is responsible for?
public class BasicMath {

    public double basicMath() throws IOException {

        double total = 0;
        // setup the memory file. the question is if I call this method a second time will the file be overwritten?

        String mathFile = "basicMath.txt";
        PrintWriter bmFile = new PrintWriter(new FileWriter(mathFile, true));



        System.out.println("BASIC MATH CALCULATOR");
        System.out.println("Enter the first number");

        Scanner Num = new Scanner(System.in);
        double fNumber = Num.nextInt();

        System.out.println("Enter the second number");
        double sNumber = Num.nextInt();

        System.out.println("Please enter the operator you wish to use. Enter + for Addition, - for Subtraction, * for Multiplication and / for Division.");

        // Multiple scanners...
        Scanner operator = new Scanner(System.in);
        String oper = operator.nextLine();
        // do some math.

        // Switch statement
        switch (oper){
            case "+":
                total = fNumber + sNumber;
                break;
            case "-":
                total = fNumber - sNumber;
                break;
            case "*":
                total = fNumber * sNumber;
                break;
            case "/":
                total = fNumber / sNumber;
                break;
        }

        // save the equasion to the file
        bmFile.println(fNumber +" " + oper+" "+sNumber+" = "+total);
        bmFile.close();
        // send the result back to the user

        return total;
    }
}
