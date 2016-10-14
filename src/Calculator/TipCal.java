package Calculator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by alexhughes on 10/8/16.
 */

// Why isn't this named TipCalculator?
public class TipCal {

    // same.
    public String tipCal() throws IOException {
        // Should be on one line.
        double tipAmount = 0;
        double tipPercent = 0;
        double totalBill = 0;

        // weird spacing?
        int servLev=0;

        // Declared final
        // Should be named tipFileName. It's more descriptive
        final String tipFile = "tipHistory.txt";
        PrintWriter tFile = new PrintWriter(new FileWriter(tipFile, true));
        Scanner billAmount = new Scanner(System.in);

        System.out.println("TIP CALCULATOR");
        System.out.println("Please enter the total bill amount:");
        double bill = billAmount.nextDouble();
        System.out.println("Please rate your service from 1 to 4. 4 being excellent and 1 being poor.");

        // You only need one scanner.
        Scanner sLev = new Scanner(System.in);
        servLev = sLev.nextInt();

        // Should be a switch statement.
        if (servLev == 1){
            tipPercent = .5;
        } else if (servLev == 2){
            tipPercent = .10;
        }else if (servLev == 3){
            tipPercent = .15;
        }else if (servLev == 4){
            tipPercent = .20;
        }
        DecimalFormat format = new DecimalFormat();

        tipAmount = bill * tipPercent;


        totalBill = bill + tipAmount;



        BigDecimal convertedTip = new BigDecimal(tipAmount);
        BigDecimal roundedTip = convertedTip.setScale(2, RoundingMode.DOWN);

        BigDecimal convertedBill = new BigDecimal(totalBill);
        BigDecimal roundedBill = convertedBill.setScale(2, RoundingMode.DOWN);


        tFile.println(bill + " at " + tipPercent + "% is $" + roundedTip + ", your total bill with tip is" + roundedBill);
        tFile.close();

        return "The Tip amount is: $" + roundedTip + "\n" + "Your total bill including tip is: $" + roundedBill + "\n";
    }



}
