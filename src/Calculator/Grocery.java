package Calculator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by alexhughes on 10/8/16.
 */
public class Grocery {
    ArrayList<Double> gItems = new ArrayList<>();
    public  String gerCal() throws IOException {

        final String groFile = "grocery.txt";
        PrintWriter gFile = new PrintWriter(new FileWriter(groFile, true));
        boolean anotherOne = true;

       // ArrayList<Double> gItems = new ArrayList<>();
        double taxAmount = .06;

        System.out.println("GROCERY CALCULATOR");
        System.out.println("Please enter your first item");

        Scanner fItem = new Scanner(System.in);
        Scanner nItem = new Scanner(System.in);
        Scanner yN = new Scanner(System.in);

        double firstItem = fItem.nextDouble();
        gItems.add(firstItem);

        while(anotherOne){
            System.out.println("Would you like to enter another item? y/n");
            String ans = yN.nextLine();

            if (ans.equals("y")) {
                System.out.println("Enter next item.");
                double nextItem = nItem.nextDouble();
                gItems.add(nextItem);
            } else{
                anotherOne = false;
            }
//end of while statement
        }

        double subTotal = 0;

        for (int i = 0; i < gItems.size(); ++i){
            gFile.print(gItems.get(i)+", ");
             subTotal = subTotal + gItems.get(i);
        }

        double tax = subTotal * taxAmount;
        double totalGBill = subTotal + tax;

        BigDecimal convertedTax = new BigDecimal(tax);
        BigDecimal roundedTax = convertedTax.setScale(2, RoundingMode.DOWN);

        BigDecimal convertedtotalGBill = new BigDecimal(totalGBill);
        BigDecimal roundedGBill = convertedtotalGBill.setScale(2, RoundingMode.DOWN);

        gFile.println(" Subtotal of items is: $" + subTotal + "\n" + "Tax: $" + roundedTax +"\n" + "Your total bill is: $" + roundedGBill+"\n");
        gFile.close();
        return "Subtotal of items is: $" + subTotal + "\n" + "Tax: $" + roundedTax +"\n" + "Your total bill is: $" + roundedGBill +"\n";




    }


}
