package Calculator;

/**
 * Created by alexhughes on 10/8/16.
 */
public class Help {
    public String helpMenu(){
        String text = "HELP MENU" + "\n" +
                "Basic Math - The basic math system allows you to preform simple math functions on two numbers." + "\n" +
                "You will be asked to enter the first number then the second number. Finally you will be asked for " + "\n" +
                "the type of mathematical operation you wish to preform. THe solution will be displayed and you will be " + "\n" +
                "asked if you wish to exit to the main menu." + "\n" + "\n" +
                "Tip Calculator - Enter your total bill amount including tax. You will be asked to rate your " + "\n" +
                "service from 1 to 4, with 1 being poor service and 4 being excellent. 1 is 5%, 2 is 10%, 3 is 15%," + "\n" +
                " and 4 is 20%. You will be provided with the tip amount as well as the total bill amount including tip." + "\n" + "\n" +
                "Grocery Calculator - As you shop add in the price of each item. As you enter items you will be asked " + "\n" +
                "if you wish to enter additional items. Once you have entered the last item select n to begin calculations. " + "\n" +
                "You will be provided with the subtotal of your items, tax amount and total bill including tax." + "\n" +"\n" +
                "Past Calculations - You may go back and review a list of previous calculations you have made. " + "\n" +
                "You can clear the past calculation list by selecting the option form the menu."+"\n";
    return text;
    }
}
